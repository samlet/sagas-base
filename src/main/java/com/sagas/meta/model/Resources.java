// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package com.sagas.meta.model;

public final class Resources {
  private Resources() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsResource_PropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsResource_PropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsProperty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsProperty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsProperty_ValuesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsProperty_ValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsStrings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsStrings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsIndex_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsIndex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsIndex_IndexesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsIndex_IndexesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsLookups_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsLookups_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsLookups_IndexTableEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsLookups_IndexTableEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsEntityReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsEntityReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsEntities_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsEntities_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsEntities_FieldRefsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsEntities_FieldRefsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsLang_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsLang_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_RsLangs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_RsLangs_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017resources.proto\022\005model\"\211\001\n\nRsResource\022" +
      "5\n\nproperties\030\001 \003(\0132!.model.RsResource.P" +
      "ropertiesEntry\032D\n\017PropertiesEntry\022\013\n\003key" +
      "\030\001 \001(\t\022 \n\005value\030\002 \001(\0132\021.model.RsProperty" +
      ":\0028\001\"\211\001\n\nRsProperty\022\013\n\003key\030\001 \001(\t\022-\n\006valu" +
      "es\030\002 \003(\0132\035.model.RsProperty.ValuesEntry\022" +
      "\020\n\010location\030\003 \001(\t\032-\n\013ValuesEntry\022\013\n\003key\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\032\n\tRsStrings\022\r\n" +
      "\005value\030\001 \003(\t\"y\n\007RsIndex\022,\n\007indexes\030\001 \003(\013" +
      "2\033.model.RsIndex.IndexesEntry\032@\n\014Indexes" +
      "Entry\022\013\n\003key\030\001 \001(\t\022\037\n\005value\030\002 \001(\0132\020.mode" +
      "l.RsStrings:\0028\001\"\204\001\n\tRsLookups\0224\n\nindexTa" +
      "ble\030\001 \003(\0132 .model.RsLookups.IndexTableEn" +
      "try\032A\n\017IndexTableEntry\022\013\n\003key\030\001 \001(\t\022\035\n\005v" +
      "alue\030\002 \001(\0132\016.model.RsIndex:\0028\001\"4\n\021RsEnti" +
      "tyReference\022\020\n\010entities\030\001 \003(\t\022\r\n\005views\030\002" +
      " \003(\t\"\215\001\n\nRsEntities\0223\n\tfieldRefs\030\001 \003(\0132 " +
      ".model.RsEntities.FieldRefsEntry\032J\n\016Fiel" +
      "dRefsEntry\022\013\n\003key\030\001 \001(\t\022\'\n\005value\030\002 \001(\0132\030" +
      ".model.RsEntityReference:\0028\001\"K\n\006RsLang\022\017" +
      "\n\007entries\030\001 \003(\t\022\r\n\005store\030\002 \001(\014\022\r\n\005verbs\030" +
      "\003 \003(\t\022\022\n\nverbLemmas\030\004 \003(\t\"\'\n\007RsLangs\022\034\n\005" +
      "langs\030\001 \003(\0132\r.model.RsLangB\030\n\024com.sagas." +
      "meta.modelP\001b\006proto3"
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
        }, assigner);
    internal_static_model_RsResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_model_RsResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsResource_descriptor,
        new java.lang.String[] { "Properties", });
    internal_static_model_RsResource_PropertiesEntry_descriptor =
      internal_static_model_RsResource_descriptor.getNestedTypes().get(0);
    internal_static_model_RsResource_PropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsResource_PropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_model_RsProperty_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_model_RsProperty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsProperty_descriptor,
        new java.lang.String[] { "Key", "Values", "Location", });
    internal_static_model_RsProperty_ValuesEntry_descriptor =
      internal_static_model_RsProperty_descriptor.getNestedTypes().get(0);
    internal_static_model_RsProperty_ValuesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsProperty_ValuesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_model_RsStrings_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_model_RsStrings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsStrings_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_model_RsIndex_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_model_RsIndex_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsIndex_descriptor,
        new java.lang.String[] { "Indexes", });
    internal_static_model_RsIndex_IndexesEntry_descriptor =
      internal_static_model_RsIndex_descriptor.getNestedTypes().get(0);
    internal_static_model_RsIndex_IndexesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsIndex_IndexesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_model_RsLookups_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_model_RsLookups_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsLookups_descriptor,
        new java.lang.String[] { "IndexTable", });
    internal_static_model_RsLookups_IndexTableEntry_descriptor =
      internal_static_model_RsLookups_descriptor.getNestedTypes().get(0);
    internal_static_model_RsLookups_IndexTableEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsLookups_IndexTableEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_model_RsEntityReference_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_model_RsEntityReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsEntityReference_descriptor,
        new java.lang.String[] { "Entities", "Views", });
    internal_static_model_RsEntities_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_model_RsEntities_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsEntities_descriptor,
        new java.lang.String[] { "FieldRefs", });
    internal_static_model_RsEntities_FieldRefsEntry_descriptor =
      internal_static_model_RsEntities_descriptor.getNestedTypes().get(0);
    internal_static_model_RsEntities_FieldRefsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsEntities_FieldRefsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_model_RsLang_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_model_RsLang_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsLang_descriptor,
        new java.lang.String[] { "Entries", "Store", "Verbs", "VerbLemmas", });
    internal_static_model_RsLangs_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_model_RsLangs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_RsLangs_descriptor,
        new java.lang.String[] { "Langs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
