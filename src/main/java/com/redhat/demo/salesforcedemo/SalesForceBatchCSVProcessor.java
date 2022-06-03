package com.redhat.demo.salesforcedemo;

import java.io.Reader;
import java.io.StringReader;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.salesforce.api.dto.composite.SObjectBatch;
import org.apache.camel.component.salesforce.api.dto.composite.SObjectBatchResponse;
import org.apache.camel.component.salesforce.api.dto.composite.SObjectBatchResult;
import org.apache.camel.salesforce.dto.Opportunity;
import org.apache.camel.salesforce.dto.Opportunity_StageNameEnum;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class SalesForceBatchCSVProcessor implements Processor{

    @Override
    public void process(Exchange exchange) throws Exception {
        String[] HEADERS = { "AccountName", "AccountId","StageName", "Name", "Amount", "Probability", "CloseDate"};
        String inCSVRecords = exchange.getIn().getBody(String.class);
        Reader in = new StringReader(inCSVRecords);

        Iterable<CSVRecord> records = CSVFormat.Builder.create(CSVFormat.DEFAULT)
        .setHeader(HEADERS)
        .setSkipHeaderRecord(true)
        .setTrim(true)
        .build()
        .parse(in);

        final SObjectBatch batch = new SObjectBatch("38.0");
        for (CSVRecord record : records) {
            org.apache.camel.salesforce.dto.Opportunity opp = new org.apache.camel.salesforce.dto.Opportunity();
            opp.setAccountId(record.get("AccountId"));
            opp.setStageName(Opportunity_StageNameEnum.fromValue(record.get("StageName")));
            opp.setName(record.get("Name"));
            opp.setAmount(Double.valueOf(record.get("Amount")));
            opp.setCloseDate(LocalDate.parse(record.get("CloseDate")));
            opp.setProbability(Double.valueOf(String.valueOf(record.get("Probability"))));
            opp.setExternalId__c(new Timestamp(System.currentTimeMillis()).toString());
            batch.addCreate(opp);
        }
        
        ProducerTemplate template = exchange.getContext().createProducerTemplate();
        final SObjectBatchResponse response = template.requestBody("salesforce:composite-batch?format=JSON", batch,
                SObjectBatchResponse.class);
        // exchange.getIn().setBody(batch, SObjectBatch.class);
        if (response.hasErrors()) {
            throw new Exception("Could not create opportunities");
        } else {
            final List<SObjectBatchResult> results = response.getResults();
            for (SObjectBatchResult result : results){
                System.out.println("status code : " + result.getStatusCode());
                System.out.println("result : " + result.getResult());
                
            }
        }

        in.close();
    }
    
    
}
