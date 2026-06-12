package com.rajanthari.java.mail.sender;

import com.rajanthari.java.mail.sender.config.ApiProperties;
import com.rajanthari.java.mail.sender.config.MailConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApiProperties.class)
public class JavaMailSenderApplication implements CommandLineRunner {

	private static final Logger log =
			LoggerFactory.getLogger(JavaMailSenderApplication.class);

	private final MailConfiguration mailConfiguration;
	private final ApiProperties apiProperties;

	public JavaMailSenderApplication(MailConfiguration mailConfiguration, ApiProperties apiProperties) {
		this.mailConfiguration = mailConfiguration;
        this.apiProperties = apiProperties;
    }

	public static void main(String[] args) {
		SpringApplication.run(JavaMailSenderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Welcome to email sender");
	}
}
