/*
 * Dalet Metadata Analysis API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: cortexsupport@dalet.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dalet.mediator.metadataanalysis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TranslateTextResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-03T19:24:04.607+08:00[GMT+08:00]")
public class TranslateTextResponse {
  public static final String SERIALIZED_NAME_DETECTED_SOURCE_LANGUAGE = "detectedSourceLanguage";
  @SerializedName(SERIALIZED_NAME_DETECTED_SOURCE_LANGUAGE)
  private String detectedSourceLanguage;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;


  public TranslateTextResponse detectedSourceLanguage(String detectedSourceLanguage) {
    
    this.detectedSourceLanguage = detectedSourceLanguage;
    return this;
  }

   /**
   * The source language that was detected by the API in case it was not specified in the request.
   * @return detectedSourceLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source language that was detected by the API in case it was not specified in the request.")

  public String getDetectedSourceLanguage() {
    return detectedSourceLanguage;
  }


  public void setDetectedSourceLanguage(String detectedSourceLanguage) {
    this.detectedSourceLanguage = detectedSourceLanguage;
  }


  public TranslateTextResponse text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Translated text.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "Translated text.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateTextResponse translateTextResponse = (TranslateTextResponse) o;
    return Objects.equals(this.detectedSourceLanguage, translateTextResponse.detectedSourceLanguage) &&
        Objects.equals(this.text, translateTextResponse.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectedSourceLanguage, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateTextResponse {\n");
    sb.append("    detectedSourceLanguage: ").append(toIndentedString(detectedSourceLanguage)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
