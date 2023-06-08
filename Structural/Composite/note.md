# Composite

Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects

### :mag: Components
Component: an interface describes operations that are common to bothsimple and complex elements of the tree
Leaf: a basic element of a tree, doing the real work
Container: an element that has sub-elements: leaves or other containers without knowing its children's class
Client: works with all elements through the component interface

### :key: Usecase
- when you have to implement a tree-like object structure
- when you want the client code to treat both simple and complex elements uniformly

### :memo: Pros and Cons
:white_check_mark: you can work with complex tree structures more conveniently, using polymorphism and recursion

:white_check_mark: Open/Closed Principle: you can add a new elements easily

:x: it's difficult to provide a common interface for classes whose functionality differs too much
