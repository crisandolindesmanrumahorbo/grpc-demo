// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcserverstream.proto

package com.rumahorbo.grpserverstream;

public final class Grpcserverstream {
  private Grpcserverstream() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rumahorbo_grpserverstream_WordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rumahorbo_grpserverstream_WordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rumahorbo_grpserverstream_WordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rumahorbo_grpserverstream_WordResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026grpcserverstream.proto\022\035com.rumahorbo." +
      "grpserverstream\"\033\n\013WordRequest\022\014\n\004word\030\001" +
      " \001(\t\"\034\n\014WordResponse\022\014\n\004word\030\001 \001(\t2t\n\014Sp" +
      "ellService\022d\n\005spell\022*.com.rumahorbo.grps" +
      "erverstream.WordRequest\032+.com.rumahorbo." +
      "grpserverstream.WordResponse\"\0000\001B!\n\035com." +
      "rumahorbo.grpserverstreamP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_rumahorbo_grpserverstream_WordRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_rumahorbo_grpserverstream_WordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rumahorbo_grpserverstream_WordRequest_descriptor,
        new java.lang.String[] { "Word", });
    internal_static_com_rumahorbo_grpserverstream_WordResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_rumahorbo_grpserverstream_WordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rumahorbo_grpserverstream_WordResponse_descriptor,
        new java.lang.String[] { "Word", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}