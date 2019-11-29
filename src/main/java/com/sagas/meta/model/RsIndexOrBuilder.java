// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package com.sagas.meta.model;

public interface RsIndexOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.RsIndex)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * key is lookup value, value is property key
   * </pre>
   *
   * <code>map&lt;string, .model.RsStrings&gt; indexes = 1;</code>
   */
  int getIndexesCount();
  /**
   * <pre>
   * key is lookup value, value is property key
   * </pre>
   *
   * <code>map&lt;string, .model.RsStrings&gt; indexes = 1;</code>
   */
  boolean containsIndexes(
      java.lang.String key);
  /**
   * Use {@link #getIndexesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.sagas.meta.model.RsStrings>
  getIndexes();
  /**
   * <pre>
   * key is lookup value, value is property key
   * </pre>
   *
   * <code>map&lt;string, .model.RsStrings&gt; indexes = 1;</code>
   */
  java.util.Map<java.lang.String, com.sagas.meta.model.RsStrings>
  getIndexesMap();
  /**
   * <pre>
   * key is lookup value, value is property key
   * </pre>
   *
   * <code>map&lt;string, .model.RsStrings&gt; indexes = 1;</code>
   */

  com.sagas.meta.model.RsStrings getIndexesOrDefault(
      java.lang.String key,
      com.sagas.meta.model.RsStrings defaultValue);
  /**
   * <pre>
   * key is lookup value, value is property key
   * </pre>
   *
   * <code>map&lt;string, .model.RsStrings&gt; indexes = 1;</code>
   */

  com.sagas.meta.model.RsStrings getIndexesOrThrow(
      java.lang.String key);
}
