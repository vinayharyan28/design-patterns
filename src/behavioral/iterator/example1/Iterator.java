package behavioral.iterator.example1;


/**
 The Iterator Design Pattern in java is a behavioral pattern that provides a way to access elements of a collection sequentially without exposing the underlying details of the collection.
 It's a common pattern used in java, especially with collections like ArrayList, HashMap, and more.
 The primary goal is to separate the iteration logic from the collection, making it easy to iterate over different types of collections in a consistent manner.

 1. Iterator interface:
    In Java, the Iterator pattern often starts with an 'Iterator' interface.
    This interface defines methods for traversing a collection, typically including method like:
    'next()': Return the next element in the collection.
    'hasNext()': Checks if there are more elements to iterate over.
    (Optionally) 'remove()': Removes the last element returned by 'next()'
 */
public interface Iterator {
    boolean hasNext();
    Object next();
}
