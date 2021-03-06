/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 */
package org.apache.camel.salesforce.dto;

import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;
import javax.annotation.Generated;

/**
 * Salesforce QueryRecords DTO for type Opportunity
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class QueryRecordsOpportunity extends AbstractQueryRecordsBase {

    private List<Opportunity> records;

    public List<Opportunity> getRecords() {
        return records;
    }

    public void setRecords(List<Opportunity> records) {
        this.records = records;
    }
}
