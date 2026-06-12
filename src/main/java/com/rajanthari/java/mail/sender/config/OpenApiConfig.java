package com.rajanthari.java.mail.sender.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Email Service API")
                        .description("REST APIs for sending emails")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Rajesh")
                                .email("support@example.com")));
    }
}