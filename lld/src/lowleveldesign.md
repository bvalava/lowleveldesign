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

Single Responsibility principle: 

Class should have only one reason to change the implementation.

In the invoice example, every class has just a single reason to change the implementation. Every class is segregated
to change for one single reason

Use of single responsibility principle:

- Easy to maintain
- Easy to understand

Open/closed principle:

This principle follows the open for extension and closed for modification

In the invoice example, whenever there is any future implementation to save a file in any other DB or storage we can
create other class and implement the solution. So this helps the class that is already implemented doesn't go through
modification. New class helps for extension of implementation.

Liskov substitution principle:

If class B is subtype of class A, then we should be able to replace object of A with B without breaking the behaviour 
of the program. Subclass should extend the capability of parent class not narrow it down.

In the Bike example, there is engine and accelerate methods, Motorcycle can extend the capability of parent but cycle class narrows
it down

The above issue can be solved by segregating the class. Parent class/interface should have generic method which serves for all types 
of vehicle and child classes should extend/implement the necessary methods in hierarchy.

Interface segregation principle:

The class should not implement unnecessary functions that they do not need.

In the Restaurant example, interfaces are segregated such that each individual has specific roles to do instead of classes implemented
all the unwanted methods.

Dependency Inversion principle:

Classes should depend on interfaces rather than concrete classes.

In the Macbook example, I have used the interfaces so that in future if there are any different types of keyboard or mouse being used
we can easily construct the object with different types of keyboard or mouse.
