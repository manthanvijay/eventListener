// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greeting.proto

package com.wheelseye.proto.event;

public final class Greeting {
  private Greeting() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_HealthRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_HealthRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_HealthResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_HealthResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_EventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_EventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_EventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_EventResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016greeting.proto\022\013proto.event\"\035\n\rHealthR" +
      "equest\022\014\n\004ping\030\001 \001(\t\"\036\n\016HealthResponse\022\014" +
      "\n\004pong\030\001 \001(\t\"\"\n\014EventRequest\022\022\n\nevent_na" +
      "me\030\001 \001(\t\"!\n\rEventResponse\022\020\n\010response\030\001 " +
      "\001(\t2\243\001\n\014EventService\022H\n\013HealthCheck\022\032.pr" +
      "oto.event.HealthRequest\032\033.proto.event.He" +
      "althResponse\"\000\022I\n\014CaptureEvent\022\031.proto.e" +
      "vent.EventRequest\032\032.proto.event.EventRes" +
      "ponse\"\0000\001B*\n\031com.wheelseye.proto.eventP\001" +
      "Z\013proto/eventb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_event_HealthRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_event_HealthRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_HealthRequest_descriptor,
        new java.lang.String[] { "Ping", });
    internal_static_proto_event_HealthResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_event_HealthResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_HealthResponse_descriptor,
        new java.lang.String[] { "Pong", });
    internal_static_proto_event_EventRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_event_EventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_EventRequest_descriptor,
        new java.lang.String[] { "EventName", });
    internal_static_proto_event_EventResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_event_EventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_EventResponse_descriptor,
        new java.lang.String[] { "Response", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
