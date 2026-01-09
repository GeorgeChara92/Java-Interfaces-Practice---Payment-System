# 💳 Java Interfaces Practice – Payment System

## 📌 Overview

This project is a **Java console application** built as a learning exercise to practice **interfaces, polymorphism, and clean code structure**. It simulates a simple payment system where different payment methods can be used interchangeably through a common contract.

This project is part of my learning journey toward building backend applications with **Spring Boot**.

---

## 🎯 Learning Objectives

- Understand **what interfaces are** and **why they are used**
- Learn how to depend on **behaviour, not implementation**
- Practice **polymorphism** using interface types
- Handle **user input** safely using `Scanner`
- Write Java code that mirrors real-world backend design

---

## 🧠 Key Concept: Interfaces

The core idea of this project is that the main application:

- Does **not care** how a payment is processed
- Only cares that a payment **can** be processed

Each payment method implements the same interface, allowing the application to switch behaviour without changing its core logic.

This is a fundamental principle used heavily in **Spring Boot dependency injection**.

---

## ⚙️ How the Application Works

1. The user selects a payment method
2. The user enters an amount to pay
3. The payment is processed using the selected implementation
4. The program validates input and retries on invalid options

---
## 🗂️ Project Structure

```
src/
├── Main.java
├── IPaymentProcessor.java
├── CreditCardPayments.java
├── PayPalPayments.java
├── INotificationSender.java
├── EmailNotificationSender.java
└── SMSNotificationSender.java
```



### File Responsibilities

- **Main.java**  
  Handles user interaction and program flow. Depends only on the interface.

- **IPaymentProcessor**  
  Defines the contract for processing payments.

- **CreditCardPayments**  
  Implements credit card payment logic.

- **PayPalPayments**  
  Implements PayPal payment logic.

---

## ▶️ Running the Project

1. Clone the repository
2. Open the project in your IDE (IntelliJ / Eclipse / VS Code)
3. Run `Main.java`
4. Follow the console prompts

---

## 🚀 Possible Future Improvements

- Add additional payment methods (e.g. Apple Pay)
- Replace `if` logic with a factory pattern
- Add input validation and exception handling
- Convert this console app into a **Spring Boot REST API**
- Add unit tests

---

## 📘 Notes

This project intentionally avoids frameworks to focus on **core Java fundamentals** before moving on to Spring Boot.  
All design choices are made to reinforce clean, maintainable backend patterns.

