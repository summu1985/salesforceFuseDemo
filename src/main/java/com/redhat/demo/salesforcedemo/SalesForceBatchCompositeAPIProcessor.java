package com.redhat.demo.salesforcedemo;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.salesforce.api.dto.composite.SObjectBatch;
import org.apache.camel.component.salesforce.api.dto.composite.SObjectBatchResponse;
import org.apache.camel.component.salesforce.api.dto.composite.SObjectBatchResult;

public class SalesForceBatchCompositeAPIProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        SObjectBatch batch = exchange.getIn().getBody(SObjectBatch.class);
        ProducerTemplate template = exchange.getContext().createProducerTemplate();
        final SObjectBatchResponse response = template.requestBody("salesforce:composite-batch?format=JSON", batch,
                SObjectBatchResponse.class);
        boolean hasErrors = response.hasErrors(); // if any of the requests has resulted in either 4xx or 5xx HTTP status
        if (hasErrors == false ) {
            final List<SObjectBatchResult> results = response.getResults();
        } else {
            
        }
    }

}
