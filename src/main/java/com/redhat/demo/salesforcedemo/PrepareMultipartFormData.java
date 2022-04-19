package com.redhat.demo.salesforcedemo;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

public class PrepareMultipartFormData implements Processor {
    private String[] multipartHeaders;

    public PrepareMultipartFormData(String... multipartHeaders) {
        this.multipartHeaders = multipartHeaders;
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        addMultipart(exchange.getIn(), multipartHeaders);
    }

    private static void addMultipart(Message message, String... multipartKeys) throws Exception{
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        for (String key: multipartKeys) {
            builder.addTextBody(key, message.getHeader(key, String.class));
        }
        HttpEntity resultEntity = builder.build();
        message.setHeader(Exchange.CONTENT_TYPE, resultEntity.getContentType().getValue());
        message.setBody(resultEntity.getContent());
    }

}
