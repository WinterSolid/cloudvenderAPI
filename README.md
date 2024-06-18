# CloudVenderAPI - End-to-End Java REST API with Spring Boot and MySQL

## Project Description:
Developed a robust and scalable RESTful API using Java and Spring Boot, integrating MySQL for data persistence. Testing and validation of API endpoints using Postman, and performed database management and queries using MySQL Workbench.

## Technologies Used:

- Java
- Spring Boot Framework
- Spring Data JPA
- MySQL
- Postman
- MySQL Workbench
  
## project Summary:

- Designed and implemented RESTful API endpoints for CRUD operations on entities.
- Configured Spring Data JPA to interact with a MySQL database for data persistence.
- Installed and configured MySQL server, created databases and users, and managed schema using MySQL Workbench.
- Managed project dependencies using Maven, including integration of MySQL Connector/J and other Spring Boot dependencies.
- Configured application.properties for database connection and JPA settings.
- Utilized spring.jpa.hibernate.ddl-auto setting to manage database schema creation and updates.
- Documentation for API endpoints and database schema for future reference and team collaboration.


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
-  Using MySQL workbench to create DB, Table. 
-  For mySQL syntax examples:
- - https://www.w3schools.com/mysql/mysql_create_table.asp
<img width="984" alt="DBSetup" src="https://github.com/WinterSolid/cloudvenderAPI/assets/58896705/7253284b-3026-4e94-ae62-b0c12afe2361">
