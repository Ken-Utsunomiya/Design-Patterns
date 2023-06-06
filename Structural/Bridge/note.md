# Bridge

Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other

### :mag: Components
Abstraction: provides high-level control logic, which contains Implementation interface
Implementation interface: declares the interface that is commmon for all concrete implementations
Concrete Implementations: contain platform-specific code
Refined Abstractions: provide variants of control logic
Client: works with Abstraction

### :key: Usecase
- when you want to divide and organize a monolithic class that has several variants of some functionality
- when you need to extend a class in several independent dimensions
- when you need to be able to switch implementations at runtime

### :memo: Pros and Cons
:white_check_mark: Single Responsitiblity Principle: you can separate high-level logic in Abstraction and platform details in Implementaitions

:white_check_mark: Open/Closed Principle: you can add new abstractions and implementations independently from each other

:white_check_mark: Client only works with Abstraction, not with platform details

:x: program gets more complex
