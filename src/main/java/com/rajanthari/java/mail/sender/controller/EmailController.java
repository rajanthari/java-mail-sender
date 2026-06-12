package com.rajanthari.java.mail.sender.controller;


import com.rajanthari.java.mail.sender.service.EmailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/email")
@Tag(name = "Email APIs", description = "Operations related to email sending")
public class EmailController {


    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    @Operation(
            summary = "Send Email",
            description = "Send a plain text email to a recipient"
    )
    @ApiResponse(responseCode = "200",
            description = "Email sent successfully")
    @ApiResponse(responseCode = "400",
            description = "Invalid request")
    public String sendMail() {

        emailService.sendEmail(
                "rajeshanthari@gmail.com",
                "Spring Boot Email",
                "Hello from Spring Boot!");

        return "Email sent successfully";
    }


    @PostMapping("/send-html")
    @Operation(
            summary = "Send Html Email",
            description = "Send a html email to a recipient"
    )
    @ApiResponse(responseCode = "200",
            description = "Email sent successfully")
    @ApiResponse(responseCode = "400",
            description = "Invalid request")
    public String sendHtmlMail() throws Exception {

        String html = """
                    <html>
                      <body>
                        <h2>Welcome Rajesh</h2>
                        <p>Your registration is successful.</p>
                      </body>
                    </html>
                    """;
        emailService.sendHtmlEmail(
                "rajeshanthari@gmail.com",
                "Spring Boot Email",
                html);

        return "Email sent successfully";
    }

    @PostMapping("/send-attachment")
    @Operation(
            summary = "Send Email",
            description = "Send a plain text email with attachment to a recipient"
    )
    @ApiResponse(responseCode = "200",
            description = "Email sent successfully")
    @ApiResponse(responseCode = "400",
            description = "Invalid request")
    public String sendMailWithAttachment() throws Exception {

        emailService.sendEmailWithAttachment(
                "rajeshanthari@gmail.com",
                "Spring Boot Email with attachment",
                "Hello from Spring Boot!", new File("C:\\Users\\RajAnthari\\Downloads\\dummytextfile.txt"));

        return "Email sent successfully";
    }

}