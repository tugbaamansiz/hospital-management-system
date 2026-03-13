# Hospital Management System (Java)

This project is a simple hospital management system developed in Java.  
It demonstrates how different data structures can be used together to manage hospital workflows efficiently.

## Project Purpose
The goal of this project is to simulate a hospital environment where patients are registered, queued for treatment, and discharged while maintaining efficient data access and processing.

## Data Structures Used

### Patient List
All registered patients are stored in a PatientList structure.  
This list allows adding, removing and searching patients.

Time Complexity:
- Add patient → O(1)
- Remove patient → O(n)
- Find patient → O(n)

### Treatment Queue
The treatment system uses a **Queue (FIFO)** structure.

This ensures that patients are treated in the order they arrive.

Operations:
- enqueue → O(1)
- dequeue → O(1)

### Discharge Records
A **Stack (LIFO)** structure is used to store discharged patient records.

This allows the system to quickly access the most recently discharged patient.

Operations:
- push → O(1)
- pop → O(1)

### Patient Lookup
A **HashMap** is used to store patient references for fast searching.

Time Complexity:
- patient lookup → O(1)

This allows the system to quickly retrieve patient information without scanning the entire patient list.

## System Components

Main classes used in the project:

- Patient.java
- PatientList.java
- TreatmentQueue.java
- TreatmentRequest.java
- DischargeStack.java
- DischargeRecord.java
- HospitalSystem.java

## Features

- Patient registration
- Patient search
- Treatment request queue
- Treatment processing
- Discharge record management

## Technologies

- Java
- Object Oriented Programming
- Data Structures (Stack, Queue, HashMap, List)

  ## Project Report

You can read the detailed project report here:

[Hospital System Project Report](docs/hospital-system-report.pdf)


## Author

Tuğba Amansız  
Computer Engineering Student
