# Bug Simulation

## Problem 3 – Bug Simulation

### Overview
In this project, you will simulate the growth and control of a bug population using Java. You will build a `Bug` class and demonstrate its functionality through a `BugTester` class.

### Requirements

#### `Bug` Class
- Store the current bug count as an integer.
- Implement a constructor that initializes the bug count.
- Include a method `breedBugs()` that doubles the current bug count.
- Include a method `sprayBugs()` that reduces the bug count by 25%. Cast the result to an integer.
- Implement a method `getBugCount()` that returns the current bug count.

#### `BugTester` Class
- Initialize your simulation with a starting count of 10 bugs.
- Execute the following cycle three times:
  - Breed bugs once.
  - Spray bugs three times.
  - After spraying three times, print the current bug count.

### Example Simulation Cycle
```
Initial Bug Count: 10
Cycle 1:
  Breed → Spray → Spray → Spray → Print Bug Count
Cycle 2:
  Breed → Spray → Spray → Spray → Print Bug Count
Cycle 3:
  Breed → Spray → Spray → Spray → Print Bug Count
```

### Purpose
This exercise will help you practice:
- Class and object creation in Java.
- Basic arithmetic operations.
- Method implementation and usage.
- Iterative logic with loops.

### Usage
Run your `BugTester` Java class to execute the simulation and observe the bug count after each simulation cycle.

