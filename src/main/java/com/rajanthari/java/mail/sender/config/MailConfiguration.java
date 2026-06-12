package com.rajanthari.java.mail.sender.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


/**
 * This is sample class file to read properties
 */
@Configuration
@ConfigurationProperties(prefix = "spring.mail")
public class MailConfiguration {
    private String host;
    private int port;
    private String username;
    private String password;

    // Captures all nested properties under 'spring.mail.properties.*'
    private Map<String, String> properties = new HashMap<>();

    // Getters and Setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
