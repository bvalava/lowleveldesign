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