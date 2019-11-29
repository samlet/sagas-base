// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.MetaField}
 */
public  final class MetaField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.MetaField)
    MetaFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaField.newBuilder() to construct.
  private MetaField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaField() {
    name_ = "";
    type_ = "";
    pk_ = false;
    notNull_ = false;
    autoCreatedInternal_ = false;
    enableAuditLog_ = false;
    validators_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    encrypt_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetaField(
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

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 24: {

            pk_ = input.readBool();
            break;
          }
          case 32: {

            notNull_ = input.readBool();
            break;
          }
          case 40: {

            autoCreatedInternal_ = input.readBool();
            break;
          }
          case 48: {

            enableAuditLog_ = input.readBool();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              validators_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000040;
            }
            validators_.add(s);
            break;
          }
          case 64: {

            encrypt_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        validators_ = validators_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sagas.meta.model.Metainfo.internal_static_model_MetaField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Metainfo.internal_static_model_MetaField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.MetaField.class, com.sagas.meta.model.MetaField.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 2;</code>
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
   * <code>string type = 2;</code>
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

  public static final int PK_FIELD_NUMBER = 3;
  private boolean pk_;
  /**
   * <code>bool pk = 3;</code>
   */
  public boolean getPk() {
    return pk_;
  }

  public static final int NOTNULL_FIELD_NUMBER = 4;
  private boolean notNull_;
  /**
   * <code>bool notNull = 4;</code>
   */
  public boolean getNotNull() {
    return notNull_;
  }

  public static final int AUTOCREATEDINTERNAL_FIELD_NUMBER = 5;
  private boolean autoCreatedInternal_;
  /**
   * <code>bool autoCreatedInternal = 5;</code>
   */
  public boolean getAutoCreatedInternal() {
    return autoCreatedInternal_;
  }

  public static final int ENABLEAUDITLOG_FIELD_NUMBER = 6;
  private boolean enableAuditLog_;
  /**
   * <code>bool enableAuditLog = 6;</code>
   */
  public boolean getEnableAuditLog() {
    return enableAuditLog_;
  }

  public static final int VALIDATORS_FIELD_NUMBER = 7;
  private com.google.protobuf.LazyStringList validators_;
  /**
   * <code>repeated string validators = 7;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getValidatorsList() {
    return validators_;
  }
  /**
   * <code>repeated string validators = 7;</code>
   */
  public int getValidatorsCount() {
    return validators_.size();
  }
  /**
   * <code>repeated string validators = 7;</code>
   */
  public java.lang.String getValidators(int index) {
    return validators_.get(index);
  }
  /**
   * <code>repeated string validators = 7;</code>
   */
  public com.google.protobuf.ByteString
      getValidatorsBytes(int index) {
    return validators_.getByteString(index);
  }

  public static final int ENCRYPT_FIELD_NUMBER = 8;
  private boolean encrypt_;
  /**
   * <code>bool encrypt = 8;</code>
   */
  public boolean getEncrypt() {
    return encrypt_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (pk_ != false) {
      output.writeBool(3, pk_);
    }
    if (notNull_ != false) {
      output.writeBool(4, notNull_);
    }
    if (autoCreatedInternal_ != false) {
      output.writeBool(5, autoCreatedInternal_);
    }
    if (enableAuditLog_ != false) {
      output.writeBool(6, enableAuditLog_);
    }
    for (int i = 0; i < validators_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, validators_.getRaw(i));
    }
    if (encrypt_ != false) {
      output.writeBool(8, encrypt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (pk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, pk_);
    }
    if (notNull_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, notNull_);
    }
    if (autoCreatedInternal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, autoCreatedInternal_);
    }
    if (enableAuditLog_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, enableAuditLog_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < validators_.size(); i++) {
        dataSize += computeStringSizeNoTag(validators_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValidatorsList().size();
    }
    if (encrypt_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, encrypt_);
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
    if (!(obj instanceof com.sagas.meta.model.MetaField)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.MetaField other = (com.sagas.meta.model.MetaField) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getType()
        .equals(other.getType());
    result = result && (getPk()
        == other.getPk());
    result = result && (getNotNull()
        == other.getNotNull());
    result = result && (getAutoCreatedInternal()
        == other.getAutoCreatedInternal());
    result = result && (getEnableAuditLog()
        == other.getEnableAuditLog());
    result = result && getValidatorsList()
        .equals(other.getValidatorsList());
    result = result && (getEncrypt()
        == other.getEncrypt());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + PK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPk());
    hash = (37 * hash) + NOTNULL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNotNull());
    hash = (37 * hash) + AUTOCREATEDINTERNAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoCreatedInternal());
    hash = (37 * hash) + ENABLEAUDITLOG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableAuditLog());
    if (getValidatorsCount() > 0) {
      hash = (37 * hash) + VALIDATORS_FIELD_NUMBER;
      hash = (53 * hash) + getValidatorsList().hashCode();
    }
    hash = (37 * hash) + ENCRYPT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEncrypt());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.MetaField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaField parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.MetaField prototype) {
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
   * Protobuf type {@code model.MetaField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.MetaField)
      com.sagas.meta.model.MetaFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.MetaField.class, com.sagas.meta.model.MetaField.Builder.class);
    }

    // Construct using com.sagas.meta.model.MetaField.newBuilder()
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
      name_ = "";

      type_ = "";

      pk_ = false;

      notNull_ = false;

      autoCreatedInternal_ = false;

      enableAuditLog_ = false;

      validators_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000040);
      encrypt_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaField_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaField getDefaultInstanceForType() {
      return com.sagas.meta.model.MetaField.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaField build() {
      com.sagas.meta.model.MetaField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaField buildPartial() {
      com.sagas.meta.model.MetaField result = new com.sagas.meta.model.MetaField(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.type_ = type_;
      result.pk_ = pk_;
      result.notNull_ = notNull_;
      result.autoCreatedInternal_ = autoCreatedInternal_;
      result.enableAuditLog_ = enableAuditLog_;
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        validators_ = validators_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000040);
      }
      result.validators_ = validators_;
      result.encrypt_ = encrypt_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.sagas.meta.model.MetaField) {
        return mergeFrom((com.sagas.meta.model.MetaField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.MetaField other) {
      if (other == com.sagas.meta.model.MetaField.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.getPk() != false) {
        setPk(other.getPk());
      }
      if (other.getNotNull() != false) {
        setNotNull(other.getNotNull());
      }
      if (other.getAutoCreatedInternal() != false) {
        setAutoCreatedInternal(other.getAutoCreatedInternal());
      }
      if (other.getEnableAuditLog() != false) {
        setEnableAuditLog(other.getEnableAuditLog());
      }
      if (!other.validators_.isEmpty()) {
        if (validators_.isEmpty()) {
          validators_ = other.validators_;
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          ensureValidatorsIsMutable();
          validators_.addAll(other.validators_);
        }
        onChanged();
      }
      if (other.getEncrypt() != false) {
        setEncrypt(other.getEncrypt());
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
      com.sagas.meta.model.MetaField parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.MetaField) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 2;</code>
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
     * <code>string type = 2;</code>
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
     * <code>string type = 2;</code>
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
     * <code>string type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
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

    private boolean pk_ ;
    /**
     * <code>bool pk = 3;</code>
     */
    public boolean getPk() {
      return pk_;
    }
    /**
     * <code>bool pk = 3;</code>
     */
    public Builder setPk(boolean value) {
      
      pk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool pk = 3;</code>
     */
    public Builder clearPk() {
      
      pk_ = false;
      onChanged();
      return this;
    }

    private boolean notNull_ ;
    /**
     * <code>bool notNull = 4;</code>
     */
    public boolean getNotNull() {
      return notNull_;
    }
    /**
     * <code>bool notNull = 4;</code>
     */
    public Builder setNotNull(boolean value) {
      
      notNull_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool notNull = 4;</code>
     */
    public Builder clearNotNull() {
      
      notNull_ = false;
      onChanged();
      return this;
    }

    private boolean autoCreatedInternal_ ;
    /**
     * <code>bool autoCreatedInternal = 5;</code>
     */
    public boolean getAutoCreatedInternal() {
      return autoCreatedInternal_;
    }
    /**
     * <code>bool autoCreatedInternal = 5;</code>
     */
    public Builder setAutoCreatedInternal(boolean value) {
      
      autoCreatedInternal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool autoCreatedInternal = 5;</code>
     */
    public Builder clearAutoCreatedInternal() {
      
      autoCreatedInternal_ = false;
      onChanged();
      return this;
    }

    private boolean enableAuditLog_ ;
    /**
     * <code>bool enableAuditLog = 6;</code>
     */
    public boolean getEnableAuditLog() {
      return enableAuditLog_;
    }
    /**
     * <code>bool enableAuditLog = 6;</code>
     */
    public Builder setEnableAuditLog(boolean value) {
      
      enableAuditLog_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enableAuditLog = 6;</code>
     */
    public Builder clearEnableAuditLog() {
      
      enableAuditLog_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList validators_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureValidatorsIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        validators_ = new com.google.protobuf.LazyStringArrayList(validators_);
        bitField0_ |= 0x00000040;
       }
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getValidatorsList() {
      return validators_.getUnmodifiableView();
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public int getValidatorsCount() {
      return validators_.size();
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public java.lang.String getValidators(int index) {
      return validators_.get(index);
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public com.google.protobuf.ByteString
        getValidatorsBytes(int index) {
      return validators_.getByteString(index);
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public Builder setValidators(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValidatorsIsMutable();
      validators_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public Builder addValidators(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureValidatorsIsMutable();
      validators_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public Builder addAllValidators(
        java.lang.Iterable<java.lang.String> values) {
      ensureValidatorsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, validators_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public Builder clearValidators() {
      validators_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string validators = 7;</code>
     */
    public Builder addValidatorsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureValidatorsIsMutable();
      validators_.add(value);
      onChanged();
      return this;
    }

    private boolean encrypt_ ;
    /**
     * <code>bool encrypt = 8;</code>
     */
    public boolean getEncrypt() {
      return encrypt_;
    }
    /**
     * <code>bool encrypt = 8;</code>
     */
    public Builder setEncrypt(boolean value) {
      
      encrypt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool encrypt = 8;</code>
     */
    public Builder clearEncrypt() {
      
      encrypt_ = false;
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


    // @@protoc_insertion_point(builder_scope:model.MetaField)
  }

  // @@protoc_insertion_point(class_scope:model.MetaField)
  private static final com.sagas.meta.model.MetaField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.MetaField();
  }

  public static com.sagas.meta.model.MetaField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetaField>
      PARSER = new com.google.protobuf.AbstractParser<MetaField>() {
    @java.lang.Override
    public MetaField parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetaField(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetaField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.MetaField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

