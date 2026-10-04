# 🏦 Banking Management System

A console-based **Banking Management System** developed using **Core Java** and **Object-Oriented Programming (OOP)** concepts.

The application allows users to create bank accounts, deposit money, withdraw money, transfer money, check account balances, and view account details through a simple menu-driven interface.

---

## 📌 Project Overview

The Banking Management System is designed to simulate basic banking operations using Java.

The project demonstrates practical implementation of:

* Java Classes and Objects
* Encapsulation
* Inheritance
* Polymorphism
* ArrayList / Collections
* Exception Handling
* File Handling
* Methods and Constructors
* Conditional Statements
* Loops
* Switch Statements

---

## 🚀 Features

### 1. Create Account

Users can create a new bank account by entering:

* Account Number
* Customer Name
* Initial Balance
* Account Type

### 2. Deposit Money

Users can deposit money into an existing account.

### 3. Withdraw Money

Users can withdraw money if sufficient balance is available.

### 4. Transfer Money

Users can transfer money from one account to another.

### 5. Check Balance

Users can check the current balance of their account.

### 6. View Account Details

Users can view account information such as:

* Account Number
* Customer Name
* Account Type
* Current Balance

### 7. Transaction Validation

The system validates transactions and prevents invalid operations such as:

* Negative deposit amounts
* Negative withdrawal amounts
* Withdrawal exceeding available balance
* Transfer to a non-existing account

### 8. Exit

Users can safely exit the application from the main menu.

---

## 🛠️ Technologies Used

| Technology         | Usage                           |
| ------------------ | ------------------------------- |
| Java               | Main programming language       |
| OOP                | Application design              |
| ArrayList          | Store account information       |
| Exception Handling | Handle invalid input            |
| File Handling      | Store and retrieve account data |
| Git                | Version control                 |
| GitHub             | Source code hosting             |

---

## 📚 Java Concepts Used

This project demonstrates the following Core Java concepts:

* Classes and Objects
* Constructors
* Encapsulation
* Inheritance
* Polymorphism
* Method Overloading / Overriding
* Access Modifiers
* ArrayList
* Loops
* Conditional Statements
* Switch Case
* Exception Handling
* File I/O
* Scanner Class

---

## 📂 Project Structure

```text
java-banking-management-system/
│
├── src/
│   ├── Main.java
│   ├── BankAccount.java
│   ├── SavingsAccount.java
│   ├── CurrentAccount.java
│   ├── BankService.java
│   └── FileManager.java
│
├── data/
│   └── accounts.dat
│
├── README.md
│
└── .gitignore
```

---

## ▶️ How to Run

### Prerequisites

Make sure Java is installed on your computer.

Check the Java version:

```bash
java -version
```

You should have **JDK 8 or above** installed.

### Step 1: Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/java-banking-management-system.git
```

### Step 2: Open the Project

Open the project in any Java IDE such as:

* IntelliJ IDEA
* Eclipse
* VS Code
* NetBeans

### Step 3: Compile the Program

Navigate to the `src` folder and compile:

```bash
javac *.java
```

### Step 4: Run the Application

```bash
java Main
```

---

# 🖥️ Sample Output

## Main Menu

```text
========================================
       BANKING MANAGEMENT SYSTEM
========================================

1. Create Account
2. Deposit Money
3. Withdraw Money
4. Transfer Money
5. Check Balance
6. View Account Details
7. Exit

Enter your choice: 1
```

---

## Create Account

```text
----------- CREATE ACCOUNT -----------

Enter Account Number: 1001
Enter Customer Name: Rahul
Enter Account Type:
1. Savings
2. Current

Enter choice: 1
Enter Initial Deposit: 10000

Account created successfully!

Account Number : 1001
Customer Name  : Rahul
Account Type   : Savings
Balance        : ₹10000.00
```

---

## Deposit Money

```text
----------- DEPOSIT MONEY -----------

Enter Account Number: 1001
Enter Amount: 5000

Deposit successful!

Previous Balance : ₹10000.00
Deposited Amount : ₹5000.00
Current Balance  : ₹15000.00
```

---

## Withdraw Money

```text
----------- WITHDRAW MONEY -----------

Enter Account Number: 1001
Enter Amount: 3000

Withdrawal successful!

Withdrawn Amount : ₹3000.00
Remaining Balance: ₹12000.00
```

---

## Transfer Money

```text
----------- TRANSFER MONEY -----------

Enter Sender Account Number: 1001
Enter Receiver Account Number: 1002
Enter Amount: 2000

Transfer successful!

Amount Transferred : ₹2000.00
Sender Balance     : ₹10000.00
```

---

## Check Balance

```text
----------- CHECK BALANCE -----------

Enter Account Number: 1001

Account Number : 1001
Customer Name  : Rahul
Current Balance: ₹10000.00
```

---

## View Account Details

```text
----------- ACCOUNT DETAILS -----------

Account Number : 1001
Customer Name  : Rahul
Account Type   : Savings
Balance        : ₹10000.00
```

---

## Invalid Transaction Example

```text
----------- WITHDRAW MONEY -----------

Enter Account Number: 1001
Enter Amount: 15000

Transaction failed!
Insufficient balance.

Available Balance: ₹10000.00
```

---

## Invalid Account Example

```text
Enter Account Number: 9999

Account not found!
Please enter a valid account number.
```

---

## Exit

```text
========================================
Thank you for using Banking Management System!
Have a great day.
========================================
```

---

# 🎯 Learning Objectives

This project was developed to strengthen practical knowledge of Core Java and Object-Oriented Programming.

Through this project, the following skills were practiced:

* Designing classes and objects
* Applying OOP principles
* Managing data using collections
* Implementing banking operations
* Validating user input
* Handling exceptions
* Reading and writing data using files
* Building a structured console application

---

# 🔮 Future Improvements

The project can be extended with the following features:

* MySQL database integration
* JDBC connectivity
* Java Swing / JavaFX GUI
* User login and authentication
* PIN / password protection
* Transaction history
* Admin dashboard
* Account deletion
* Account statement generation
* Interest calculation
* REST API integration using Spring Boot

---

# 👨‍💻 Author

**Sandra Mounish**

GitHub:
https://github.com/YOUR-USERNAME

---

## ⭐ Project Purpose

This project was created as a **Java learning and portfolio project** to demonstrate practical knowledge of Core Java, OOP, collections, exception handling, and file handling.
