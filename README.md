
# 🏦 ATM Management System (Java OOP)

A **console-based ATM application** built using **Core Java and Object-Oriented Programming (OOP) concepts**.  
This project simulates basic ATM functionalities such as account creation, PIN generation, balance checking, cash withdrawal, deposit, and transaction history.

---

## 🚀 Features

- Create a bank account
- Generate ATM PIN
- Check account balance
- Withdraw cash (PIN protected)
- Deposit cash
- Display transaction history
- Display account details
- Menu-driven console interface
- Exit safely

---

## 🧠 OOP Concepts Used

- **Abstraction**  
  Implemented using an abstract class (`ATM`)

- **Inheritance**  
  `BankATM` class extends `ATM`

- **Encapsulation**  
  Account details are protected and accessed via methods

- **Polymorphism**  
  Method overriding in child class (`BankATM`)

- **Constructor Usage**  
  Used for initializing transaction history

---

## 📂 Project Structure

```

ATMProject/
│
├── ATM.java          // Abstract class defining ATM operations
├── BankATM.java     // Implementation of ATM logic
└── Main.java        // Menu-driven execution class

````

---

## 🛠️ Technologies Used

- Java (Core Java)
- OOP Concepts
- Scanner class
- ArrayList

---

## ▶️ How to Run the Project

### Step 1: Clone or Download the Project
```bash
git clone <repository-url>
````

### Step 2: Navigate to Project Folder

```bash
cd ATMProject
```

### Step 3: Compile All Java Files

```bash
javac *.java
```

### Step 4: Run the Application

```bash
java Main
```

---

## 📋 Sample Menu

```
================ ATM MENU ================
1. Generate Pin
2. Check Balance
3. Withdraw Cash
4. Deposit Cash
5. Display Transaction History
6. Create Account
7. Display Account Details
8. Exit
Please select an option:
```

---

## 🔐 Important Notes

* PIN validation is required for cash withdrawal
* Transaction history is stored using `ArrayList`
* This is a **single-user ATM simulation**
* Interfaces are NOT used (only abstract classes)

---

## 🎯 Learning Outcomes

* Clear understanding of Java OOP principles
* Hands-on experience with abstraction and inheritance
* Real-world application design using Java
* Improved problem-solving and coding structure

---

## 🌱 Future Enhancements

* Multiple account support
* File or database storage
* Exception handling
* GUI version using JavaFX or Swing
* Interface-based design

---

## 👨‍💻 Author

**Satwik**
