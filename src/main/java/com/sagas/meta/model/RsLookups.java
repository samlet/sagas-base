// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources.proto

package com.sagas.meta.model;

/**
 * Protobuf type {@code model.RsLookups}
 */
public  final class RsLookups extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:model.RsLookups)
    RsLookupsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RsLookups.newBuilder() to construct.
  private RsLookups(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RsLookups() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RsLookups(
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
              indexTable_ = com.google.protobuf.MapField.newMapField(
                  IndexTableDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.sagas.meta.model.RsIndex>
            indexTable__ = input.readMessage(
                IndexTableDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            indexTable_.getMutableMap().put(
                indexTable__.getKey(), indexTable__.getValue());
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
    return com.sagas.meta.model.Resources.internal_static_model_RsLookups_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetIndexTable();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sagas.meta.model.Resources.internal_static_model_RsLookups_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sagas.meta.model.RsLookups.class, com.sagas.meta.model.RsLookups.Builder.class);
  }

  public static final int INDEXTABLE_FIELD_NUMBER = 1;
  private static final class IndexTableDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.sagas.meta.model.RsIndex> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.sagas.meta.model.RsIndex>newDefaultInstance(
                com.sagas.meta.model.Resources.internal_static_model_RsLookups_IndexTableEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.sagas.meta.model.RsIndex.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.sagas.meta.model.RsIndex> indexTable_;
  private com.google.protobuf.MapField<java.lang.String, com.sagas.meta.model.RsIndex>
  internalGetIndexTable() {
    if (indexTable_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          IndexTableDefaultEntryHolder.defaultEntry);
    }
    return indexTable_;
  }

  public int getIndexTableCount() {
    return internalGetIndexTable().getMap().size();
  }
  /**
   * <pre>
   * key is lang
   * </pre>
   *
   * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
   */

  public boolean containsIndexTable(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetIndexTable().getMap().containsKey(key);
  }
  /**
   * Use {@link #getIndexTableMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> getIndexTable() {
    return getIndexTableMap();
  }
  /**
   * <pre>
   * key is lang
   * </pre>
   *
   * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
   */

  public java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> getIndexTableMap() {
    return internalGetIndexTable().getMap();
  }
  /**
   * <pre>
   * key is lang
   * </pre>
   *
   * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
   */

  public com.sagas.meta.model.RsIndex getIndexTableOrDefault(
      java.lang.String key,
      com.sagas.meta.model.RsIndex defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> map =
        internalGetIndexTable().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * key is lang
   * </pre>
   *
   * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
   */

  public com.sagas.meta.model.RsIndex getIndexTableOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> map =
        internalGetIndexTable().getMap();
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
        internalGetIndexTable(),
        IndexTableDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.sagas.meta.model.RsIndex> entry
         : internalGetIndexTable().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.sagas.meta.model.RsIndex>
      indexTable__ = IndexTableDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, indexTable__);
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
    if (!(obj instanceof com.sagas.meta.model.RsLookups)) {
      return super.equals(obj);
    }
    com.sagas.meta.model.RsLookups other = (com.sagas.meta.model.RsLookups) obj;

    boolean result = true;
    result = result && internalGetIndexTable().equals(
        other.internalGetIndexTable());
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
    if (!internalGetIndexTable().getMap().isEmpty()) {
      hash = (37 * hash) + INDEXTABLE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetIndexTable().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sagas.meta.model.RsLookups parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLookups parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsLookups parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sagas.meta.model.RsLookups parseFrom(
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
  public static Builder newBuilder(com.sagas.meta.model.RsLookups prototype) {
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
   * Protobuf type {@code model.RsLookups}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:model.RsLookups)
      com.sagas.meta.model.RsLookupsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sagas.meta.model.Resources.internal_static_model_RsLookups_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetIndexTable();
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
          return internalGetMutableIndexTable();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sagas.meta.model.Resources.internal_static_model_RsLookups_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sagas.meta.model.RsLookups.class, com.sagas.meta.model.RsLookups.Builder.class);
    }

    // Construct using com.sagas.meta.model.RsLookups.newBuilder()
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
      internalGetMutableIndexTable().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sagas.meta.model.Resources.internal_static_model_RsLookups_descriptor;
    }

    @java.lang.Override
    public com.sagas.meta.model.RsLookups getDefaultInstanceForType() {
      return com.sagas.meta.model.RsLookups.getDefaultInstance();
    }

    @java.lang.Override
    public com.sagas.meta.model.RsLookups build() {
      com.sagas.meta.model.RsLookups result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sagas.meta.model.RsLookups buildPartial() {
      com.sagas.meta.model.RsLookups result = new com.sagas.meta.model.RsLookups(this);
      int from_bitField0_ = bitField0_;
      result.indexTable_ = internalGetIndexTable();
      result.indexTable_.makeImmutable();
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
      if (other instanceof com.sagas.meta.model.RsLookups) {
        return mergeFrom((com.sagas.meta.model.RsLookups)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sagas.meta.model.RsLookups other) {
      if (other == com.sagas.meta.model.RsLookups.getDefaultInstance()) return this;
      internalGetMutableIndexTable().mergeFrom(
          other.internalGetIndexTable());
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
      com.sagas.meta.model.RsLookups parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sagas.meta.model.RsLookups) e.getUnfinishedMessage();
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
        java.lang.String, com.sagas.meta.model.RsIndex> indexTable_;
    private com.google.protobuf.MapField<java.lang.String, com.sagas.meta.model.RsIndex>
    internalGetIndexTable() {
      if (indexTable_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            IndexTableDefaultEntryHolder.defaultEntry);
      }
      return indexTable_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.sagas.meta.model.RsIndex>
    internalGetMutableIndexTable() {
      onChanged();;
      if (indexTable_ == null) {
        indexTable_ = com.google.protobuf.MapField.newMapField(
            IndexTableDefaultEntryHolder.defaultEntry);
      }
      if (!indexTable_.isMutable()) {
        indexTable_ = indexTable_.copy();
      }
      return indexTable_;
    }

    public int getIndexTableCount() {
      return internalGetIndexTable().getMap().size();
    }
    /**
     * <pre>
     * key is lang
     * </pre>
     *
     * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
     */

    public boolean containsIndexTable(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetIndexTable().getMap().containsKey(key);
    }
    /**
     * Use {@link #getIndexTableMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> getIndexTable() {
      return getIndexTableMap();
    }
    /**
     * <pre>
     * key is lang
     * </pre>
     *
     * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
     */

    public java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> getIndexTableMap() {
      return internalGetIndexTable().getMap();
    }
    /**
     * <pre>
     * key is lang
     * </pre>
     *
     * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
     */

    public com.sagas.meta.model.RsIndex getIndexTableOrDefault(
        java.lang.String key,
        com.sagas.meta.model.RsIndex defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> map =
          internalGetIndexTable().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * key is lang
     * </pre>
     *
     * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
     */

    public com.sagas.meta.model.RsIndex getIndexTableOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> map =
          internalGetIndexTable().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearIndexTable() {
      internalGetMutableIndexTable().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * key is lang
     * </pre>
     *
     * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
     */

    public Builder removeIndexTable(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableIndexTable().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex>
    getMutableIndexTable() {
      return internalGetMutableIndexTable().getMutableMap();
    }
    /**
     * <pre>
     * key is lang
     * </pre>
     *
     * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
     */
    public Builder putIndexTable(
        java.lang.String key,
        com.sagas.meta.model.RsIndex value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableIndexTable().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * key is lang
     * </pre>
     *
     * <code>map&lt;string, .model.RsIndex&gt; indexTable = 1;</code>
     */

    public Builder putAllIndexTable(
        java.util.Map<java.lang.String, com.sagas.meta.model.RsIndex> values) {
      internalGetMutableIndexTable().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:model.RsLookups)
  }

  // @@protoc_insertion_point(class_scope:model.RsLookups)
  private static final com.sagas.meta.model.RsLookups DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sagas.meta.model.RsLookups();
  }

  public static com.sagas.meta.model.RsLookups getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RsLookups>
      PARSER = new com.google.protobuf.AbstractParser<RsLookups>() {
    @java.lang.Override
    public RsLookups parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RsLookups(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RsLookups> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RsLookups> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sagas.meta.model.RsLookups getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
