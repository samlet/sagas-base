// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forms.proto

package com.sagas.meta.model;

public interface MetaDropDownFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaDropDownField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool allowEmpty = 1;</code>
   */
  boolean getAllowEmpty();

  /**
   * <code>bool allowMulti = 2;</code>
   */
  boolean getAllowMulti();

  /**
   * <code>string current = 3;</code>
   */
  java.lang.String getCurrent();
  /**
   * <code>string current = 3;</code>
   */
  com.google.protobuf.ByteString
      getCurrentBytes();

  /**
   * <code>repeated .model.MetaOptionSource optionSources = 4;</code>
   */
  java.util.List<com.sagas.meta.model.MetaOptionSource> 
      getOptionSourcesList();
  /**
   * <code>repeated .model.MetaOptionSource optionSources = 4;</code>
   */
  com.sagas.meta.model.MetaOptionSource getOptionSources(int index);
  /**
   * <code>repeated .model.MetaOptionSource optionSources = 4;</code>
   */
  int getOptionSourcesCount();
  /**
   * <code>repeated .model.MetaOptionSource optionSources = 4;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaOptionSourceOrBuilder> 
      getOptionSourcesOrBuilderList();
  /**
   * <code>repeated .model.MetaOptionSource optionSources = 4;</code>
   */
  com.sagas.meta.model.MetaOptionSourceOrBuilder getOptionSourcesOrBuilder(
      int index);

  /**
   * <code>string currentDescription = 5;</code>
   */
  java.lang.String getCurrentDescription();
  /**
   * <code>string currentDescription = 5;</code>
   */
  com.google.protobuf.ByteString
      getCurrentDescriptionBytes();

  /**
   * <code>string size = 6;</code>
   */
  java.lang.String getSize();
  /**
   * <code>string size = 6;</code>
   */
  com.google.protobuf.ByteString
      getSizeBytes();

  /**
   * <code>string textSize = 7;</code>
   */
  java.lang.String getTextSize();
  /**
   * <code>string textSize = 7;</code>
   */
  com.google.protobuf.ByteString
      getTextSizeBytes();

  /**
   * <code>int32 otherFieldSize = 8;</code>
   */
  int getOtherFieldSize();
}
