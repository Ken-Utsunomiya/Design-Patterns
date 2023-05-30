# Factory Method

Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. 

## :mag: Components
- Product: defines an interface that is common to all objects produced by the creator and its subclasses
- Concrete Product: implements the product interface
- Creator: declares the factory method that returns new product objects
- Concrete Creator: overrides the base factory method so it returns a different type of product

## :key: Usecase
- when you don't know beforehand the exact types of and dependencies of the objects your code should work with
- when you want to provide users of your library or framework with a way to extend its internal components
- when you want to save system resources by reusing existing objects instead of rebuilding them each time

## :memo: Pros and Cons
:white_check_mark: Single Responsibility Principle: extract product creation code into one place

:white_check_mark: Loose coupling between concrete products and client code

:white_check_mark: Open/Closed Principle: add new variants without breaking client code

:x: Code may become more complicated with a lot of interfaces, classes
