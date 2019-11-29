// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.MetaMemberEntity}
 */
public  final class MetaMemberEntity extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.MetaMemberEntity)
    MetaMemberEntityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaMemberEntity.newBuilder() to construct.
  private MetaMemberEntity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaMemberEntity() {
    entityAlias_ = "";
    entityName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetaMemberEntity(
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

            entityAlias_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            entityName_ = s;
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
    return com.sagas.meta.model.Metainfo.internal_static_model_MetaMemberEntity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Metainfo.internal_static_model_MetaMemberEntity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.MetaMemberEntity.class, com.sagas.meta.model.MetaMemberEntity.Builder.class);
  }

  public static final int ENTITYALIAS_FIELD_NUMBER = 1;
  private volatile java.lang.Object entityAlias_;
  /**
   * <code>string entityAlias = 1;</code>
   */
  public java.lang.String getEntityAlias() {
    java.lang.Object ref = entityAlias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityAlias_ = s;
      return s;
    }
  }
  /**
   * <code>string entityAlias = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEntityAliasBytes() {
    java.lang.Object ref = entityAlias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityAlias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITYNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object entityName_;
  /**
   * <code>string entityName = 2;</code>
   */
  public java.lang.String getEntityName() {
    java.lang.Object ref = entityName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityName_ = s;
      return s;
    }
  }
  /**
   * <code>string entityName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEntityNameBytes() {
    java.lang.Object ref = entityName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityName_ = b;
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
    if (!getEntityAliasBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entityAlias_);
    }
    if (!getEntityNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEntityAliasBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entityAlias_);
    }
    if (!getEntityNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entityName_);
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
    if (!(obj instanceof com.sagas.meta.model.MetaMemberEntity)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.MetaMemberEntity other = (com.sagas.meta.model.MetaMemberEntity) obj;

    boolean result = true;
    result = result && getEntityAlias()
        .equals(other.getEntityAlias());
    result = result && getEntityName()
        .equals(other.getEntityName());
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
    hash = (37 * hash) + ENTITYALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getEntityAlias().hashCode();
    hash = (37 * hash) + ENTITYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getEntityName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.MetaMemberEntity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaMemberEntity parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.MetaMemberEntity prototype) {
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
   * Protobuf type {@code model.MetaMemberEntity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.MetaMemberEntity)
      com.sagas.meta.model.MetaMemberEntityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaMemberEntity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaMemberEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.MetaMemberEntity.class, com.sagas.meta.model.MetaMemberEntity.Builder.class);
    }

    // Construct using com.sagas.meta.model.MetaMemberEntity.newBuilder()
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
      entityAlias_ = "";

      entityName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Metainfo.internal_static_model_MetaMemberEntity_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaMemberEntity getDefaultInstanceForType() {
      return com.sagas.meta.model.MetaMemberEntity.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaMemberEntity build() {
      com.sagas.meta.model.MetaMemberEntity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaMemberEntity buildPartial() {
      com.sagas.meta.model.MetaMemberEntity result = new com.sagas.meta.model.MetaMemberEntity(this);
      result.entityAlias_ = entityAlias_;
      result.entityName_ = entityName_;
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
      if (other instanceof com.sagas.meta.model.MetaMemberEntity) {
        return mergeFrom((com.sagas.meta.model.MetaMemberEntity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.MetaMemberEntity other) {
      if (other == com.sagas.meta.model.MetaMemberEntity.getDefaultInstance()) return this;
      if (!other.getEntityAlias().isEmpty()) {
        entityAlias_ = other.entityAlias_;
        onChanged();
      }
      if (!other.getEntityName().isEmpty()) {
        entityName_ = other.entityName_;
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
      com.sagas.meta.model.MetaMemberEntity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.MetaMemberEntity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object entityAlias_ = "";
    /**
     * <code>string entityAlias = 1;</code>
     */
    public java.lang.String getEntityAlias() {
      java.lang.Object ref = entityAlias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityAlias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string entityAlias = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEntityAliasBytes() {
      java.lang.Object ref = entityAlias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityAlias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string entityAlias = 1;</code>
     */
    public Builder setEntityAlias(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entityAlias_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string entityAlias = 1;</code>
     */
    public Builder clearEntityAlias() {
      
      entityAlias_ = getDefaultInstance().getEntityAlias();
      onChanged();
      return this;
    }
    /**
     * <code>string entityAlias = 1;</code>
     */
    public Builder setEntityAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entityAlias_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object entityName_ = "";
    /**
     * <code>string entityName = 2;</code>
     */
    public java.lang.String getEntityName() {
      java.lang.Object ref = entityName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string entityName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEntityNameBytes() {
      java.lang.Object ref = entityName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string entityName = 2;</code>
     */
    public Builder setEntityName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      entityName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string entityName = 2;</code>
     */
    public Builder clearEntityName() {
      
      entityName_ = getDefaultInstance().getEntityName();
      onChanged();
      return this;
    }
    /**
     * <code>string entityName = 2;</code>
     */
    public Builder setEntityNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      entityName_ = value;
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


    // @@protoc_insertion_point(builder_scope:model.MetaMemberEntity)
  }

  // @@protoc_insertion_point(class_scope:model.MetaMemberEntity)
  private static final com.sagas.meta.model.MetaMemberEntity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.MetaMemberEntity();
  }

  public static com.sagas.meta.model.MetaMemberEntity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetaMemberEntity>
      PARSER = new com.google.protobuf.AbstractParser<MetaMemberEntity>() {
    @java.lang.Override
    public MetaMemberEntity parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetaMemberEntity(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetaMemberEntity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaMemberEntity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.MetaMemberEntity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

