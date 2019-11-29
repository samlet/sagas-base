package com.sagas.actions;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.util.Map;

public class TestRedisPutter {
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
            Map<String,String> voteData= Maps.newHashMap();
            voteData.put("voter_id", "samlet");
            voteData.put("vote", "50");
            voteData.put("timestamp", Long.toString(System.currentTimeMillis()));
            redis.rpush("votes", gson.toJson(voteData));

            System.out.printf(".. put vote for '%s'\n", voteData.toString());
            // updateVote(dbConn, voterID, vote);
            sleep(2000);
        }
    }
}
