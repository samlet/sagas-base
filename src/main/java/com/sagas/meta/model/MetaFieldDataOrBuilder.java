// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forms.proto

package com.sagas.meta.model;

public interface MetaFieldDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaFieldData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string fieldName = 1;</code>
   */
  java.lang.String getFieldName();
  /**
   * <code>string fieldName = 1;</code>
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();

  /**
   * <code>string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>.model.MetaListValues listValues = 3;</code>
   */
  boolean hasListValues();
  /**
   * <code>.model.MetaListValues listValues = 3;</code>
   */
  com.sagas.meta.model.MetaListValues getListValues();
  /**
   * <code>.model.MetaListValues listValues = 3;</code>
   */
  com.sagas.meta.model.MetaListValuesOrBuilder getListValuesOrBuilder();

  /**
   * <code>string widgetType = 5;</code>
   */
  java.lang.String getWidgetType();
  /**
   * <code>string widgetType = 5;</code>
   */
  com.google.protobuf.ByteString
      getWidgetTypeBytes();

  /**
   * <code>map&lt;string, string&gt; widgetOptions = 6;</code>
   */
  int getWidgetOptionsCount();
  /**
   * <code>map&lt;string, string&gt; widgetOptions = 6;</code>
   */
  boolean containsWidgetOptions(
      java.lang.String key);
  /**
   * Use {@link #getWidgetOptionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getWidgetOptions();
  /**
   * <code>map&lt;string, string&gt; widgetOptions = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getWidgetOptionsMap();
  /**
   * <code>map&lt;string, string&gt; widgetOptions = 6;</code>
   */

  java.lang.String getWidgetOptionsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; widgetOptions = 6;</code>
   */

  java.lang.String getWidgetOptionsOrThrow(
      java.lang.String key);
}
