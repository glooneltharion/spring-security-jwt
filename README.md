# JWT Authentication with Spring Boot

## Overview
This application illustrates how to implement JWT (JSON Web Token) authentication in a Spring Boot project. JWT is used to secure RESTful APIs and facilitate stateless authentication.

## Application Components

### User Entity
The `User` class represents the user model with details required for authentication.

### AuthenticationRequest Class
The `AuthenticationRequest` class encapsulates user credentials for authentication.

### AuthenticationResponse Class
The `AuthenticationResponse` class contains the JWT token generated upon successful authentication.

### UserRepository Interface
The `UserRepository` interface extends `JpaRepository` and handles CRUD operations for users.

### UserService Class
The `UserService` class implements the `UserDetailsService` interface to load user details and is used for authentication purposes.

### Security Configuration
The `SecurityConfiguration` class configures security settings, defines authentication methods, and manages HTTP security.

### JwtFilter Class
The `JwtFilter` class is a filter responsible for intercepting incoming requests, validating JWT tokens, and setting up authentication in the Spring Security context.

### JwtUtil Class
The `JwtUtil` class provides methods for generating, parsing, and validating JWT tokens.

### MainController Class
The `MainController` class contains a basic endpoint ("/") for displaying an index page.

### RestController Class
The `RestController` class handles REST endpoints, specifically the "/authenticate" endpoint for user authentication.

## Key Features
- **User Authentication**: Users can authenticate via the "/authenticate" endpoint with valid credentials.
- **JWT Token Generation**: Upon successful authentication, the server generates a JWT token.
- **Token-Based Authentication**: JWT tokens are used for subsequent API requests to validate user identity.

## How to Use
1. **Run the Application**: Execute the Spring Boot application.
2. **API Usage**:
    - **Authenticate**: Make a POST request to "/authenticate" with user credentials (username and password) to receive a JWT token.
    - **Access Secured Endpoints**: Include the obtained JWT token in the "Authorization" header of subsequent requests to access secured endpoints.


