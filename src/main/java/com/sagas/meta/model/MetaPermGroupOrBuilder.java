// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

public interface MetaPermGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaPermGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string joinType = 1;</code>
   */
  java.lang.String getJoinType();
  /**
   * <code>string joinType = 1;</code>
   */
  com.google.protobuf.ByteString
      getJoinTypeBytes();

  /**
   * <code>repeated .model.MetaPermission permissions = 2;</code>
   */
  java.util.List<com.sagas.meta.model.MetaPermission> 
      getPermissionsList();
  /**
   * <code>repeated .model.MetaPermission permissions = 2;</code>
   */
  com.sagas.meta.model.MetaPermission getPermissions(int index);
  /**
   * <code>repeated .model.MetaPermission permissions = 2;</code>
   */
  int getPermissionsCount();
  /**
   * <code>repeated .model.MetaPermission permissions = 2;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaPermissionOrBuilder> 
      getPermissionsOrBuilderList();
  /**
   * <code>repeated .model.MetaPermission permissions = 2;</code>
   */
  com.sagas.meta.model.MetaPermissionOrBuilder getPermissionsOrBuilder(
      int index);
}
