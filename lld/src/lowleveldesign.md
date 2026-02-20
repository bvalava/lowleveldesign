SOLID principles

S - Single Responsibility principle
O - Open/closed principle
L - Liskov substitution principle
I - Interface segregation principle
D - Dependency Inversion principle

Uses:
- Avoid Duplicate code
- Easy to maintain
- Easy to understand
- Flexible software
- Reduce complexity

**Single Responsibility principle:** 

Class should have only one reason to change the implementation.

In the invoice example, every class has just a single reason to change the implementation. Every class is segregated
to change for one single reason

Use of single responsibility principle:

- Easy to maintain
- Easy to understand

**Open/closed principle:**

This principle follows the open for extension and closed for modification

In the invoice example, whenever there is any future implementation to save a file in any other DB or storage we can
create other class and implement the solution. So this helps the class that is already implemented doesn't go through
modification. New class helps for extension of implementation.

**Liskov substitution principle:**

If class B is subtype of class A, then we should be able to replace object of A with B without breaking the behaviour 
of the program. Subclass should extend the capability of parent class not narrow it down.

In the Bike example, there is engine and accelerate methods, Motorcycle can extend the capability of parent but cycle class narrows
it down

The above issue can be solved by segregating the class. Parent class/interface should have generic method which serves for all types 
of vehicle and child classes should extend/implement the necessary methods in hierarchy.

**Interface segregation principle:**

The class should not implement unnecessary functions that they do not need.

In the Restaurant example, interfaces are segregated such that each individual has specific roles to do instead of classes implemented
all the unwanted methods.

**Dependency Inversion principle:**

Classes should depend on interfaces rather than concrete classes.

In the Macbook example, I have used the interfaces so that in future if there are any different types of keyboard or mouse being used
we can easily construct the object with different types of keyboard or mouse.

**Strategy Design pattern**

This design pattern comes into picture when there is existence of duplicate code in child classes. Consider a scenario, where multiple child classes need to implement a capability which is not present in parent class. In that case, this code should be implemented in multiple child classes which increases duplication.
Strategy design pattern solves the duplication issue by implementing the generic interface and that interface will be implemented multiple classes which needs its specific capability

**Observer Design Pattern**
This design pattern has two categories, observable and observer. Whenever there is a change of state in observable it will notify to all observers. For example, whenever there is a change in temperature the weather station which is observable will notify to TV's, mobiles etc. which are observers.

**Decorator Design pattern**
This Design pattern is used when you want to decorate the base object. So basically, if you want to add new features on the top of already existing object decorator pattern will come into play. Example is Pizza, on pizza object you can add any number of toppings. Here toppings can be called decorators.

**Factory Design Pattern**
This is a creational design pattern, it helps in encapsulating the object creation logic within a separate class known as factory. It avoids creation of same object in multiples classes. This pattern provides loose coupling and enhances code organization and maintainability by centralizing object instantiation. 

**Abstract Factory Design Pattern**
It is called as Factories of factory. It has one more object on top of factory object. 
Example: You want to design a system to create cars with specific configurations for different regions, such as North America and Europe.
         Each region may have unique requirements and regulations, and you want to ensure that cars produced for each region meet those standards.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Striver notes**

**Single Responsibility Principle:** 
A class should have only one reason to change. This means that class should have only one job, one responsibility, one purpose.

Real life analogy - Restaurant (Waiters, chefs, Reception, security each have single different role)

Benefits:
 Easier to maintain
 Improved test coverage
 Low risk in changes
 Reusable modules

**Open Closed principle**
Software entities(classes, modules and functions) should be open for extension but closed for modification. 

This means that the behavior of a module can be extended without modifying its source code. The goal is to reduce the risk of breaking existing functionality when requirements change.

Real life analogy - Adapter

**Liskov Substitution principle**
If S is a subtype of T, then objects of type T may be replaced with objects of type S without altering the correctness of the program.
This means that any subclass should be substitutable for its parent class without breaking the functionality.

Think of it like this:
If you write code using a parent class (say Shape), and later swap in a child class (using the child class object in place of the parent class object) (like Circle), the code should still work without errors or unexpected behavior.
If the subclass changes behavior in a way that breaks expectations, it violates LSP

Example: Notification

**Interface Segregation Principle**
It says: "Don't force a class to depend on methods it does not use."

Understanding

Suppose you order an Uber. You're just a rider — you only care about booking rides, tracking the driver, and paying. You don't care about picking up passengers, verifying driver's licenses, or managing earnings — that's for drivers!
But what if the app gave you one massive interface with everything — rider features and driver features? It would be confusing, right?

That's exactly what ISP helps prevent in software.

**Dependency Inversion principle**
"High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions."

In simpler words, Rather than high-level classes controlling and depending on the details of lower-level ones, both should rely on interfaces or abstract classes. This makes your code flexible, testable, and easier to maintain.

**Association(USE-A)**

Association represents a general relationship between two classes where one class uses or interacts with another. It can be: one-to-one, one-to-many or many-to-many.
Example: A teacher can teach multiple students, and a student can be taught by multiple teachers (many-to-many association).
UML Notation: A solid line between the two classes.

**Aggregation (HAS-A)**

Aggregation is a "whole-part" relationship where a class is made up of one or more classes, but those parts can exist independently.
Example: A Department has multiple Professors. If the department is removed, the professors still exist.
UML Notation: A hollow diamond at the container (whole) class.

**Composition (Strong HAS-A)**

Composition is a stronger form of aggregation where the part cannot exist without the whole. It is a "whole-part" relationship where the part is dependent on the whole.
Example: A House has Rooms. If the House is destroyed, so are the Rooms.
UML Notation: A filled diamond at the whole side.

**Inheritance (IS-A)**

Inheritance defines an IS-A relationship where a subclass inherits properties and behavior from a superclass. The subclass can extend or override the superclass's attributes and methods.
Example: A Dog is an Animal.
UML Notation: A solid line with a filled triangle pointing to the parent class.

**Realization (Implementation)**

Realization is the relationship between a class and an interface. The class agrees to implement the behavior declared by the interface.
Example: A Circle class implements the Shape interface.
UML Notation: A dashed line with a filled triangle pointing to the interface.

**Dependency**

Dependency indicates that a class uses another class temporarily. Changes to the used class may affect the dependent class.
Example: OrderService depends on PaymentService to process payments.
UML Notation: A dashed line with an open arrow pointing to the class being used.

**Creational Design Patterns**

**Singleton**

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance.

In simpler terms:
Imagine you're building an application where you only want one shared object throughout the lifecycle of the program. This is where Singleton comes into play — it restricts object creation and guarantees that all parts of your application use the same object.

The Problem It Solves
In a typical application, creating multiple objects of a class might not be problematic. However, in certain scenarios — like logging, configuration handling, or managing a database connection — you want just one instance to avoid redundancy, excessive memory use, or inconsistent behavior.

**Factory**

The Factory Pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.

In simpler terms:
Rather than calling a constructor directly to create an object, we use a factory method to create that object based on some input or condition.

When Should You Use It?
We can use the Factory Pattern when:
The client code needs to work with multiple types of objects.
The decision of which class to instantiate must be made at runtime.
The instantiation process is complex or needs to be controlled.

**Builder**

The Builder Pattern is a creational design pattern that separates the construction of a complex object from its representation. This allows you to create different types and representations of an object using the same construction process.

Formal Definition:
"Builder pattern builds a complex object step by step. It separates the construction of a complex object from its representation, so that the same construction process can create different representations."

In simpler terms:
Imagine you're ordering a custom burger. You choose the bun, patty, toppings, sauces, and whether you want it grilled or toasted. The chef follows your instructions step by step to build your custom burger. This is what the Builder Pattern does — it lets you construct complex objects by specifying their parts one at a time, giving you flexibility and control over the object creation process.

**Abstract Factory**

The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.

In simpler terms:
You use it when you have multiple factories, each responsible for producing objects that are meant to work together.

**Prototype**

The Prototype Pattern is a creational design pattern used to clone existing objects instead of constructing them from scratch. It enables efficient object creation, especially when the initialization process is complex or costly.

Formal Definition: 
"Prototype pattern creates duplicate objects while keeping performance in mind. It provides a mechanism to copy the original object to a new one without making the code dependent on their classes."

**Adapter**

The Adapter Pattern allows incompatible interfaces to work together by acting as a translator or wrapper around an existing class. It converts the interface of a class into another interface that a client expects.

It acts as a bridge between the Target interface (expected by the client) and the Adaptee (an existing class with a different interface). This structural wrapping enables integration and compatibility across diverse systems.

**Decorator**

The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, dynamically at runtime, without affecting the behavior of other objects from the same class.

It wraps an object inside another object that adds new behaviors or responsibilities at runtime, keeping the original object's interface intact.

**Facade**

The Facade Pattern is a structural design pattern that provides a simplified, unified interface to a complex subsystem or group of classes.

It acts as a single entry point for clients to interact with the system, hiding the underlying complexity and making the system easier to use.

**Composite**

The Composite Pattern is a structural design pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

**Proxy**

The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it.

A proxy acts as an intermediary that implements the same interface as the original object, allowing it to intercept and manage requests to the real object.

**Bridge**

The Bridge Pattern is a structural design pattern that is used to decouple an abstraction from its implementation so that the two can vary independently.

**Flyweight**

The Flyweight Pattern is a structural design pattern used to minimize memory usage by sharing as much data as possible with similar objects.

It separates the intrinsic (shared) state from the extrinsic (unique) state, so that shared parts of objects are stored only once and reused wherever needed.

**Iterator**

The Iterator Pattern is a behavioral design pattern that provides a way to access the elements of a collection sequentially without exposing the underlying representation.

Formal Definition
The Iterator Pattern is a behavioral design pattern that entrusts the traversal behavior of a collection to a separate design object. It traverses the elements without exposing the underlying operations.

This means whether your collection is an array, a list, a tree, or something custom, you can use an iterator to traverse it in a consistent manner, one element at a time, without worrying about how the data is stored or managed internally.

**Observer**

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object (the subject) changes its state, all its dependents (called observers) are notified and updated automatically.

Formal Definition
The Observer Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of dependents (observers) and notifies them of any state changes, usually by calling one of their methods.

This means if multiple objects are watching another object for updates, they don’t need to keep checking repeatedly. Instead, they get notified as soon as something changes — making the system more efficient and loosely coupled.

**Strategy**

The Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one into a separate class, and makes them interchangeable at runtime depending on the context.

Formal Definition
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime by defining a set of strategies (algorithms), each encapsulated in its own class, and making them interchangeable via a common interface.

It is primarily focused on changing the behavior of an object dynamically, without modifying its class. This promotes better organization of related algorithms and enhances code flexibility and scalability.

**Command**

The Command Pattern is a behavioral design pattern that turns a request into a separate object, allowing you to decouple the code that issues the request from the code that performs it.

Formal Definition
The Command Pattern is a behavioral design pattern that encapsulates a request as an object, allowing for parameterization of clients with different requests, queuing of requests, and logging of the requests. It lets you add features like undo, redo, logging, and dynamic command execution without changing the core business logic.

This allows you to execute commands at a later time, in a flexible manner, without having to interact directly with the request's execution details.

**Template Method**

The Template Pattern is a behavioral design pattern that provides a blueprint for executing an algorithm. It allows subclasses to override specific steps of the algorithm, but the overall structure remains the same. This ensures that the invariant parts of the algorithm are not changed, while enabling customization in the variable parts.

**State**

The State Pattern is a behavioral design pattern that encapsulates state-specific behavior into separate classes and delegates the behavior to the appropriate state object. This allows the object to change its behavior without altering the underlying code.

This pattern makes it easy to manage state transitions by isolating state-specific behavior into distinct classes. It helps achieve loose coupling by ensuring that each state class is independent and can evolve without affecting others.

**Chain Of Responsibility**

The Chain of Responsibility Pattern is a behavioral design pattern that transforms particular behaviors into standalone objects called handlers. It allows a request to be passed along a chain of handlers, where each handler decides whether to process the request or pass it to the next handler in the chain.

This pattern decouples the sender of a request from its receivers, giving multiple objects a chance to handle the object.

**Visitor**

The Visitor Pattern is a behavioral design pattern that lets you add new operations to existing class hierarchies without modifying the classes themselves. This is achieved by moving the logic of the operation into a separate class, known as the "visitor".

The main advantage of the Visitor Pattern is that it allows you to decouple operations from the objects on which they operate, enabling you to add new operations without changing the classes that contain the objects. This promotes Open-Closed Principle (OCP), as new functionality can be added without modifying existing code.

**Mediator**

The Mediator Pattern is a behavioral design pattern that centralizes complex communication between objects into a single mediation object. It promotes loose coupling and organizes the interaction between components.

Instead of objects communicating directly with each other, they interact through the mediator, which helps simplify and manage their communication.

**Momento**

The Memento Pattern is a behavioral design pattern that allows an object to capture its internal state and restore it later without violating encapsulation. It is especially useful when implementing features like undo/redo or rollback.

Key Components
This pattern defines three key components:

Originator: The object whose internal state we want to save and restore.
Memento: A storage object that holds the snapshot of the originator’s state.
Caretaker: The object responsible for requesting the memento and keeping track of it. It neither modifies nor examines the contents of the memento.

**LLD of parking lot**

Step 1:

    Functional Requirements:
        
        Entry flow:
            1. Vehicles arrive at gate
            2. Generate ticket and assign slot based on vehicle type
            3. Mark slot as occupied
            4. Return entry response 

        Exit flow:
            1. Present ticket
            2. Calculate fee using pricing rules (flat vs hourly)
            3. Process payment
            4. Release slot
            5. Return exit response with receipt

        Admin Configurations:
            1. Add/Edit/Delete floors and slots
            2. Define/update pricing rules
            3. View parking lot status

    Edge cases:
        Payment failure at exit
        Lost ticket
        System clock mismatch
        Slot marked occupied wrongly

Step 2:
    
    Identify core entities:
        
        Vehicle
        ParkingSlot
        Floor
        Ticket
        Receipt
        PricingRule
        Payment
        
    DTOs:
        
        EntryResult
        ExitResult

Step 3:

    Discuss interaction flow

    Entry flow:
        Vehicle arrives
        Slot allocated
        Ticket generated
        Slot marked as occupied

    Exit Flow
        Ticket scanned
        Fee calculated
        Payment processed (with retries)
        Receipt generated
        Slot released
        Ticket deactivated

    Admin Flow
        Add floor
        Add slot
        Update pricing

Step 4: 
    
    Defines Class Structures & Relationships