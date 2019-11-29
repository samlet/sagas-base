// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forms.proto

package com.sagas.meta.model;

/**
 * Protobuf enum {@code model.MetaFormFieldType}
 */
public enum MetaFormFieldType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>DISPLAY = 1;</code>
   */
  DISPLAY(1),
  /**
   * <code>HYPERLINK = 2;</code>
   */
  HYPERLINK(2),
  /**
   * <code>TEXT = 3;</code>
   */
  TEXT(3),
  /**
   * <code>TEXTAREA = 4;</code>
   */
  TEXTAREA(4),
  /**
   * <code>DATE_TIME = 5;</code>
   */
  DATE_TIME(5),
  /**
   * <code>DROP_DOWN = 6;</code>
   */
  DROP_DOWN(6),
  /**
   * <code>CHECK = 7;</code>
   */
  CHECK(7),
  /**
   * <code>RADIO = 8;</code>
   */
  RADIO(8),
  /**
   * <code>SUBMIT = 9;</code>
   */
  SUBMIT(9),
  /**
   * <code>RESET = 10;</code>
   */
  RESET(10),
  /**
   * <code>HIDDEN = 11;</code>
   */
  HIDDEN(11),
  /**
   * <code>IGNORED = 12;</code>
   */
  IGNORED(12),
  /**
   * <code>TEXTQBE = 13;</code>
   */
  TEXTQBE(13),
  /**
   * <code>DATEQBE = 14;</code>
   */
  DATEQBE(14),
  /**
   * <code>RANGEQBE = 15;</code>
   */
  RANGEQBE(15),
  /**
   * <code>LOOKUP = 16;</code>
   */
  LOOKUP(16),
  /**
   * <code>FILE = 17;</code>
   */
  FILE(17),
  /**
   * <code>PASSWORD = 18;</code>
   */
  PASSWORD(18),
  /**
   * <code>IMAGE = 19;</code>
   */
  IMAGE(19),
  /**
   * <code>DISPLAY_ENTITY = 20;</code>
   */
  DISPLAY_ENTITY(20),
  /**
   * <code>CONTAINER = 21;</code>
   */
  CONTAINER(21),
  /**
   * <code>MENU = 22;</code>
   */
  MENU(22),
  /**
   * <code>FORM = 23;</code>
   */
  FORM(23),
  /**
   * <code>GRID = 24;</code>
   */
  GRID(24),
  /**
   * <code>SCREEN = 25;</code>
   */
  SCREEN(25),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>DISPLAY = 1;</code>
   */
  public static final int DISPLAY_VALUE = 1;
  /**
   * <code>HYPERLINK = 2;</code>
   */
  public static final int HYPERLINK_VALUE = 2;
  /**
   * <code>TEXT = 3;</code>
   */
  public static final int TEXT_VALUE = 3;
  /**
   * <code>TEXTAREA = 4;</code>
   */
  public static final int TEXTAREA_VALUE = 4;
  /**
   * <code>DATE_TIME = 5;</code>
   */
  public static final int DATE_TIME_VALUE = 5;
  /**
   * <code>DROP_DOWN = 6;</code>
   */
  public static final int DROP_DOWN_VALUE = 6;
  /**
   * <code>CHECK = 7;</code>
   */
  public static final int CHECK_VALUE = 7;
  /**
   * <code>RADIO = 8;</code>
   */
  public static final int RADIO_VALUE = 8;
  /**
   * <code>SUBMIT = 9;</code>
   */
  public static final int SUBMIT_VALUE = 9;
  /**
   * <code>RESET = 10;</code>
   */
  public static final int RESET_VALUE = 10;
  /**
   * <code>HIDDEN = 11;</code>
   */
  public static final int HIDDEN_VALUE = 11;
  /**
   * <code>IGNORED = 12;</code>
   */
  public static final int IGNORED_VALUE = 12;
  /**
   * <code>TEXTQBE = 13;</code>
   */
  public static final int TEXTQBE_VALUE = 13;
  /**
   * <code>DATEQBE = 14;</code>
   */
  public static final int DATEQBE_VALUE = 14;
  /**
   * <code>RANGEQBE = 15;</code>
   */
  public static final int RANGEQBE_VALUE = 15;
  /**
   * <code>LOOKUP = 16;</code>
   */
  public static final int LOOKUP_VALUE = 16;
  /**
   * <code>FILE = 17;</code>
   */
  public static final int FILE_VALUE = 17;
  /**
   * <code>PASSWORD = 18;</code>
   */
  public static final int PASSWORD_VALUE = 18;
  /**
   * <code>IMAGE = 19;</code>
   */
  public static final int IMAGE_VALUE = 19;
  /**
   * <code>DISPLAY_ENTITY = 20;</code>
   */
  public static final int DISPLAY_ENTITY_VALUE = 20;
  /**
   * <code>CONTAINER = 21;</code>
   */
  public static final int CONTAINER_VALUE = 21;
  /**
   * <code>MENU = 22;</code>
   */
  public static final int MENU_VALUE = 22;
  /**
   * <code>FORM = 23;</code>
   */
  public static final int FORM_VALUE = 23;
  /**
   * <code>GRID = 24;</code>
   */
  public static final int GRID_VALUE = 24;
  /**
   * <code>SCREEN = 25;</code>
   */
  public static final int SCREEN_VALUE = 25;


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
  public static MetaFormFieldType valueOf(int value) {
    return forNumber(value);
  }

  public static MetaFormFieldType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return DISPLAY;
      case 2: return HYPERLINK;
      case 3: return TEXT;
      case 4: return TEXTAREA;
      case 5: return DATE_TIME;
      case 6: return DROP_DOWN;
      case 7: return CHECK;
      case 8: return RADIO;
      case 9: return SUBMIT;
      case 10: return RESET;
      case 11: return HIDDEN;
      case 12: return IGNORED;
      case 13: return TEXTQBE;
      case 14: return DATEQBE;
      case 15: return RANGEQBE;
      case 16: return LOOKUP;
      case 17: return FILE;
      case 18: return PASSWORD;
      case 19: return IMAGE;
      case 20: return DISPLAY_ENTITY;
      case 21: return CONTAINER;
      case 22: return MENU;
      case 23: return FORM;
      case 24: return GRID;
      case 25: return SCREEN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MetaFormFieldType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MetaFormFieldType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MetaFormFieldType>() {
          public MetaFormFieldType findValueByNumber(int number) {
            return MetaFormFieldType.forNumber(number);
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
    return com.sagas.meta.model.Forms.getDescriptor().getEnumTypes().get(0);
  }

  private static final MetaFormFieldType[] VALUES = values();

  public static MetaFormFieldType valueOf(
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

  private MetaFormFieldType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:model.MetaFormFieldType)
}

