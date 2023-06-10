# Fllyweight

Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object

### :mag: Components
Flyweight: a class that contains the portion of the original object’s state that can be shared between multiple objects
Context: a class that contains the extrinsic state, unique across all original objects
Complex Subsystem: consists of dozens of various objects
Flyweight Factory: manages a pool of existing flyweights
Client: calculates or stores the extrinsic state of flyweights

### :key: Usecase
- when your program must support a huge number of objects which barely fit into available RAM

### :memo: Pros and Cons
:white_check_mark: you can save lots of RAM

:x: worse CPU cycles

:x: code becomes more complicated
