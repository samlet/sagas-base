// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forms.proto

package com.sagas.meta.model;

public interface MetaListOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaListOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 1;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string listEntryName = 2;</code>
   */
  java.lang.String getListEntryName();
  /**
   * <code>string listEntryName = 2;</code>
   */
  com.google.protobuf.ByteString
      getListEntryNameBytes();

  /**
   * <code>repeated .model.MetaSingleOption optionValues = 3;</code>
   */
  java.util.List<com.sagas.meta.model.MetaSingleOption> 
      getOptionValuesList();
  /**
   * <code>repeated .model.MetaSingleOption optionValues = 3;</code>
   */
  com.sagas.meta.model.MetaSingleOption getOptionValues(int index);
  /**
   * <code>repeated .model.MetaSingleOption optionValues = 3;</code>
   */
  int getOptionValuesCount();
  /**
   * <code>repeated .model.MetaSingleOption optionValues = 3;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaSingleOptionOrBuilder> 
      getOptionValuesOrBuilderList();
  /**
   * <code>repeated .model.MetaSingleOption optionValues = 3;</code>
   */
  com.sagas.meta.model.MetaSingleOptionOrBuilder getOptionValuesOrBuilder(
      int index);
}