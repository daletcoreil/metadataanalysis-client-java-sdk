# MetadataAnalysisApi

All URIs are relative to *https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze**](MetadataAnalysisApi.md#analyze) | **POST** /metadata-analysis/analyze | 
[**knowledgeGraphSearch**](MetadataAnalysisApi.md#knowledgeGraphSearch) | **GET** /metadata-analysis/knowledge-graph-search | 
[**segmentText**](MetadataAnalysisApi.md#segmentText) | **POST** /metadata-analysis/segment-text | 
[**translateCaptions**](MetadataAnalysisApi.md#translateCaptions) | **POST** /metadata-analysis/translate-captions | 
[**translateText**](MetadataAnalysisApi.md#translateText) | **POST** /metadata-analysis/translate-text | 


<a name="analyze"></a>
# **analyze**
> AnalyzedTextResponse analyze(projectServiceId, analyzeRequest)



Perform metadata analysis on the provided text.

### Example
```java
// Import classes:
import com.dalet.mediator.metadataanalysis.ApiClient;
import com.dalet.mediator.metadataanalysis.ApiException;
import com.dalet.mediator.metadataanalysis.Configuration;
import com.dalet.mediator.metadataanalysis.auth.*;
import com.dalet.mediator.metadataanalysis.models.*;
import com.dalet.mediator.metadataanalysis.api.MetadataAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    MetadataAnalysisApi apiInstance = new MetadataAnalysisApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client associated to the request
    AnalyzeRequest analyzeRequest = new AnalyzeRequest(); // AnalyzeRequest | Text to be analyzed and list of requested analysis methods.
    try {
      AnalyzedTextResponse result = apiInstance.analyze(projectServiceId, analyzeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataAnalysisApi#analyze");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceId** | **String**| Project service id of the client associated to the request |
 **analyzeRequest** | [**AnalyzeRequest**](AnalyzeRequest.md)| Text to be analyzed and list of requested analysis methods. |

### Return type

[**AnalyzedTextResponse**](AnalyzedTextResponse.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success response |  -  |
**400** | Bad request |  -  |
**401** | Authorization request fail |  -  |
**502** | Failed request.  Reason is most likely quota violation. |  -  |

<a name="knowledgeGraphSearch"></a>
# **knowledgeGraphSearch**
> KnowledgeGraphSearchResponse knowledgeGraphSearch(projectServiceId, ids)



Get information for given knowledge graph ids. Knowledge graph ids are returned by the entities extractor of the analyzed method. This returns detailed information on an entity including image and description.

### Example
```java
// Import classes:
import com.dalet.mediator.metadataanalysis.ApiClient;
import com.dalet.mediator.metadataanalysis.ApiException;
import com.dalet.mediator.metadataanalysis.Configuration;
import com.dalet.mediator.metadataanalysis.auth.*;
import com.dalet.mediator.metadataanalysis.models.*;
import com.dalet.mediator.metadataanalysis.api.MetadataAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    MetadataAnalysisApi apiInstance = new MetadataAnalysisApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client associated to the request
    List<String> ids = Arrays.asList(); // List<String> | Query knowledge graph ids
    try {
      KnowledgeGraphSearchResponse result = apiInstance.knowledgeGraphSearch(projectServiceId, ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataAnalysisApi#knowledgeGraphSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceId** | **String**| Project service id of the client associated to the request |
 **ids** | [**List&lt;String&gt;**](String.md)| Query knowledge graph ids |

### Return type

[**KnowledgeGraphSearchResponse**](KnowledgeGraphSearchResponse.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response |  -  |
**400** | Bad request |  -  |
**401** | Authorization request fail |  -  |
**502** | Failed request.  Reason is most likely quota violation. |  -  |

<a name="segmentText"></a>
# **segmentText**
> SegmentTextResponse segmentText(projectServiceId, segmentTextRequest)



Create segments from a given text.

### Example
```java
// Import classes:
import com.dalet.mediator.metadataanalysis.ApiClient;
import com.dalet.mediator.metadataanalysis.ApiException;
import com.dalet.mediator.metadataanalysis.Configuration;
import com.dalet.mediator.metadataanalysis.auth.*;
import com.dalet.mediator.metadataanalysis.models.*;
import com.dalet.mediator.metadataanalysis.api.MetadataAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    MetadataAnalysisApi apiInstance = new MetadataAnalysisApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client associated to the request
    SegmentTextRequest segmentTextRequest = new SegmentTextRequest(); // SegmentTextRequest | Request which contains the needed information for the segment operation.
    try {
      SegmentTextResponse result = apiInstance.segmentText(projectServiceId, segmentTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataAnalysisApi#segmentText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceId** | **String**| Project service id of the client associated to the request |
 **segmentTextRequest** | [**SegmentTextRequest**](SegmentTextRequest.md)| Request which contains the needed information for the segment operation. |

### Return type

[**SegmentTextResponse**](SegmentTextResponse.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success response |  -  |
**400** | Bad request |  -  |
**401** | Authorization request fail |  -  |
**502** | Failed request.  Reason is most likely quota violation. |  -  |

<a name="translateCaptions"></a>
# **translateCaptions**
> TranslateCaptionsResponse translateCaptions(projectServiceId, translateCaptionsRequest)



Translate captions from a given text.

### Example
```java
// Import classes:
import com.dalet.mediator.metadataanalysis.ApiClient;
import com.dalet.mediator.metadataanalysis.ApiException;
import com.dalet.mediator.metadataanalysis.Configuration;
import com.dalet.mediator.metadataanalysis.auth.*;
import com.dalet.mediator.metadataanalysis.models.*;
import com.dalet.mediator.metadataanalysis.api.MetadataAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    MetadataAnalysisApi apiInstance = new MetadataAnalysisApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client associated to the request
    TranslateCaptionsRequest translateCaptionsRequest = new TranslateCaptionsRequest(); // TranslateCaptionsRequest | Request which contains the needed information for the traslate captions operation.
    try {
      TranslateCaptionsResponse result = apiInstance.translateCaptions(projectServiceId, translateCaptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataAnalysisApi#translateCaptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceId** | **String**| Project service id of the client associated to the request |
 **translateCaptionsRequest** | [**TranslateCaptionsRequest**](TranslateCaptionsRequest.md)| Request which contains the needed information for the traslate captions operation. |

### Return type

[**TranslateCaptionsResponse**](TranslateCaptionsResponse.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success response |  -  |
**400** | Bad request |  -  |
**401** | Authorization request fail |  -  |
**502** | Failed request.  Reason is most likely quota violation. |  -  |

<a name="translateText"></a>
# **translateText**
> TranslateTextResponse translateText(projectServiceId, translateTextRequest)



Translate a given text to a target language.

### Example
```java
// Import classes:
import com.dalet.mediator.metadataanalysis.ApiClient;
import com.dalet.mediator.metadataanalysis.ApiException;
import com.dalet.mediator.metadataanalysis.Configuration;
import com.dalet.mediator.metadataanalysis.auth.*;
import com.dalet.mediator.metadataanalysis.models.*;
import com.dalet.mediator.metadataanalysis.api.MetadataAnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    MetadataAnalysisApi apiInstance = new MetadataAnalysisApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client associated to the request
    TranslateTextRequest translateTextRequest = new TranslateTextRequest(); // TranslateTextRequest | Request which contains the needed information for the translate operation.
    try {
      TranslateTextResponse result = apiInstance.translateText(projectServiceId, translateTextRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataAnalysisApi#translateText");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceId** | **String**| Project service id of the client associated to the request |
 **translateTextRequest** | [**TranslateTextRequest**](TranslateTextRequest.md)| Request which contains the needed information for the translate operation. |

### Return type

[**TranslateTextResponse**](TranslateTextResponse.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success response |  -  |
**400** | Bad request |  -  |
**401** | Authorization request fail |  -  |
**502** | Failed request.  Reason is most likely quota violation. |  -  |

