package com.rajanthari.java.mail.sender.service;

import com.rajanthari.java.mail.sender.config.MailConfiguration;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailService {

    private final MailConfiguration mailConfig;
    private final JavaMailSender mailSender;
    // Constructor injection
    public EmailService(MailConfiguration mailConfig, JavaMailSender mailSender) {
        this.mailConfig = mailConfig;
        this.mailSender = mailSender;
    }

    public void printConfig() {
        System.out.println("Host: " + mailConfig.getHost());
        System.out.println("SMTP Auth: " + mailConfig.getProperties().get("mail.smtp.auth"));
    }

    public void sendEmail(String to, String subject, String body) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
    }
    public void sendHtmlEmail(String to,
                              String subject,
                              String htmlContent) throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper =
                new MimeMessageHelper(message, true);

        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(htmlContent, true);

        mailSender.send(message);
    }

    public void sendEmailWithAttachment(
            String to,
            String subject,
            String body,
            File file) throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper helper =
                new MimeMessageHelper(message, true);

        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(body);

        helper.addAttachment(file.getName(), file);

        mailSender.send(message);
    }
}