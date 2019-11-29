package com.sagas.actors.bots;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import java.util.ArrayList;
import java.util.List;

import static com.sagas.actors.bots.Messages.*;

public class BotFsmMain {

    /*
     * Alright, here's our test-harness
     */
    public static void main(String[] args) {
        ActorSystem system = ActorSystem.create();
        //Create 5 chopsticks
        List<ActorRef> chopsticks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            chopsticks.add(system.actorOf(Props.create(RasaBotFsm.Chopstick.class), "Chopstick" + i));
        }

        chopsticks.stream().forEach(hakker -> hakker.tell(Take, ActorRef.noSender()));
    }
}

