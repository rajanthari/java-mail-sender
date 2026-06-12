package com.rajanthari.java.mail.sender;

import com.rajanthari.java.mail.sender.config.ApiProperties;
import com.rajanthari.java.mail.sender.config.MailConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApiProperties.class)
public class JavaMailSenderApplication implements CommandLineRunner {

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
		System.out.println(mailConfiguration.getUsername());
		System.out.println(mailConfiguration.getPassword());
		System.out.println(apiProperties.receiverMail());
	}
}
