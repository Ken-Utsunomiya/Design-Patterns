# Adapter

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate

### :mag: Components
Client: a class containing the existing business logic of the program
Client Interface: describes a protocol that other classes must follow to be able to collaborate with the client code
Service: a class (usually 3rd-party) that cannot be used by clientdirectly because it has an incompatible interface
Adapter: a class that implements the client interface and wraps the service object

### :key: Usecase
- when you want to use some existing class but its interface is not compatible with the rest of your code 
- when you want to re-use several existing subclasses that lack some common functionality that cannot be added to the superclass

### :memo: Pros and Cons
:white_check_mark: Single Responsitiblity Principle: you can separate the interface or data conversion code from the primary business logic of the program

:white_check_mark: Open/Closed Principle: you can add a new adapter easily

:x: program gets more complex
