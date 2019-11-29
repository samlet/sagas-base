/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sagas.remote;

import com.sagas.meta.model.ArtifactServiceGrpc;
import com.sagas.meta.model.PingRequest;
import com.sagas.meta.model.PingResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArtifactsClient {
  private static final Logger logger = Logger.getLogger(ArtifactsClient.class.getName());

  private final ManagedChannel channel;
  private final ArtifactServiceGrpc.ArtifactServiceBlockingStub blockingStub;

  /** Construct client connecting to HelloWorld server at {@code host:port}. */
  public ArtifactsClient(String host, int port) {
    this(ManagedChannelBuilder.forAddress(host, port)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        .usePlaintext()
        .build());
  }

  /** Construct client for accessing HelloWorld server using the existing channel. */
  ArtifactsClient(ManagedChannel channel) {
    this.channel = channel;
    blockingStub = ArtifactServiceGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  /** Say hello to server. */
  public void greet(String name) {
    logger.info("Will try to greet " + name + " ...");
    PingRequest request = PingRequest.newBuilder().setMessage(name).build();
    PingResponse response;
    try {
      response = blockingStub.ping(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return;
    }
    logger.info("Greeting: " + response.getResponse());
  }

  public static PingResponse once(String message) throws InterruptedException {
    ArtifactsClient client = new ArtifactsClient("localhost", 20051);

    PingRequest request = PingRequest.newBuilder().setMessage(message).build();
    PingResponse response;
    try {
      response = client.blockingStub.ping(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      return PingResponse.newBuilder().setResponse(e.getStatus().getDescription()).build();
    }finally {
      client.shutdown();
    }
    return response;
  }

  /**
   * Greet server. If provided, the first element of {@code args} is the name to use in the
   * greeting.
   */
  public static void main(String[] args) throws Exception {
    /*
    ArtifactsClient client = new ArtifactsClient("localhost", 20051);
    // HelloWorldClient client = new HelloWorldClient("localhost", 50051);
    try {
      // Access a service running on the local machine on port 50051
      String user = "world";
      client.greet(user);
    } finally {
      client.shutdown();
    }
    */
    PingResponse r=ArtifactsClient.once("hello");
    System.out.println(r);
  }
}
