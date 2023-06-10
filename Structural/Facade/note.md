# Facade

Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes

### :mag: Components
Facade: provides convenient access to a particular part of the subsystem’s functionality
Additional Facade: can be created to prevent polluting a single facade with unrelated features that might make it yet another complex structure
Complex Subsystem: consists of dozens of various objects
Client: uses the facade instead of calling the subsystem objects directly

### :key: Usecase
- when you need to have a limited but straightforward interface to a complex subsystem
- when you want to structure a subsystem into layers

### :memo: Pros and Cons
:white_check_mark: you can isolate your code from the complexity of a subsystem

:x: a facade can become a god object coupled to all classes of an app
