# My Spring Boot CRUD Application

This is a simple Spring Boot application that demonstrates how to perform basic CRUD (Create, Read, Update, Delete) operations using Spring Boot, MyBatis, and XML-based SQL mappings. The application serves a basic HTML page and provides a RESTful API to interact with the database.

## Features

- Serve a basic HTML page using Thymeleaf.
- Perform CRUD operations using a RESTful API.
- No entity classes required, operations are performed using `Map<String, Object>`.
- MyBatis is used for database interactions with SQL queries defined in XML.

## Getting Started

### Prerequisites

- Java 22
- Maven 3.9
- MySQL (or any other relational database supported by MyBatis)

### Database Setup

1. **Create a Database**: 

    Create a database in MySQL (or your chosen RDBMS) and name it as you like. For this example, we'll assume the database is named `aurora_spring`.

    ```sql
    CREATE DATABASE aurora_spring;
    ```

2. **Create a Table**:

    Create a table in the database that will be used for CRUD operations.

    ```sql
    CREATE TABLE pegawai (
        id INT AUTO_INCREMENT PRIMARY KEY,
        column1 VARCHAR(255),
        column2 VARCHAR(255),
        ...
    );
    ```

### Application Setup

1. **Clone the Repository**:

    ```bash
    git clone https://github.com/your-username/my-spring-boot-crud-app.git
    cd my-spring-boot-crud-app
    ```

2. **Configure the Database Connection**:

    Update the `src/main/resources/application.properties` file with your database connection details.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/aurora_spring
    spring.datasource.username=your-username
    spring.datasource.password=your-password
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

    mybatis.mapper-locations=classpath:mapper/*.xml
    ```

3. **Build the Project**:

    Use Maven or Gradle to build the project.

    ```bash
    mvn clean install
    ```

4. **Run the Application**:

    ```bash
    mvn spring-boot:run
    ```

5. **Access the Application**:

    - Visit `http://localhost:8080/` to see the HTML page.
    - Use tools like Postman or `curl` to interact with the REST API at `http://localhost:8080/api/data`.

## API Endpoints

- **GET /api/data**: Retrieve all records from the database.
- **POST /api/data**: Create a new record.
- **PUT /api/data/{id}**: Update an existing record by ID.
- **DELETE /api/data/{id}**: Delete a record by ID.

### Example Requests

- **GET /api/data**:

    ```bash
    curl -X GET http://localhost:8080/api/data
    ```

- **POST /api/data**:

    ```bash
    curl -X POST -H "Content-Type: application/json" -d '{"column1": "value1", "column2": "value2"}' http://localhost:8080/api/data
    ```

- **PUT /api/data/1**:

    ```bash
    curl -X PUT -H "Content-Type: application/json" -d '{"column1": "new value", "column2": "new value"}' http://localhost:8080/api/data/1
    ```

- **DELETE /api/data/1**:

    ```bash
    curl -X DELETE http://localhost:8080/api/data/1
    ```

## Project Structure

- **src/main/java/com/lotteinnovate/aurora_spring/controller**: Contains the `PegawaiController` class that handles HTTP requests.
- **src/main/java/com/lotteinnovate/aurora_spring/service**: Contains the `PegawaiService` class that contains the business logic.
- **src/main/java/com/lotteinnovate/aurora_spring/mapper**: Contains the `PegawaiMapper` interface for MyBatis.
- **src/main/resources/mapper**: Contains the `PegawaiMapper.xml` file with SQL queries.
- **src/main/resources/templates**: Contains the `index.html` file for the basic HTML view.
- **src/main/resources/application.properties**: Configuration file for database and MyBatis settings.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [MyBatis](https://mybatis.org/mybatis-3/)
- [Thymeleaf](https://www.thymeleaf.org/)
