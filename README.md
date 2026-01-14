# HapifyMe UI Automation Project 🖥️

A Java-based **UI automation project** demonstrating automated testing for the HapifyMe application, covering login, registration, posts, and profile editing.

---

## 🌟 Overview

This project is part of my portfolio and showcases my skills in:

- **UI test automation** using **Selenide** (via Maven project)  
- Behavior-driven development (**BDD**) with **Cucumber**  
- Page Object Model (POM) design pattern for maintainable tests  
- Dynamic test data generation with a **TestData utility class**  
- HTML reporting for test results  

The project covers core user interactions on the web application:

1. **Login**  
   - Successful and failed login scenarios  
   - Scenario Outline with multiple invalid credential examples  
   - LoginSteps uses **LoginPage** (POM) for all locators and interactions  

2. **Registration**  
   - Successful registration and failure cases for missing required fields  
   - Scenario Outline with dynamic, generated names, emails, and passwords  
   - Validates browser error messages for missing fields  

3. **Post Creation**  
   - Test creating a new post on the feed  
   - Verifies that the new post displays correctly with timestamp "Just now"  

4. **Profile Editing**  
   - Update first and/or last names using Scenario Outline with multiple examples  
   - Verifies success messages after updating profile fields  

---

## 💡 Highlights

- Clear **project structure** with `features`, `stepdefinitions`, `pages`, `runners`, and **Hooks** for setup/teardown  
- Reusable **Page Objects** and step definitions for maintainable automation  
- Dynamic test data generation for realistic and repeatable tests  
- HTML reports for easy visualization of test results  
- Demonstrates **BDD-style UI test automation** and solid understanding of front-end interactions  

---

## 📂 Project Structure

- `features/` → Cucumber feature files (Login, Register, Post, Profile)  
- `stepdefinitions/` → step implementation classes for each feature  
- `pages/` → Page Object Model classes (LoginPage, HomePage, ProfilePage)  
- `runners/` → Test runners for executing features  
- `utils/` → Helper classes (TestData, Config, etc.)  
- `pom.xml` → Maven dependencies and build configuration  

---

This project is a concrete example from my portfolio that demonstrates **how I design maintainable, BDD-style UI automation tests for web applications**. 
