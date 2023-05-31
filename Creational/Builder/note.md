# Builder

Builder is a creational design pattern that lets you construct complex and various types of objects step by step using the same code.

## :mag: Components
- Builder: declares product construction steps that are common to all types of builders
- Concrete Builder: implements different construction steps
- Product: may be constructed in a way that the resulting object does not belong to the same class hierarchy or interface
- Director: defines the order in which to call construction steps
- Client: associates one of the builder with the director
## :key: Usecase
- when you want to get rid of a "telescoping constructor"
- when you want to be able to create different representations of some various product
- when you want to construct complex objects, such as Composite trees

## :memo: Pros and Cons
:white_check_mark: you can construct objects step by step, defer construction steps or run steps recursively

:white_check_mark: you can reuse the same construction code when building various representations of procuts

:white_check_mark: Single Responsibility Principle. You can isolate complex construction code from the business logic of the product

:x: Code may become more complicated with a lot of interfaces, classes
