# Simple Student Management System (Java CLI)

A basic command-line application to manage students. You can:
- Add a new student
- Search for a student by ID
- List all students

## Project Structure
```
student-management/
  └── src/
      ├── Student.java
      └── StudentManagementSystem.java
```

## Requirements
- Java 17+ (or Java 8+, if you change the `--release` flag accordingly)

## How to Compile
From the project root:
```bash
javac --release 17 -d out src/*.java
```

This compiles sources into the `out/` directory.

## How to Run
From the project root:
```bash
java -cp out studentmanagement.StudentManagementSystem
```

## Notes
- Data is stored in memory only (no files or databases).
- Keep it simple: just a small example to demonstrate OOP, `ArrayList`, and basic input handling.