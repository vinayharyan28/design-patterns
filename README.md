# **Creational design pattern**
* **Abstract Factory**: 
_Abstract factory is a design pattern that falls under the creational design patterns category.
It provides an interface for creating families of related or dependent object without specifying their concrete classes.
It allows you to create objects that belong to a particular family or group and ensure that these objects are compatible with each other._

* **Factory**:
_The Factor method is a design pattern that falls under the category of creational design patterns.
It provides an interface for creating objects but allows subclasses to alter type of objects that will be created.
This pattern is useful when you want to create objects without specifying the exact class of object that will be created until runtime._

* **Builder**:
_The builder design pattern in java is creational design pattern that is used to construct complex object step by step.
it separates the construction of an object from its representation, allowing you to create different variations of an object without altering its class.
this pattern is particularly useful when dealing with objects that have a large number of optional attributes or configurations._

* **Prototype**:
_The prototype design pattern is a creational design pattern that is used to create new objects by copying an existing object, known as prototype.
This pattern is particularly useful when creating objects is more efficient by cloning an existing object rather than creating them from scratch, especially when the cost of initialization is high_

* **Singleton**:
_The singleton design pattern is a creational design pattern that restricts the instantiation of a class to a single instance and provides a global point of access to that instance.
It ensures that there is only one instance of a particular class in the system and provides a way to access that instance from any part of the application._
  1. _Private constructor: The Singleton class typically has a private constructor to prevent direct instantiation of the class from outside. this ensures that no other instance of the class can be created._
  2. _Private instance variable: The singleton clas usually contains a private static variable to hold the single instance of the class._
  3. _Static method for access: A public static method is provided to allow clients to access the single instance of the class. this method creates the instance if it doesn't exist or returns the existing instance._
  4. _Lazy initialization: The singleton instance is often lazily initialized, meaning it is created only when it is first requested. This helps improve performance and resource usage._

  
# **Structural design pattern**
* **Adapter**:
_The Adapter design pattern is a structural pattern that allows objects with incompatible interfaces to work together.
It acts as a bridge between two incompatible interface, making them work together without modifying their source code.
In java, adapters are commonly used to make existing classes work with others without modifying their source code._


# **Behavioral design pattern**
