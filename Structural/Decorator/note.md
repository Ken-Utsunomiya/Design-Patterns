# Decorator

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors

### :mag: Components
Component: declares the common interface for both wrappers and wrapped objects
Concrete Component: a class of objects being wrapped, defining the basic behavior, which can be altered by decorators
Base Decorator: a class of type the component interface that has a filed for referencing a wrapped object
Concrete Decorators: define extra behaviours that can be added to components dynamically, overriding methods of the base decorator and execute their behavior either before or after calling the parent method
Client: can wrap components in multiple layers of decorators

### :key: Usecase
- when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects
- when it’s awkward or not possible to extend an object’s behavior using inheritance

### :memo: Pros and Cons
:white_check_mark: you can extend an object’s behavior without making a new subclass

:white_check_mark: you can add or remove responsibilities from an object at runtime

:white_check_mark: you can combine several behaviors by wrapping an object into multiple decorators

:white_check_mark: Single Responsibility Principle: you can divide a monolithic class that implements many possible variants of behavior into several smaller classes

:x: it's difficult to remove a specific wrapper from the wrappers stack

:x: it’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack

:x: less readable
