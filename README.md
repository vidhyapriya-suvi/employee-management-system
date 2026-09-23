# Employee Management System - REST API
RESTful CRUD application for managing employee records.

- Full CRUD (Create, Read, Update, Delete) // **Features** 
- Get All Employees / Get by ID
- Validation & Global Exception Handling
- Layered Architecture (Controller-Service-Repository)

// Tech Stack
Java 17, Spring Boot, Spring Data JPA, MySQL, Maven, Postman, IntelliJ

// API Endpoints
- POST `/api/employees` - Create Employee
- GET `/api/employees` - Get All
- GET `/api/employees/{id}` - Get by ID
- PUT `/api/employees/{id}` - Update
- DELETE `/api/employees/{id}` - Delete

// How to Run
1. Clone: `git clone https://github.com/vidhyapriya-suvi/employee-management-system.git`
2. Create MySQL DB: `employee_db`
3. Update `application.properties` with your DB username/password
4. Run: `mvn spring-boot:run` -> App at `http://localhost:8080`

### Author
Vidhyapriya Sugumar | MCA | Java Backend Developer
GitHub: @vidhyapriya-suvi | LinkedIn: vidhyapriya-sugumar
