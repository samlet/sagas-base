package com.sagas.actors.bots;

import akka.actor.AbstractLoggingFSM;
import akka.actor.ActorRef;

import static com.sagas.actors.bots.Messages.*;

public class RasaBotFsm {
    /**
     * Some states the chopstick can be in
     */
    public static enum CS {
        Available,
        Taken
    }

    /**
     * Some state container for the chopstick
     */
    public static final class TakenBy {
        public final ActorRef hakker;
        public TakenBy(ActorRef hakker){
            this.hakker = hakker;
        }
    }

    /*
     * A chopstick is an actor, it can be taken, and put back
     */
    public static class Chopstick extends AbstractLoggingFSM<CS, TakenBy> {
        {
            // A chopstick begins its existence as available and taken by no one
            startWith(CS.Available, new TakenBy(context().system().deadLetters()));

            // When a chopstick is available, it can be taken by a some hakker
            when(CS.Available,
                    matchEventEquals(Take, (take, data) ->
                            goTo(CS.Taken).using(new TakenBy(sender())).replying(new Taken(self()))));

            // When a chopstick is taken by a hakker
            // It will refuse to be taken by other hakkers
            // But the owning hakker can put it back
            when(CS.Taken,
                    matchEventEquals(Take, (take, data) ->
                            stay().replying(new Busy(self()))).
                            event((event, data) -> (event == Put) && (data.hakker == sender()), (event, data) ->
                                    goTo(CS.Available).using(new TakenBy(context().system().deadLetters()))));

            // Initialize the chopstick
            initialize();
        }
    }
}
