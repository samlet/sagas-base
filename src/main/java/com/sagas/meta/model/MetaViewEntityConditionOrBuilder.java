// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

public interface MetaViewEntityConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaViewEntityCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool filterByDate = 1;</code>
   */
  boolean getFilterByDate();

  /**
   * <code>bool distinct = 2;</code>
   */
  boolean getDistinct();

  /**
   * <code>repeated string orderByList = 3;</code>
   */
  java.util.List<java.lang.String>
      getOrderByListList();
  /**
   * <code>repeated string orderByList = 3;</code>
   */
  int getOrderByListCount();
  /**
   * <code>repeated string orderByList = 3;</code>
   */
  java.lang.String getOrderByList(int index);
  /**
   * <code>repeated string orderByList = 3;</code>
   */
  com.google.protobuf.ByteString
      getOrderByListBytes(int index);
}