// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.RsResource}
 */
public  final class RsResource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.RsResource)
    RsResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RsResource.newBuilder() to construct.
  private RsResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RsResource() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RsResource(
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
              properties_ = com.google.protobuf.MapField.newMapField(
                  PropertiesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.sagas.meta.model.RsProperty>
            properties__ = input.readMessage(
                PropertiesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            properties_.getMutableMap().put(
                properties__.getKey(), properties__.getValue());
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
    return com.sagas.meta.model.Resources.internal_static_model_RsResource_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetProperties();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Resources.internal_static_model_RsResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.RsResource.class, com.sagas.meta.model.RsResource.Builder.class);
  }

  public static final int PROPERTIES_FIELD_NUMBER = 1;
  private static final class PropertiesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.sagas.meta.model.RsProperty> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.sagas.meta.model.RsProperty>newDefaultInstance(
                com.sagas.meta.model.Resources.internal_static_model_RsResource_PropertiesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.sagas.meta.model.RsProperty.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.sagas.meta.model.RsProperty> properties_;
  private com.google.protobuf.MapField<java.lang.String, com.sagas.meta.model.RsProperty>
  internalGetProperties() {
    if (properties_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PropertiesDefaultEntryHolder.defaultEntry);
    }
    return properties_;
  }

  public int getPropertiesCount() {
    return internalGetProperties().getMap().size();
  }
  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */

  public boolean containsProperties(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetProperties().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> getProperties() {
    return getPropertiesMap();
  }
  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */

  public java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> getPropertiesMap() {
    return internalGetProperties().getMap();
  }
  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */

  public com.sagas.meta.model.RsProperty getPropertiesOrDefault(
      java.lang.String key,
      com.sagas.meta.model.RsProperty defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> map =
        internalGetProperties().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
   */

  public com.sagas.meta.model.RsProperty getPropertiesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> map =
        internalGetProperties().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetProperties(),
        PropertiesDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.sagas.meta.model.RsProperty> entry
         : internalGetProperties().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.sagas.meta.model.RsProperty>
      properties__ = PropertiesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, properties__);
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
    if (!(obj instanceof com.sagas.meta.model.RsResource)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.RsResource other = (com.sagas.meta.model.RsResource) obj;

    boolean result = true;
    result = result && internalGetProperties().equals(
        other.internalGetProperties());
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
    if (!internalGetProperties().getMap().isEmpty()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetProperties().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.RsResource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsResource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsResource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsResource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.RsResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsResource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.RsResource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsResource parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.RsResource prototype) {
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
   * Protobuf type {@code model.RsResource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.RsResource)
      com.sagas.meta.model.RsResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Resources.internal_static_model_RsResource_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Resources.internal_static_model_RsResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.RsResource.class, com.sagas.meta.model.RsResource.Builder.class);
    }

    // Construct using com.sagas.meta.model.RsResource.newBuilder()
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
      internalGetMutableProperties().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Resources.internal_static_model_RsResource_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.RsResource getDefaultInstanceForType() {
      return com.sagas.meta.model.RsResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.RsResource build() {
      com.sagas.meta.model.RsResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.RsResource buildPartial() {
      com.sagas.meta.model.RsResource result = new com.sagas.meta.model.RsResource(this);
      int from_bitField0_ = bitField0_;
      result.properties_ = internalGetProperties();
      result.properties_.makeImmutable();
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
      if (other instanceof com.sagas.meta.model.RsResource) {
        return mergeFrom((com.sagas.meta.model.RsResource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.RsResource other) {
      if (other == com.sagas.meta.model.RsResource.getDefaultInstance()) return this;
      internalGetMutableProperties().mergeFrom(
          other.internalGetProperties());
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
      com.sagas.meta.model.RsResource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.RsResource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.sagas.meta.model.RsProperty> properties_;
    private com.google.protobuf.MapField<java.lang.String, com.sagas.meta.model.RsProperty>
    internalGetProperties() {
      if (properties_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      return properties_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.sagas.meta.model.RsProperty>
    internalGetMutableProperties() {
      onChanged();;
      if (properties_ == null) {
        properties_ = com.google.protobuf.MapField.newMapField(
            PropertiesDefaultEntryHolder.defaultEntry);
      }
      if (!properties_.isMutable()) {
        properties_ = properties_.copy();
      }
      return properties_;
    }

    public int getPropertiesCount() {
      return internalGetProperties().getMap().size();
    }
    /**
     * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
     */

    public boolean containsProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetProperties().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPropertiesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> getProperties() {
      return getPropertiesMap();
    }
    /**
     * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
     */

    public java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> getPropertiesMap() {
      return internalGetProperties().getMap();
    }
    /**
     * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
     */

    public com.sagas.meta.model.RsProperty getPropertiesOrDefault(
        java.lang.String key,
        com.sagas.meta.model.RsProperty defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> map =
          internalGetProperties().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
     */

    public com.sagas.meta.model.RsProperty getPropertiesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> map =
          internalGetProperties().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearProperties() {
      internalGetMutableProperties().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
     */

    public Builder removeProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableProperties().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty>
    getMutableProperties() {
      return internalGetMutableProperties().getMutableMap();
    }
    /**
     * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
     */
    public Builder putProperties(
        java.lang.String key,
        com.sagas.meta.model.RsProperty value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableProperties().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .model.RsProperty&gt; properties = 1;</code>
     */

    public Builder putAllProperties(
        java.util.Map<java.lang.String, com.sagas.meta.model.RsProperty> values) {
      internalGetMutableProperties().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:model.RsResource)
  }

  // @@protoc_insertion_point(class_scope:model.RsResource)
  private static final com.sagas.meta.model.RsResource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.RsResource();
  }

  public static com.sagas.meta.model.RsResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RsResource>
      PARSER = new com.google.protobuf.AbstractParser<RsResource>() {
    @java.lang.Override
    public RsResource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RsResource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RsResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RsResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.RsResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
