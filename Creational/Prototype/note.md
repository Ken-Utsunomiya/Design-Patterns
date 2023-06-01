# Prototype

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes

### :mag: Components
Prototype: defines an interface for cloning objects
Concrete Prototype: implements the cloning method, dealing with some edge cases of the cloning process
Client: clones any objects that follow the prototype interface 

### :key: Usecase
- when your code should not depend on the concrete classes of objects that you need to copy
- when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects

### :memo: Pros and Cons
:white_check_mark: You can clone objects without coupling to their concrete classes

:white_check_mark: You can remove repeated initialization

:white_check_mark: You can produce complext objects more conveniently

:white_check_mark: You get an alternative to inheritance when dealing with configuration presets for complex objects

:x: Cloning complext objects that have circular references might be tricky
