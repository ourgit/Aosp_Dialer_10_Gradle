// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/voicemail/impl/transcribe/grpc/voicemail_transcription.proto

package com.google.internal.communications.voicemailtranscription.v1;

/**
 * <pre>
 * Response for uploading transcription ratings
 * </pre>
 *
 * Protobuf type {@code google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse}
 */
public  final class SendTranscriptionFeedbackResponse extends
    com.google.protobuf.GeneratedMessageLite<
        SendTranscriptionFeedbackResponse, SendTranscriptionFeedbackResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse)
    SendTranscriptionFeedbackResponseOrBuilder {
  private SendTranscriptionFeedbackResponse() {
  }
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Response for uploading transcription ratings
   * </pre>
   *
   * Protobuf type {@code google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse)
      com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponseOrBuilder {
    // Construct using com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    // @@protoc_insertion_point(builder_scope:google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse();
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
        com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse other = (com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse) arg1;
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
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
        if (PARSER == null) {    synchronized (com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse.class) {
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


  // @@protoc_insertion_point(class_scope:google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse)
  private static final com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SendTranscriptionFeedbackResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.internal.communications.voicemailtranscription.v1.SendTranscriptionFeedbackResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SendTranscriptionFeedbackResponse> PARSER;

  public static com.google.protobuf.Parser<SendTranscriptionFeedbackResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

