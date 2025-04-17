# Spring JDBC Project

A comprehensive Java application demonstrating Spring JDBC operations with MySQL database integration. This project showcases best practices in Spring Framework, JDBC operations, and GUI development using Java Swing.

## 🚀 Features

- **Database Operations**
  - Complete CRUD operations using Spring JDBC
  - Efficient data access with DAO pattern
  - Transaction management
  - Prepared statements for secure queries

- **User Interface**
  - Modern Java Swing GUI
  - Real-time operation feedback
  - Scrollable result display
  - User-friendly error handling

- **Technical Stack**
  - Spring Framework
  - Spring JDBC
  - MySQL Database
  - Maven Build Tool
  - Java Swing GUI

## 📋 Prerequisites

- Java JDK 17 or higher
- Maven 3.x
- MySQL Server 8.0+
- IDE (Eclipse, IntelliJ IDEA, or VS Code)

## 🛠️ Project Structure

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

## ⚙️ Configuration

### Database Setup

1. Create a MySQL database named `spring`
2. Update the database configuration in `src/main/resources/com/spring/jdbc/Pro1/Config.xml`:

```xml
<property name="driverClassName" value="com.mysql.cj.jdbc.Driver" />
<property name="url" value="jdbc:mysql://localhost:3306/spring" />
<property name="username" value="your_username" />
<property name="password" value="your_password" />
```

### Maven Dependencies

The project uses the following key dependencies:
- spring-jdbc
- mysql-connector-java
- spring-context

## 🚀 Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/ashishkumarmandal/Spring_jdbc.git
   ```

2. **Navigate to Project Directory**
   ```bash
   cd Spring_jdbc
   ```

3. **Build the Project**
   ```bash
   mvn clean install
   ```

4. **Run the Application**
   ```bash
   mvn exec:java -Dexec.mainClass="com.spring.jdbc.Pro1.App"
   ```

## 📝 Usage

1. Launch the application
2. Use the GUI interface to:
   - Add new student records
   - View existing records
   - Update student information
   - Delete student records
3. Results will be displayed in the scrollable text area

## 🔄 Recent Updates

- Enhanced GUI with modern Java Swing components
- Improved error handling and user feedback
- Optimized database operations
- Added transaction management
- Updated documentation and code comments

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- **Ashish Kumar Mandal** - *Initial work* - [ashishkumarmandal](https://github.com/ashishkumarmandal)

## 🙏 Acknowledgments

- Spring Framework documentation
- MySQL documentation
- Java Swing tutorials
- Open source community
