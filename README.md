# ♨ ☕ 🚀 Java *Reactive*, Hexagonal Architecture + DDD: Template repository for your new java *reactive* projects

<img src="https://raw.githubusercontent.com/lionelgt/java-hexagonal-ddd-reactive-skeleton/main/docs/img/reactive-microservice.svg"  align="left" width="300px" height="210px">
<img align="left" width="0" height="210px" hspace="10"/>

> ⚡ Start your Java **reactive** non-blocking, asynchronous projects as fast as possible

> 🎯 Start with a software architecture that isolates the domain from external components

> 🔥 Get started with software architecture that promotes maintainable, scalable, and high-quality software design

[![Lionelgt](https://img.shields.io/badge/Lionel_gt-LinkedIn-blue.svg)](https://www.linkedin.com/in/lionelgt/)

## 👨🏼‍💻️️ Content
- [Introduction](#-introduction)
- [Dependencies](#-dependencies)
- [How to start](#-how-to-start)
- [Software architecture diagram](https://github.com/lionelgt/java-hexagonal-ddd-skeleton/blob/main/docs/software-architecture-diagram.md)

## ℹ️️ Introduction

This skeleton repository was built to serve as a starting point for building a java **reactive** project that implements Hexagonal Architecture + Domain-Driven Design (DDD).

As a example I included a **reactive** API that covers all the layers to show the implementation in each of them.

## 🔧️ Dependencies

- [Java 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Spring Boot 3.2.2](https://spring.io/projects/spring-boot#overview)
- [Maven 3.9.4](https://maven.apache.org/docs/3.9.4/release-notes.html)

## 🚀 How to Start
1. Create your repository from this [java-hexagonal-ddd-reactive-skeleton](https://github.com/lionelgt/java-hexagonal-ddd-reactive-skeleton) repository. [Follow these steps](https://docs.github.com/en/repositories/creating-and-managing-repositories/creating-a-repository-from-a-template).
2. Clone your repository: `git clone https://github.com/:your-user/:your-repository-name`.
3. Execute this to build jar:  `mvn clean package`
4. Execute this to build image: `docker build -t java-hexagonal-ddd-reactive-skeleton:0.0.1-SNAPSHOT .`
5. Execute this to run the container: `docker run -p 8080:8080 java-hexagonal-ddd-reactive-skeleton:0.0.1-SNAPSHOT`
6. In order to check everything is OK : `curl 'localhost:8080/api/git-repository'`
7. Start developing!

## 💡 Related repositories

### ☕ Java

- [♨ ☕ 🚀 Java Hexagonal Architecture + DDD: Skeleton repository for your new java projects](https://github.com/lionelgt/java-hexagonal-ddd-skeleton)
