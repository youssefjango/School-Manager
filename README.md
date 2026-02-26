# School Department Manager

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Java Swing](https://img.shields.io/badge/Frontend-Java_Swing-007396?style=for-the-badge&logo=java)
![Persistence](https://img.shields.io/badge/Database-Custom_Text_I%2F0-4CAF50?style=for-the-badge)
![JUnit5](https://img.shields.io/badge/Testing-JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Gradle](https://img.shields.io/badge/Build-Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed_Academic_Project-blueviolet?style=for-the-badge)

**Academic Project** | Vanier College 
**Course:** Data Structures and Algorithms 
**Semester:** Spring 2023 

---

## 📖 Project Overview

The **School Department Manager** is a desktop application designed to streamline administrative tasks at an academic institution. Built as a comprehensive final project for a Data Structures and Algorithms course, it emphasizes object-oriented programming (OOP), custom algorithmic implementations, and manual state management.

The system allows administrators to manage personnel across multiple departments (English, Music, Natural Science, and Social Science), compute dynamic payrolls based on educational credentials and workloads, and perform complex data sorting using custom-built algorithms.

## ✨ Key Features

* **Comprehensive Personnel Management**: Add, remove, and update records for Teachers, Staff, and Deans. The system validates entries to prevent logical errors (e.g., age-to-experience ratio, unique ID constraints across the entire school).
* **Automated Payroll Engine**: Implements a `PayRoll` interface that polymorphically calculates compensation based on the employee's role (Full-time Teacher, Part-time Teacher, or Staff), their highest degree, and weekly hours.
* **Custom Sorting Algorithms**: Instead of relying exclusively on built-in standard libraries, this project features a custom implementation of the **MergeSort** algorithm. Coupled with the Strategy Pattern (via `Comparator` classes), users can sort employee data by ID, Name, Age, Salary, or Hours Worked.
* **Department Sandboxing**: Isolates data by department while maintaining a global check to ensure an employee does not hold conflicting roles in different departments.

## 🛠️ Tech Stack & Architecture

### Front End
* **Java Swing**: The entire graphical user interface is built from scratch using Java Swing, featuring interactive tables, multi-panel navigation, and form validation to provide a seamless desktop experience.

### Persistence Layer
* **Custom Text-File Engine**: To demonstrate a fundamental understanding of data serialization, this project intentionally avoids external database libraries (like SQL/JDBC). Instead, it uses a custom persistence component.
* **DataConvertor**: A dedicated utility class that handles File I/O operations, deserializing `.txt` formatted pseudo-tables into Java Objects at runtime, and serializing the application state back to text files upon saving.

### Data Structures & Algorithms
* **Object-Oriented Design**: Heavily utilizes encapsulation, inheritance (Abstract `Person` → `Teacher` / `Staff` → `Dean`), and interfaces.
* **Algorithmic Sorting**: Includes a proprietary threshold-based recursive `MergeSort` class.
* **Custom Exception Handling**: Features domain-specific exceptions (`IDInSameSchoolException`, `DeanException`, `InfoException`) to enforce strict business logic and data integrity.

## 📂 Repository Structure

```text
├── Database/                   # Custom persistence layer (.txt files representing tables)
├── src/main/java/
│   ├── Comparators/            # Custom sorting strategies (Age, ID, Name, Salary, Workload)
│   ├── Convertors/             # Data serialization/deserialization logic (DataConvertor.java)
│   ├── Exceptions/             # Custom error handling classes
│   ├── GUI/                    # Java Swing application forms and panels
│   ├── School/                 # Core domain models (Departement, PayRoll interface)
│   ├── Sorters/                # Custom MergeSort algorithm implementation
│   └── Workers/                # OOP entity models (Person, Teacher, Staff, Dean)
├── src/test/java/              # JUnit 5 test suite
└── build.gradle                # Gradle build configuration
```
Getting Started
Prerequisites
Java Development Kit (JDK) 11 or higher.

An IDE that supports Java Swing (e.g., IntelliJ IDEA, Eclipse, or Apache NetBeans).

Execution
Clone this repository to your local machine.

Build the project using your preferred Java build tool or IDE.

Locate the main execution class at src/main/java/GUI/StartHere.java and run it.

Default Login Credentials (Mock Security Gateway):

Username: Adin Ashby

Password: BestTeacher123

Testing
This project includes a suite of JUnit 5 unit tests to validate core business logic, including payroll calculations and object serialization.
To run tests via the command line:

Bash
./gradlew test
🔒 License & Usage
This repository serves solely as a closed academic archive and a personal portfolio to showcase academic progress and algorithmic understanding.
