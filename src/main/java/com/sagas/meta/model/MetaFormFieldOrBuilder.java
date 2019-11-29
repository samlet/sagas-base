// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: forms.proto

package com.sagas.meta.model;

public interface MetaFormFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:model.MetaFormField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string title = 2;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string fieldName = 3;</code>
   */
  java.lang.String getFieldName();
  /**
   * <code>string fieldName = 3;</code>
   */
  com.google.protobuf.ByteString
      getFieldNameBytes();

  /**
   * <code>string useWhen = 4;</code>
   */
  java.lang.String getUseWhen();
  /**
   * <code>string useWhen = 4;</code>
   */
  com.google.protobuf.ByteString
      getUseWhenBytes();

  /**
   * <code>string redWhen = 5;</code>
   */
  java.lang.String getRedWhen();
  /**
   * <code>string redWhen = 5;</code>
   */
  com.google.protobuf.ByteString
      getRedWhenBytes();

  /**
   * <code>bool requiredField = 6;</code>
   */
  boolean getRequiredField();

  /**
   * <code>string tooltip = 7;</code>
   */
  java.lang.String getTooltip();
  /**
   * <code>string tooltip = 7;</code>
   */
  com.google.protobuf.ByteString
      getTooltipBytes();

  /**
   * <code>string ignoreWhen = 8;</code>
   */
  java.lang.String getIgnoreWhen();
  /**
   * <code>string ignoreWhen = 8;</code>
   */
  com.google.protobuf.ByteString
      getIgnoreWhenBytes();

  /**
   * <code>string event = 9;</code>
   */
  java.lang.String getEvent();
  /**
   * <code>string event = 9;</code>
   */
  com.google.protobuf.ByteString
      getEventBytes();

  /**
   * <code>.model.MetaFormFieldType fieldType = 10;</code>
   */
  int getFieldTypeValue();
  /**
   * <code>.model.MetaFormFieldType fieldType = 10;</code>
   */
  com.sagas.meta.model.MetaFormFieldType getFieldType();

  /**
   * <pre>
   * includes the title original expression
   * </pre>
   *
   * <code>string titleOriginal = 11;</code>
   */
  java.lang.String getTitleOriginal();
  /**
   * <pre>
   * includes the title original expression
   * </pre>
   *
   * <code>string titleOriginal = 11;</code>
   */
  com.google.protobuf.ByteString
      getTitleOriginalBytes();

  /**
   * <code>.model.MetaTextField textField = 20;</code>
   */
  boolean hasTextField();
  /**
   * <code>.model.MetaTextField textField = 20;</code>
   */
  com.sagas.meta.model.MetaTextField getTextField();
  /**
   * <code>.model.MetaTextField textField = 20;</code>
   */
  com.sagas.meta.model.MetaTextFieldOrBuilder getTextFieldOrBuilder();

  /**
   * <code>.model.MetaDateTimeField dateTimeField = 21;</code>
   */
  boolean hasDateTimeField();
  /**
   * <code>.model.MetaDateTimeField dateTimeField = 21;</code>
   */
  com.sagas.meta.model.MetaDateTimeField getDateTimeField();
  /**
   * <code>.model.MetaDateTimeField dateTimeField = 21;</code>
   */
  com.sagas.meta.model.MetaDateTimeFieldOrBuilder getDateTimeFieldOrBuilder();

  /**
   * <code>.model.MetaDisplayField displayField = 22;</code>
   */
  boolean hasDisplayField();
  /**
   * <code>.model.MetaDisplayField displayField = 22;</code>
   */
  com.sagas.meta.model.MetaDisplayField getDisplayField();
  /**
   * <code>.model.MetaDisplayField displayField = 22;</code>
   */
  com.sagas.meta.model.MetaDisplayFieldOrBuilder getDisplayFieldOrBuilder();

  /**
   * <code>.model.MetaCheckField checkField = 23;</code>
   */
  boolean hasCheckField();
  /**
   * <code>.model.MetaCheckField checkField = 23;</code>
   */
  com.sagas.meta.model.MetaCheckField getCheckField();
  /**
   * <code>.model.MetaCheckField checkField = 23;</code>
   */
  com.sagas.meta.model.MetaCheckFieldOrBuilder getCheckFieldOrBuilder();

  /**
   * <code>.model.MetaDropDownField dropDownField = 24;</code>
   */
  boolean hasDropDownField();
  /**
   * <code>.model.MetaDropDownField dropDownField = 24;</code>
   */
  com.sagas.meta.model.MetaDropDownField getDropDownField();
  /**
   * <code>.model.MetaDropDownField dropDownField = 24;</code>
   */
  com.sagas.meta.model.MetaDropDownFieldOrBuilder getDropDownFieldOrBuilder();

  /**
   * <code>.model.MetaRadioField radioField = 25;</code>
   */
  boolean hasRadioField();
  /**
   * <code>.model.MetaRadioField radioField = 25;</code>
   */
  com.sagas.meta.model.MetaRadioField getRadioField();
  /**
   * <code>.model.MetaRadioField radioField = 25;</code>
   */
  com.sagas.meta.model.MetaRadioFieldOrBuilder getRadioFieldOrBuilder();

  /**
   * <code>.model.MetaSubmitField submitField = 26;</code>
   */
  boolean hasSubmitField();
  /**
   * <code>.model.MetaSubmitField submitField = 26;</code>
   */
  com.sagas.meta.model.MetaSubmitField getSubmitField();
  /**
   * <code>.model.MetaSubmitField submitField = 26;</code>
   */
  com.sagas.meta.model.MetaSubmitFieldOrBuilder getSubmitFieldOrBuilder();

  /**
   * <code>.model.MetaTextAreaField textAreaField = 27;</code>
   */
  boolean hasTextAreaField();
  /**
   * <code>.model.MetaTextAreaField textAreaField = 27;</code>
   */
  com.sagas.meta.model.MetaTextAreaField getTextAreaField();
  /**
   * <code>.model.MetaTextAreaField textAreaField = 27;</code>
   */
  com.sagas.meta.model.MetaTextAreaFieldOrBuilder getTextAreaFieldOrBuilder();

  public com.sagas.meta.model.MetaFormField.FieldInfoCase getFieldInfoCase();
}
