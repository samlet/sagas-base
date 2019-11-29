package com.sagas.actions;

import com.google.gson.Gson;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;
import java.util.Map;

public class TestRedis {
    static void sleep(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            System.exit(1);
        }
    }

    static Jedis connectToRedis(String host) {
        Jedis conn = new Jedis(host);

        while (true) {
            try {
                conn.keys("*");
                break;
            } catch (JedisConnectionException e) {
                System.err.println("Waiting for redis");
                sleep(1000);
            }
        }

        System.err.println("Connected to redis");
        return conn;
    }

    public static void main(String[] args){
        Jedis redis = connectToRedis("localhost");
        Gson gson = new Gson();
        while (true) {
            System.out.println(".. waiting for votes");
            String voteJSON = redis.blpop(0, "votes").get(1);

            Map<String,String> voteData = gson.fromJson(voteJSON, Map.class);
            String voterID = voteData.get("voter_id");
            String vote = voteData.get("vote");

            System.out.printf("Processing vote for '%s' by '%s' - %s\n",
                    vote, voterID, voteData.get("timestamp"));
            // updateVote(dbConn, voterID, vote);
        }
    }
}
