// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/android/dialer/blockreportspam/block_report_spam_dialog_info.proto

package com.fissy.dialer.blockreportspam;

public interface BlockReportSpamDialogInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.fissy.dialer.blockreportspam.BlockReportSpamDialogInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A dialer-normalized version of the number used in the dialogs.
   * See DialerPhoneNumber#normalized_number.
   * </pre>
   *
   * <code>optional string normalized_number = 1;</code>
   */
  boolean hasNormalizedNumber();
  /**
   * <pre>
   * A dialer-normalized version of the number used in the dialogs.
   * See DialerPhoneNumber#normalized_number.
   * </pre>
   *
   * <code>optional string normalized_number = 1;</code>
   */
  java.lang.String getNormalizedNumber();
  /**
   * <pre>
   * A dialer-normalized version of the number used in the dialogs.
   * See DialerPhoneNumber#normalized_number.
   * </pre>
   *
   * <code>optional string normalized_number = 1;</code>
   */
  com.google.protobuf.ByteString
      getNormalizedNumberBytes();

  /**
   * <pre>
   * The ISO 3166-1 two letters country code of the number.
   * </pre>
   *
   * <code>optional string country_iso = 2;</code>
   */
  boolean hasCountryIso();
  /**
   * <pre>
   * The ISO 3166-1 two letters country code of the number.
   * </pre>
   *
   * <code>optional string country_iso = 2;</code>
   */
  java.lang.String getCountryIso();
  /**
   * <pre>
   * The ISO 3166-1 two letters country code of the number.
   * </pre>
   *
   * <code>optional string country_iso = 2;</code>
   */
  com.google.protobuf.ByteString
      getCountryIsoBytes();

  /**
   * <pre>
   * Type of the call to/from the number, as defined in
   * android.provider.CallLog.Calls
   * </pre>
   *
   * <code>optional int32 call_type = 3;</code>
   */
  boolean hasCallType();
  /**
   * <pre>
   * Type of the call to/from the number, as defined in
   * android.provider.CallLog.Calls
   * </pre>
   *
   * <code>optional int32 call_type = 3;</code>
   */
  int getCallType();

  /**
   * <pre>
   * The location where the number is reported.
   * </pre>
   *
   * <code>optional .com.fissy.dialer.logging.ReportingLocation.Type reporting_location = 4;</code>
   */
  boolean hasReportingLocation();
  /**
   * <pre>
   * The location where the number is reported.
   * </pre>
   *
   * <code>optional .com.fissy.dialer.logging.ReportingLocation.Type reporting_location = 4;</code>
   */
  com.fissy.dialer.logging.ReportingLocation.Type getReportingLocation();

  /**
   * <pre>
   * The source where contact info is associated with the number.
   * </pre>
   *
   * <code>optional .com.fissy.dialer.logging.ContactSource.Type contact_source = 5;</code>
   */
  boolean hasContactSource();
  /**
   * <pre>
   * The source where contact info is associated with the number.
   * </pre>
   *
   * <code>optional .com.fissy.dialer.logging.ContactSource.Type contact_source = 5;</code>
   */
  com.fissy.dialer.logging.ContactSource.Type getContactSource();
}
