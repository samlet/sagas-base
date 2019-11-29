// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forms.proto

package com.sagas.meta.model;

public interface MetaEntityOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaEntityOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool cache = 1;</code>
   */
  boolean getCache();

  /**
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string entityName = 3;</code>
   */
  java.lang.String getEntityName();
  /**
   * <code>string entityName = 3;</code>
   */
  com.google.protobuf.ByteString
      getEntityNameBytes();

  /**
   * <code>string filterByDate = 4;</code>
   */
  java.lang.String getFilterByDate();
  /**
   * <code>string filterByDate = 4;</code>
   */
  com.google.protobuf.ByteString
      getFilterByDateBytes();

  /**
   * <code>string keyFieldName = 5;</code>
   */
  java.lang.String getKeyFieldName();
  /**
   * <code>string keyFieldName = 5;</code>
   */
  com.google.protobuf.ByteString
      getKeyFieldNameBytes();

  /**
   * <code>repeated string orderByList = 6;</code>
   */
  java.util.List<java.lang.String>
      getOrderByListList();
  /**
   * <code>repeated string orderByList = 6;</code>
   */
  int getOrderByListCount();
  /**
   * <code>repeated string orderByList = 6;</code>
   */
  java.lang.String getOrderByList(int index);
  /**
   * <code>repeated string orderByList = 6;</code>
   */
  com.google.protobuf.ByteString
      getOrderByListBytes(int index);

  /**
   * <code>repeated .model.MetaSingleOption optionValues = 7;</code>
   */
  java.util.List<com.sagas.meta.model.MetaSingleOption> 
      getOptionValuesList();
  /**
   * <code>repeated .model.MetaSingleOption optionValues = 7;</code>
   */
  com.sagas.meta.model.MetaSingleOption getOptionValues(int index);
  /**
   * <code>repeated .model.MetaSingleOption optionValues = 7;</code>
   */
  int getOptionValuesCount();
  /**
   * <code>repeated .model.MetaSingleOption optionValues = 7;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaSingleOptionOrBuilder> 
      getOptionValuesOrBuilderList();
  /**
   * <code>repeated .model.MetaSingleOption optionValues = 7;</code>
   */
  com.sagas.meta.model.MetaSingleOptionOrBuilder getOptionValuesOrBuilder(
      int index);
}
