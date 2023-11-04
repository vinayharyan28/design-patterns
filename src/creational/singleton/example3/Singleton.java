package creational.singleton.example3;

/**
 * In the context of the Singleton design pattern, "double locking" is a technique used to improve the performance and efficiency of creating a single instance of a class while ensuring thread safety.
 * The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.
 * When multiple threads attempt to access the Singleton instance simultaneously, there is a potential for race conditions, which can lead to the creation of multiple instances or other unexpected behavior.
 * To address this issue, double locking is used to make sure that only one instance of the Singleton is created even in a multithreaded environment.
 * The volatile keyword is used to ensure that the instance variable is properly synchronized among threads. It prevents the scenario where one thread reads a partially initialized instance due to instruction reordering by the compiler.
 * By using double locking, the Singleton pattern provides both lazy initialization (the instance is created only when needed) and thread safety (ensuring only one instance is created even in a multithreaded context).
 * This is a common approach for implementing Singletons in languages with multi-threading support.
 * */

public class Singleton {
    private volatile static Singleton instance;

    private Singleton(){
        System.out.println("Private constructor to prevent external instantiation.");
    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
