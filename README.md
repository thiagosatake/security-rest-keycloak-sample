# RESTful Service built with Spring Boot, secured by Keycloak’s Authorization Services.

```
 -------------------------------------
< You are number 6! Who is number one? >
 --------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
                
       security-rest-keycloak-sample
       :: OpenJDK (v21.0.3) ::
       :: Spring Boot: (v3.3.0) ::
```
## Overview

Spring Boot is an open-source Java-based framework used to create a micro Service. It is developed by Pivotal Team and is used to build stand-alone and production-ready spring applications. It simplifies the bootstrapping and development of new Spring applications by providing default configurations, which helps to get started quickly and with less configuration.

Keycloak is an open-source Identity and Access Management solution aimed at modern applications and services. It makes it easy to secure applications and services with little to no code. Keycloak offers features such as Single-Sign On (SSO), identity brokering and social login, user federation, client adapters, an admin console, and an account management console. 

Using Keycloak with Spring Boot can be a good choice if you’re looking to implement robust authentication and authorization in your Spring Boot applications. Keycloak integrates well with Spring Boot and provides a comprehensive security solution that can handle user identity, SSO, and more. It’s especially useful if you want to externalize your security features and focus on your application’s business logic. 

This project is a very simplified example and you’ll need to adjust it to fit your application’s needs. 

## System Requirements

To compile and run you'll need:

- [JDK 21](https://github.com/adoptium/)
- [Gradle 8.8](https://github.com/gradle/gradle)
- [Spring Boot 3.3.0](https://github.com/spring-projects/spring-boot)
- [Keycloak 25.0.0](https://github.com/keycloak/keycloak)
- [Podman 4.3.1](https://github.com/containers/podman)
- [Podman Composer 1.0.3](https://github.com/docker/docker)

## Starting and Configuring the Keycloak Server

To start a Keycloak Server you can use Podman Compose. It is a tool similar to Docker Compose, designed for managing multi-container applications using Podman. It acts as a wrapper around an external compose provider like docker-compose, allowing you to use a YAML file to define and run your containers with Podman as the backend. It simplifies the process of deploying interdependent containers.
Run podman-compose up in the same directory as your container-compose.yml file. This command will start all the services defined in the YAML file.

  ```shell
  podman-compose up
  ```
To stop and remove all the services, you can use:

  ```shell
  podman-compose down
  ```
Remember to have Podman and Podman Compose installed on your system before running these commands.

## Build and Run 

