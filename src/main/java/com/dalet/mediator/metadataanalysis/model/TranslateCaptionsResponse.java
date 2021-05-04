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
import com.dalet.mediator.metadataanalysis.model.Locator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TranslateCaptionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-04T14:41:39.145+08:00[GMT+08:00]")
public class TranslateCaptionsResponse {
  public static final String SERIALIZED_NAME_TTML_FILE = "ttmlFile";
  @SerializedName(SERIALIZED_NAME_TTML_FILE)
  private Locator ttmlFile;

  public static final String SERIALIZED_NAME_TEXT_FILE = "textFile";
  @SerializedName(SERIALIZED_NAME_TEXT_FILE)
  private Locator textFile;


  public TranslateCaptionsResponse ttmlFile(Locator ttmlFile) {
    
    this.ttmlFile = ttmlFile;
    return this;
  }

   /**
   * Get ttmlFile
   * @return ttmlFile
  **/
  @ApiModelProperty(required = true, value = "")

  public Locator getTtmlFile() {
    return ttmlFile;
  }


  public void setTtmlFile(Locator ttmlFile) {
    this.ttmlFile = ttmlFile;
  }


  public TranslateCaptionsResponse textFile(Locator textFile) {
    
    this.textFile = textFile;
    return this;
  }

   /**
   * Get textFile
   * @return textFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Locator getTextFile() {
    return textFile;
  }


  public void setTextFile(Locator textFile) {
    this.textFile = textFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateCaptionsResponse translateCaptionsResponse = (TranslateCaptionsResponse) o;
    return Objects.equals(this.ttmlFile, translateCaptionsResponse.ttmlFile) &&
        Objects.equals(this.textFile, translateCaptionsResponse.textFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ttmlFile, textFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateCaptionsResponse {\n");
    sb.append("    ttmlFile: ").append(toIndentedString(ttmlFile)).append("\n");
    sb.append("    textFile: ").append(toIndentedString(textFile)).append("\n");
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

