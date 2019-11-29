package com.sagas.actors.bots;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Recipients {
    public static class Sentence{
        @JsonCreator
        public Sentence(@JsonProperty("recipient_id")String recipientId,
                        @JsonProperty("text")String text) {
            this.recipientId = recipientId;
            this.text = text;
        }

        String recipientId;
        String text;
    }

    @JsonCreator
    public Recipients(@JsonProperty("sentences")List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    List<Sentence> sentences;

}
