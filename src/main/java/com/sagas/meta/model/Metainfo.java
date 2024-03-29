// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

public final class Metainfo {
  private Metainfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_ErrorInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_ErrorInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaKeyMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaKeyMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaRelation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaRelation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaMemberEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaMemberEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaAliasAll_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaAliasAll_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaAlias_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaAlias_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaViewEntityCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaViewEntityCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaViewLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaViewLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaViewEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaViewEntity_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaViewEntity_MemberModelEntitiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaViewEntity_MemberModelEntitiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaServiceIface_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaServiceIface_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaPermission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaPermission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaPermGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaPermGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaParam_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaParam_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_MetaService_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_MetaService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_ServiceMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_ServiceMetrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016metainfo.proto\022\005model\"8\n\tMetaQuery\022\020\n\010" +
      "infoType\030\001 \001(\t\022\013\n\003uri\030\002 \001(\t\022\014\n\004data\030\003 \001(" +
      "\014\"A\n\013MetaPayload\022$\n\004type\030\001 \001(\0162\026.model.M" +
      "etaPayloadType\022\014\n\004body\030\002 \001(\014\"A\n\tErrorInf" +
      "o\022#\n\terrorType\030\001 \001(\0162\020.model.ErrorType\022\017" +
      "\n\007message\030\002 \001(\t\"\236\001\n\tMetaField\022\014\n\004name\030\001 " +
      "\001(\t\022\014\n\004type\030\002 \001(\t\022\n\n\002pk\030\003 \001(\010\022\017\n\007notNull" +
      "\030\004 \001(\010\022\033\n\023autoCreatedInternal\030\005 \001(\010\022\026\n\016e" +
      "nableAuditLog\030\006 \001(\010\022\022\n\nvalidators\030\007 \003(\t\022" +
      "\017\n\007encrypt\030\010 \001(\010\"G\n\nMetaKeyMap\022\021\n\tfieldN" +
      "ame\030\001 \001(\t\022\024\n\014relFieldName\030\002 \001(\t\022\020\n\010fullN" +
      "ame\030\003 \001(\t\"\242\001\n\014MetaRelation\022\r\n\005title\030\001 \001(" +
      "\t\022\014\n\004type\030\002 \001(\t\022\025\n\rrelEntityName\030\003 \001(\t\022\016" +
      "\n\006fkName\030\004 \001(\t\022\"\n\007keyMaps\030\005 \003(\0132\021.model." +
      "MetaKeyMap\022\024\n\014autoRelation\030\006 \001(\010\022\024\n\014comb" +
      "inedName\030\007 \001(\t\"\230\002\n\nMetaEntity\022\022\n\nentityN" +
      "ame\030\001 \001(\t\022\023\n\013packageName\030\002 \001(\t\022\023\n\013depend" +
      "entOn\030\003 \001(\t\022 \n\006fields\030\004 \003(\0132\020.model.Meta" +
      "Field\022&\n\trelations\030\005 \003(\0132\023.model.MetaRel" +
      "ation\022\024\n\014viewEntities\030\006 \003(\t\022\013\n\003pks\030\007 \003(\t" +
      "\022\r\n\005nopks\030\010 \003(\t\022\017\n\007version\030\t \001(\t\022\023\n\013desc" +
      "ription\030\n \001(\t\022\r\n\005title\030\013 \001(\t\022\033\n\023defaultR" +
      "esourceName\030\014 \001(\t\";\n\020MetaMemberEntity\022\023\n" +
      "\013entityAlias\030\001 \001(\t\022\022\n\nentityName\030\002 \001(\t\"\201" +
      "\001\n\014MetaAliasAll\022\023\n\013entityAlias\030\001 \001(\t\022\016\n\006" +
      "prefix\030\002 \001(\t\022\027\n\017fieldsToExclude\030\003 \003(\t\022\017\n" +
      "\007groupBy\030\004 \001(\010\022\020\n\010function\030\005 \001(\t\022\020\n\010fiel" +
      "dSet\030\006 \001(\t\"\275\001\n\tMetaAlias\022\023\n\013entityAlias\030" +
      "\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005field\030\003 \001(\t\022\020\n\010co" +
      "lAlias\030\004 \001(\t\022\n\n\002pk\030\005 \001(\010\022\017\n\007groupBy\030\006 \001(" +
      "\010\022\020\n\010function\030\007 \001(\t\022\020\n\010fieldSet\030\010 \001(\t\022\026\n" +
      "\016isFromAliasAll\030\t \001(\010\022\023\n\013description\030\n \001" +
      "(\t\"V\n\027MetaViewEntityCondition\022\024\n\014filterB" +
      "yDate\030\001 \001(\010\022\020\n\010distinct\030\002 \001(\010\022\023\n\013orderBy" +
      "List\030\003 \003(\t\"\261\001\n\014MetaViewLink\022\023\n\013entityAli" +
      "as\030\001 \001(\t\022\026\n\016relEntityAlias\030\002 \001(\t\022\023\n\013relO" +
      "ptional\030\003 \001(\010\022\"\n\007keyMaps\030\004 \003(\0132\021.model.M" +
      "etaKeyMap\022;\n\023viewEntityCondition\030\005 \001(\0132\036" +
      ".model.MetaViewEntityCondition\"\362\002\n\016MetaV" +
      "iewEntity\022\022\n\nentityName\030\001 \001(\t\022\023\n\013package" +
      "Name\030\002 \001(\t\022K\n\023memberModelEntities\030\003 \003(\0132" +
      "..model.MetaViewEntity.MemberModelEntiti" +
      "esEntry\022&\n\taliasAlls\030\004 \003(\0132\023.model.MetaA" +
      "liasAll\022!\n\007aliases\030\005 \003(\0132\020.model.MetaAli" +
      "as\022&\n\tviewLinks\030\006 \003(\0132\023.model.MetaViewLi" +
      "nk\022\"\n\010groupBys\030\007 \003(\0132\020.model.MetaField\032S" +
      "\n\030MemberModelEntitiesEntry\022\013\n\003key\030\001 \001(\t\022" +
      "&\n\005value\030\002 \001(\0132\027.model.MetaMemberEntity:" +
      "\0028\001\"5\n\020MetaServiceIface\022\017\n\007service\030\001 \001(\t" +
      "\022\020\n\010optional\030\002 \001(\010\"\276\001\n\016MetaPermission\022\026\n" +
      "\016permissionType\030\001 \001(\005\022\024\n\014serviceModel\030\002 " +
      "\001(\t\022\022\n\nnameOrRole\030\003 \001(\t\022\016\n\006action\030\004 \001(\t\022" +
      "\035\n\025permissionServiceName\030\005 \001(\t\022\036\n\026permis" +
      "sionResourceDesc\030\006 \001(\t\022\014\n\004auth\030\007 \001(\010\022\r\n\005" +
      "clazz\030\010 \001(\t\"M\n\rMetaPermGroup\022\020\n\010joinType" +
      "\030\001 \001(\t\022*\n\013permissions\030\002 \003(\0132\025.model.Meta" +
      "Permission\"f\n\020MetaNotification\022\035\n\025notifi" +
      "cationGroupName\030\001 \001(\t\022\031\n\021notificationEve" +
      "nt\030\002 \001(\t\022\030\n\020notificationMode\030\003 \001(\t\"\235\002\n\tM" +
      "etaParam\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 " +
      "\001(\t\022\014\n\004type\030\003 \001(\t\022\014\n\004mode\030\004 \001(\t\022\021\n\tformL" +
      "abel\030\005 \001(\t\022\022\n\nentityName\030\006 \001(\t\022\021\n\tfieldN" +
      "ame\030\007 \001(\t\022\024\n\014defaultValue\030\t \001(\t\022\020\n\010optio" +
      "nal\030\n \001(\010\022\030\n\020overrideOptional\030\013 \001(\010\022\023\n\013f" +
      "ormDisplay\030\014 \001(\010\022\033\n\023overrideFormDisplay\030" +
      "\r \001(\010\022\021\n\tallowHtml\030\016 \001(\t\022\020\n\010internal\030\017 \001" +
      "(\010\"\235\004\n\013MetaService\022\014\n\004name\030\001 \001(\t\022\032\n\022defi" +
      "nitionLocation\030\002 \001(\t\022\023\n\013description\030\003 \001(" +
      "\t\022\022\n\nengineName\030\004 \001(\t\022\021\n\tnameSpace\030\005 \001(\t" +
      "\022\020\n\010location\030\006 \001(\t\022\016\n\006invoke\030\007 \001(\t\022\031\n\021de" +
      "faultEntityName\030\010 \001(\t\022\014\n\004auth\030\t \001(\010\022\016\n\006e" +
      "xport\030\n \001(\010\022\r\n\005debug\030\013 \001(\010\022\020\n\010validate\030\014" +
      " \001(\010\022\035\n\025permissionServiceName\030\r \001(\t\022\034\n\024p" +
      "ermissionMainAction\030\016 \001(\t\022\036\n\026permissionR" +
      "esourceDesc\030\017 \001(\t\022-\n\014implServices\030\020 \003(\0132" +
      "\027.model.MetaServiceIface\022\032\n\022overridePara" +
      "meters\030\021 \003(\t\022.\n\020permissionGroups\030\022 \003(\0132\024" +
      ".model.MetaPermGroup\022.\n\rnotifications\030\023 " +
      "\003(\0132\027.model.MetaNotification\022$\n\nparamete" +
      "rs\030\024 \003(\0132\020.model.MetaParam\"[\n\016ServiceMet" +
      "rics\022\014\n\004name\030\001 \001(\t\022\023\n\013serviceRate\030\002 \001(\001\022" +
      "\021\n\tthreshold\030\003 \001(\001\022\023\n\013totalEvents\030\004 \001(\003*" +
      "\243\001\n\017MetaPayloadType\022\016\n\nERROR_INFO\020\000\022\017\n\013M" +
      "ETA_ENTITY\020\001\022\020\n\014META_SERVICE\020\002\022\020\n\014ENTITY" +
      "_VALUE\020\003\022\025\n\021ENTITY_VALUE_LIST\020\004\022\r\n\tMETA_" +
      "FORM\020\005\022\022\n\016META_FORM_DATA\020\006\022\021\n\rACTION_RES" +
      "ULT\020\007*S\n\tErrorType\022\013\n\007SUCCESS\020\000\022\r\n\tNOT_F" +
      "OUND\020\001\022\022\n\016UNSUPPORT_META\020\002\022\026\n\022RETRIEVE_I" +
      "NFO_FAIL\020\003B\030\n\024com.sagas.meta.modelP\001b\006pr" +
      "oto3"
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
    internal_static_model_MetaQuery_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_model_MetaQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaQuery_descriptor,
        new java.lang.String[] { "InfoType", "Uri", "Data", });
    internal_static_model_MetaPayload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_model_MetaPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaPayload_descriptor,
        new java.lang.String[] { "Type", "Body", });
    internal_static_model_ErrorInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_model_ErrorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_ErrorInfo_descriptor,
        new java.lang.String[] { "ErrorType", "Message", });
    internal_static_model_MetaField_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_model_MetaField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaField_descriptor,
        new java.lang.String[] { "Name", "Type", "Pk", "NotNull", "AutoCreatedInternal", "EnableAuditLog", "Validators", "Encrypt", });
    internal_static_model_MetaKeyMap_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_model_MetaKeyMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaKeyMap_descriptor,
        new java.lang.String[] { "FieldName", "RelFieldName", "FullName", });
    internal_static_model_MetaRelation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_model_MetaRelation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaRelation_descriptor,
        new java.lang.String[] { "Title", "Type", "RelEntityName", "FkName", "KeyMaps", "AutoRelation", "CombinedName", });
    internal_static_model_MetaEntity_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_model_MetaEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaEntity_descriptor,
        new java.lang.String[] { "EntityName", "PackageName", "DependentOn", "Fields", "Relations", "ViewEntities", "Pks", "Nopks", "Version", "Description", "Title", "DefaultResourceName", });
    internal_static_model_MetaMemberEntity_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_model_MetaMemberEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaMemberEntity_descriptor,
        new java.lang.String[] { "EntityAlias", "EntityName", });
    internal_static_model_MetaAliasAll_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_model_MetaAliasAll_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaAliasAll_descriptor,
        new java.lang.String[] { "EntityAlias", "Prefix", "FieldsToExclude", "GroupBy", "Function", "FieldSet", });
    internal_static_model_MetaAlias_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_model_MetaAlias_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaAlias_descriptor,
        new java.lang.String[] { "EntityAlias", "Name", "Field", "ColAlias", "Pk", "GroupBy", "Function", "FieldSet", "IsFromAliasAll", "Description", });
    internal_static_model_MetaViewEntityCondition_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_model_MetaViewEntityCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaViewEntityCondition_descriptor,
        new java.lang.String[] { "FilterByDate", "Distinct", "OrderByList", });
    internal_static_model_MetaViewLink_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_model_MetaViewLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaViewLink_descriptor,
        new java.lang.String[] { "EntityAlias", "RelEntityAlias", "RelOptional", "KeyMaps", "ViewEntityCondition", });
    internal_static_model_MetaViewEntity_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_model_MetaViewEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaViewEntity_descriptor,
        new java.lang.String[] { "EntityName", "PackageName", "MemberModelEntities", "AliasAlls", "Aliases", "ViewLinks", "GroupBys", });
    internal_static_model_MetaViewEntity_MemberModelEntitiesEntry_descriptor =
      internal_static_model_MetaViewEntity_descriptor.getNestedTypes().get(0);
    internal_static_model_MetaViewEntity_MemberModelEntitiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaViewEntity_MemberModelEntitiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_model_MetaServiceIface_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_model_MetaServiceIface_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaServiceIface_descriptor,
        new java.lang.String[] { "Service", "Optional", });
    internal_static_model_MetaPermission_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_model_MetaPermission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaPermission_descriptor,
        new java.lang.String[] { "PermissionType", "ServiceModel", "NameOrRole", "Action", "PermissionServiceName", "PermissionResourceDesc", "Auth", "Clazz", });
    internal_static_model_MetaPermGroup_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_model_MetaPermGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaPermGroup_descriptor,
        new java.lang.String[] { "JoinType", "Permissions", });
    internal_static_model_MetaNotification_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_model_MetaNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaNotification_descriptor,
        new java.lang.String[] { "NotificationGroupName", "NotificationEvent", "NotificationMode", });
    internal_static_model_MetaParam_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_model_MetaParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaParam_descriptor,
        new java.lang.String[] { "Name", "Description", "Type", "Mode", "FormLabel", "EntityName", "FieldName", "DefaultValue", "Optional", "OverrideOptional", "FormDisplay", "OverrideFormDisplay", "AllowHtml", "Internal", });
    internal_static_model_MetaService_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_model_MetaService_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_MetaService_descriptor,
        new java.lang.String[] { "Name", "DefinitionLocation", "Description", "EngineName", "NameSpace", "Location", "Invoke", "DefaultEntityName", "Auth", "Export", "Debug", "Validate", "PermissionServiceName", "PermissionMainAction", "PermissionResourceDesc", "ImplServices", "OverrideParameters", "PermissionGroups", "Notifications", "Parameters", });
    internal_static_model_ServiceMetrics_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_model_ServiceMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_ServiceMetrics_descriptor,
        new java.lang.String[] { "Name", "ServiceRate", "Threshold", "TotalEvents", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
