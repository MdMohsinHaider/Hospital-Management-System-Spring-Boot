# Hospital Management System

## Overview

The **Hospital Management System** is a web-based application designed to efficiently manage hospital operations. It allows patients to register, book appointments, and access their medical records while enabling doctors and administrators to manage patient details, schedules, and billing.

## Features

### **For Patients:**
- Register and log in securely
- Book and manage appointments
- Access medical records and prescriptions
- View doctors' availability

### **For Doctors:**
- View and manage patient records
- Manage appointments and schedules
- Provide prescriptions and treatment history

### **For Admins:**
- Manage hospital departments and staff
- Generate reports on hospital activities
- Oversee billing and patient records

## Technologies Used

### **Backend:**
- Java (Spring Boot)
- Hibernate & Spring Data JPA
- RESTful API development
- MySQL/PostgreSQL (Database)

### **Frontend:**
- React.js with Vite
- Tailwind CSS for styling
- Axios for API communication

### **Other Technologies:**
- JWT Authentication for security
- Lombok for reducing boilerplate code
- Docker (Optional for deployment)

## Project Configuration (Maven)

The project is built using **Maven**. Below is the `pom.xml` configuration:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.3</version>
        <relativePath/>
    </parent>
    <groupId>com.jspider</groupId>
    <artifactId>hospital-management-system-spring-boot</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>hospital-management-system-spring-boot</name>
    <description>Hospital Management System Spring Boot</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <annotationProcessorPaths>
                        <path>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </path>
                    </annotationProcessorPaths>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

## API Documentation

### **Patient APIs**

#### **POST - Save Patient**
**Endpoint:**
```
http://localhost:8090/api/patient
```

**Request Body (JSON):**
```json
{
    "contactNumber": 9876543210,
    "password": "securePassword123",
    "email": "patient@example.com",
    "firstName": "John",
    "lastName": "Doe",
    "dateOfBirth": "1990-05-15",
    "gender": 1,
    "address": "123 Main Street, City, Country",
    "emergencyContact": 9876543211,
    "bloodType": "O+"
}
```

#### **GET - Retrieve All Patients**
**Endpoint:**
```
http://localhost:8090/api/patient
```

#### **GET - Retrieve Patient by ID**
**Endpoint:**
```
http://localhost:8090/api/patient/{patientId}
```

#### **GET - Retrieve Patient by Contact Number**
**Endpoint:**
```
http://localhost:8090/api/patient/contact/{contactNumber}
```

#### **GET - Retrieve Patient by Email**
**Endpoint:**
```
http://localhost:8090/api/patient/email/{email}
```

#### **POST - Authenticate Patient**
**Endpoint:**
```
http://localhost:8090/api/patient/auth/patientId/1/password/securePassword123
```

### **Admin APIs**

#### **POST - Authenticate Admin**
**Endpoint:**
```
http://localhost:8090/api/authenticateAdmin/identifier/admin@gmail.com/password/admin123
```

---

**Developed by:**

