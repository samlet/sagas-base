// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services_common.proto

package com.sagas.meta.model;

public final class ServicesCommon {
  private ServicesCommon() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_Names_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_Names_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_InfoQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_InfoQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_InfoMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_InfoMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_InfoMap_InfoEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_InfoMap_InfoEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_ModifyInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_ModifyInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025services_common.proto\022\005model\032\016metainfo" +
      ".proto\032\014values.proto\"\025\n\005Names\022\014\n\004name\030\001 " +
      "\003(\t\"\037\n\tInfoQuery\022\022\n\nqueryItems\030\001 \003(\t\"^\n\007" +
      "InfoMap\022&\n\004info\030\001 \003(\0132\030.model.InfoMap.In" +
      "foEntry\032+\n\tInfoEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val" +
      "ue\030\002 \001(\t:\0028\001\",\n\nModifyInfo\022\r\n\005total\030\001 \001(" +
      "\003\022\017\n\007message\030\002 \001(\t2p\n\007SysInfo\0220\n\nGetSysI" +
      "nfo\022\020.model.InfoQuery\032\016.model.InfoMap\"\000\022" +
      "3\n\tQueryMeta\022\020.model.MetaQuery\032\022.model.M" +
      "etaPayload\"\0002\201\001\n\rEntityServant\0222\n\016GetEnt" +
      "ityNames\022\020.model.InfoQuery\032\014.model.Names" +
      "\"\000\022<\n\010StoreAll\022\033.model.TaStringEntriesBa" +
      "tch\032\021.model.ModifyInfo\"\000B\030\n\024com.sagas.me" +
      "ta.modelP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sagas.meta.model.Metainfo.getDescriptor(),
          com.sagas.meta.model.Values.getDescriptor(),
        }, assigner);
    internal_static_model_Names_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_model_Names_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_Names_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_model_InfoQuery_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_model_InfoQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_InfoQuery_descriptor,
        new java.lang.String[] { "QueryItems", });
    internal_static_model_InfoMap_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_model_InfoMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_InfoMap_descriptor,
        new java.lang.String[] { "Info", });
    internal_static_model_InfoMap_InfoEntry_descriptor =
      internal_static_model_InfoMap_descriptor.getNestedTypes().get(0);
    internal_static_model_InfoMap_InfoEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_InfoMap_InfoEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_model_ModifyInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_model_ModifyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_ModifyInfo_descriptor,
        new java.lang.String[] { "Total", "Message", });
    com.sagas.meta.model.Metainfo.getDescriptor();
    com.sagas.meta.model.Values.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
