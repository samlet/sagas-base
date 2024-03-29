// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: values.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.TaJsonEntities}
 */
public  final class TaJsonEntities extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.TaJsonEntities)
    TaJsonEntitiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaJsonEntities.newBuilder() to construct.
  private TaJsonEntities(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaJsonEntities() {
    entities_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaJsonEntities(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              entities_ = new java.util.ArrayList<com.sagas.meta.model.TaJsonEntity>();
              mutable_bitField0_ |= 0x00000001;
            }
            entities_.add(
                input.readMessage(com.sagas.meta.model.TaJsonEntity.parser(), extensionRegistry));
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
        entities_ = java.util.Collections.unmodifiableList(entities_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sagas.meta.model.Values.internal_static_model_TaJsonEntities_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Values.internal_static_model_TaJsonEntities_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.TaJsonEntities.class, com.sagas.meta.model.TaJsonEntities.Builder.class);
  }

  public static final int ENTITIES_FIELD_NUMBER = 1;
  private java.util.List<com.sagas.meta.model.TaJsonEntity> entities_;
  /**
   * <code>repeated .model.TaJsonEntity entities = 1;</code>
   */
  public java.util.List<com.sagas.meta.model.TaJsonEntity> getEntitiesList() {
    return entities_;
  }
  /**
   * <code>repeated .model.TaJsonEntity entities = 1;</code>
   */
  public java.util.List<? extends com.sagas.meta.model.TaJsonEntityOrBuilder> 
      getEntitiesOrBuilderList() {
    return entities_;
  }
  /**
   * <code>repeated .model.TaJsonEntity entities = 1;</code>
   */
  public int getEntitiesCount() {
    return entities_.size();
  }
  /**
   * <code>repeated .model.TaJsonEntity entities = 1;</code>
   */
  public com.sagas.meta.model.TaJsonEntity getEntities(int index) {
    return entities_.get(index);
  }
  /**
   * <code>repeated .model.TaJsonEntity entities = 1;</code>
   */
  public com.sagas.meta.model.TaJsonEntityOrBuilder getEntitiesOrBuilder(
      int index) {
    return entities_.get(index);
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
    for (int i = 0; i < entities_.size(); i++) {
      output.writeMessage(1, entities_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, entities_.get(i));
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
    if (!(obj instanceof com.sagas.meta.model.TaJsonEntities)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.TaJsonEntities other = (com.sagas.meta.model.TaJsonEntities) obj;

    boolean result = true;
    result = result && getEntitiesList()
        .equals(other.getEntitiesList());
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
    if (getEntitiesCount() > 0) {
      hash = (37 * hash) + ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntitiesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.TaJsonEntities parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.TaJsonEntities parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.TaJsonEntities parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.TaJsonEntities parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.TaJsonEntities prototype) {
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
   * Protobuf type {@code model.TaJsonEntities}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.TaJsonEntities)
      com.sagas.meta.model.TaJsonEntitiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Values.internal_static_model_TaJsonEntities_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Values.internal_static_model_TaJsonEntities_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.TaJsonEntities.class, com.sagas.meta.model.TaJsonEntities.Builder.class);
    }

    // Construct using com.sagas.meta.model.TaJsonEntities.newBuilder()
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
        getEntitiesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        entitiesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Values.internal_static_model_TaJsonEntities_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.TaJsonEntities getDefaultInstanceForType() {
      return com.sagas.meta.model.TaJsonEntities.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.TaJsonEntities build() {
      com.sagas.meta.model.TaJsonEntities result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.TaJsonEntities buildPartial() {
      com.sagas.meta.model.TaJsonEntities result = new com.sagas.meta.model.TaJsonEntities(this);
      int from_bitField0_ = bitField0_;
      if (entitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          entities_ = java.util.Collections.unmodifiableList(entities_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entities_ = entities_;
      } else {
        result.entities_ = entitiesBuilder_.build();
      }
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
      if (other instanceof com.sagas.meta.model.TaJsonEntities) {
        return mergeFrom((com.sagas.meta.model.TaJsonEntities)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.TaJsonEntities other) {
      if (other == com.sagas.meta.model.TaJsonEntities.getDefaultInstance()) return this;
      if (entitiesBuilder_ == null) {
        if (!other.entities_.isEmpty()) {
          if (entities_.isEmpty()) {
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntitiesIsMutable();
            entities_.addAll(other.entities_);
          }
          onChanged();
        }
      } else {
        if (!other.entities_.isEmpty()) {
          if (entitiesBuilder_.isEmpty()) {
            entitiesBuilder_.dispose();
            entitiesBuilder_ = null;
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entitiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntitiesFieldBuilder() : null;
          } else {
            entitiesBuilder_.addAllMessages(other.entities_);
          }
        }
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
      com.sagas.meta.model.TaJsonEntities parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.TaJsonEntities) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sagas.meta.model.TaJsonEntity> entities_ =
      java.util.Collections.emptyList();
    private void ensureEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        entities_ = new java.util.ArrayList<com.sagas.meta.model.TaJsonEntity>(entities_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sagas.meta.model.TaJsonEntity, com.sagas.meta.model.TaJsonEntity.Builder, com.sagas.meta.model.TaJsonEntityOrBuilder> entitiesBuilder_;

    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public java.util.List<com.sagas.meta.model.TaJsonEntity> getEntitiesList() {
      if (entitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entities_);
      } else {
        return entitiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public int getEntitiesCount() {
      if (entitiesBuilder_ == null) {
        return entities_.size();
      } else {
        return entitiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public com.sagas.meta.model.TaJsonEntity getEntities(int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);
      } else {
        return entitiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder setEntities(
        int index, com.sagas.meta.model.TaJsonEntity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.set(index, value);
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder setEntities(
        int index, com.sagas.meta.model.TaJsonEntity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.set(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder addEntities(com.sagas.meta.model.TaJsonEntity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder addEntities(
        int index, com.sagas.meta.model.TaJsonEntity value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(index, value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder addEntities(
        com.sagas.meta.model.TaJsonEntity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder addEntities(
        int index, com.sagas.meta.model.TaJsonEntity.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder addAllEntities(
        java.lang.Iterable<? extends com.sagas.meta.model.TaJsonEntity> values) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entities_);
        onChanged();
      } else {
        entitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder clearEntities() {
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entitiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public Builder removeEntities(int index) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.remove(index);
        onChanged();
      } else {
        entitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public com.sagas.meta.model.TaJsonEntity.Builder getEntitiesBuilder(
        int index) {
      return getEntitiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public com.sagas.meta.model.TaJsonEntityOrBuilder getEntitiesOrBuilder(
        int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);  } else {
        return entitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public java.util.List<? extends com.sagas.meta.model.TaJsonEntityOrBuilder> 
         getEntitiesOrBuilderList() {
      if (entitiesBuilder_ != null) {
        return entitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entities_);
      }
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public com.sagas.meta.model.TaJsonEntity.Builder addEntitiesBuilder() {
      return getEntitiesFieldBuilder().addBuilder(
          com.sagas.meta.model.TaJsonEntity.getDefaultInstance());
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public com.sagas.meta.model.TaJsonEntity.Builder addEntitiesBuilder(
        int index) {
      return getEntitiesFieldBuilder().addBuilder(
          index, com.sagas.meta.model.TaJsonEntity.getDefaultInstance());
    }
    /**
     * <code>repeated .model.TaJsonEntity entities = 1;</code>
     */
    public java.util.List<com.sagas.meta.model.TaJsonEntity.Builder> 
         getEntitiesBuilderList() {
      return getEntitiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sagas.meta.model.TaJsonEntity, com.sagas.meta.model.TaJsonEntity.Builder, com.sagas.meta.model.TaJsonEntityOrBuilder> 
        getEntitiesFieldBuilder() {
      if (entitiesBuilder_ == null) {
        entitiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sagas.meta.model.TaJsonEntity, com.sagas.meta.model.TaJsonEntity.Builder, com.sagas.meta.model.TaJsonEntityOrBuilder>(
                entities_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        entities_ = null;
      }
      return entitiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:model.TaJsonEntities)
  }

  // @@protoc_insertion_point(class_scope:model.TaJsonEntities)
  private static final com.sagas.meta.model.TaJsonEntities DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.TaJsonEntities();
  }

  public static com.sagas.meta.model.TaJsonEntities getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaJsonEntities>
      PARSER = new com.google.protobuf.AbstractParser<TaJsonEntities>() {
    @java.lang.Override
    public TaJsonEntities parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaJsonEntities(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaJsonEntities> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaJsonEntities> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.TaJsonEntities getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

