// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

public interface MetaServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaService)
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
   * <code>string definitionLocation = 2;</code>
   */
  java.lang.String getDefinitionLocation();
  /**
   * <code>string definitionLocation = 2;</code>
   */
  com.google.protobuf.ByteString
      getDefinitionLocationBytes();

  /**
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string engineName = 4;</code>
   */
  java.lang.String getEngineName();
  /**
   * <code>string engineName = 4;</code>
   */
  com.google.protobuf.ByteString
      getEngineNameBytes();

  /**
   * <code>string nameSpace = 5;</code>
   */
  java.lang.String getNameSpace();
  /**
   * <code>string nameSpace = 5;</code>
   */
  com.google.protobuf.ByteString
      getNameSpaceBytes();

  /**
   * <code>string location = 6;</code>
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 6;</code>
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string invoke = 7;</code>
   */
  java.lang.String getInvoke();
  /**
   * <code>string invoke = 7;</code>
   */
  com.google.protobuf.ByteString
      getInvokeBytes();

  /**
   * <code>string defaultEntityName = 8;</code>
   */
  java.lang.String getDefaultEntityName();
  /**
   * <code>string defaultEntityName = 8;</code>
   */
  com.google.protobuf.ByteString
      getDefaultEntityNameBytes();

  /**
   * <code>bool auth = 9;</code>
   */
  boolean getAuth();

  /**
   * <code>bool export = 10;</code>
   */
  boolean getExport();

  /**
   * <code>bool debug = 11;</code>
   */
  boolean getDebug();

  /**
   * <code>bool validate = 12;</code>
   */
  boolean getValidate();

  /**
   * <pre>
   ** Permission service name 
   * </pre>
   *
   * <code>string permissionServiceName = 13;</code>
   */
  java.lang.String getPermissionServiceName();
  /**
   * <pre>
   ** Permission service name 
   * </pre>
   *
   * <code>string permissionServiceName = 13;</code>
   */
  com.google.protobuf.ByteString
      getPermissionServiceNameBytes();

  /**
   * <pre>
   ** Permission service main-action 
   * </pre>
   *
   * <code>string permissionMainAction = 14;</code>
   */
  java.lang.String getPermissionMainAction();
  /**
   * <pre>
   ** Permission service main-action 
   * </pre>
   *
   * <code>string permissionMainAction = 14;</code>
   */
  com.google.protobuf.ByteString
      getPermissionMainActionBytes();

  /**
   * <pre>
   ** Permission service resource-description 
   * </pre>
   *
   * <code>string permissionResourceDesc = 15;</code>
   */
  java.lang.String getPermissionResourceDesc();
  /**
   * <pre>
   ** Permission service resource-description 
   * </pre>
   *
   * <code>string permissionResourceDesc = 15;</code>
   */
  com.google.protobuf.ByteString
      getPermissionResourceDescBytes();

  /**
   * <pre>
   ** Set of services this service implements 
   * </pre>
   *
   * <code>repeated .model.MetaServiceIface implServices = 16;</code>
   */
  java.util.List<com.sagas.meta.model.MetaServiceIface> 
      getImplServicesList();
  /**
   * <pre>
   ** Set of services this service implements 
   * </pre>
   *
   * <code>repeated .model.MetaServiceIface implServices = 16;</code>
   */
  com.sagas.meta.model.MetaServiceIface getImplServices(int index);
  /**
   * <pre>
   ** Set of services this service implements 
   * </pre>
   *
   * <code>repeated .model.MetaServiceIface implServices = 16;</code>
   */
  int getImplServicesCount();
  /**
   * <pre>
   ** Set of services this service implements 
   * </pre>
   *
   * <code>repeated .model.MetaServiceIface implServices = 16;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaServiceIfaceOrBuilder> 
      getImplServicesOrBuilderList();
  /**
   * <pre>
   ** Set of services this service implements 
   * </pre>
   *
   * <code>repeated .model.MetaServiceIface implServices = 16;</code>
   */
  com.sagas.meta.model.MetaServiceIfaceOrBuilder getImplServicesOrBuilder(
      int index);

  /**
   * <code>repeated string overrideParameters = 17;</code>
   */
  java.util.List<java.lang.String>
      getOverrideParametersList();
  /**
   * <code>repeated string overrideParameters = 17;</code>
   */
  int getOverrideParametersCount();
  /**
   * <code>repeated string overrideParameters = 17;</code>
   */
  java.lang.String getOverrideParameters(int index);
  /**
   * <code>repeated string overrideParameters = 17;</code>
   */
  com.google.protobuf.ByteString
      getOverrideParametersBytes(int index);

  /**
   * <code>repeated .model.MetaPermGroup permissionGroups = 18;</code>
   */
  java.util.List<com.sagas.meta.model.MetaPermGroup> 
      getPermissionGroupsList();
  /**
   * <code>repeated .model.MetaPermGroup permissionGroups = 18;</code>
   */
  com.sagas.meta.model.MetaPermGroup getPermissionGroups(int index);
  /**
   * <code>repeated .model.MetaPermGroup permissionGroups = 18;</code>
   */
  int getPermissionGroupsCount();
  /**
   * <code>repeated .model.MetaPermGroup permissionGroups = 18;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaPermGroupOrBuilder> 
      getPermissionGroupsOrBuilderList();
  /**
   * <code>repeated .model.MetaPermGroup permissionGroups = 18;</code>
   */
  com.sagas.meta.model.MetaPermGroupOrBuilder getPermissionGroupsOrBuilder(
      int index);

  /**
   * <code>repeated .model.MetaNotification notifications = 19;</code>
   */
  java.util.List<com.sagas.meta.model.MetaNotification> 
      getNotificationsList();
  /**
   * <code>repeated .model.MetaNotification notifications = 19;</code>
   */
  com.sagas.meta.model.MetaNotification getNotifications(int index);
  /**
   * <code>repeated .model.MetaNotification notifications = 19;</code>
   */
  int getNotificationsCount();
  /**
   * <code>repeated .model.MetaNotification notifications = 19;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaNotificationOrBuilder> 
      getNotificationsOrBuilderList();
  /**
   * <code>repeated .model.MetaNotification notifications = 19;</code>
   */
  com.sagas.meta.model.MetaNotificationOrBuilder getNotificationsOrBuilder(
      int index);

  /**
   * <code>repeated .model.MetaParam parameters = 20;</code>
   */
  java.util.List<com.sagas.meta.model.MetaParam> 
      getParametersList();
  /**
   * <code>repeated .model.MetaParam parameters = 20;</code>
   */
  com.sagas.meta.model.MetaParam getParameters(int index);
  /**
   * <code>repeated .model.MetaParam parameters = 20;</code>
   */
  int getParametersCount();
  /**
   * <code>repeated .model.MetaParam parameters = 20;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaParamOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <code>repeated .model.MetaParam parameters = 20;</code>
   */
  com.sagas.meta.model.MetaParamOrBuilder getParametersOrBuilder(
      int index);
}