// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: values.proto

package com.sagas.meta.model;

/**
 * Protobuf enum {@code model.JsonDataType}
 */
public enum JsonDataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MAP = 0;</code>
   */
  MAP(0),
  /**
   * <code>LIST = 1;</code>
   */
  LIST(1),
  /**
   * <code>SCALAR = 2;</code>
   */
  SCALAR(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MAP = 0;</code>
   */
  public static final int MAP_VALUE = 0;
  /**
   * <code>LIST = 1;</code>
   */
  public static final int LIST_VALUE = 1;
  /**
   * <code>SCALAR = 2;</code>
   */
  public static final int SCALAR_VALUE = 2;


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
  public static JsonDataType valueOf(int value) {
    return forNumber(value);
  }

  public static JsonDataType forNumber(int value) {
    switch (value) {
      case 0: return MAP;
      case 1: return LIST;
      case 2: return SCALAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JsonDataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JsonDataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JsonDataType>() {
          public JsonDataType findValueByNumber(int number) {
            return JsonDataType.forNumber(number);
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
    return com.sagas.meta.model.Values.getDescriptor().getEnumTypes().get(0);
  }

  private static final JsonDataType[] VALUES = values();

  public static JsonDataType valueOf(
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

  private JsonDataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:model.JsonDataType)
}
