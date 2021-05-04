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
import com.dalet.mediator.metadataanalysis.model.KnowledgeGraph;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * KnowledgeGraphSearchResponseItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-04T14:41:39.145+08:00[GMT+08:00]")
public class KnowledgeGraphSearchResponseItems {
  public static final String SERIALIZED_NAME_RESULT_SCORE = "resultScore";
  @SerializedName(SERIALIZED_NAME_RESULT_SCORE)
  private java.lang.Double resultScore;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private KnowledgeGraph result;


  public KnowledgeGraphSearchResponseItems resultScore(java.lang.Double resultScore) {
    
    this.resultScore = resultScore;
    return this;
  }

   /**
   * An indicator of how well the entity matched the request constraints.
   * @return resultScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An indicator of how well the entity matched the request constraints.")

  public java.lang.Double getResultScore() {
    return resultScore;
  }


  public void setResultScore(java.lang.Double resultScore) {
    this.resultScore = resultScore;
  }


  public KnowledgeGraphSearchResponseItems result(KnowledgeGraph result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KnowledgeGraph getResult() {
    return result;
  }


  public void setResult(KnowledgeGraph result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGraphSearchResponseItems knowledgeGraphSearchResponseItems = (KnowledgeGraphSearchResponseItems) o;
    return Objects.equals(this.resultScore, knowledgeGraphSearchResponseItems.resultScore) &&
        Objects.equals(this.result, knowledgeGraphSearchResponseItems.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultScore, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGraphSearchResponseItems {\n");
    sb.append("    resultScore: ").append(toIndentedString(resultScore)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

