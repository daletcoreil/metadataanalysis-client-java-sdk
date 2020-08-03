

# Entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**mid** | **String** | Google knowledge graph id when detected. |  [optional]
**wikipediaUrl** | **String** |  |  [optional]
**salience** | [**java.lang.Double**](java.lang.Double.md) | The salience score associated with the entity in the [0, 1.0] range. The salience score for an entity provides information about the importance or centrality of that entity to the entire document text. Scores closer to 0 are less salient, while scores closer to 1.0 are highly salient. |  [optional]
**mentions** | [**List&lt;Mention&gt;**](Mention.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
PERSON | &quot;PERSON&quot;
LOCATION | &quot;LOCATION&quot;
ORGANIZATION | &quot;ORGANIZATION&quot;
EVENT | &quot;EVENT&quot;
WORKOFART | &quot;WORKOFART&quot;
CONSUMERGOOD | &quot;CONSUMERGOOD&quot;
OTHER | &quot;OTHER&quot;
PHONENUMBER | &quot;PHONENUMBER&quot;
ADDRESS | &quot;ADDRESS&quot;
DATE | &quot;DATE&quot;
NUMBER | &quot;NUMBER&quot;
PRICE | &quot;PRICE&quot;



