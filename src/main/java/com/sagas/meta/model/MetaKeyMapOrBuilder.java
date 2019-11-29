// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

public interface MetaKeyMapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaKeyMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** name of the field in this entity 
   * </pre>
   *
   * <code>string fieldName = 1;</code>
   */
  java.lang.String getFieldName();
  /**
   * <pre>
   ** name of the field in this entity 
   * </pre>
   *
   * <code>string fieldName = 1;</code>
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();

  /**
   * <pre>
   ** name of the field in related entity 
   * </pre>
   *
   * <code>string relFieldName = 2;</code>
   */
  java.lang.String getRelFieldName();
  /**
   * <pre>
   ** name of the field in related entity 
   * </pre>
   *
   * <code>string relFieldName = 2;</code>
   */
  com.google.protobuf.ByteString
      getRelFieldNameBytes();

  /**
   * <pre>
   ** Full name of the key map (fieldName:relFieldName) 
   * </pre>
   *
   * <code>string fullName = 3;</code>
   */
  java.lang.String getFullName();
  /**
   * <pre>
   ** Full name of the key map (fieldName:relFieldName) 
   * </pre>
   *
   * <code>string fullName = 3;</code>
   */
  com.google.protobuf.ByteString
      getFullNameBytes();
}