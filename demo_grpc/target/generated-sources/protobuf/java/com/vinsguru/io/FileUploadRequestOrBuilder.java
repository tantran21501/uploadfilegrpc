// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fileupload.proto

package com.vinsguru.io;

public interface FileUploadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:file.FileUploadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.file.MetaData metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.file.MetaData metadata = 1;</code>
   * @return The metadata.
   */
  com.vinsguru.io.MetaData getMetadata();
  /**
   * <code>.file.MetaData metadata = 1;</code>
   */
  com.vinsguru.io.MetaDataOrBuilder getMetadataOrBuilder();

  /**
   * <code>.file.File file = 2;</code>
   * @return Whether the file field is set.
   */
  boolean hasFile();
  /**
   * <code>.file.File file = 2;</code>
   * @return The file.
   */
  com.vinsguru.io.File getFile();
  /**
   * <code>.file.File file = 2;</code>
   */
  com.vinsguru.io.FileOrBuilder getFileOrBuilder();

  public com.vinsguru.io.FileUploadRequest.RequestCase getRequestCase();
}