package behavioral.mediator.example1;

/**
 The Mediator design pattern is behavioral design pattern that promotes loose coupling among components in a system.
 It's used to reduce the direct communication between components and instead centralize control through a design pattern. Mediator object.
 This pattern is particularly and instead centralize control through a design pattern.mediator object.
 This pattern is particularly helpful when you a complex system with many interconnected components, and you want to avoid the spaghetti-like connections that can arise from direct communication between components.

 1. Mediator: This is an interface or an abstract class that defines the communication interface between the components. it provides methods for components to send and receive message, effectively acting as an intermediary.
 2. Concrete Mediator: This is a specific implementation of the design pattern. Mediator interface. it manages the relationships and communication between components. it is aware of all the concrete components and how they should interact.
 3. Colleague Components: these are individual components in the system. they are often decoupled from each other and communicate with the design pattern. Mediator instead of directly with each other. Colleagues know about the design pattern. Mediator, but they don't need to know about other colleagues.
 */

public interface ChatMediator {
    void sendMessage(String message, User user);
}
