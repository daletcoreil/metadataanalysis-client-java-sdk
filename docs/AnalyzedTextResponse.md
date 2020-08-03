

# AnalyzedTextResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**language** | **String** |  | 
**languageIsReliable** | **Boolean** |  |  [optional]
**entities** | [**List&lt;Entity&gt;**](Entity.md) |  |  [optional]
**topics** | [**List&lt;Topic&gt;**](Topic.md) | List of topics detected in the text. each detected topic refers to wikiLink and wikidataId or None if no wikipedia reference is found. |  [optional]
**categories** | [**List&lt;ClassifierCategory&gt;**](ClassifierCategory.md) | List of categories associated to the text. IPTC news codes refer to - http://cv.iptc.org/newscodes/subjectcode IPTC media topics refer to - http://cv.iptc.org/newscodes/mediatopic IAB taxonomy refer to - https://www.iab.com/guidelines/taxonomy |  [optional]



