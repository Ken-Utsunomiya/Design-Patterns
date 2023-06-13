# Chain of Responsibility

Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain

### :mag: Components
Handler: declares the interface of all concrete middlewares, usually containing a single method for handling a incoming request
Base Handler: an optional handler where the boilerplate code for all handler classes is placed
Concrete Handlers: contains the actual code to process a request and decide if the request is passed down the chain further
Client: composes chain once or dynamically

### :key: Usecase
- when your program is expected to process different kinds of requests in various ways, but the exact types of requests and their sequences are unknown beforehand
- when it’s essential to execute several handlers in a particular order
- when the set of handlers and their order are supposed to change at runtime

### :memo: Pros and Cons
:white_check_mark: you can control the order of request handling

:white_check_mark: Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations

:white_check_mark: Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code

:x: some requests may end up unhandled
