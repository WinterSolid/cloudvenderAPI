# CloudVenderAPI
Setting Up the Project

<img width="375" alt="CloudVender-Wintersolid" src="https://github.com/WinterSolid/cloudvenderAPI/assets/58896705/9543654e-28b5-4e5a-8e81-c36192b3c30a">

## Prerequisites

Ensure you have the following installed on your machine:

Java Development Kit (JDK) 8 or higher
- Apache Maven
- MySQL Server and MySQL Workbench
- Postman

## 1. Create a New Spring Boot Project
Use Spring Initializr to generate a new Spring Boot project with the following dependencies:

- Spring Web
- Spring Data JPA

- MySQL Driver

## 2. Configure MySQL Database
- Update application.properties or create a application.Yaml file in src/main/resources directory:
-  Using MySQL workbench to create DB, Table. "CREATE SCHEMA is a synonym for CREATE DATABASE as of MySQL 5.0.2."
-  For mySQL syntax examples:
- - https://www.w3schools.com/mysql/mysql_create_table.asp
<img width="984" alt="DBSetup" src="https://github.com/WinterSolid/cloudvenderAPI/assets/58896705/7253284b-3026-4e94-ae62-b0c12afe2361">
