// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services_common.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.Names}
 */
public  final class Names extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.Names)
    NamesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Names.newBuilder() to construct.
  private Names(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Names() {
    name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Names(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              name_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            name_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        name_ = name_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sagas.meta.model.ServicesCommon.internal_static_model_Names_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.ServicesCommon.internal_static_model_Names_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.Names.class, com.sagas.meta.model.Names.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList name_;
  /**
   * <code>repeated string name = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getNameList() {
    return name_;
  }
  /**
   * <code>repeated string name = 1;</code>
   */
  public int getNameCount() {
    return name_.size();
  }
  /**
   * <code>repeated string name = 1;</code>
   */
  public java.lang.String getName(int index) {
    return name_.get(index);
  }
  /**
   * <code>repeated string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes(int index) {
    return name_.getByteString(index);
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
    for (int i = 0; i < name_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < name_.size(); i++) {
        dataSize += computeStringSizeNoTag(name_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNameList().size();
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
    if (!(obj instanceof com.sagas.meta.model.Names)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.Names other = (com.sagas.meta.model.Names) obj;

    boolean result = true;
    result = result && getNameList()
        .equals(other.getNameList());
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
    if (getNameCount() > 0) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getNameList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.Names parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.Names parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.Names parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.Names parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.Names parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.Names parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.Names parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.Names parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.Names parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.Names parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.Names parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.Names parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.Names prototype) {
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
   * Protobuf type {@code model.Names}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.Names)
      com.sagas.meta.model.NamesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.ServicesCommon.internal_static_model_Names_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.ServicesCommon.internal_static_model_Names_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.Names.class, com.sagas.meta.model.Names.Builder.class);
    }

    // Construct using com.sagas.meta.model.Names.newBuilder()
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
      name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.ServicesCommon.internal_static_model_Names_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.Names getDefaultInstanceForType() {
      return com.sagas.meta.model.Names.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.Names build() {
      com.sagas.meta.model.Names result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.Names buildPartial() {
      com.sagas.meta.model.Names result = new com.sagas.meta.model.Names(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        name_ = name_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.name_ = name_;
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
      if (other instanceof com.sagas.meta.model.Names) {
        return mergeFrom((com.sagas.meta.model.Names)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.Names other) {
      if (other == com.sagas.meta.model.Names.getDefaultInstance()) return this;
      if (!other.name_.isEmpty()) {
        if (name_.isEmpty()) {
          name_ = other.name_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNameIsMutable();
          name_.addAll(other.name_);
        }
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
      com.sagas.meta.model.Names parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.Names) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNameIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        name_ = new com.google.protobuf.LazyStringArrayList(name_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getNameList() {
      return name_.getUnmodifiableView();
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public int getNameCount() {
      return name_.size();
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public java.lang.String getName(int index) {
      return name_.get(index);
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes(int index) {
      return name_.getByteString(index);
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public Builder setName(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
      name_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public Builder addName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNameIsMutable();
      name_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public Builder addAllName(
        java.lang.Iterable<java.lang.String> values) {
      ensureNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, name_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public Builder clearName() {
      name_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string name = 1;</code>
     */
    public Builder addNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNameIsMutable();
      name_.add(value);
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


    // @@protoc_insertion_point(builder_scope:model.Names)
  }

  // @@protoc_insertion_point(class_scope:model.Names)
  private static final com.sagas.meta.model.Names DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.Names();
  }

  public static com.sagas.meta.model.Names getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Names>
      PARSER = new com.google.protobuf.AbstractParser<Names>() {
    @java.lang.Override
    public Names parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Names(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Names> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Names> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.Names getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
