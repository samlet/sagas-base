package com.sagas.actors.bots;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.*;
import akka.http.javadsl.model.headers.SetCookie;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.sagas.actors.bots.Recipients;
import scala.concurrent.ExecutionContextExecutor;

import java.util.List;
import java.util.concurrent.CompletionStage;

import static akka.pattern.PatternsCS.pipe;

public class BotTalkMain {
    static class SingleRequestInActorExample extends AbstractActor {
        final Http http = Http.get(context().system());
        final ExecutionContextExecutor dispatcher = context().dispatcher();
        final Materializer materializer = ActorMaterializer.create(context());
        final ObjectMapper mapper = new ObjectMapper();

        final CollectionType sentenceType = mapper.getTypeFactory()
                .constructCollectionType(List.class, Recipients.Sentence.class);

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
                        // response.discardEntityBytes(materializer);
                        // CompletionStage<Pet> pet = Jackson.unmarshaller(Pet.class).unmarshal(response.entity(), materializer);
                        // response.entity()..getData().utf8String()
                        if (response.entity() instanceof HttpEntity.Strict) {
                            System.out.println("response is strict");
                            String message = ((HttpEntity.Strict) response.entity()).getData().utf8String();
                            System.out.println(message);
                            // return response.withEntity(ContentTypes.APPLICATION_JSON, "{\"rejection\": \"" + message + "\"}");
                        }
                        })
                    .build();
        }

        CompletionStage<HttpResponse> fetch(String url) {
            // return http.singleRequest(HttpRequest.create(url));
            return http.singleRequest(HttpRequest.POST(url)
                    .withEntity(HttpEntities.create(ContentTypes.APPLICATION_JSON, "{\n" +
                            "    \"message\": \"I am great\"\n" +
                            "  }")));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final ActorSystem system = ActorSystem.create();
        final Materializer materializer = ActorMaterializer.create(system);

        final String url="http://localhost:5005/webhooks/rest/webhook";
        final ActorRef bot =
                system.actorOf(SingleRequestInActorExample.props(), "bot");
        bot.tell(url, ActorRef.noSender());

        System.out.println("...");
        Thread.sleep(3000L);
        system.terminate();
    }
}
