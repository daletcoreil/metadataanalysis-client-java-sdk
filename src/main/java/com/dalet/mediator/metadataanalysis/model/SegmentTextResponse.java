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
 * SegmentTextResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-04T14:41:39.145+08:00[GMT+08:00]")
public class SegmentTextResponse {
  public static final String SERIALIZED_NAME_DPTT_FILE = "dpttFile";
  @SerializedName(SERIALIZED_NAME_DPTT_FILE)
  private Locator dpttFile;

  public static final String SERIALIZED_NAME_DRAFTJS_FILE = "draftjsFile";
  @SerializedName(SERIALIZED_NAME_DRAFTJS_FILE)
  private Locator draftjsFile;


  public SegmentTextResponse dpttFile(Locator dpttFile) {
    
    this.dpttFile = dpttFile;
    return this;
  }

   /**
   * Get dpttFile
   * @return dpttFile
  **/
  @ApiModelProperty(required = true, value = "")

  public Locator getDpttFile() {
    return dpttFile;
  }


  public void setDpttFile(Locator dpttFile) {
    this.dpttFile = dpttFile;
  }


  public SegmentTextResponse draftjsFile(Locator draftjsFile) {
    
    this.draftjsFile = draftjsFile;
    return this;
  }

   /**
   * Get draftjsFile
   * @return draftjsFile
  **/
  @ApiModelProperty(required = true, value = "")

  public Locator getDraftjsFile() {
    return draftjsFile;
  }


  public void setDraftjsFile(Locator draftjsFile) {
    this.draftjsFile = draftjsFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentTextResponse segmentTextResponse = (SegmentTextResponse) o;
    return Objects.equals(this.dpttFile, segmentTextResponse.dpttFile) &&
        Objects.equals(this.draftjsFile, segmentTextResponse.draftjsFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpttFile, draftjsFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentTextResponse {\n");
    sb.append("    dpttFile: ").append(toIndentedString(dpttFile)).append("\n");
    sb.append("    draftjsFile: ").append(toIndentedString(draftjsFile)).append("\n");
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

