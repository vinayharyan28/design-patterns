# **Creational design pattern**
_These design patterns provide a way to create object while handing the creation logic, rather than instantiating objects directly using new operator. this gives program more flexibility in deciding which objects need to be created for given use cases._

* **Abstract Factory**: 
_Abstract factory is a design pattern that falls under the creational design patterns category.
It provides an interface
  for creating families of a related or dependent object without specifying their concrete classes.
It allows you to create objects that belong to a particular family or group
  and ensure that these objects are compatible with each other._

* **Factory**:
_The Factor method is a design pattern that falls under the category of creational design patterns.
It provides an interface for creating objects but allows subclasses to alter a type of objects that will be created.
This pattern is useful when you want to create objects without specifying the exact class of object that will be created until runtime._

* **Builder**:
_The builder design pattern in java is a creational design pattern
  that is used to construct complex object step by step.
it separates the construction of an object from its representation,
  allowing you to create different variations of an object without altering its class.
this pattern is particularly useful
  when dealing with objects that have a large number of optional attributes or configurations._

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
_Structural design patterns are a category of design patterns in software engineering this focus on how classes and objects are composed to form larger structure and relationships between them. they help in defining how different parts of a system can work together to create a cohesive and flexible architecture. structural design patterns primarily deal with object composition, making it easier to change the structure of a system without altering its individual components._
* **Adapter**:
_The Adapter design pattern is a structural pattern that allows objects with incompatible interfaces to work together.
It acts as a bridge between two incompatible interfaces, making them work together without modifying their source code.
In java, adapters are commonly used to make existing classes work with others without modifying their source code._

* **Bridge**:
_The Bridge design pattern is a structural design pattern that is used to separate an object's abstraction from its implementation so that both can be modified independently without affecting each other.
it is a way to decouple an abstraction from its concrete classes, making it easier to add new functionality or variations without changing the exiting code.
The Bridge pattern promotes flexibility and extensibility in your software design._
  1. _Abstraction: this is the interface or abstract class that defines the high-level logic or behavior. it contains a reference to the implementor and defines methods that delegate the implementation to the implementor._
  2. _Refined Abstraction: this i a subclass of the Abstraction. it can provide additional method or customization on top of the basic Abstraction._
  3. _Implementor: This is the interface or abstract class that defines the methods that the concrete implementors must implement. it represents the low-level, platform-specific code._
  4. _Concrete implementor: these are the classes that implement the implementor interface. they contain the platform-specific code invoked by the abstraction and refined abstraction._

* **Composite**:
_The composite design pattern is a structural design pattern that allows you to compose objects into tree structure to represent part-whole hierarchies.
It lets you treat individual objects and compositions of objects uniformly.
This pattern is used to create hierarchical structures of objects where clients can treat individual objects and compositions of objects in uniform way.
The composite pattern allows you to build complex structures using simple building blocks(individual objects) and to treat these structures uniformly_
  1. _Component: This is the base interface or abstract class that defines the common interface for all concrete objects and their compositions. it typically includes operations that are common to both leaf and composite objects._
  2. _Leaf: This is a class that implements the component interface but represents individual objects that do not have any child objects. these are the "leaf" nodes in the tree structure._
  3. _Composite: This is a class that implements the component interface and can contain a collection of child components, which can be either leaf or composite objects. composites have methods for adding, removing, and accessing child components._

* **Decorator**:
_The decorator design pattern is a structural design pattern that allows you to dynamically add behaviors or responsibilities to objects without altering their code.
This pattern is used to extend the functionality of classes in a flexible and reusable way.
Decorator pattern is commonly used to modify the behavior of objects, often in a cascading or layered manner._
  1. _Component (or Interface): This is the core interface or abstract class that defines the common methods and attributes that concrete components and decorators must implement. it represents the base object you want to extend._
  2. _Concrete component: This is a concrete implementation of the component interface. it provides the basic functionality and can be extended by decorators._
  3. _Decorator: The decorator is an abstract class or interface that also implements the component interface. it has a reference to a component and can modify the behavior of the component by adding new methods or overriding existing methods._
  4. _Concrete Decorator: These are concrete classes that extend the decorator class. each concrete decorator adds specific behavior to the component. decorators can be stacked to combine multiple functionalities_

* **Facade**:
_The facade design pattern is a structural design pattern.
It provides a simplified and unified interface to set of interfaces in a subsystem, making it easier for clients to interact with that subsystem.
Essentially, it acts as higher-level interface that hides the complexities of the subsystem, allowing clients to work with the subsystem in a more straightforward manner.
The Facade pattern is useful in various scenarios, including when you want to:_
  1. _Provide a simple and unified interface to a complex system._ 
  2. _Encapsulate the complexities of a subsystem to reduce client code dependencies on it._
  3. _Promote decoupling between the client code and the subsystem, making it easier to change or replace part of the subsystem without affecting the clients._

* **Flyweight**:
_The flyweight design pattern is a structural design pattern used in software engineering to reduce the memory usage or computational overhead of an object by sharing as much as possible with similar objects.
This pattern is particularly useful when you need to create a large number of similar objects efficiently._
  1. _Flyweight interface/class: define an interface or abstract class that represents the common properties and methods that can be shared among multiple objects. This class usually has some intrinsic state (shared data) and extrinsic state (context-dependent data) that can be passed as method parameters._
  2. _Concrete Flyweight class: create implementations of the flyweight class that represent the intrinsic state of objects. These objects should be shared among multiple context to minimize memory usage._
  3. _Flyweight Factory: create a factory class that manages the creation and sharing of flyweight objects. This factory class maintains a pool of flyweight objects and provides a way to retrieve these objects based on the extrinsic state. it ensures that there is only one instance of each unique intrinsic state._

* **Proxy**:
_The proxy design pattern is a structural design pattern that provides a surrogate or placeholder for another object to control access to it.
In other words, it acts as an intermediary or representative of the real object and allows you to add an additional layer of control or functionality when accessing the real object.
The proxy object. The proxy object can be seen as a go-between, intercepting requests and performing tasks like lazy loading, access control, logging and caching.
The proxy design pattern is typically used in scenarios when want to control or monitor access to an object, or when you want to defer the creation and initialization of the real object until it is actually needed, which is known as lazy initialization._

  1. _Subject Interface: This is an interface or abstract class that both the real object and the proxy implement. It defines the common methods that the proxy and real object should have. The subject is what the client code interacts with._
  2. _Real Object (Real Subject): This is the actual object that the proxy represents. It performs the actual work when requested. It's the object you want to control or add functionality to, and it implements the subject interface._
  3. _Proxy Object: The proxy object has the same interface as the real object, so it can be used in place of the real object. It contains a reference to the real object. The proxy may intercept calls to the real object to perform additional tasks before or after forwarding the call to the real object._


# **Behavioral design pattern**
_behavioural design patterns deal with the interaction and communication between objects and classes. These patterns focus on how objects collaborate to achieve specific behaviours and responsibilities, providing solutions to common challenges in designing and managing complex systems. Behavioural design patterns help ensure that the objects within a system interact in a flexible, efficient, and maintainable way_

* **Chain of responsibility:**:
_The chain of responsibility is a behavioral design pattern that is used to pass requests along a chain of handlers.
Each handler decides either to process the request or to pass it to the next handler in the chain.
This pattern decouples the sender and receiver of a request and allows multiple objects to handle the request without the sender needing to know which object ultimately process it._
  1. _**Participants:**_
      _**Handler Interface/Abstract Class:**_ _This is an interface or an abstract class that declares a method to handle requests. It often contains a reference to the next handler in the chain (a successor), either directly or via a setter method._
      _**Concrete Handlers:**_ _These are classes that implement the handler interface or extend the handler abstract class. They provide concrete implementations of the request handling method. If they can't handle the request, they pass it to the next handler in the chain._
      _**Client:**_ _The client is responsible for creating the chain of handlers and initiating the request. The client doesn't need to know which handler will process the request._


* **Command:**
_The command design pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing you to parameterize clients with queues, requests, and operations.
This pattern allows you to decouple the sender and receiver of a request and provides a way to support undoable operations.
It's particularly useful when you need to implement feature like macros, queuing requests, or logging requests.
The command design pattern promotes loose coupling between the invoker and the receiver, making it easy to add new commands and receivers without modifying existing code.
It also enables features like undo and redo, logging, and more._