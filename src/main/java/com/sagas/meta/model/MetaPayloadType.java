// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

/**
 * <pre>
 * The type of payload that should be returned.
 * </pre>
 *
 * Protobuf enum {@code model.MetaPayloadType}
 */
public enum MetaPayloadType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Compressable text format.
   * </pre>
   *
   * <code>ERROR_INFO = 0;</code>
   */
  ERROR_INFO(0),
  /**
   * <code>META_ENTITY = 1;</code>
   */
  META_ENTITY(1),
  /**
   * <code>META_SERVICE = 2;</code>
   */
  META_SERVICE(2),
  /**
   * <code>ENTITY_VALUE = 3;</code>
   */
  ENTITY_VALUE(3),
  /**
   * <code>ENTITY_VALUE_LIST = 4;</code>
   */
  ENTITY_VALUE_LIST(4),
  /**
   * <code>META_FORM = 5;</code>
   */
  META_FORM(5),
  /**
   * <code>META_FORM_DATA = 6;</code>
   */
  META_FORM_DATA(6),
  /**
   * <code>ACTION_RESULT = 7;</code>
   */
  ACTION_RESULT(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Compressable text format.
   * </pre>
   *
   * <code>ERROR_INFO = 0;</code>
   */
  public static final int ERROR_INFO_VALUE = 0;
  /**
   * <code>META_ENTITY = 1;</code>
   */
  public static final int META_ENTITY_VALUE = 1;
  /**
   * <code>META_SERVICE = 2;</code>
   */
  public static final int META_SERVICE_VALUE = 2;
  /**
   * <code>ENTITY_VALUE = 3;</code>
   */
  public static final int ENTITY_VALUE_VALUE = 3;
  /**
   * <code>ENTITY_VALUE_LIST = 4;</code>
   */
  public static final int ENTITY_VALUE_LIST_VALUE = 4;
  /**
   * <code>META_FORM = 5;</code>
   */
  public static final int META_FORM_VALUE = 5;
  /**
   * <code>META_FORM_DATA = 6;</code>
   */
  public static final int META_FORM_DATA_VALUE = 6;
  /**
   * <code>ACTION_RESULT = 7;</code>
   */
  public static final int ACTION_RESULT_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MetaPayloadType valueOf(int value) {
    return forNumber(value);
  }

  public static MetaPayloadType forNumber(int value) {
    switch (value) {
      case 0: return ERROR_INFO;
      case 1: return META_ENTITY;
      case 2: return META_SERVICE;
      case 3: return ENTITY_VALUE;
      case 4: return ENTITY_VALUE_LIST;
      case 5: return META_FORM;
      case 6: return META_FORM_DATA;
      case 7: return ACTION_RESULT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MetaPayloadType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MetaPayloadType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MetaPayloadType>() {
          public MetaPayloadType findValueByNumber(int number) {
            return MetaPayloadType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.sagas.meta.model.Metainfo.getDescriptor().getEnumTypes().get(0);
  }

  private static final MetaPayloadType[] VALUES = values();

  public static MetaPayloadType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MetaPayloadType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:model.MetaPayloadType)
}
