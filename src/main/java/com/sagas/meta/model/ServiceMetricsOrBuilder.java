// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

public interface ServiceMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.ServiceMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double serviceRate = 2;</code>
   */
  double getServiceRate();

  /**
   * <code>double threshold = 3;</code>
   */
  double getThreshold();

  /**
   * <code>int64 totalEvents = 4;</code>
   */
  long getTotalEvents();
}