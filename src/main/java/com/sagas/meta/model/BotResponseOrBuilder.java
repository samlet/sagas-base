// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blueprints.proto

package com.sagas.meta.model;

public interface BotResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.BotResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .model.BotRecipient recipients = 1;</code>
   */
  java.util.List<com.sagas.meta.model.BotRecipient> 
      getRecipientsList();
  /**
   * <code>repeated .model.BotRecipient recipients = 1;</code>
   */
  com.sagas.meta.model.BotRecipient getRecipients(int index);
  /**
   * <code>repeated .model.BotRecipient recipients = 1;</code>
   */
  int getRecipientsCount();
  /**
   * <code>repeated .model.BotRecipient recipients = 1;</code>
   */
  java.util.List<? extends com.sagas.meta.model.BotRecipientOrBuilder> 
      getRecipientsOrBuilderList();
  /**
   * <code>repeated .model.BotRecipient recipients = 1;</code>
   */
  com.sagas.meta.model.BotRecipientOrBuilder getRecipientsOrBuilder(
      int index);
}
