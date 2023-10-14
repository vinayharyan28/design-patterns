package creational.singleton.example1;

public class Client {
    /*
    * Usage of Singleton pattern can be seen in scenarios where you want to ensure that there's only one instance of a class,
    * such as managing a configuration manger, a database connection pool, a logging service, or a thread pool.
    * It can help control access ot shared resources, maintain global state, or coordinate actions in a centralized way.
    *
    * However, it's important to be cautious when using the singleton pattern because it can lead to tight coupling and global state,
    * Which might make the code harder to test and maintain.
    * Additionally, in multithreaded environment, you need to take care of thread safety to ensure that the singleton instance is created correctly and consistently.
    * Depending on the programming language and the specific use cases, different mechanisms like double-checked locking or enums can be used to ensure thread safety. */
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton);

    }
}
