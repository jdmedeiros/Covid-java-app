/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.serpamedeiros.covid;
/**
 *
 * @author enta
 */
//public class Covid {
//    
//}
package com.serpamedeiros.covid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "get",
    "parameters",
    "errors",
    "results",
    "response"
})
public class Covid {

    @JsonProperty("get")
    private String get;
    @JsonProperty("parameters")
    private List<Object> parameters = null;
    @JsonProperty("errors")
    private List<Object> errors = null;
    @JsonProperty("results")
    private int results;
    @JsonProperty("response")
    private List<Resposta> response = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Covid() {
    }

    /**
     *
     * @param response
     * @param get
     * @param parameters
     * @param results
     * @param errors
     */
    public Covid(String get, List<Object> parameters, List<Object> errors, int results, List<Resposta> response) {
        super();
        this.get = get;
        this.parameters = parameters;
        this.errors = errors;
        this.results = results;
        this.response = response;
    }

    @JsonProperty("get")
    public String getGet() {
        return get;
    }

    @JsonProperty("get")
    public void setGet(String get) {
        this.get = get;
    }

    public Covid withGet(String get) {
        this.get = get;
        return this;
    }

    @JsonProperty("parameters")
    public List<Object> getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    public Covid withParameters(List<Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    @JsonProperty("errors")
    public List<Object> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public Covid withErrors(List<Object> errors) {
        this.errors = errors;
        return this;
    }

    @JsonProperty("results")
    public int getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(int results) {
        this.results = results;
    }

    public Covid withResults(int results) {
        this.results = results;
        return this;
    }

    @JsonProperty("response")
    public List<Resposta> getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(List<Resposta> response) {
        this.response = response;
    }

    public Covid withResponse(List<Resposta> response) {
        this.response = response;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Covid withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
