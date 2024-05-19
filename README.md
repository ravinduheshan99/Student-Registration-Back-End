# Student Registration System - Backend

This repository contains the backend code for the Student Registration System. The backend is developed using Java Spring Boot framework and provides RESTful API endpoints for managing student records.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL

## Setup and Installation
### Prerequisites
- Java 11 or higher
- Maven
- MySQL

### Steps
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/student-registration-backend.git
    cd student-registration-backend
    ```

2. Ensure MySQL is running and create a database named `student_crm`.

3. Update the MySQL username and password in `src/main/resources/application.yml`:
    ```yaml
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/student_crm
        username: root
        password: your_mysql_password
      jpa:
        hibernate:
          ddl-auto: update
    ```

4. Build and run the Spring Boot application:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

The backend server will start on `http://localhost:8080`.

## API Endpoints
### Create a new student
- **URL:** `/student`
- **Method:** `POST`
- **Request Body:**
  
    ```json
    {
        "studNo": "S123",
        "fname": "John",
        "lname": "Doe",
        "dep": "CS",
        "course": "Course Module 01"
    }
    ```
- **Response:**
  
    ```json
    {
        "studNo": "S123",
        "fname": "John",
        "lname": "Doe",
        "dep": "CS",
        "course": "Course Module 01"
    }
    ```

### Update an existing student
- **URL:** `/student`
- **Method:** `PUT`
- **Request Body:** Same as above.

### Retrieve a student by student number
- **URL:** `/student`
- **Method:** `GET`
- **Query Param:** `studNo`
- **Response:**
  
    ```json
    {
        "studNo": "S123",
        "fname": "John",
        "lname": "Doe",
        "dep": "CS",
        "course": "Course Module 01"
    }
    ```

### Retrieve all students
- **URL:** `/all-students`
- **Method:** `GET`
- **Response:**
  
    ```json
        {
            "studNo": "S123",
            "fname": "John",
            "lname": "Doe",
            "dep": "CS",
            "course": "Course Module 01"
        }
    ```

### Delete a student
- **URL:** `/student`
- **Method:** `DELETE`
- **Query Param:** `studNo`

## Contact
For any inquiries or feedback, please contact:

Email: ravinduheshan99@gmail.com

## Authors
- [@ravinduheshan99](https://github.com/ravinduheshan99)
