// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.wheelseye.proto.event;

public interface MimicSendRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.event.MimicSendRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string uuid = 1;</code>
   */
  java.lang.String getUuid();
  /**
   * <code>string uuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <code>int32 layout_id = 2;</code>
   */
  int getLayoutId();

  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
   */
  int getDataCount();
  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
   */
  boolean containsData(
      java.lang.String key);
  /**
   * Use {@link #getDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getData();
  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDataMap();
  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
   */

  java.lang.String getDataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; data = 3;</code>
   */

  java.lang.String getDataOrThrow(
      java.lang.String key);
}
