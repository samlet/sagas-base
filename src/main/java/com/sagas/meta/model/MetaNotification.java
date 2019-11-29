// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.MetaNotification}
 */
public  final class MetaNotification extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.MetaNotification)
    MetaNotificationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaNotification.newBuilder() to construct.
  private MetaNotification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaNotification() {
    notificationGroupName_ = "";
    notificationEvent_ = "";
    notificationMode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetaNotification(
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

            notificationGroupName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            notificationEvent_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            notificationMode_ = s;
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
    return com.sagas.meta.model.Metainfo.internal_static_model_MetaNotification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Metainfo.internal_static_model_MetaNotification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.MetaNotification.class, com.sagas.meta.model.MetaNotification.Builder.class);
  }

  public static final int NOTIFICATIONGROUPNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object notificationGroupName_;
  /**
   * <code>string notificationGroupName = 1;</code>
   */
  public java.lang.String getNotificationGroupName() {
    java.lang.Object ref = notificationGroupName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notificationGroupName_ = s;
      return s;
    }
  }
  /**
   * <code>string notificationGroupName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNotificationGroupNameBytes() {
    java.lang.Object ref = notificationGroupName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notificationGroupName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTIFICATIONEVENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object notificationEvent_;
  /**
   * <code>string notificationEvent = 2;</code>
   */
  public java.lang.String getNotificationEvent() {
    java.lang.Object ref = notificationEvent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notificationEvent_ = s;
      return s;
    }
  }
  /**
   * <code>string notificationEvent = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNotificationEventBytes() {
    java.lang.Object ref = notificationEvent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notificationEvent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOTIFICATIONMODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object notificationMode_;
  /**
   * <code>string notificationMode = 3;</code>
   */
  public java.lang.String getNotificationMode() {
    java.lang.Object ref = notificationMode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notificationMode_ = s;
      return s;
    }
  }
  /**
   * <code>string notificationMode = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNotificationModeBytes() {
    java.lang.Object ref = notificationMode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      notificationMode_ = b;
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
    if (!getNotificationGroupNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notificationGroupName_);
    }
    if (!getNotificationEventBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, notificationEvent_);
    }
    if (!getNotificationModeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, notificationMode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNotificationGroupNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, notificationGroupName_);
    }
    if (!getNotificationEventBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, notificationEvent_);
    }
    if (!getNotificationModeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, notificationMode_);
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
    if (!(obj instanceof com.sagas.meta.model.MetaNotification)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.MetaNotification other = (com.sagas.meta.model.MetaNotification) obj;

    boolean result = true;
    result = result && getNotificationGroupName()
        .equals(other.getNotificationGroupName());
    result = result && getNotificationEvent()
        .equals(other.getNotificationEvent());
    result = result && getNotificationMode()
        .equals(other.getNotificationMode());
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
    hash = (37 * hash) + NOTIFICATIONGROUPNAME_FIELD_NUMBER;
    hash = (53 * hash) + getNotificationGroupName().hashCode();
    hash = (37 * hash) + NOTIFICATIONEVENT_FIELD_NUMBER;
    hash = (53 * hash) + getNotificationEvent().hashCode();
    hash = (37 * hash) + NOTIFICATIONMODE_FIELD_NUMBER;
    hash = (53 * hash) + getNotificationMode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.MetaNotification parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaNotification parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaNotification parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaNotification parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.MetaNotification prototype) {
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
   * Protobuf type {@code model.MetaNotification}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.MetaNotification)
      com.sagas.meta.model.MetaNotificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaNotification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaNotification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.MetaNotification.class, com.sagas.meta.model.MetaNotification.Builder.class);
    }

    // Construct using com.sagas.meta.model.MetaNotification.newBuilder()
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
      notificationGroupName_ = "";

      notificationEvent_ = "";

      notificationMode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaNotification_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaNotification getDefaultInstanceForType() {
      return com.sagas.meta.model.MetaNotification.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaNotification build() {
      com.sagas.meta.model.MetaNotification result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaNotification buildPartial() {
      com.sagas.meta.model.MetaNotification result = new com.sagas.meta.model.MetaNotification(this);
      result.notificationGroupName_ = notificationGroupName_;
      result.notificationEvent_ = notificationEvent_;
      result.notificationMode_ = notificationMode_;
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
      if (other instanceof com.sagas.meta.model.MetaNotification) {
        return mergeFrom((com.sagas.meta.model.MetaNotification)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.MetaNotification other) {
      if (other == com.sagas.meta.model.MetaNotification.getDefaultInstance()) return this;
      if (!other.getNotificationGroupName().isEmpty()) {
        notificationGroupName_ = other.notificationGroupName_;
        onChanged();
      }
      if (!other.getNotificationEvent().isEmpty()) {
        notificationEvent_ = other.notificationEvent_;
        onChanged();
      }
      if (!other.getNotificationMode().isEmpty()) {
        notificationMode_ = other.notificationMode_;
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
      com.sagas.meta.model.MetaNotification parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.MetaNotification) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object notificationGroupName_ = "";
    /**
     * <code>string notificationGroupName = 1;</code>
     */
    public java.lang.String getNotificationGroupName() {
      java.lang.Object ref = notificationGroupName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notificationGroupName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string notificationGroupName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNotificationGroupNameBytes() {
      java.lang.Object ref = notificationGroupName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notificationGroupName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string notificationGroupName = 1;</code>
     */
    public Builder setNotificationGroupName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      notificationGroupName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string notificationGroupName = 1;</code>
     */
    public Builder clearNotificationGroupName() {
      
      notificationGroupName_ = getDefaultInstance().getNotificationGroupName();
      onChanged();
      return this;
    }
    /**
     * <code>string notificationGroupName = 1;</code>
     */
    public Builder setNotificationGroupNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      notificationGroupName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object notificationEvent_ = "";
    /**
     * <code>string notificationEvent = 2;</code>
     */
    public java.lang.String getNotificationEvent() {
      java.lang.Object ref = notificationEvent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notificationEvent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string notificationEvent = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNotificationEventBytes() {
      java.lang.Object ref = notificationEvent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notificationEvent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string notificationEvent = 2;</code>
     */
    public Builder setNotificationEvent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      notificationEvent_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string notificationEvent = 2;</code>
     */
    public Builder clearNotificationEvent() {
      
      notificationEvent_ = getDefaultInstance().getNotificationEvent();
      onChanged();
      return this;
    }
    /**
     * <code>string notificationEvent = 2;</code>
     */
    public Builder setNotificationEventBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      notificationEvent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object notificationMode_ = "";
    /**
     * <code>string notificationMode = 3;</code>
     */
    public java.lang.String getNotificationMode() {
      java.lang.Object ref = notificationMode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notificationMode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string notificationMode = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNotificationModeBytes() {
      java.lang.Object ref = notificationMode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        notificationMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string notificationMode = 3;</code>
     */
    public Builder setNotificationMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      notificationMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string notificationMode = 3;</code>
     */
    public Builder clearNotificationMode() {
      
      notificationMode_ = getDefaultInstance().getNotificationMode();
      onChanged();
      return this;
    }
    /**
     * <code>string notificationMode = 3;</code>
     */
    public Builder setNotificationModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      notificationMode_ = value;
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


    // @@protoc_insertion_point(builder_scope:model.MetaNotification)
  }

  // @@protoc_insertion_point(class_scope:model.MetaNotification)
  private static final com.sagas.meta.model.MetaNotification DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.MetaNotification();
  }

  public static com.sagas.meta.model.MetaNotification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetaNotification>
      PARSER = new com.google.protobuf.AbstractParser<MetaNotification>() {
    @java.lang.Override
    public MetaNotification parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetaNotification(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetaNotification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaNotification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.MetaNotification getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

