package com.david.emailservice.infra.ses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;

@Configuration
public class AwsSesConfiguration {

    String accessKey = System.getenv("ACCESS_KEY");
    String secretKey = System.getenv("SECRET_KEY");

    Regions region = Regions.US_EAST_2;

    BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);

    @Bean
    AmazonSimpleEmailService amazonSimpleEmailService() {

        return AmazonSimpleEmailServiceClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(region)
                .build();
    }
}
