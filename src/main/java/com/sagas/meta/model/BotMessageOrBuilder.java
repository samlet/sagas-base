// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blueprints.proto

package com.sagas.meta.model;

public interface BotMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.BotMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1;</code>
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1;</code>
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated string attachments = 3;</code>
   */
  java.util.List<java.lang.String>
      getAttachmentsList();
  /**
   * <code>repeated string attachments = 3;</code>
   */
  int getAttachmentsCount();
  /**
   * <code>repeated string attachments = 3;</code>
   */
  java.lang.String getAttachments(int index);
  /**
   * <code>repeated string attachments = 3;</code>
   */
  com.google.protobuf.ByteString
      getAttachmentsBytes(int index);

  /**
   * <code>.model.TaStringEntries slots = 4;</code>
   */
  boolean hasSlots();
  /**
   * <code>.model.TaStringEntries slots = 4;</code>
   */
  com.sagas.meta.model.TaStringEntries getSlots();
  /**
   * <code>.model.TaStringEntries slots = 4;</code>
   */
  com.sagas.meta.model.TaStringEntriesOrBuilder getSlotsOrBuilder();
}
