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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_MimicStartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_MimicStartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_MimicRecieveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_MimicRecieveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_MimicRecieveResponse_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_MimicRecieveResponse_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_ServerStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_ServerStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_MimicResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_MimicResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_MimicLayoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_MimicLayoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_MimicLayoutRequest_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_MimicLayoutRequest_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_MimicLayoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_MimicLayoutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_GetEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_GetEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_event_GetEventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_event_GetEventResponse_fieldAccessorTable;

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
      "\001(\t\"!\n\021MimicStartRequest\022\014\n\004uuid\030\001 \001(\t\"\221" +
      "\001\n\024MimicRecieveResponse\022\021\n\tlayout_id\030\001 \001" +
      "(\005\0229\n\004data\030\002 \003(\0132+.proto.event.MimicReci" +
      "eveResponse.DataEntry\032+\n\tDataEntry\022\013\n\003ke" +
      "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"%\n\023ServerStre" +
      "amRequest\022\016\n\006app_id\030\001 \001(\t\" \n\rMimicRespon" +
      "se\022\017\n\007request\030\001 \001(\t\"\215\001\n\022MimicLayoutReque" +
      "st\022\021\n\tlayout_id\030\001 \001(\005\0227\n\004data\030\002 \003(\0132).pr" +
      "oto.event.MimicLayoutRequest.DataEntry\032+" +
      "\n\tDataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:" +
      "\0028\001\"\'\n\023MimicLayoutResponse\022\020\n\010response\030\001" +
      " \001(\t\"%\n\017GetEventRequest\022\022\n\nevent_name\030\001 " +
      "\001(\t\"<\n\020GetEventResponse\022\022\n\nevent_name\030\001 " +
      "\001(\t\022\024\n\014phone_number\030\002 \001(\t2\355\003\n\014EventServi" +
      "ce\022H\n\013HealthCheck\022\032.proto.event.HealthRe" +
      "quest\032\033.proto.event.HealthResponse\"\000\022G\n\014" +
      "CaptureEvent\022\031.proto.event.EventRequest\032" +
      "\032.proto.event.EventResponse\"\000\022Q\n\rMimicLi" +
      "stener\022 .proto.event.ServerStreamRequest" +
      "\032\032.proto.event.MimicResponse\"\0000\001\022U\n\014Mimi" +
      "cRecieve\022\036.proto.event.MimicStartRequest" +
      "\032!.proto.event.MimicRecieveResponse\"\0000\001\022" +
      "R\n\tMimicSend\022\037.proto.event.MimicLayoutRe" +
      "quest\032 .proto.event.MimicLayoutResponse\"" +
      "\000(\001\022L\n\tGetEvents\022\034.proto.event.GetEventR" +
      "equest\032\035.proto.event.GetEventResponse\"\0000" +
      "\001B*\n\031com.wheelseye.proto.eventP\001Z\013proto/" +
      "eventb\006proto3"
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
    internal_static_proto_event_MimicStartRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_proto_event_MimicStartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_MimicStartRequest_descriptor,
        new java.lang.String[] { "Uuid", });
    internal_static_proto_event_MimicRecieveResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_proto_event_MimicRecieveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_MimicRecieveResponse_descriptor,
        new java.lang.String[] { "LayoutId", "Data", });
    internal_static_proto_event_MimicRecieveResponse_DataEntry_descriptor =
      internal_static_proto_event_MimicRecieveResponse_descriptor.getNestedTypes().get(0);
    internal_static_proto_event_MimicRecieveResponse_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_MimicRecieveResponse_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_proto_event_ServerStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_proto_event_ServerStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_ServerStreamRequest_descriptor,
        new java.lang.String[] { "AppId", });
    internal_static_proto_event_MimicResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_proto_event_MimicResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_MimicResponse_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_proto_event_MimicLayoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_proto_event_MimicLayoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_MimicLayoutRequest_descriptor,
        new java.lang.String[] { "LayoutId", "Data", });
    internal_static_proto_event_MimicLayoutRequest_DataEntry_descriptor =
      internal_static_proto_event_MimicLayoutRequest_descriptor.getNestedTypes().get(0);
    internal_static_proto_event_MimicLayoutRequest_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_MimicLayoutRequest_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_proto_event_MimicLayoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_proto_event_MimicLayoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_MimicLayoutResponse_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_proto_event_GetEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_proto_event_GetEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_GetEventRequest_descriptor,
        new java.lang.String[] { "EventName", });
    internal_static_proto_event_GetEventResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_proto_event_GetEventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_event_GetEventResponse_descriptor,
        new java.lang.String[] { "EventName", "PhoneNumber", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
