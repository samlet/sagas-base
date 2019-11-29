// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.RsLangs}
 */
public  final class RsLangs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.RsLangs)
    RsLangsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RsLangs.newBuilder() to construct.
  private RsLangs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RsLangs() {
    langs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RsLangs(
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
              langs_ = new java.util.ArrayList<com.sagas.meta.model.RsLang>();
              mutable_bitField0_ |= 0x00000001;
            }
            langs_.add(
                input.readMessage(com.sagas.meta.model.RsLang.parser(), extensionRegistry));
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
        langs_ = java.util.Collections.unmodifiableList(langs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sagas.meta.model.Resources.internal_static_model_RsLangs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Resources.internal_static_model_RsLangs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.RsLangs.class, com.sagas.meta.model.RsLangs.Builder.class);
  }

  public static final int LANGS_FIELD_NUMBER = 1;
  private java.util.List<com.sagas.meta.model.RsLang> langs_;
  /**
   * <code>repeated .model.RsLang langs = 1;</code>
   */
  public java.util.List<com.sagas.meta.model.RsLang> getLangsList() {
    return langs_;
  }
  /**
   * <code>repeated .model.RsLang langs = 1;</code>
   */
  public java.util.List<? extends com.sagas.meta.model.RsLangOrBuilder> 
      getLangsOrBuilderList() {
    return langs_;
  }
  /**
   * <code>repeated .model.RsLang langs = 1;</code>
   */
  public int getLangsCount() {
    return langs_.size();
  }
  /**
   * <code>repeated .model.RsLang langs = 1;</code>
   */
  public com.sagas.meta.model.RsLang getLangs(int index) {
    return langs_.get(index);
  }
  /**
   * <code>repeated .model.RsLang langs = 1;</code>
   */
  public com.sagas.meta.model.RsLangOrBuilder getLangsOrBuilder(
      int index) {
    return langs_.get(index);
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
    for (int i = 0; i < langs_.size(); i++) {
      output.writeMessage(1, langs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < langs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, langs_.get(i));
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
    if (!(obj instanceof com.sagas.meta.model.RsLangs)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.RsLangs other = (com.sagas.meta.model.RsLangs) obj;

    boolean result = true;
    result = result && getLangsList()
        .equals(other.getLangsList());
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
    if (getLangsCount() > 0) {
      hash = (37 * hash) + LANGS_FIELD_NUMBER;
      hash = (53 * hash) + getLangsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.RsLangs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLangs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsLangs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsLangs parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.RsLangs prototype) {
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
   * Protobuf type {@code model.RsLangs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.RsLangs)
      com.sagas.meta.model.RsLangsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Resources.internal_static_model_RsLangs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Resources.internal_static_model_RsLangs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.RsLangs.class, com.sagas.meta.model.RsLangs.Builder.class);
    }

    // Construct using com.sagas.meta.model.RsLangs.newBuilder()
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
        getLangsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (langsBuilder_ == null) {
        langs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        langsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Resources.internal_static_model_RsLangs_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.RsLangs getDefaultInstanceForType() {
      return com.sagas.meta.model.RsLangs.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.RsLangs build() {
      com.sagas.meta.model.RsLangs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.RsLangs buildPartial() {
      com.sagas.meta.model.RsLangs result = new com.sagas.meta.model.RsLangs(this);
      int from_bitField0_ = bitField0_;
      if (langsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          langs_ = java.util.Collections.unmodifiableList(langs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.langs_ = langs_;
      } else {
        result.langs_ = langsBuilder_.build();
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
      if (other instanceof com.sagas.meta.model.RsLangs) {
        return mergeFrom((com.sagas.meta.model.RsLangs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.RsLangs other) {
      if (other == com.sagas.meta.model.RsLangs.getDefaultInstance()) return this;
      if (langsBuilder_ == null) {
        if (!other.langs_.isEmpty()) {
          if (langs_.isEmpty()) {
            langs_ = other.langs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLangsIsMutable();
            langs_.addAll(other.langs_);
          }
          onChanged();
        }
      } else {
        if (!other.langs_.isEmpty()) {
          if (langsBuilder_.isEmpty()) {
            langsBuilder_.dispose();
            langsBuilder_ = null;
            langs_ = other.langs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            langsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLangsFieldBuilder() : null;
          } else {
            langsBuilder_.addAllMessages(other.langs_);
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
      com.sagas.meta.model.RsLangs parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.RsLangs) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sagas.meta.model.RsLang> langs_ =
      java.util.Collections.emptyList();
    private void ensureLangsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        langs_ = new java.util.ArrayList<com.sagas.meta.model.RsLang>(langs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sagas.meta.model.RsLang, com.sagas.meta.model.RsLang.Builder, com.sagas.meta.model.RsLangOrBuilder> langsBuilder_;

    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public java.util.List<com.sagas.meta.model.RsLang> getLangsList() {
      if (langsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(langs_);
      } else {
        return langsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public int getLangsCount() {
      if (langsBuilder_ == null) {
        return langs_.size();
      } else {
        return langsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public com.sagas.meta.model.RsLang getLangs(int index) {
      if (langsBuilder_ == null) {
        return langs_.get(index);
      } else {
        return langsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder setLangs(
        int index, com.sagas.meta.model.RsLang value) {
      if (langsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLangsIsMutable();
        langs_.set(index, value);
        onChanged();
      } else {
        langsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder setLangs(
        int index, com.sagas.meta.model.RsLang.Builder builderForValue) {
      if (langsBuilder_ == null) {
        ensureLangsIsMutable();
        langs_.set(index, builderForValue.build());
        onChanged();
      } else {
        langsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder addLangs(com.sagas.meta.model.RsLang value) {
      if (langsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLangsIsMutable();
        langs_.add(value);
        onChanged();
      } else {
        langsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder addLangs(
        int index, com.sagas.meta.model.RsLang value) {
      if (langsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLangsIsMutable();
        langs_.add(index, value);
        onChanged();
      } else {
        langsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder addLangs(
        com.sagas.meta.model.RsLang.Builder builderForValue) {
      if (langsBuilder_ == null) {
        ensureLangsIsMutable();
        langs_.add(builderForValue.build());
        onChanged();
      } else {
        langsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder addLangs(
        int index, com.sagas.meta.model.RsLang.Builder builderForValue) {
      if (langsBuilder_ == null) {
        ensureLangsIsMutable();
        langs_.add(index, builderForValue.build());
        onChanged();
      } else {
        langsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder addAllLangs(
        java.lang.Iterable<? extends com.sagas.meta.model.RsLang> values) {
      if (langsBuilder_ == null) {
        ensureLangsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, langs_);
        onChanged();
      } else {
        langsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder clearLangs() {
      if (langsBuilder_ == null) {
        langs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        langsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public Builder removeLangs(int index) {
      if (langsBuilder_ == null) {
        ensureLangsIsMutable();
        langs_.remove(index);
        onChanged();
      } else {
        langsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public com.sagas.meta.model.RsLang.Builder getLangsBuilder(
        int index) {
      return getLangsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public com.sagas.meta.model.RsLangOrBuilder getLangsOrBuilder(
        int index) {
      if (langsBuilder_ == null) {
        return langs_.get(index);  } else {
        return langsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public java.util.List<? extends com.sagas.meta.model.RsLangOrBuilder> 
         getLangsOrBuilderList() {
      if (langsBuilder_ != null) {
        return langsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(langs_);
      }
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public com.sagas.meta.model.RsLang.Builder addLangsBuilder() {
      return getLangsFieldBuilder().addBuilder(
          com.sagas.meta.model.RsLang.getDefaultInstance());
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public com.sagas.meta.model.RsLang.Builder addLangsBuilder(
        int index) {
      return getLangsFieldBuilder().addBuilder(
          index, com.sagas.meta.model.RsLang.getDefaultInstance());
    }
    /**
     * <code>repeated .model.RsLang langs = 1;</code>
     */
    public java.util.List<com.sagas.meta.model.RsLang.Builder> 
         getLangsBuilderList() {
      return getLangsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sagas.meta.model.RsLang, com.sagas.meta.model.RsLang.Builder, com.sagas.meta.model.RsLangOrBuilder> 
        getLangsFieldBuilder() {
      if (langsBuilder_ == null) {
        langsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sagas.meta.model.RsLang, com.sagas.meta.model.RsLang.Builder, com.sagas.meta.model.RsLangOrBuilder>(
                langs_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        langs_ = null;
      }
      return langsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:model.RsLangs)
  }

  // @@protoc_insertion_point(class_scope:model.RsLangs)
  private static final com.sagas.meta.model.RsLangs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.RsLangs();
  }

  public static com.sagas.meta.model.RsLangs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RsLangs>
      PARSER = new com.google.protobuf.AbstractParser<RsLangs>() {
    @java.lang.Override
    public RsLangs parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RsLangs(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RsLangs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RsLangs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.RsLangs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
