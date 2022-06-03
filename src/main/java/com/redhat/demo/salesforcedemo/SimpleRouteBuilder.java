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

        rest()
        .consumes(MediaType.APPLICATION_JSON_VALUE)
        .produces(MediaType.APPLICATION_JSON_VALUE)

        .get("/opportunity").to("{{route.findAllOpportunities}}")
        .post("/opportunity").to("{{route.addOpportunity}}");

        from("{{route.findAllOpportunities}}")
        .to("log:response")
                .to("salesforce:query?sObjectQuery=SELECT Id,Account.Name,AccountId,StageName,Name,Amount,Probability,CloseDate from Opportunity &sObjectClass=org.apache.camel.salesforce.dto.Opportunity.class&rawPayload=true")
                .convertBodyTo(String.class)
                .unmarshal(getJacksonDataFormat(OpportunityList.class))
                .marshal().json()
                .to("log:response");

        from("{{route.addOpportunity}}")
        .to("log:response")
        .unmarshal(getJacksonDataFormat(Opportunity.class))
        .removeHeaders("*")
        .process(exchange->{
            org.apache.camel.salesforce.dto.Opportunity opp = new org.apache.camel.salesforce.dto.Opportunity();
            Opportunity appOpp = exchange.getIn().getBody(Opportunity.class);
            opp.setAccountId(appOpp.getAccountId());
            opp.setStageName(Opportunity_StageNameEnum.fromValue(appOpp.getStageName()));
            opp.setName(appOpp.getName());
            opp.setAmount(Double.valueOf(appOpp.getAmount()));
            opp.setCloseDate(LocalDate.parse(appOpp.getCloseDate()));
            opp.setProbability(Double.valueOf(String.valueOf(appOpp.getProbability())));
            opp.setExternalId__c(new Timestamp(System.currentTimeMillis()).toString());
            exchange.getIn().setBody(opp,Opportunity.class);
        })
        .to("log:response")
        .to("salesforce:upsertSObject?sObjectIdName=ExternalId__c")
        //.marshal().json()
        .to("log:response")
        .log("SObject ID: ${body?.id}");
        // .convertBodyTo(String.class);

        // route for consuming files from ftp server
        //from("ftp:{{ftp_user}}@{{ftp_host}}/{{ftp_dir}}?noop=true&password={{ftp_password}}")
        // from("ftp://{{ftp_host}}/{{ftp_dir}}/?username={{ftp_user}}&password={{ftp_password}}&delete=true&passiveMode=true&localWorkDirectory=/tmp&transferLoggingLevel=INFO&transferLoggingIntervalSeconds=1&transferLoggingVerbose=false&delay=5s&noop=true")
        // .log("Processing file : ${headers.CamelFileName}")
        // .log("Downloaded File Content: ${body}")
        // .process(new SalesForceBatchCSVProcessor());
        // .log("Opportunities : ${body}");
        // .to("file:///tmp");
    }

    private JacksonDataFormat getJacksonDataFormat(Class<?> unmarshalType) {
        JacksonDataFormat format = new JacksonDataFormat();
        format.setUnmarshalType(unmarshalType);
        return format;
    }
}
