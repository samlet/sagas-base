package com.sagas.actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.model.headers.SetCookie;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import scala.concurrent.ExecutionContextExecutor;

import java.util.concurrent.CompletionStage;

import static akka.pattern.PatternsCS.pipe;

public class HttpClientTestor {
    static class SingleRequestInActorExample extends AbstractActor {
        final Http http = Http.get(context().system());
        final ExecutionContextExecutor dispatcher = context().dispatcher();
        final Materializer materializer = ActorMaterializer.create(context());

        static public Props props() {
            return Props.create(SingleRequestInActorExample.class,
                    () -> new SingleRequestInActorExample());
        }
        @Override
        public Receive createReceive() {
            return receiveBuilder()
                    .match(String.class, url -> pipe(fetch(url), dispatcher).to(self()))
                    .match(HttpResponse.class, response ->{
                        final Iterable<SetCookie> setCookies = response.getHeaders(SetCookie.class);

                        System.out.println("+ Cookies set by a server: " + setCookies);
                        response.discardEntityBytes(materializer);
                    })
                    .build();
        }

        CompletionStage<HttpResponse> fetch(String url) {
            return http.singleRequest(HttpRequest.create(url));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final ActorSystem system = ActorSystem.create();
        final Materializer materializer = ActorMaterializer.create(system);

        final String url="http://www.baidu.com"; // "http://akka.io"
        /*
        final CompletionStage<HttpResponse> responseFuture =
                Http.get(system)
                        .singleRequest(HttpRequest.create(url), materializer);
        */
        final ActorRef requestor =
                system.actorOf(SingleRequestInActorExample.props(), "requestor");
        requestor.tell(url, ActorRef.noSender());

        System.out.println("...");
        Thread.sleep(3000L);
        system.terminate();
    }
}
