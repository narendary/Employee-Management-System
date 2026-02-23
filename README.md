# Employee Management System

A web-based Employee Management System built with Java, JDBC, Servlets, and JSP. This application enables organizations to manage employee records efficiently through a clean, browser-based interface.

## Tech Stack

- **Backend:** Java, JDBC, Servlets
- **Frontend:** JSP (JavaServer Pages), HTML, CSS
- **Database:** MySQL (or compatible RDBMS)
- **Server:** Apache Tomcat
- **IDE:** Eclipse (project includes `.project` and `.classpath` files)

## Features

- Add new employee records
- View all employees
- Update existing employee details
- Delete employee records
- Search/filter employees by relevant fields

## Project Structure

```
Employee-Management-System/
├── src/
│   └── main/
│       ├── java/         # Java Servlet and JDBC logic
│       └── webapp/       # JSP pages, HTML, CSS
├── .classpath            # Eclipse classpath configuration
├── .project              # Eclipse project configuration
└── .gitignore
```

## Prerequisites

- Java JDK 8 or higher
- Apache Tomcat 9+
- MySQL (or compatible database)
- Eclipse IDE (recommended) or any Java-compatible IDE
- JDBC MySQL Connector JAR

## Getting Started

### 1. Set Up the Database

Create a MySQL database and table:

```sql
CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    department VARCHAR(50),
    salary DOUBLE,
    join_date DATE
);
```

### 2. Configure Database Connection

Update the JDBC connection details in the database utility/configuration file:

```java
String url = "jdbc:mysql://localhost:3306/employee_db";
String username = "your_db_username";
String password = "your_db_password";
```

### 3. Add JDBC Driver

Download the [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) JAR and place it in your project's `WEB-INF/lib/` directory.

### 4. Deploy to Tomcat

1. Import the project into Eclipse as an existing project.
2. Configure Apache Tomcat in Eclipse.
3. Right-click the project → **Run As** → **Run on Server**.
4. Open your browser and navigate to: `http://localhost:8080/Employee-Management-System/`

## Usage

Once running, you can:

- Navigate to the home page to see a list of all employees.
- Use the **Add Employee** form to create a new record.
- Click **Edit** next to any employee to update their details.
- Click **Delete** to remove an employee from the system.


## License

This project is open source and available under the [MIT License](LICENSE).

## Author

**Pallavee Maurya**  
[GitHub Profile](https://github.com/PallaveeMaurya)
