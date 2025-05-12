# jsf-fatwar-demo

This project is a **demonstration of the integration of modern Jakarta EE and Spring technologies**, including:

- **Java 17**
- **Spring Boot 3**
- **Jakarta Faces (JSF) 4**
- **Jakarta CDI 4**
- **Servlet 6**
- **Tomcat 10.1 (embedded)**
- Packaged as a **fat WAR**

## Features

- Runs JSF 4 pages inside a Spring Boot 3 application.
- Demonstrates CDI-managed and Spring-managed beans working together.
- Includes usage of different Spring bean scopes (singleton, request, session, prototype).
- Custom JSF validator integration with Spring beans.
- Simple navigation between pages and form validation.
- Designed to run on an embedded Tomcat 10.1 server.

## Build the Project

Build the project using Maven:

```bash
mvn clean package
```

This will generate a `jsf-fatwar-demo.war` file in the `target/` directory.

## How to Run

You can run the application in one of two ways:

### 1. Using Maven

```bash
mvn spring-boot:run
```

### 2. Using the generated WAR file

```bash
java -jar target/jsf-fatwar-demo.war
```

## Accessing the Application

Once the application is running, open your browser and navigate to:

[http://localhost:8080/demo/hello.xhtml](http://localhost:8080/demo/hello.xhtml)

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── beans           # Spring and CDI beans
│   │       ├── config          # JSF/CDI configuration
│   │       └── validators      # Custom JSF validators
│   ├── resources
│   │   ├── application.yml     # yml file
│   │   └── META-INF
│   │       └── beans.xml       # CDI config
│   └── webapp
│       ├── digit.xhtml         # First JSF page
│       ├── hello.xhtml         # Second JSF page
│       ├── resources
│       │   └── css             # CSS
│       └── WEB-INF
│           └── faces-config.xml # Faces config file
```

## License

This project is released into the public domain. You are free to use, modify, and distribute it without restriction.
