// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: values.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.TaIdBag}
 */
public  final class TaIdBag extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.TaIdBag)
    TaIdBagOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaIdBag.newBuilder() to construct.
  private TaIdBag(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaIdBag() {
    ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaIdBag(
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
              ids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            ids_.add(s);
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
        ids_ = ids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sagas.meta.model.Values.internal_static_model_TaIdBag_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Values.internal_static_model_TaIdBag_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.TaIdBag.class, com.sagas.meta.model.TaIdBag.Builder.class);
  }

  public static final int IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList ids_;
  /**
   * <code>repeated string ids = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getIdsList() {
    return ids_;
  }
  /**
   * <code>repeated string ids = 1;</code>
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <code>repeated string ids = 1;</code>
   */
  public java.lang.String getIds(int index) {
    return ids_.get(index);
  }
  /**
   * <code>repeated string ids = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdsBytes(int index) {
    return ids_.getByteString(index);
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
    for (int i = 0; i < ids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ids_.getRaw(i));
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
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += computeStringSizeNoTag(ids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIdsList().size();
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
    if (!(obj instanceof com.sagas.meta.model.TaIdBag)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.TaIdBag other = (com.sagas.meta.model.TaIdBag) obj;

    boolean result = true;
    result = result && getIdsList()
        .equals(other.getIdsList());
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
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.TaIdBag parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.TaIdBag parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.TaIdBag parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.TaIdBag parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.TaIdBag prototype) {
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
   * Protobuf type {@code model.TaIdBag}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.TaIdBag)
      com.sagas.meta.model.TaIdBagOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Values.internal_static_model_TaIdBag_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Values.internal_static_model_TaIdBag_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.TaIdBag.class, com.sagas.meta.model.TaIdBag.Builder.class);
    }

    // Construct using com.sagas.meta.model.TaIdBag.newBuilder()
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
      ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Values.internal_static_model_TaIdBag_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.TaIdBag getDefaultInstanceForType() {
      return com.sagas.meta.model.TaIdBag.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.TaIdBag build() {
      com.sagas.meta.model.TaIdBag result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.TaIdBag buildPartial() {
      com.sagas.meta.model.TaIdBag result = new com.sagas.meta.model.TaIdBag(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        ids_ = ids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ids_ = ids_;
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
      if (other instanceof com.sagas.meta.model.TaIdBag) {
        return mergeFrom((com.sagas.meta.model.TaIdBag)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.TaIdBag other) {
      if (other == com.sagas.meta.model.TaIdBag.getDefaultInstance()) return this;
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
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
      com.sagas.meta.model.TaIdBag parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.TaIdBag) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ids_ = new com.google.protobuf.LazyStringArrayList(ids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getIdsList() {
      return ids_.getUnmodifiableView();
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public java.lang.String getIds(int index) {
      return ids_.get(index);
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdsBytes(int index) {
      return ids_.getByteString(index);
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public Builder setIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIdsIsMutable();
      ids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public Builder addIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureIdsIsMutable();
      ids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public Builder addAllIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public Builder clearIds() {
      ids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string ids = 1;</code>
     */
    public Builder addIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureIdsIsMutable();
      ids_.add(value);
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


    // @@protoc_insertion_point(builder_scope:model.TaIdBag)
  }

  // @@protoc_insertion_point(class_scope:model.TaIdBag)
  private static final com.sagas.meta.model.TaIdBag DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.TaIdBag();
  }

  public static com.sagas.meta.model.TaIdBag getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaIdBag>
      PARSER = new com.google.protobuf.AbstractParser<TaIdBag>() {
    @java.lang.Override
    public TaIdBag parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaIdBag(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaIdBag> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaIdBag> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.TaIdBag getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
