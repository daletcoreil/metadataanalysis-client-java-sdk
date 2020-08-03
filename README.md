# metadataanalysis-client

Dalet Metadata Analysis API
- API version: 2.1.0
  - Build date: 2020-08-03T19:24:04.607+08:00[GMT+08:00]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

  For more information, please visit [https://www.dalet.com](https://www.dalet.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.dalet.mediator</groupId>
  <artifactId>metadataanalysis-client</artifactId>
  <version>2.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.dalet.mediator:metadataanalysis-client:2.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/metadataanalysis-client-2.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.dalet.mediator.metadataanalysis.ApiClient;
import com.dalet.mediator.metadataanalysis.ApiException;
import com.dalet.mediator.metadataanalysis.Configuration;
import com.dalet.mediator.metadataanalysis.models.*;
import com.dalet.mediator.metadataanalysis.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String client = "client_example"; // String | client_id of the application
    String secret = "secret_example"; // String | secret_key of the application
    try {
      Token result = apiInstance.getAccessToken(client, secret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**getAccessToken**](docs/AuthApi.md#getAccessToken) | **POST** /auth/access-token | 
*MetadataAnalysisApi* | [**analyze**](docs/MetadataAnalysisApi.md#analyze) | **POST** /metadata-analysis/analyze | 
*MetadataAnalysisApi* | [**knowledgeGraphSearch**](docs/MetadataAnalysisApi.md#knowledgeGraphSearch) | **GET** /metadata-analysis/knowledge-graph-search | 
*MetadataAnalysisApi* | [**translateText**](docs/MetadataAnalysisApi.md#translateText) | **POST** /metadata-analysis/translate-text | 


## Documentation for Models

 - [AnalyzeRequest](docs/AnalyzeRequest.md)
 - [AnalyzedTextResponse](docs/AnalyzedTextResponse.md)
 - [ClassifierCategory](docs/ClassifierCategory.md)
 - [Entity](docs/Entity.md)
 - [KnowledgeGraph](docs/KnowledgeGraph.md)
 - [KnowledgeGraphDetailedDescription](docs/KnowledgeGraphDetailedDescription.md)
 - [KnowledgeGraphImage](docs/KnowledgeGraphImage.md)
 - [KnowledgeGraphSearchResponse](docs/KnowledgeGraphSearchResponse.md)
 - [KnowledgeGraphSearchResponseItems](docs/KnowledgeGraphSearchResponseItems.md)
 - [Mention](docs/Mention.md)
 - [Span](docs/Span.md)
 - [Token](docs/Token.md)
 - [Topic](docs/Topic.md)
 - [TranslateTextRequest](docs/TranslateTextRequest.md)
 - [TranslateTextResponse](docs/TranslateTextResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### tokenSignature

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

cortexsupport@dalet.com
