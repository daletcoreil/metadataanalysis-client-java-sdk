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


package com.dalet.mediator.metadataanalysis.api;

import com.dalet.mediator.metadataanalysis.ApiException;
import com.dalet.mediator.metadataanalysis.model.AnalyzeRequest;
import com.dalet.mediator.metadataanalysis.model.AnalyzedTextResponse;
import com.dalet.mediator.metadataanalysis.model.KnowledgeGraphSearchResponse;
import com.dalet.mediator.metadataanalysis.model.TranslateTextRequest;
import com.dalet.mediator.metadataanalysis.model.TranslateTextResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetadataAnalysisApi
 */
@Ignore
public class MetadataAnalysisApiTest {

    private final MetadataAnalysisApi api = new MetadataAnalysisApi();

    
    /**
     * 
     *
     * Perform metadata analysis on the provided text.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void analyzeTest() throws ApiException {
        String projectServiceId = null;
        AnalyzeRequest analyzeRequest = null;
        AnalyzedTextResponse response = api.analyze(projectServiceId, analyzeRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get information for given knowledge graph ids. Knowledge graph ids are returned by the entities extractor of the analyzed method. This returns detailed information on an entity including image and description.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void knowledgeGraphSearchTest() throws ApiException {
        String projectServiceId = null;
        List<String> ids = null;
        KnowledgeGraphSearchResponse response = api.knowledgeGraphSearch(projectServiceId, ids);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Translate a given text to a target language.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translateTextTest() throws ApiException {
        String projectServiceId = null;
        TranslateTextRequest translateTextRequest = null;
        TranslateTextResponse response = api.translateText(projectServiceId, translateTextRequest);

        // TODO: test validations
    }
    
}