package com.rajanthari.java.mail.sender.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "apps.api")
public record ApiProperties(
    String receiverMail
) {}