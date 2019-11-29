// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forms.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.MetaOptionSource}
 */
public  final class MetaOptionSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.MetaOptionSource)
    MetaOptionSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetaOptionSource.newBuilder() to construct.
  private MetaOptionSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetaOptionSource() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetaOptionSource(
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
            com.sagas.meta.model.MetaSingleOption.Builder subBuilder = null;
            if (sourceCase_ == 1) {
              subBuilder = ((com.sagas.meta.model.MetaSingleOption) source_).toBuilder();
            }
            source_ =
                input.readMessage(com.sagas.meta.model.MetaSingleOption.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.sagas.meta.model.MetaSingleOption) source_);
              source_ = subBuilder.buildPartial();
            }
            sourceCase_ = 1;
            break;
          }
          case 18: {
            com.sagas.meta.model.MetaEntityOptions.Builder subBuilder = null;
            if (sourceCase_ == 2) {
              subBuilder = ((com.sagas.meta.model.MetaEntityOptions) source_).toBuilder();
            }
            source_ =
                input.readMessage(com.sagas.meta.model.MetaEntityOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.sagas.meta.model.MetaEntityOptions) source_);
              source_ = subBuilder.buildPartial();
            }
            sourceCase_ = 2;
            break;
          }
          case 26: {
            com.sagas.meta.model.MetaListOptions.Builder subBuilder = null;
            if (sourceCase_ == 3) {
              subBuilder = ((com.sagas.meta.model.MetaListOptions) source_).toBuilder();
            }
            source_ =
                input.readMessage(com.sagas.meta.model.MetaListOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.sagas.meta.model.MetaListOptions) source_);
              source_ = subBuilder.buildPartial();
            }
            sourceCase_ = 3;
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
    return com.sagas.meta.model.Forms.internal_static_model_MetaOptionSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Forms.internal_static_model_MetaOptionSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.MetaOptionSource.class, com.sagas.meta.model.MetaOptionSource.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;
  public enum SourceCase
      implements com.google.protobuf.Internal.EnumLite {
    SINGLEOPTION(1),
    ENTITYOPTIONS(2),
    LISTOPTIONS(3),
    SOURCE_NOT_SET(0);
    private final int value;
    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1: return SINGLEOPTION;
        case 2: return ENTITYOPTIONS;
        case 3: return LISTOPTIONS;
        case 0: return SOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase
  getSourceCase() {
    return SourceCase.forNumber(
        sourceCase_);
  }

  public static final int SINGLEOPTION_FIELD_NUMBER = 1;
  /**
   * <code>.model.MetaSingleOption singleOption = 1;</code>
   */
  public boolean hasSingleOption() {
    return sourceCase_ == 1;
  }
  /**
   * <code>.model.MetaSingleOption singleOption = 1;</code>
   */
  public com.sagas.meta.model.MetaSingleOption getSingleOption() {
    if (sourceCase_ == 1) {
       return (com.sagas.meta.model.MetaSingleOption) source_;
    }
    return com.sagas.meta.model.MetaSingleOption.getDefaultInstance();
  }
  /**
   * <code>.model.MetaSingleOption singleOption = 1;</code>
   */
  public com.sagas.meta.model.MetaSingleOptionOrBuilder getSingleOptionOrBuilder() {
    if (sourceCase_ == 1) {
       return (com.sagas.meta.model.MetaSingleOption) source_;
    }
    return com.sagas.meta.model.MetaSingleOption.getDefaultInstance();
  }

  public static final int ENTITYOPTIONS_FIELD_NUMBER = 2;
  /**
   * <code>.model.MetaEntityOptions entityOptions = 2;</code>
   */
  public boolean hasEntityOptions() {
    return sourceCase_ == 2;
  }
  /**
   * <code>.model.MetaEntityOptions entityOptions = 2;</code>
   */
  public com.sagas.meta.model.MetaEntityOptions getEntityOptions() {
    if (sourceCase_ == 2) {
       return (com.sagas.meta.model.MetaEntityOptions) source_;
    }
    return com.sagas.meta.model.MetaEntityOptions.getDefaultInstance();
  }
  /**
   * <code>.model.MetaEntityOptions entityOptions = 2;</code>
   */
  public com.sagas.meta.model.MetaEntityOptionsOrBuilder getEntityOptionsOrBuilder() {
    if (sourceCase_ == 2) {
       return (com.sagas.meta.model.MetaEntityOptions) source_;
    }
    return com.sagas.meta.model.MetaEntityOptions.getDefaultInstance();
  }

  public static final int LISTOPTIONS_FIELD_NUMBER = 3;
  /**
   * <code>.model.MetaListOptions listOptions = 3;</code>
   */
  public boolean hasListOptions() {
    return sourceCase_ == 3;
  }
  /**
   * <code>.model.MetaListOptions listOptions = 3;</code>
   */
  public com.sagas.meta.model.MetaListOptions getListOptions() {
    if (sourceCase_ == 3) {
       return (com.sagas.meta.model.MetaListOptions) source_;
    }
    return com.sagas.meta.model.MetaListOptions.getDefaultInstance();
  }
  /**
   * <code>.model.MetaListOptions listOptions = 3;</code>
   */
  public com.sagas.meta.model.MetaListOptionsOrBuilder getListOptionsOrBuilder() {
    if (sourceCase_ == 3) {
       return (com.sagas.meta.model.MetaListOptions) source_;
    }
    return com.sagas.meta.model.MetaListOptions.getDefaultInstance();
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.sagas.meta.model.MetaSingleOption) source_);
    }
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.sagas.meta.model.MetaEntityOptions) source_);
    }
    if (sourceCase_ == 3) {
      output.writeMessage(3, (com.sagas.meta.model.MetaListOptions) source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.sagas.meta.model.MetaSingleOption) source_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.sagas.meta.model.MetaEntityOptions) source_);
    }
    if (sourceCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.sagas.meta.model.MetaListOptions) source_);
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
    if (!(obj instanceof com.sagas.meta.model.MetaOptionSource)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.MetaOptionSource other = (com.sagas.meta.model.MetaOptionSource) obj;

    boolean result = true;
    result = result && getSourceCase().equals(
        other.getSourceCase());
    if (!result) return false;
    switch (sourceCase_) {
      case 1:
        result = result && getSingleOption()
            .equals(other.getSingleOption());
        break;
      case 2:
        result = result && getEntityOptions()
            .equals(other.getEntityOptions());
        break;
      case 3:
        result = result && getListOptions()
            .equals(other.getListOptions());
        break;
      case 0:
      default:
    }
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
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + SINGLEOPTION_FIELD_NUMBER;
        hash = (53 * hash) + getSingleOption().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ENTITYOPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getEntityOptions().hashCode();
        break;
      case 3:
        hash = (37 * hash) + LISTOPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getListOptions().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.MetaOptionSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaOptionSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaOptionSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.MetaOptionSource parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.MetaOptionSource prototype) {
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
   * Protobuf type {@code model.MetaOptionSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.MetaOptionSource)
      com.sagas.meta.model.MetaOptionSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Forms.internal_static_model_MetaOptionSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Forms.internal_static_model_MetaOptionSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.MetaOptionSource.class, com.sagas.meta.model.MetaOptionSource.Builder.class);
    }

    // Construct using com.sagas.meta.model.MetaOptionSource.newBuilder()
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
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Forms.internal_static_model_MetaOptionSource_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaOptionSource getDefaultInstanceForType() {
      return com.sagas.meta.model.MetaOptionSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaOptionSource build() {
      com.sagas.meta.model.MetaOptionSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.MetaOptionSource buildPartial() {
      com.sagas.meta.model.MetaOptionSource result = new com.sagas.meta.model.MetaOptionSource(this);
      if (sourceCase_ == 1) {
        if (singleOptionBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = singleOptionBuilder_.build();
        }
      }
      if (sourceCase_ == 2) {
        if (entityOptionsBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = entityOptionsBuilder_.build();
        }
      }
      if (sourceCase_ == 3) {
        if (listOptionsBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = listOptionsBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.sagas.meta.model.MetaOptionSource) {
        return mergeFrom((com.sagas.meta.model.MetaOptionSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.MetaOptionSource other) {
      if (other == com.sagas.meta.model.MetaOptionSource.getDefaultInstance()) return this;
      switch (other.getSourceCase()) {
        case SINGLEOPTION: {
          mergeSingleOption(other.getSingleOption());
          break;
        }
        case ENTITYOPTIONS: {
          mergeEntityOptions(other.getEntityOptions());
          break;
        }
        case LISTOPTIONS: {
          mergeListOptions(other.getListOptions());
          break;
        }
        case SOURCE_NOT_SET: {
          break;
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
      com.sagas.meta.model.MetaOptionSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.MetaOptionSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int sourceCase_ = 0;
    private java.lang.Object source_;
    public SourceCase
        getSourceCase() {
      return SourceCase.forNumber(
          sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.sagas.meta.model.MetaSingleOption, com.sagas.meta.model.MetaSingleOption.Builder, com.sagas.meta.model.MetaSingleOptionOrBuilder> singleOptionBuilder_;
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    public boolean hasSingleOption() {
      return sourceCase_ == 1;
    }
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    public com.sagas.meta.model.MetaSingleOption getSingleOption() {
      if (singleOptionBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.sagas.meta.model.MetaSingleOption) source_;
        }
        return com.sagas.meta.model.MetaSingleOption.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return singleOptionBuilder_.getMessage();
        }
        return com.sagas.meta.model.MetaSingleOption.getDefaultInstance();
      }
    }
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    public Builder setSingleOption(com.sagas.meta.model.MetaSingleOption value) {
      if (singleOptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        singleOptionBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    public Builder setSingleOption(
        com.sagas.meta.model.MetaSingleOption.Builder builderForValue) {
      if (singleOptionBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        singleOptionBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    public Builder mergeSingleOption(com.sagas.meta.model.MetaSingleOption value) {
      if (singleOptionBuilder_ == null) {
        if (sourceCase_ == 1 &&
            source_ != com.sagas.meta.model.MetaSingleOption.getDefaultInstance()) {
          source_ = com.sagas.meta.model.MetaSingleOption.newBuilder((com.sagas.meta.model.MetaSingleOption) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          singleOptionBuilder_.mergeFrom(value);
        }
        singleOptionBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    public Builder clearSingleOption() {
      if (singleOptionBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        singleOptionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    public com.sagas.meta.model.MetaSingleOption.Builder getSingleOptionBuilder() {
      return getSingleOptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    public com.sagas.meta.model.MetaSingleOptionOrBuilder getSingleOptionOrBuilder() {
      if ((sourceCase_ == 1) && (singleOptionBuilder_ != null)) {
        return singleOptionBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.sagas.meta.model.MetaSingleOption) source_;
        }
        return com.sagas.meta.model.MetaSingleOption.getDefaultInstance();
      }
    }
    /**
     * <code>.model.MetaSingleOption singleOption = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sagas.meta.model.MetaSingleOption, com.sagas.meta.model.MetaSingleOption.Builder, com.sagas.meta.model.MetaSingleOptionOrBuilder> 
        getSingleOptionFieldBuilder() {
      if (singleOptionBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.sagas.meta.model.MetaSingleOption.getDefaultInstance();
        }
        singleOptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sagas.meta.model.MetaSingleOption, com.sagas.meta.model.MetaSingleOption.Builder, com.sagas.meta.model.MetaSingleOptionOrBuilder>(
                (com.sagas.meta.model.MetaSingleOption) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();;
      return singleOptionBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.sagas.meta.model.MetaEntityOptions, com.sagas.meta.model.MetaEntityOptions.Builder, com.sagas.meta.model.MetaEntityOptionsOrBuilder> entityOptionsBuilder_;
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    public boolean hasEntityOptions() {
      return sourceCase_ == 2;
    }
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    public com.sagas.meta.model.MetaEntityOptions getEntityOptions() {
      if (entityOptionsBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.sagas.meta.model.MetaEntityOptions) source_;
        }
        return com.sagas.meta.model.MetaEntityOptions.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return entityOptionsBuilder_.getMessage();
        }
        return com.sagas.meta.model.MetaEntityOptions.getDefaultInstance();
      }
    }
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    public Builder setEntityOptions(com.sagas.meta.model.MetaEntityOptions value) {
      if (entityOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        entityOptionsBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    public Builder setEntityOptions(
        com.sagas.meta.model.MetaEntityOptions.Builder builderForValue) {
      if (entityOptionsBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        entityOptionsBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    public Builder mergeEntityOptions(com.sagas.meta.model.MetaEntityOptions value) {
      if (entityOptionsBuilder_ == null) {
        if (sourceCase_ == 2 &&
            source_ != com.sagas.meta.model.MetaEntityOptions.getDefaultInstance()) {
          source_ = com.sagas.meta.model.MetaEntityOptions.newBuilder((com.sagas.meta.model.MetaEntityOptions) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          entityOptionsBuilder_.mergeFrom(value);
        }
        entityOptionsBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    public Builder clearEntityOptions() {
      if (entityOptionsBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        entityOptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    public com.sagas.meta.model.MetaEntityOptions.Builder getEntityOptionsBuilder() {
      return getEntityOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    public com.sagas.meta.model.MetaEntityOptionsOrBuilder getEntityOptionsOrBuilder() {
      if ((sourceCase_ == 2) && (entityOptionsBuilder_ != null)) {
        return entityOptionsBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.sagas.meta.model.MetaEntityOptions) source_;
        }
        return com.sagas.meta.model.MetaEntityOptions.getDefaultInstance();
      }
    }
    /**
     * <code>.model.MetaEntityOptions entityOptions = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sagas.meta.model.MetaEntityOptions, com.sagas.meta.model.MetaEntityOptions.Builder, com.sagas.meta.model.MetaEntityOptionsOrBuilder> 
        getEntityOptionsFieldBuilder() {
      if (entityOptionsBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.sagas.meta.model.MetaEntityOptions.getDefaultInstance();
        }
        entityOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sagas.meta.model.MetaEntityOptions, com.sagas.meta.model.MetaEntityOptions.Builder, com.sagas.meta.model.MetaEntityOptionsOrBuilder>(
                (com.sagas.meta.model.MetaEntityOptions) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();;
      return entityOptionsBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.sagas.meta.model.MetaListOptions, com.sagas.meta.model.MetaListOptions.Builder, com.sagas.meta.model.MetaListOptionsOrBuilder> listOptionsBuilder_;
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    public boolean hasListOptions() {
      return sourceCase_ == 3;
    }
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    public com.sagas.meta.model.MetaListOptions getListOptions() {
      if (listOptionsBuilder_ == null) {
        if (sourceCase_ == 3) {
          return (com.sagas.meta.model.MetaListOptions) source_;
        }
        return com.sagas.meta.model.MetaListOptions.getDefaultInstance();
      } else {
        if (sourceCase_ == 3) {
          return listOptionsBuilder_.getMessage();
        }
        return com.sagas.meta.model.MetaListOptions.getDefaultInstance();
      }
    }
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    public Builder setListOptions(com.sagas.meta.model.MetaListOptions value) {
      if (listOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        listOptionsBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    public Builder setListOptions(
        com.sagas.meta.model.MetaListOptions.Builder builderForValue) {
      if (listOptionsBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        listOptionsBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    public Builder mergeListOptions(com.sagas.meta.model.MetaListOptions value) {
      if (listOptionsBuilder_ == null) {
        if (sourceCase_ == 3 &&
            source_ != com.sagas.meta.model.MetaListOptions.getDefaultInstance()) {
          source_ = com.sagas.meta.model.MetaListOptions.newBuilder((com.sagas.meta.model.MetaListOptions) source_)
              .mergeFrom(value).buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 3) {
          listOptionsBuilder_.mergeFrom(value);
        }
        listOptionsBuilder_.setMessage(value);
      }
      sourceCase_ = 3;
      return this;
    }
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    public Builder clearListOptions() {
      if (listOptionsBuilder_ == null) {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 3) {
          sourceCase_ = 0;
          source_ = null;
        }
        listOptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    public com.sagas.meta.model.MetaListOptions.Builder getListOptionsBuilder() {
      return getListOptionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    public com.sagas.meta.model.MetaListOptionsOrBuilder getListOptionsOrBuilder() {
      if ((sourceCase_ == 3) && (listOptionsBuilder_ != null)) {
        return listOptionsBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 3) {
          return (com.sagas.meta.model.MetaListOptions) source_;
        }
        return com.sagas.meta.model.MetaListOptions.getDefaultInstance();
      }
    }
    /**
     * <code>.model.MetaListOptions listOptions = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sagas.meta.model.MetaListOptions, com.sagas.meta.model.MetaListOptions.Builder, com.sagas.meta.model.MetaListOptionsOrBuilder> 
        getListOptionsFieldBuilder() {
      if (listOptionsBuilder_ == null) {
        if (!(sourceCase_ == 3)) {
          source_ = com.sagas.meta.model.MetaListOptions.getDefaultInstance();
        }
        listOptionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sagas.meta.model.MetaListOptions, com.sagas.meta.model.MetaListOptions.Builder, com.sagas.meta.model.MetaListOptionsOrBuilder>(
                (com.sagas.meta.model.MetaListOptions) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 3;
      onChanged();;
      return listOptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:model.MetaOptionSource)
  }

  // @@protoc_insertion_point(class_scope:model.MetaOptionSource)
  private static final com.sagas.meta.model.MetaOptionSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.MetaOptionSource();
  }

  public static com.sagas.meta.model.MetaOptionSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetaOptionSource>
      PARSER = new com.google.protobuf.AbstractParser<MetaOptionSource>() {
    @java.lang.Override
    public MetaOptionSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetaOptionSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetaOptionSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetaOptionSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.MetaOptionSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

