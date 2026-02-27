# Secure Task Management Backend

## 🚀 Tech Stack
- Spring Boot 3
- Spring Security
- JWT Authentication
- MySQL
- Swagger (OpenAPI 3)
- Maven

## 🔐 Features
- User Registration & Login
- JWT Authentication
- Role-Based Access (ADMIN delete only)
- Task CRUD APIs
- Swagger Documentation

## 📂 Setup Instructions

1. Clone repository
2. Create MySQL DB:
   CREATE DATABASE secure_backend;
3. Update application.yml with DB credentials
4. Run application

Swagger:
http://localhost:8080/swagger-ui/index.html

## 🔑 Authentication Flow
1. Register user
2. Login to get JWT token
3. Use token in Authorization header:
   Bearer <token>

## 📈 Scalability Design
- Stateless JWT Authentication
- No server session storage
- Horizontal scaling possible
- Database indexing ready
- Can integrate Redis caching
- Can deploy behind load balancer