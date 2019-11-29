// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metainfo.proto

package com.sagas.meta.model;

public interface MetaViewEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaViewEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; entity properties
   * </pre>
   *
   * <code>string entityName = 1;</code>
   */
  java.lang.String getEntityName();
  /**
   * <pre>
   *&#47; entity properties
   * </pre>
   *
   * <code>string entityName = 1;</code>
   */
  com.google.protobuf.ByteString
      getEntityNameBytes();

  /**
   * <code>string packageName = 2;</code>
   */
  java.lang.String getPackageName();
  /**
   * <code>string packageName = 2;</code>
   */
  com.google.protobuf.ByteString
      getPackageNameBytes();

  /**
   * <pre>
   * view
   * </pre>
   *
   * <code>map&lt;string, .model.MetaMemberEntity&gt; memberModelEntities = 3;</code>
   */
  int getMemberModelEntitiesCount();
  /**
   * <pre>
   * view
   * </pre>
   *
   * <code>map&lt;string, .model.MetaMemberEntity&gt; memberModelEntities = 3;</code>
   */
  boolean containsMemberModelEntities(
      java.lang.String key);
  /**
   * Use {@link #getMemberModelEntitiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.sagas.meta.model.MetaMemberEntity>
  getMemberModelEntities();
  /**
   * <pre>
   * view
   * </pre>
   *
   * <code>map&lt;string, .model.MetaMemberEntity&gt; memberModelEntities = 3;</code>
   */
  java.util.Map<java.lang.String, com.sagas.meta.model.MetaMemberEntity>
  getMemberModelEntitiesMap();
  /**
   * <pre>
   * view
   * </pre>
   *
   * <code>map&lt;string, .model.MetaMemberEntity&gt; memberModelEntities = 3;</code>
   */

  com.sagas.meta.model.MetaMemberEntity getMemberModelEntitiesOrDefault(
      java.lang.String key,
      com.sagas.meta.model.MetaMemberEntity defaultValue);
  /**
   * <pre>
   * view
   * </pre>
   *
   * <code>map&lt;string, .model.MetaMemberEntity&gt; memberModelEntities = 3;</code>
   */

  com.sagas.meta.model.MetaMemberEntity getMemberModelEntitiesOrThrow(
      java.lang.String key);

  /**
   * <code>repeated .model.MetaAliasAll aliasAlls = 4;</code>
   */
  java.util.List<com.sagas.meta.model.MetaAliasAll> 
      getAliasAllsList();
  /**
   * <code>repeated .model.MetaAliasAll aliasAlls = 4;</code>
   */
  com.sagas.meta.model.MetaAliasAll getAliasAlls(int index);
  /**
   * <code>repeated .model.MetaAliasAll aliasAlls = 4;</code>
   */
  int getAliasAllsCount();
  /**
   * <code>repeated .model.MetaAliasAll aliasAlls = 4;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaAliasAllOrBuilder> 
      getAliasAllsOrBuilderList();
  /**
   * <code>repeated .model.MetaAliasAll aliasAlls = 4;</code>
   */
  com.sagas.meta.model.MetaAliasAllOrBuilder getAliasAllsOrBuilder(
      int index);

  /**
   * <code>repeated .model.MetaAlias aliases = 5;</code>
   */
  java.util.List<com.sagas.meta.model.MetaAlias> 
      getAliasesList();
  /**
   * <code>repeated .model.MetaAlias aliases = 5;</code>
   */
  com.sagas.meta.model.MetaAlias getAliases(int index);
  /**
   * <code>repeated .model.MetaAlias aliases = 5;</code>
   */
  int getAliasesCount();
  /**
   * <code>repeated .model.MetaAlias aliases = 5;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaAliasOrBuilder> 
      getAliasesOrBuilderList();
  /**
   * <code>repeated .model.MetaAlias aliases = 5;</code>
   */
  com.sagas.meta.model.MetaAliasOrBuilder getAliasesOrBuilder(
      int index);

  /**
   * <code>repeated .model.MetaViewLink viewLinks = 6;</code>
   */
  java.util.List<com.sagas.meta.model.MetaViewLink> 
      getViewLinksList();
  /**
   * <code>repeated .model.MetaViewLink viewLinks = 6;</code>
   */
  com.sagas.meta.model.MetaViewLink getViewLinks(int index);
  /**
   * <code>repeated .model.MetaViewLink viewLinks = 6;</code>
   */
  int getViewLinksCount();
  /**
   * <code>repeated .model.MetaViewLink viewLinks = 6;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaViewLinkOrBuilder> 
      getViewLinksOrBuilderList();
  /**
   * <code>repeated .model.MetaViewLink viewLinks = 6;</code>
   */
  com.sagas.meta.model.MetaViewLinkOrBuilder getViewLinksOrBuilder(
      int index);

  /**
   * <code>repeated .model.MetaField groupBys = 7;</code>
   */
  java.util.List<com.sagas.meta.model.MetaField> 
      getGroupBysList();
  /**
   * <code>repeated .model.MetaField groupBys = 7;</code>
   */
  com.sagas.meta.model.MetaField getGroupBys(int index);
  /**
   * <code>repeated .model.MetaField groupBys = 7;</code>
   */
  int getGroupBysCount();
  /**
   * <code>repeated .model.MetaField groupBys = 7;</code>
   */
  java.util.List<? extends com.sagas.meta.model.MetaFieldOrBuilder> 
      getGroupBysOrBuilderList();
  /**
   * <code>repeated .model.MetaField groupBys = 7;</code>
   */
  com.sagas.meta.model.MetaFieldOrBuilder getGroupBysOrBuilder(
      int index);
}
