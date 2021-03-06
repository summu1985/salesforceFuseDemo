/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist StageName
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Opportunity_StageNameEnum {

    // Closed Lost
    CLOSED_LOST("Closed Lost"),

    // Closed Won
    CLOSED_WON("Closed Won"),

    // Id. Decision Makers
    ID__DECISION_MAKERS("Id. Decision Makers"),

    // Needs Analysis
    NEEDS_ANALYSIS("Needs Analysis"),

    // Negotiation/Review
    NEGOTIATION_REVIEW("Negotiation/Review"),

    // Perception Analysis
    PERCEPTION_ANALYSIS("Perception Analysis"),

    // Proposal/Price Quote
    PROPOSAL_PRICE_QUOTE("Proposal/Price Quote"),

    // Prospecting
    PROSPECTING("Prospecting"),

    // Qualification
    QUALIFICATION("Qualification"),

    // Value Proposition
    VALUE_PROPOSITION("Value Proposition");

    final String value;

    private Opportunity_StageNameEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Opportunity_StageNameEnum fromValue(String value) {
        for (Opportunity_StageNameEnum e : Opportunity_StageNameEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
