# Java Mail Sender

[![CI](https://github.com/rajanthari/java-mail-sender/actions/workflows/ci.yml/badge.svg)](https://github.com/rajanthari/java-mail-sender/actions/workflows/ci.yml)

A Spring Boot application for sending emails using SMTP.

---

## Features

- Send Plain Text Emails
- Send HTML Emails
- Send Emails with Attachments
- Swagger/OpenAPI Documentation
- JUnit 5 Testing
- Mockito-based Unit Tests
- JaCoCo Code Coverage
- SonarQube Analysis
- GitHub Actions CI Pipeline

---

## Tech Stack

- Java 21
- Spring Boot 3
- Spring Mail
- Maven
- JUnit 5
- Mockito
- Swagger / OpenAPI
- JaCoCo
- SonarQube
- GitHub Actions

---

## Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.rajanthari.java.mail.sender
│   │       ├── config
│   │       ├── controller
│   │       ├── dto
│   │       ├── service
│   │       └── JavaMailSenderApplication
│   └── resources
│       └── application.properties
│
└── test
    └── java
```

---

## Getting Started

### Prerequisites

- Java 21
- Maven 3.9+
- Gmail App Password (or SMTP credentials)

### Clone Repository

```bash
git clone https://github.com/rajanthari/java-mail-sender.git

cd java-mail-sender
```

### Configure Mail Settings

Update `application.properties`:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password

spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

---

## Build Project

```bash
mvn clean install
```

---

## Run Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

---

## Swagger Documentation

Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI Specification:

```text
http://localhost:8080/v3/api-docs
```

---

## Running Tests

```bash
mvn test
```

---

## Generate Code Coverage

```bash
mvn clean verify
```

JaCoCo report:

```text
target/site/jacoco/index.html
```

---

## SonarQube Analysis

```bash
mvn clean verify sonar:sonar
```

---

## CI Pipeline

```text
GitHub
   ↓
GitHub Actions
   ↓
Maven Build
   ↓
JUnit Tests
   ↓
JaCoCo Coverage
   ↓
SonarQube Analysis
```

---

## GitHub Actions

The project uses GitHub Actions for Continuous Integration.

Workflow:

```text
.github/workflows/ci.yml
```

Build status:

[![CI](https://github.com/rajanthari/java-mail-sender/actions/workflows/ci.yml/badge.svg)](https://github.com/rajanthari/java-mail-sender/actions/workflows/ci.yml)

---

## Future Enhancements

- Async Email Sending
- Email Templates (Thymeleaf)
- Retry Mechanism
- Docker Support
- AWS SES Integration
- Deployment Pipeline

---

## Author

**Rajesh**

GitHub:
https://github.com/rajanthari