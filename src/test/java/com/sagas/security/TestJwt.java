package com.sagas.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.Test;

public class TestJwt {
    @Test
    public void testJwt(){
        // encode
        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            String token = JWT.create()
                    .withIssuer("auth0")
                    .sign(algorithm);
            System.out.println(token);
        } catch (JWTCreationException exception){
            //Invalid Signing configuration / Couldn't convert Claims.
        }

        // verify
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXUyJ9.eyJpc3MiOiJhdXRoMCJ9.AbIJTDMFc7yUa5MhvcP03nJPyCPzZtQcGEp-zWfOkEE";
        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build(); //Reusable verifier instance
            DecodedJWT jwt = verifier.verify(token);
            System.out.println(jwt.getPayload());
        } catch (JWTVerificationException exception){
            //Invalid signature/claims
        }

        // decode
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXUyJ9.eyJpc3MiOiJhdXRoMCJ9.AbIJTDMFc7yUa5MhvcP03nJPyCPzZtQcGEp-zWfOkEE";
        try {
            DecodedJWT jwt = JWT.decode(token);
            System.out.println(jwt.getHeader());
        } catch (JWTDecodeException exception){
            //Invalid token
        }
    }

    @Test
    public void testClaims(){
        Algorithm algorithm = Algorithm.HMAC256("secret");
        String token = JWT.create()
                .withClaim("name", 123)
                .withClaim("user", "system")
                .withIssuer("auth0")
                .withArrayClaim("array", new Integer[]{1, 2, 3})
                .sign(algorithm);
        System.out.println(token.length()+": "+token);

        // verify
        JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("auth0")
                // .withIssuer("auth")
                .build(); //Reusable verifier instance
        DecodedJWT jwt = verifier.verify(token);

        // decode
        // DecodedJWT jwt = JWT.decode(token);
        System.out.println(jwt.getHeader());
        System.out.println(jwt.getClaim("name").asInt());
        System.out.println(jwt.getClaim("user").asString());
    }
}
