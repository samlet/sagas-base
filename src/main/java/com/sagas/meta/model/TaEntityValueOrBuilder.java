// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: values.proto

package com.sagas.meta.model;

public interface TaEntityValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.TaEntityValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string entityName = 1;</code>
   */
  java.lang.String getEntityName();
  /**
   * <code>string entityName = 1;</code>
   */
  com.google.protobuf.ByteString
      getEntityNameBytes();

  /**
   * <code>bool mutable = 2;</code>
   */
  boolean getMutable();

  /**
   * <code>map&lt;string, .model.TaFieldValue&gt; fields = 3;</code>
   */
  int getFieldsCount();
  /**
   * <code>map&lt;string, .model.TaFieldValue&gt; fields = 3;</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.sagas.meta.model.TaFieldValue>
  getFields();
  /**
   * <code>map&lt;string, .model.TaFieldValue&gt; fields = 3;</code>
   */
  java.util.Map<java.lang.String, com.sagas.meta.model.TaFieldValue>
  getFieldsMap();
  /**
   * <code>map&lt;string, .model.TaFieldValue&gt; fields = 3;</code>
   */

  com.sagas.meta.model.TaFieldValue getFieldsOrDefault(
      java.lang.String key,
      com.sagas.meta.model.TaFieldValue defaultValue);
  /**
   * <code>map&lt;string, .model.TaFieldValue&gt; fields = 3;</code>
   */

  com.sagas.meta.model.TaFieldValue getFieldsOrThrow(
      java.lang.String key);
}
