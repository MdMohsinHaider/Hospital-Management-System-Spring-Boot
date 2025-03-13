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
</project>
```

## API Documentation

### **Patient APIs**

| Method | Endpoint | Description |
|--------|----------------------------------------------|--------------------------------------------|
| POST   | `/api/patient`                              | Save Patient |
| GET    | `/api/patient`                              | Retrieve All Patients |
| GET    | `/api/patient/{patientId}`                  | Retrieve Patient by ID |
| GET    | `/api/patient/contact/{contactNumber}`      | Retrieve Patient by Contact Number |
| GET    | `/api/patient/email/{email}`                | Retrieve Patient by Email |
| POST   | `/api/patient/auth?patientId=1&password=SecurePass123` | Authenticate Patient |
| POST   | `/api/patient/exists/{email}`               | Check if Patient exists by Email |

### **Admin APIs**

| Method | Endpoint | Description |
|--------|-----------------------------------------------------|----------------------|
| POST   | `/api/authenticateAdmin/identifier/admin@gmail.com/password/admin123` | Authenticate Admin |

### **Doctor APIs**

| Method | Endpoint | Description |
|--------|------------------------------------------------|----------------------|
| POST   | `/api/doctor`                                  | Save Doctor |
| GET    | `/api/doctor`                                  | Retrieve All Doctors |
| GET    | `/api/doctor/contactNumber/{contactNumber}`    | Retrieve Doctor by Contact Number |
| GET    | `/api/doctor/id/{id}`                          | Retrieve Doctor by ID |
| GET    | `/api/doctor/email/{email}`                    | Retrieve Doctor by Email |
| GET    | `/api/doctor/specialization/{specialization}`  | Retrieve Doctor by Specialization |
| POST   | `/api/doctor/existsByEmail/{email}`            | Check if Doctor exists by Email |
| POST   | `/api/doctor/existsByContactNumber/{contactNumber}` | Check if Doctor exists by Contact Number |

### **Appointment APIs**

| Method | Endpoint | Description |
|--------|------------------------------------------------|----------------------|
| POST   | `/api/appointment`                             | Save Appointment |
| GET    | `/api/appointment`                             | Retrieve All Appointments |
| GET    | `/api/appointment/date/{date}`                 | Retrieve Appointments by Date |
| PUT    | `/api/appointment/{appointmentId}`             | Update an Appointment |

### **Doctor Note APIs**

| Method | Endpoint | Description |
|--------|------------------------------------------------|----------------------|
| POST   | `/api/doctor-notes`                            | Save Doctor Note |
| GET    | `/api/doctor-notes/patient/{patientId}`       | Retrieve Doctor Notes by Patient |

## Example Data for API Testing

### **Sample Patient JSON**
```json
{
  "contactNumber": "8084527631",
  "email": "mohsinhaider@mohsin.com",
  "password": "authaCode123",
  "firstName": "Md Mohsin",
  "lastName": "Haider",
  "dateOfBirth": "2001-10-29",
  "gender": "MALE",
  "address": "100 White house Main Street, New York",
  "emergencyContact": "1111111112",
  "bloodType": "B+",
  "appointments": []
}
```

### **Sample Doctor JSON**
```json
{
  "name": "Dr. Smith",
  "email": "dr.smith@example.com",
  "contactNumber": "9876543670",
  "specialization": "Cardiologist",
  "experienceYears": 3,
  "clinicAddress": "123 Heart Care Center, New York, NY",
  "availableDays": "Monday, Wednesday, Friday",
  "consultationFee": 300.0
}
```

---

**Developed by:** Md Mohsin Haider

