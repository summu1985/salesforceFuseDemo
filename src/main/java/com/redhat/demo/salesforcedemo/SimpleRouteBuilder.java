package com.redhat.demo.salesforcedemo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.salesforce.dto.*;
import org.springframework.stereotype.Component;
import java.sql.Timestamp; 
import java.time.LocalDate;

import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;


@Component
public class SimpleRouteBuilder extends RouteBuilder {

    private final Environment env;

    public SimpleRouteBuilder(Environment env) {
        this.env = env;
    }

    @Override
    public void configure() throws Exception {

        restConfiguration()
        .component("servlet");
        //.bindingMode(RestBindingMode.json);

        // from("timer:foo?period=100000")
        // .setBody(constant("Started..."))
        // .to("log:response")
        //         .to("salesforce:query?sObjectQuery=SELECT Id,AccountId,StageName,Name,ExpectedRevenue,NextStep from Opportunity&sObjectClass=org.apache.camel.salesforce.dto.Opportunity.class&rawPayload=true")
        //         .convertBodyTo(String.class)
        //         .to("log:Received update notification for ${body.name}");

        rest()
        .consumes(MediaType.APPLICATION_JSON_VALUE)
        .produces(MediaType.APPLICATION_JSON_VALUE)
        // .get("/{name}").route()
        // .to("{{route.findBookByName}}")
        // .endRest()
        .get("/opportunity").to("{{route.findAllOpportunities}}")
        .post("/opportunity").to("{{route.addOpportunity}}");
        // .marshal().json()
        // .unmarshal(getJacksonDataFormat(Book.class))
        // .to("{{route.saveBook}}")
        // .endRest()
        // .delete("/{bookId}").route()
        // .to("{{route.removeBook}}")

        // from("timer:foo?period=100000")
        // .setBody(constant("Started..."))
        // .to("log:response")
        //         .to("salesforce:query?sObjectQuery=SELECT Id,Account.Name,AccountId,StageName,Name,Amount,Probability,CloseDate from Opportunity where AccountId='0015j000007YQrGAAW'&sObjectClass=org.apache.camel.salesforce.dto.Opportunity.class&rawPayload=true")
        //         // .convertBodyTo(String.class)
        //         .unmarshal(getJacksonDataFormat(OpportunityList.class))
        //         .process(new Processor() {
        //             public void process (Exchange exchange) throws Exception {
        //                 OpportunityList olist = exchange.getIn().getBody(OpportunityList.class);
        //                 Opportunity opp = olist.getRecords().get(0);
        //                 exchange.getIn().setBody(opp);
        //             }
        //         })
        //         .marshal().json()
        //         .to("log:response");

        from("{{route.findAllOpportunities}}")
        .to("log:response")
                .to("salesforce:query?sObjectQuery=SELECT Id,Account.Name,AccountId,StageName,Name,Amount,Probability,CloseDate from Opportunity &sObjectClass=org.apache.camel.salesforce.dto.Opportunity.class&rawPayload=true")
                .convertBodyTo(String.class)
                .unmarshal(getJacksonDataFormat(OpportunityList.class));
                //.to("log:Received update notification for ${body.name}");
        
        from("{{route.addOpportunity}}")
        .to("log:response")
        .unmarshal(getJacksonDataFormat(Opportunity.class))
        .process(new Processor() {
            public void process (Exchange exchange) throws Exception {
                org.apache.camel.salesforce.dto.Opportunity opp = new org.apache.camel.salesforce.dto.Opportunity();
                Opportunity appOpp = exchange.getIn().getBody(Opportunity.class);
                opp.setAccountId(appOpp.getAccountId());
                opp.setStageName(Opportunity_StageNameEnum.fromValue(appOpp.getStageName()));
                opp.setName(appOpp.getName());
                opp.setCloseDate(LocalDate.parse(appOpp.getCloseDate()));
                opp.setProbability(Double.valueOf(String.valueOf(appOpp.getProbability())));
                opp.setExternalId__c(new Timestamp(System.currentTimeMillis()).toString());
                exchange.getIn().setBody(opp);
        }})
        .marshal().json()
        .to("salesforce:upsertSObject?sObjectIdName=ExternalId__c")
        .log("SObject ID: ${body?.id}")
        .convertBodyTo(String.class);
    }

    private JacksonDataFormat getJacksonDataFormat(Class<?> unmarshalType) {
        JacksonDataFormat format = new JacksonDataFormat();
        format.setUnmarshalType(unmarshalType);
        return format;
    }
}
