package com.redhat.demo.salesforcedemo;

import org.apache.camel.Exchange;
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
        .component("servlet")
        .bindingMode(RestBindingMode.json);

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
        .get("/opportunity").to("{{route.findAllOpportunities}}");
        // .post("/").route()
        // .marshal().json()
        // .unmarshal(getJacksonDataFormat(Book.class))
        // .to("{{route.saveBook}}")
        // .endRest()
        // .delete("/{bookId}").route()
        // .to("{{route.removeBook}}")

        from("timer:foo?period=100000")
        .setBody(constant("Started..."))
        .to("log:response")
                .to("salesforce:query?sObjectQuery=SELECT Id,Account.Name,StageName,Name,Amount,CloseDate from Opportunity&sObjectClass=org.apache.camel.salesforce.dto.Opportunity.class&rawPayload=true")
                .convertBodyTo(String.class)
                .to("log:Received update notification for ${body.name}");

        from("{{route.findAllOpportunities}}")
        .setBody(constant("Started..."))
        .to("log:response")
                .to("salesforce:query?sObjectQuery=SELECT Id,AccountId,StageName,Name,ExpectedRevenue,NextStep from Opportunity &sObjectClass=org.apache.camel.salesforce.dto.Opportunity.class&rawPayload=true")
                .convertBodyTo(String.class)
                .unmarshal(getJacksonDataFormat(OpportunityList.class));
                //.to("log:Received update notification for ${body.name}");
        
        // from("timer:foo?period=100000")
        // .process(exchange->{
        //     Opportunity opp = new Opportunity();
        //     opp.setAccountId("0015j00000dkwdKAAQ");
        //     opp.setStageName(Opportunity_StageNameEnum.PROSPECTING);
        //     opp.setName("Red Hat Integration on ROSA");
        //     // opp.setExpectedRevenue(Double.valueOf("2000.00"));
        //     opp.setCloseDate(LocalDate.parse("2022-04-30"));
        //     opp.setProbability(Double.valueOf("90"));
        //     opp.setExternalId__c(new Timestamp(System.currentTimeMillis()).toString());
        //     exchange.getIn().setBody(opp);
        // })
        // .to("salesforce:upsertSObject?sObjectIdName=ExternalId__c")
        // .log("SObject ID: ${body?.id}");

        // from("timer:foo?period=100000")
        // .setBody(constant("Started..."))
        // .to("log:response")
        // .setHeader(Exchange.HTTP_METHOD, constant("POST"))
        // .setHeader(Exchange.HTTP_PATH, constant("services/oauth2/token"))
        // .setHeader("grant_type", constant("password"))
        // .setHeader("username", constant("sumit@redhat.com"))
        // .setHeader("password", constant("salesforceredhat@IBM11"))
        // .setHeader("client_id", constant("3MVG9pRzvMkjMb6l3fpLWXuQLumfGOc7HQeXpPGHZ1gfGW5dZdCCA9J.3WDLL8Ca0ud2Q55zUwT7WYctBLggv"))
        // .setHeader("client_secret", constant("140128A2F53C9EFBE561B0FEEEBC77115D49E3516E4BCABF5801FE9BA6FB9049"))
        // .process(new PrepareMultipartFormData("grant_type", "username", "password", "client_id", "client_secret"))
        // .to("https://redhat-8b-dev-ed.my.salesforce.com")
        // .convertBodyTo(String.class)
        // .to("log:response");

        // from("timer:foo?period=100000")
        // .setBody(constant("Hello world"))
        // .to("log:response");
    }

    private JacksonDataFormat getJacksonDataFormat(Class<?> unmarshalType) {
        JacksonDataFormat format = new JacksonDataFormat();
        format.setUnmarshalType(unmarshalType);
        return format;
    }
}
