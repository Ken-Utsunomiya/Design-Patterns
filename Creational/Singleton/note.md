# Singleton

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance

### :mag: Components
Singleton: declares the static method getInstance that returns the same instance of its own class 

### :key: Usecase
- when a class in your program should have just a single instance available to all clients, such as a single database object shared by different parts of the program 
- when you need stricter control over global variables

### :memo: Pros and Cons
:white_check_mark: You can be sure that a class has only a single instance

:white_check_mark: You can gain a global access point to the instace

:x: It violates Single Responsibility Principle, solving two problems at the time

:x: It can mask bad design, such as components know too much about each other

:x: It requires special treatment in a multi-threaded environment

:x: It can be difficult to unit test
