// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forms.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.MetaDateTimeField}
 */
public  final class MetaDateTimeField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.MetaDateTimeField)
    MetaDateTimeFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaDateTimeField.newBuilder() to construct.
  private MetaDateTimeField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaDateTimeField() {
    clock_ = "";
    defaultValue_ = "";
    inputMethod_ = "";
    mask_ = "";
    step_ = "";
    type_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetaDateTimeField(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            clock_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            defaultValue_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            inputMethod_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            mask_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            step_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sagas.meta.model.Forms.internal_static_model_MetaDateTimeField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Forms.internal_static_model_MetaDateTimeField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.MetaDateTimeField.class, com.sagas.meta.model.MetaDateTimeField.Builder.class);
  }

  public static final int CLOCK_FIELD_NUMBER = 1;
  private volatile java.lang.Object clock_;
  /**
   * <code>string clock = 1;</code>
   */
  public java.lang.String getClock() {
    java.lang.Object ref = clock_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clock_ = s;
      return s;
    }
  }
  /**
   * <code>string clock = 1;</code>
   */
  public com.google.protobuf.ByteString
      getClockBytes() {
    java.lang.Object ref = clock_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clock_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEFAULTVALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object defaultValue_;
  /**
   * <code>string defaultValue = 2;</code>
   */
  public java.lang.String getDefaultValue() {
    java.lang.Object ref = defaultValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      defaultValue_ = s;
      return s;
    }
  }
  /**
   * <code>string defaultValue = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDefaultValueBytes() {
    java.lang.Object ref = defaultValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      defaultValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUTMETHOD_FIELD_NUMBER = 3;
  private volatile java.lang.Object inputMethod_;
  /**
   * <code>string inputMethod = 3;</code>
   */
  public java.lang.String getInputMethod() {
    java.lang.Object ref = inputMethod_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputMethod_ = s;
      return s;
    }
  }
  /**
   * <code>string inputMethod = 3;</code>
   */
  public com.google.protobuf.ByteString
      getInputMethodBytes() {
    java.lang.Object ref = inputMethod_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inputMethod_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MASK_FIELD_NUMBER = 4;
  private volatile java.lang.Object mask_;
  /**
   * <code>string mask = 4;</code>
   */
  public java.lang.String getMask() {
    java.lang.Object ref = mask_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mask_ = s;
      return s;
    }
  }
  /**
   * <code>string mask = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMaskBytes() {
    java.lang.Object ref = mask_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mask_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STEP_FIELD_NUMBER = 5;
  private volatile java.lang.Object step_;
  /**
   * <code>string step = 5;</code>
   */
  public java.lang.String getStep() {
    java.lang.Object ref = step_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      step_ = s;
      return s;
    }
  }
  /**
   * <code>string step = 5;</code>
   */
  public com.google.protobuf.ByteString
      getStepBytes() {
    java.lang.Object ref = step_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      step_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 6;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 6;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 6;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getClockBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clock_);
    }
    if (!getDefaultValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, defaultValue_);
    }
    if (!getInputMethodBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, inputMethod_);
    }
    if (!getMaskBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, mask_);
    }
    if (!getStepBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, step_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClockBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clock_);
    }
    if (!getDefaultValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, defaultValue_);
    }
    if (!getInputMethodBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, inputMethod_);
    }
    if (!getMaskBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, mask_);
    }
    if (!getStepBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, step_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, type_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.sagas.meta.model.MetaDateTimeField)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.MetaDateTimeField other = (com.sagas.meta.model.MetaDateTimeField) obj;

    boolean result = true;
    result = result && getClock()
        .equals(other.getClock());
    result = result && getDefaultValue()
        .equals(other.getDefaultValue());
    result = result && getInputMethod()
        .equals(other.getInputMethod());
    result = result && getMask()
        .equals(other.getMask());
    result = result && getStep()
        .equals(other.getStep());
    result = result && getType()
        .equals(other.getType());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLOCK_FIELD_NUMBER;
    hash = (53 * hash) + getClock().hashCode();
    hash = (37 * hash) + DEFAULTVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getDefaultValue().hashCode();
    hash = (37 * hash) + INPUTMETHOD_FIELD_NUMBER;
    hash = (53 * hash) + getInputMethod().hashCode();
    hash = (37 * hash) + MASK_FIELD_NUMBER;
    hash = (53 * hash) + getMask().hashCode();
    hash = (37 * hash) + STEP_FIELD_NUMBER;
    hash = (53 * hash) + getStep().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.MetaDateTimeField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaDateTimeField parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.sagas.meta.model.MetaDateTimeField prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code model.MetaDateTimeField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.MetaDateTimeField)
      com.sagas.meta.model.MetaDateTimeFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Forms.internal_static_model_MetaDateTimeField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Forms.internal_static_model_MetaDateTimeField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.MetaDateTimeField.class, com.sagas.meta.model.MetaDateTimeField.Builder.class);
    }

    // Construct using com.sagas.meta.model.MetaDateTimeField.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      clock_ = "";

      defaultValue_ = "";

      inputMethod_ = "";

      mask_ = "";

      step_ = "";

      type_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Forms.internal_static_model_MetaDateTimeField_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaDateTimeField getDefaultInstanceForType() {
      return com.sagas.meta.model.MetaDateTimeField.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaDateTimeField build() {
      com.sagas.meta.model.MetaDateTimeField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaDateTimeField buildPartial() {
      com.sagas.meta.model.MetaDateTimeField result = new com.sagas.meta.model.MetaDateTimeField(this);
      result.clock_ = clock_;
      result.defaultValue_ = defaultValue_;
      result.inputMethod_ = inputMethod_;
      result.mask_ = mask_;
      result.step_ = step_;
      result.type_ = type_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sagas.meta.model.MetaDateTimeField) {
        return mergeFrom((com.sagas.meta.model.MetaDateTimeField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.MetaDateTimeField other) {
      if (other == com.sagas.meta.model.MetaDateTimeField.getDefaultInstance()) return this;
      if (!other.getClock().isEmpty()) {
        clock_ = other.clock_;
        onChanged();
      }
      if (!other.getDefaultValue().isEmpty()) {
        defaultValue_ = other.defaultValue_;
        onChanged();
      }
      if (!other.getInputMethod().isEmpty()) {
        inputMethod_ = other.inputMethod_;
        onChanged();
      }
      if (!other.getMask().isEmpty()) {
        mask_ = other.mask_;
        onChanged();
      }
      if (!other.getStep().isEmpty()) {
        step_ = other.step_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.sagas.meta.model.MetaDateTimeField parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.MetaDateTimeField) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clock_ = "";
    /**
     * <code>string clock = 1;</code>
     */
    public java.lang.String getClock() {
      java.lang.Object ref = clock_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clock_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clock = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClockBytes() {
      java.lang.Object ref = clock_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clock_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clock = 1;</code>
     */
    public Builder setClock(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clock = 1;</code>
     */
    public Builder clearClock() {
      
      clock_ = getDefaultInstance().getClock();
      onChanged();
      return this;
    }
    /**
     * <code>string clock = 1;</code>
     */
    public Builder setClockBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clock_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object defaultValue_ = "";
    /**
     * <code>string defaultValue = 2;</code>
     */
    public java.lang.String getDefaultValue() {
      java.lang.Object ref = defaultValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        defaultValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string defaultValue = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDefaultValueBytes() {
      java.lang.Object ref = defaultValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        defaultValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string defaultValue = 2;</code>
     */
    public Builder setDefaultValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      defaultValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string defaultValue = 2;</code>
     */
    public Builder clearDefaultValue() {
      
      defaultValue_ = getDefaultInstance().getDefaultValue();
      onChanged();
      return this;
    }
    /**
     * <code>string defaultValue = 2;</code>
     */
    public Builder setDefaultValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      defaultValue_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object inputMethod_ = "";
    /**
     * <code>string inputMethod = 3;</code>
     */
    public java.lang.String getInputMethod() {
      java.lang.Object ref = inputMethod_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputMethod_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inputMethod = 3;</code>
     */
    public com.google.protobuf.ByteString
        getInputMethodBytes() {
      java.lang.Object ref = inputMethod_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputMethod_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inputMethod = 3;</code>
     */
    public Builder setInputMethod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inputMethod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string inputMethod = 3;</code>
     */
    public Builder clearInputMethod() {
      
      inputMethod_ = getDefaultInstance().getInputMethod();
      onChanged();
      return this;
    }
    /**
     * <code>string inputMethod = 3;</code>
     */
    public Builder setInputMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      inputMethod_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object mask_ = "";
    /**
     * <code>string mask = 4;</code>
     */
    public java.lang.String getMask() {
      java.lang.Object ref = mask_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mask_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mask = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMaskBytes() {
      java.lang.Object ref = mask_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mask_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mask = 4;</code>
     */
    public Builder setMask(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mask_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mask = 4;</code>
     */
    public Builder clearMask() {
      
      mask_ = getDefaultInstance().getMask();
      onChanged();
      return this;
    }
    /**
     * <code>string mask = 4;</code>
     */
    public Builder setMaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mask_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object step_ = "";
    /**
     * <code>string step = 5;</code>
     */
    public java.lang.String getStep() {
      java.lang.Object ref = step_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        step_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string step = 5;</code>
     */
    public com.google.protobuf.ByteString
        getStepBytes() {
      java.lang.Object ref = step_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        step_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string step = 5;</code>
     */
    public Builder setStep(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      step_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string step = 5;</code>
     */
    public Builder clearStep() {
      
      step_ = getDefaultInstance().getStep();
      onChanged();
      return this;
    }
    /**
     * <code>string step = 5;</code>
     */
    public Builder setStepBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      step_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 6;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 6;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 6;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 6;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 6;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:model.MetaDateTimeField)
  }

  // @@protoc_insertion_point(class_scope:model.MetaDateTimeField)
  private static final com.sagas.meta.model.MetaDateTimeField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.MetaDateTimeField();
  }

  public static com.sagas.meta.model.MetaDateTimeField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetaDateTimeField>
      PARSER = new com.google.protobuf.AbstractParser<MetaDateTimeField>() {
    @java.lang.Override
    public MetaDateTimeField parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetaDateTimeField(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetaDateTimeField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaDateTimeField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.MetaDateTimeField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

