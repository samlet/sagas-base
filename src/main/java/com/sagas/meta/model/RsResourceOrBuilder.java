// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package com.sagas.meta.model;

public interface RsResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.RsResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */
  int getPropertiesCount();
  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */
  boolean containsProperties(
      java.lang.String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty>
  getProperties();
  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */
  java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty>
  getPropertiesMap();
  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */

  com.sagas.meta.model.RsProperty getPropertiesOrDefault(
      java.lang.String key,
      com.sagas.meta.model.RsProperty defaultValue);
  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */

  com.sagas.meta.model.RsProperty getPropertiesOrThrow(
      java.lang.String key);
}