# Abstract Factory

Abstract Factory is a creational pattern that lets you produce families of related objects without specifying their concrete classes.

### :mag: Components
- Abstract factory - defines an interface for creating all distinct products
- Concrete factory - corresponds to one certain product variety
- Abstract product - expresses related family of products
- Concrete product - has one corresponding factory to communicate with client
- Client - calls the creation methods of a factory object instead of creating products directly.

### :key: Usecase
- when code needs to work with various families of related products
- when you are not sure which product will be created beforehand

### :memo: Pros and Cons
:white_check_mark: Single Responsibility Principle: extract product creation code into one place

:white_check_mark: Loose coupling between concrete products and client code

:white_check_mark: Open/Closed Principle: add new variants without breaking client code

:x: Code may become more complicated with a lot of interfaces, classes
