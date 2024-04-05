# Singleton Pattern

A singleton pattern is a design pattern in object-oriented programming that restricts the instantiation of a class to a single instance or object. This pattern is useful when you need to ensure that only one instance of a class exists throughout the entire application lifecycle.
The main characteristics of a singleton pattern are:
A single constructor that is private and prevents instantiation from outside the class.
A static method that returns the unique instance of the class.
The instance of the class is initialized when the static method is called for the first time.
The instance is lazily loaded or instantiated in the initial request to the application.

## Singleton versus Static Class Members (Helper Class)

While singletons and classes with only static members both provide a single point of access to their members, they have some key differences in their design and usage.

### Singleton Pattern

* A singleton class maintains a single instance of itself throughout the entire application lifecycle.
* The singleton pattern ensures that only one instance of the class exists by providing a static method to access that instance.
* Singletons can have both static and non-static members.
* Singletons are more flexible than static classes because they can still use polymorphism and implement interfaces.

### Class with only static members

* A class with only static members does not have any instance members and does not maintain a single instance of itself.
* Static classes can contain only static members, which belong to the class itself rather than to any particular instance.
* Static classes cannot be instantiated, and all their members can be accessed directly using the class name without creating an instance.
* Static classes are more limited in their functionality and cannot take advantage of polymorphism or implement interfaces.

In general, singletons are used when you want to ensure that only one instance of a 

### Singleton Use Cases
Singleton patterns are used in various scenarios in software development. Here are a few specific examples:

#### Logging
When you need a centralized logging system to manage logging across different modules or classes in an application. The singleton pattern ensures that all classes share the same logging instance and write logs to the same file or output stream. Example: Logback or Log4j in Java.

#### Configuration Settings
Storing and accessing application-wide configuration settings. A singleton class can be used to read configuration settings from a file or database at application startup and then provide access to these settings to other classes as needed. Example: java.util.Properties in Java.

#### Caching
To store frequently accessed data or objects to improve performance and reduce the need for repeated database queries or network requests. Example: Guava Cache in Java.
#### Device or Resource Managers
When managing limited resources or hardware devices in an application, such as a printer, a singleton class can ensure that only one instance of the resource manager exists, avoiding potential conflicts or resource leaks. Example: PrinterManager in an application.
#### Factory Classes
Singleton factory classes can be used to create and manage a pool of related objects. The singleton ensures that there is only one instance of the factory, and it can be used to enforce object creation policies, like limiting the number of objects that can be created or managing the lifecycle of those objects. Example: java.util.Calendar in Java.
#### Service Locators
Singleton service locators are used to locate and manage dependencies between different components of an application. Example: Spring Framework in Java.

### Lazy Instantiation Singleton Pattern

Lazy instantiation in a singleton pattern means that the singleton instance is not created when the class loads but instead is created the first time it's needed. This is achieved by checking if the instance already exists within the static getInstance() method. If it doesn't exist, the instance is created, and then it's returned.

Advantages of lazy instantiation over a regular singleton:
1) Memory Efficiency: If the application never requires the singleton class, it will never be instantiated, saving memory.
2) Initialization Time: If the singleton is expensive to create, lazy initialization can improve the startup time of your application by delaying the creation of the singleton until it's needed.
3) Thread-Safety: When implemented correctly, lazy instantiation with double-checked locking can provide thread-safe initialization of the singleton instance in a multi-threaded environment.

Disadvantages of lazy instantiation compared to a regular singleton:
1) Performance: There's a slight overhead of checking if the instance exists every time the getInstance() method is called.
2) Thread-Safety: Incorrect implementation of lazy instantiation can lead to thread-safety issues in a multi-threaded environment.
3) Complexity: Lazy instantiation adds some complexity to the code, which may be unnecessary if the singleton is inexpensive to create or is guaranteed to be used in the application.

### Double-checked Locking

A good practice with a getInstance() method in a LazySingleton is to employ a mechanism known as double-checked locking 
to ensure thread-safe lazy initialization of the singleton instance. 

Here's a detailed breakdown:

private static volatile LazySingleton instance;: The volatile keyword ensures that changes to the instance variable are always visible to other threads. 
This prevents the scenario where one thread has already initialized the instance, but another thread does not see this change and attempts to reinitialize it.

```
    if (instance == null) {
        synchronized (LazySingleton.class) {
            if (instance == null) {
                instance = new LazySingleton();
            }
        }
    }
```

This block of code checks if the instance is null twice, with the second check happening inside a synchronized block. 
This ensures that only one thread enters the synchronized block and creates the instance, even if multiple threads find 
the instance null at the same time.

1) First, the method checks if the instance is null. If it is, it enters a synchronized block that locks on the LazySingleton.class object. 
2) Inside the synchronized block, the method checks again if the instance is null. If it still is, the method creates a new LazySingleton instance.
3) After the double-checked locking, the method returns the instance, which at this point is guaranteed to be either 
the existing singleton instance or a newly created one.

In summary, the double-checked locking in the getInstance() method ensures that the singleton instance is lazily initialized 
in a thread-safe manner, improving the Singleton pattern's performance and memory efficiency while maintaining thread safety.