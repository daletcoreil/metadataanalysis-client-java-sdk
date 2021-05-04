

# AnalyzeRequest

Text to be analyzed and requested analysis methods. if not specified all analyses are executed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | Up to 200kb of UTF-8 encoded raw text to be analyzed. The language is detected automatically and it should be one of the following: English (en), French (fr), German (de), Italian (it), Japanese (ja), Korean (ko), Portuguese (pt), Russian (ru), Spanish (es) | 
**extractors** | [**List&lt;ExtractorsEnum&gt;**](#List&lt;ExtractorsEnum&gt;) | Extractors detect spans in the text and return their normalized description. |  [optional]
**extractorsScoreThreshold** | [**java.lang.Double**](java.lang.Double.md) | Only return extractors results with score above the threshold between 0 and 1. if not specified return all results. |  [optional]
**classifiers** | [**List&lt;ClassifiersEnum&gt;**](#List&lt;ClassifiersEnum&gt;) | Classifiers categorize the whole text according to industry standard taxonomies. |  [optional]
**classifierScoreThreshold** | [**java.lang.Double**](java.lang.Double.md) | Only return categories with score above the threshold between 0 and 1. if not specified return all detected categories. |  [optional]



## Enum: List&lt;ExtractorsEnum&gt;

Name | Value
---- | -----
ENTITIES | &quot;entities&quot;
TOPICS | &quot;topics&quot;



## Enum: List&lt;ClassifiersEnum&gt;

Name | Value
---- | -----
IPTCNEWSCODES | &quot;IPTCNewsCodes&quot;
IPTCMEDIATOPICS | &quot;IPTCMediaTopics&quot;
IABTAXONOMY | &quot;IABTaxonomy&quot;



