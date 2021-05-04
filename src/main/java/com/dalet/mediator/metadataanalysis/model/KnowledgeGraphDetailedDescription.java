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
 * A detailed description of the entity.
 */
@ApiModel(description = "A detailed description of the entity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-04T14:41:39.145+08:00[GMT+08:00]")
public class KnowledgeGraphDetailedDescription {
  public static final String SERIALIZED_NAME_ARTICLE_BODY = "articleBody";
  @SerializedName(SERIALIZED_NAME_ARTICLE_BODY)
  private String articleBody;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private String license;


  public KnowledgeGraphDetailedDescription articleBody(String articleBody) {
    
    this.articleBody = articleBody;
    return this;
  }

   /**
   * Get articleBody
   * @return articleBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArticleBody() {
    return articleBody;
  }


  public void setArticleBody(String articleBody) {
    this.articleBody = articleBody;
  }


  public KnowledgeGraphDetailedDescription url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public KnowledgeGraphDetailedDescription license(String license) {
    
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicense() {
    return license;
  }


  public void setLicense(String license) {
    this.license = license;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGraphDetailedDescription knowledgeGraphDetailedDescription = (KnowledgeGraphDetailedDescription) o;
    return Objects.equals(this.articleBody, knowledgeGraphDetailedDescription.articleBody) &&
        Objects.equals(this.url, knowledgeGraphDetailedDescription.url) &&
        Objects.equals(this.license, knowledgeGraphDetailedDescription.license);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleBody, url, license);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGraphDetailedDescription {\n");
    sb.append("    articleBody: ").append(toIndentedString(articleBody)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
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

