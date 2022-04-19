package com.redhat.demo.salesforcedemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Opportunity {
    @JsonProperty("Attributes")
    Attributes attributes;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("AccountId")
    private String accountId;
    @JsonProperty("StageName")
    private String stageName;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ExpectedRevenue")
    private float expectedRevenue;
    @JsonProperty("NextStep")
    private String nextStep;
   
    public Opportunity() {}
   
    // Getter Methods 
   
    public Attributes getAttributes() {
     return attributes;
    }
   
    public String getId() {
     return id;
    }
   
    public String getAccountId() {
     return accountId;
    }
   
    public String getStageName() {
     return stageName;
    }
   
    public String getName() {
     return name;
    }
   
    public float getExpectedRevenue() {
     return expectedRevenue;
    }
   
    public String getNextStep() {
     return nextStep;
    }
   
    // Setter Methods 
   
    public void setAttributes(Attributes attributesObject) {
     this.attributes = attributesObject;
    }
   
    public void setId(String Id) {
     this.id = Id;
    }
   
    public void setAccountId(String AccountId) {
     this.accountId = AccountId;
    }
   
    public void setStageName(String StageName) {
     this.stageName = StageName;
    }
   
    public void setName(String Name) {
     this.name = Name;
    }
   
    public void setExpectedRevenue(float ExpectedRevenue) {
     this.expectedRevenue = ExpectedRevenue;
    }
   
    public void setNextStep(String NextStep) {
     this.nextStep = NextStep;
    }

    @Override
    public String toString() {
        return "Id : " + this.id
        +" AccountId: " + this.accountId
        +" StageName: " + this.stageName;
    }
   }
