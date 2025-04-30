# Securing a Web Application with Spring Security

This project demonstrates how to secure a simple web application using [Spring Security](https://spring.io/projects/spring-security). It is based on the official Spring tutorial: [https://spring.io/guides/gs/securing-web](https://spring.io/guides/gs/securing-web)

## What You Will Learn

- How to configure Spring Security to require login for accessing specific resources.
- How to set up an in-memory user store.
- How to create a simple login page and protect routes.
- Basic authentication and authorization concepts using Spring Boot.

## Requirements

- Java 17 or higher
- Maven 3.8+
- An IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/EmmanuelIdeho/service-web.git
cd service-web
```

### 2. Build the Application
```bash
./mvnw clean install
```

### 3. Run the Application
```bash
./mvnw spring-boot:run
```
- the application will be available at http://localhost:8080

### 4. Access the Web App
- Navigate to  http://localhost:8080
- You'll be redirected to a login page.
- Use the following credentials (from `WebSecurityConfig.java`):
```pgsql
Username: user
Password: generated in the console on app startup
```
## Customization
- To change the default user credentials or authentication logic, edit `WebSecurityConfig.java`
- The login page can be customized by modifying `src/main/resources/templates/login.html`.