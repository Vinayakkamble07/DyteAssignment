# Dyte Assignment

A robust log ingestor system designed to efficiently manage large volumes of log data. This project provides a straightforward interface for querying log data through full-text search . It uses technologies such as Java, Spring Boot, MongoDB, and Swagger UI.

## Table of Contents

- [Requirements](#requirements )
- [Getting Started](#GettingStarted)
- [Database Configuration](#DatabaseConfiguration)
- [Add Log](#AddLog)
- [Reterive All Logs](#ToReteriveAllLogs)

  
## Requirements 
- Java
- Spring Boot
- IDE Such as IntelliJ IDEA , STS
- POSTMAN
- MongoDB

## Getting Started

# Editing `application.properties`

To customize the application configuration, modify the `application.properties` file. Here are some key properties you might want to update:

### Database Configuration

```properties
Database connection properties
server.port=3000
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017 # Change your MongoDB Port no here
spring.data.mongodb.database=mydb # Change your MongoDB database name here
```

``` To Add Log Data use the bellow url along with POSTMAN
http://localhost:3000/

```
```
Sample Log Data Format:
{
	"level": "error",
	"message": "Failed to connect to DB",
    "resourceId": "server-1234",
	"timestamp": "2023-09-15T08:00:00Z",
	"traceId": "abc-xyz-123",
    "spanId": "span-456",
    "commit": "5e5342f",
    "metadata": {
        "parentResourceId": "server-0987"
    }
}
```
To Reterive All Logs
```
http://localhost:3000/logs
```

# To Search Data Based on varoius fields
```
http://localhost:3000/swagger-ui/index.html/
```



