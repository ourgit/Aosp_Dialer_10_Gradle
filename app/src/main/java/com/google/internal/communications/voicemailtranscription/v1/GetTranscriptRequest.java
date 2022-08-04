// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/voicemail/impl/transcribe/grpc/voicemail_transcription.proto

package com.google.internal.communications.voicemailtranscription.v1;

/**
 * <pre>
 * Request for retrieving an asynchronously generated transcript.
 * </pre>
 *
 * Protobuf type {@code google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest}
 */
public  final class GetTranscriptRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetTranscriptRequest, GetTranscriptRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest)
    GetTranscriptRequestOrBuilder {
  private GetTranscriptRequest() {
    transcriptionId_ = "";
  }
  private int bitField0_;
  public static final int TRANSCRIPTION_ID_FIELD_NUMBER = 1;
  private java.lang.String transcriptionId_;
  /**
   * <pre>
   * Unique ID for the transcription. This ID was returned by
   * TranscribeVoicemailAsync.
   * </pre>
   *
   * <code>optional string transcription_id = 1;</code>
   */
  public boolean hasTranscriptionId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * Unique ID for the transcription. This ID was returned by
   * TranscribeVoicemailAsync.
   * </pre>
   *
   * <code>optional string transcription_id = 1;</code>
   */
  public java.lang.String getTranscriptionId() {
    return transcriptionId_;
  }
  /**
   * <pre>
   * Unique ID for the transcription. This ID was returned by
   * TranscribeVoicemailAsync.
   * </pre>
   *
   * <code>optional string transcription_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTranscriptionIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(transcriptionId_);
  }
  /**
   * <pre>
   * Unique ID for the transcription. This ID was returned by
   * TranscribeVoicemailAsync.
   * </pre>
   *
   * <code>optional string transcription_id = 1;</code>
   */
  private void setTranscriptionId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    transcriptionId_ = value;
  }
  /**
   * <pre>
   * Unique ID for the transcription. This ID was returned by
   * TranscribeVoicemailAsync.
   * </pre>
   *
   * <code>optional string transcription_id = 1;</code>
   */
  private void clearTranscriptionId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    transcriptionId_ = getDefaultInstance().getTranscriptionId();
  }
  /**
   * <pre>
   * Unique ID for the transcription. This ID was returned by
   * TranscribeVoicemailAsync.
   * </pre>
   *
   * <code>optional string transcription_id = 1;</code>
   */
  private void setTranscriptionIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    transcriptionId_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getTranscriptionId());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getTranscriptionId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Request for retrieving an asynchronously generated transcript.
   * </pre>
   *
   * Protobuf type {@code google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest)
      com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequestOrBuilder {
    // Construct using com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Unique ID for the transcription. This ID was returned by
     * TranscribeVoicemailAsync.
     * </pre>
     *
     * <code>optional string transcription_id = 1;</code>
     */
    public boolean hasTranscriptionId() {
      return instance.hasTranscriptionId();
    }
    /**
     * <pre>
     * Unique ID for the transcription. This ID was returned by
     * TranscribeVoicemailAsync.
     * </pre>
     *
     * <code>optional string transcription_id = 1;</code>
     */
    public java.lang.String getTranscriptionId() {
      return instance.getTranscriptionId();
    }
    /**
     * <pre>
     * Unique ID for the transcription. This ID was returned by
     * TranscribeVoicemailAsync.
     * </pre>
     *
     * <code>optional string transcription_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTranscriptionIdBytes() {
      return instance.getTranscriptionIdBytes();
    }
    /**
     * <pre>
     * Unique ID for the transcription. This ID was returned by
     * TranscribeVoicemailAsync.
     * </pre>
     *
     * <code>optional string transcription_id = 1;</code>
     */
    public Builder setTranscriptionId(
        java.lang.String value) {
      copyOnWrite();
      instance.setTranscriptionId(value);
      return this;
    }
    /**
     * <pre>
     * Unique ID for the transcription. This ID was returned by
     * TranscribeVoicemailAsync.
     * </pre>
     *
     * <code>optional string transcription_id = 1;</code>
     */
    public Builder clearTranscriptionId() {
      copyOnWrite();
      instance.clearTranscriptionId();
      return this;
    }
    /**
     * <pre>
     * Unique ID for the transcription. This ID was returned by
     * TranscribeVoicemailAsync.
     * </pre>
     *
     * <code>optional string transcription_id = 1;</code>
     */
    public Builder setTranscriptionIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTranscriptionIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest other = (com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest) arg1;
        transcriptionId_ = visitor.visitString(
            hasTranscriptionId(), transcriptionId_,
            other.hasTranscriptionId(), other.transcriptionId_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readString();
                bitField0_ |= 0x00000001;
                transcriptionId_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest)
  private static final com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetTranscriptRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.internal.communications.voicemailtranscription.v1.GetTranscriptRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetTranscriptRequest> PARSER;

  public static com.google.protobuf.Parser<GetTranscriptRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

