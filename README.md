# Spring JDBC Project

A Java application demonstrating Spring JDBC operations with a MySQL database, featuring a graphical user interface for displaying results.

## Project Structure

```
Spring_jdbc/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── spring/
│   │   │           └── jdbc/
│   │   │               └── Pro1/
│   │   │                   ├── App.java
│   │   │                   ├── dao/
│   │   │                   │   ├── StudentDao.java
│   │   │                   │   ├── StudentDaoImple.java
│   │   │                   │   └── entities/
│   │   │                   │       └── Student.java
│   │   └── resources/
│   │       └── com/
│   │           └── spring/
│   │               └── jdbc/
│   │                   └── Pro1/
│   │                       └── Config.xml
└── pom.xml
```

## Features

- Spring JDBC integration with MySQL database
- Data Access Object (DAO) pattern implementation
- CRUD operations for Student entity
- Graphical User Interface using Java Swing
- Maven project management
- XML-based Spring configuration

## Prerequisites

- Java JDK 17 or higher
- Maven 3.x
- MySQL Server
- IDE (Eclipse, IntelliJ, etc.)

## Database Configuration

Update the database configuration in `src/main/resources/com/spring/jdbc/Pro1/Config.xml`:

```xml
<property name="driverClassName" value="com.mysql.cj.jdbc.Driver" />
<property name="url" value="jdbc:mysql://localhost:8080/spring" />
<property name="username" value="root" />
<property name="password" value="root" />
```

## Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/ashishkumarmandal/Spring_jdbc.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Spring_jdbc
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn exec:java -Dexec.mainClass="com.spring.jdbc.Pro1.App"
   ```

## Recent Updates

- Added GUI interface using Java Swing for displaying operation results
- Implemented error handling for database operations
- Moved configuration file to resources directory
- Fixed package naming conventions
- Added scrollable text area for better result display

## Contributing

Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the LICENSE file for details.