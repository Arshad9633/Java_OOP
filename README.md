 Car Management System

## Project Description
This Java project is a simple car management system. It demonstrates object-oriented programming principles by creating a hierarchy of vehicle-related classes, including `Vehicle`, `Car`, and `SUV`. The application can handle different types of cars, focusing on their transmission type (manual or automatic) and basic movement functionalities.

## How to Run

### Prerequisites
- Java JDK installed

### Compilation
To compile the project, navigate to the project directory and run the following command:
This command compiles all the Java files and generates the corresponding `.class` files.

### Execution
After compiling, run the application with the following command:
This will start the program and display the output in the console.

## Project Structure

### App.java
The entry point of the application. It creates instances of the `SUV` class and demonstrates their functionalities.

### Vehicle.java
Defines the base class `Vehicle` with basic attributes like name, current speed, and current direction. It includes methods for basic vehicle operations like `move` and `steer`.

### Car.java
Extends `Vehicle` and introduces additional attributes relevant to cars, such as the number of wheels, doors, gears, and whether the car is manual or automatic. It includes methods to change gears and speed.

### SUV.java
A subclass of `Car`, representing an SUV type of vehicle. It includes specific implementations for acceleration and a method to print whether the car is manual or automatic in uppercase letters.

## Notes
- Ensure Java JDK is properly installed and configured on your system.
- Modify the code according to your requirements and project specifications.
