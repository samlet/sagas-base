/*
 * Copyright (C) 2009-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package com.sagas.actors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.testkit.javadsl.TestKit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

//import org.scalatest.junit.JUnitSuite;

//public class DeviceTest extends JUnitSuite {
  public class DeviceTest{
  static ActorSystem system;

  @BeforeClass
  public static void setup() {
    system = ActorSystem.create();
  }

  @AfterClass
  public static void teardown() {
    TestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void testReplyToRegistrationRequests() {
    TestKit probe = new TestKit(system);
    ActorRef deviceActor = system.actorOf(Device.props("group", "device"));

    deviceActor.tell(new DeviceManager.RequestTrackDevice("group", "device"), probe.getRef());
    probe.expectMsgClass(DeviceManager.DeviceRegistered.class);
    assertEquals(deviceActor, probe.getLastSender());
  }

  @Test
  public void testIgnoreWrongRegistrationRequests() {
    TestKit probe = new TestKit(system);
    ActorRef deviceActor = system.actorOf(Device.props("group", "device"));

    deviceActor.tell(new DeviceManager.RequestTrackDevice("wrongGroup", "device"), probe.getRef());
    probe.expectNoMessage();

    deviceActor.tell(new DeviceManager.RequestTrackDevice("group", "wrongDevice"), probe.getRef());
    probe.expectNoMessage();
  }

  @Test
  public void testReplyWithEmptyReadingIfNoTemperatureIsKnown() {
    TestKit probe = new TestKit(system);
    ActorRef deviceActor = system.actorOf(Device.props("group", "device"));
    deviceActor.tell(new Device.ReadTemperature(42L), probe.getRef());
    Device.RespondTemperature response = probe.expectMsgClass(Device.RespondTemperature.class);
    Assert.assertEquals(42L, response.requestId);
    Assert.assertEquals(Optional.empty(), response.value);
  }

  @Test
  public void testReplyWithLatestTemperatureReading() {
    TestKit probe = new TestKit(system);
    ActorRef deviceActor = system.actorOf(Device.props("group", "device"));

    deviceActor.tell(new Device.RecordTemperature(1L, 24.0), probe.getRef());
    Assert.assertEquals(1L, probe.expectMsgClass(Device.TemperatureRecorded.class).requestId);

    deviceActor.tell(new Device.ReadTemperature(2L), probe.getRef());
    Device.RespondTemperature response1 = probe.expectMsgClass(Device.RespondTemperature.class);
    Assert.assertEquals(2L, response1.requestId);
    Assert.assertEquals(Optional.of(24.0), response1.value);

    deviceActor.tell(new Device.RecordTemperature(3L, 55.0), probe.getRef());
    Assert.assertEquals(3L, probe.expectMsgClass(Device.TemperatureRecorded.class).requestId);

    deviceActor.tell(new Device.ReadTemperature(4L), probe.getRef());
    Device.RespondTemperature response2 = probe.expectMsgClass(Device.RespondTemperature.class);
    Assert.assertEquals(4L, response2.requestId);
    Assert.assertEquals(Optional.of(55.0), response2.value);
  }
}
