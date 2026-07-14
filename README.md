# 📚 Library Management System (DAO Pattern)

A simple **Library Management System** developed in **Java** using **JDBC**, **MySQL**, and the **DAO (Data Access Object) Design Pattern**. This project demonstrates CRUD (Create, Read, Update, Delete) operations while following a clean layered architecture.

---

## 🚀 Features

- ➕ Add a new book
- 📖 View all books
- ✏️ Update book details
- ❌ Delete a book
- 🔗 MySQL database connectivity using JDBC
- 🏗️ DAO Design Pattern implementation
- 🖥️ Console-based menu-driven application

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- Eclipse IDE
- MySQL Workbench

---

## 📂 Project Structure

```
LibraryManagement/
│
├── src/
│   ├── model/
│   │      Book.java
│   │
│   ├── dao/
│   │      BookDAO.java
│   │      BookDAOImpl.java
│   │
│   ├── util/
│   │      DBConnection.java
│   │
│   └── main/
│          Main.java
│
└── README.md
```

---

## 🗄️ Database

Database Name

```sql
librarydb
```

Table

```sql
CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    price DOUBLE
);
```

---

## ⚙️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/LibraryManagement.git
```

### 2. Create the Database

Open **MySQL Workbench** and execute:

```sql
CREATE DATABASE librarydb;

USE librarydb;

CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    price DOUBLE
);
```

### 3. Configure Database Connection

Open `DBConnection.java` and update the following values:

```java
private static final String URL = "jdbc:mysql://localhost:3306/librarydb";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

### 4. Add MySQL JDBC Driver

Download **MySQL Connector/J** and add the JAR file to your project's Build Path in Eclipse.

### 5. Run the Project

Run `Main.java`.

---

## 📸 Console Menu

```
===== Library Management System =====

1. Add Book
2. View Books
3. Update Book
4. Delete Book
5. Exit

Enter your choice:
```

---

## 📖 DAO Pattern

This project follows the **DAO (Data Access Object)** design pattern.

- **Model Layer** → Represents the `Book` entity.
- **DAO Interface** → Declares database operations.
- **DAO Implementation** → Implements CRUD operations using JDBC.
- **Utility Layer** → Handles database connection.
- **Main Layer** → Provides the console-based user interface.

---

## 📚 CRUD Operations

- Create (Add Book)
- Read (View Books)
- Update (Update Book)
- Delete (Delete Book)

---

## 🎯 Learning Outcomes

This project helps understand:

- JDBC Connectivity
- MySQL Integration
- DAO Design Pattern
- Java Interfaces
- Object-Oriented Programming (OOP)
- PreparedStatement
- ResultSet
- CRUD Operations
- Exception Handling

---

## 👨‍💻 Author

**Jayesh Wable**

Computer Science Engineering (AI & ML)

---

## 📄 License

This project is created for educational and learning purposes.
