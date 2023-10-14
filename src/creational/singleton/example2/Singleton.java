package creational.singleton.example2;

// Below is an implementation of the Singleton design pattern
// Which is included the four aspects: a private constructor, a private instance variable, a static method for access, and lazy initialization

public class Singleton {
    private static Singleton instance;
    private Singleton(){

    }

    // public static method to get the single instance with lazy initialization
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

/*
We have a private constructor to prevent direct instantiation of the Singleton class.
The getInstance method is used for accessing the single instance. It uses lazy initialization to create the instance if it doesn't exist.
The synchronized block within the getInstance method ensures that the creation of the instance is thread-safe, preventing multiple threads from creating multiple instances.
The main method demonstrates that multiple calls to getInstance return the same instance, verifying that it adheres to the Singleton pattern.
*/
