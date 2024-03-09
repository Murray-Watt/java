#Java Explained: Concurrency in Java
Murray Watt 2024-03-08

## Thread Synchronization

Techniques used to coordinate the execution of threads to avoid conflicts
and ensure data consistency. This includes mechanisms like locks, semaphores, and barriers.

## Parallelism vs. Concurrency

Understanding the difference between these two concepts. Parallelism involves executing
multiple tasks simultaneously, while concurrency involves making progress on multiple tasks
over a period of time.

## Deadlocks and Race Condition

Common issues in concurrent programming. Deadlocks occur when two or more threads are
waiting for each other to release resources, while race conditions occur when the outcome
of a program depends on the timing or interleaving of threads.

## Thread Safety

Ensuring that data shared between threads is accessed in a way that avoids conflicts
and maintains data integrity. This often involves using synchronization mechanisms
like locks or atomic operations.

## Futures and Promises

Mechanisms for asynchronous programming, where a future represents a value that may not
yet be available, and a promise is used to set the value of the future.

Futures: Futures are used to represent a value that may become available in the future.
They provide a way to retrieve the result of an asynchronous operation once it completes.
Futures typically have methods to check if the operation is complete (isDone()),
wait for the result (get()), and handle completion or failure (addListener() or handle()).

Promises: Promises are used to set the value of a future. They represent the producer side
of an asynchronous operation, where the result is produced. Promises provide methods to set
the value of the promise (fulfill()) or indicate failure (reject()). Once a promise is
fulfilled or rejected, its associated future can retrieve the result.

Java does not have a built-in Promise class in its standard library, but it does have similar
functionality provided by the CompletableFuture class introduced in Java 8. CompletableFuture
can be used to represent an asynchronous computation and provide a way to retrieve the result
once it is complete.

CompletableFuture can be used to create a promise-like object that allows you to set the result
of the computation using methods like complete() and completeExceptionally(),
and retrieve the result using methods like get() and join().

While CompletableFuture is not exactly the same as promises in other languages or libraries,
it provides similar functionality and can be used to achieve similar results in Java.

## Actor Model

A concurrency model where actors are independent units of computation that communicate
by sending messages to each other. This model can help manage concurrency by isolating state
and avoiding shared mutable state.

## CountDownLatch
[CountDownLatchTest.java](../src/test/java/org/mwatt/tutorial/concurrency/CountDownLatchTest.java)

CountDownLatch is a synchronization aid that allows one or more threads to wait until a set of
operations being performed in other threads completes.

## CyclicBarrier
[CyclicBarrierTest.java](../src/test/java/org/mwatt/tutorial/concurrency/CyclicBarrierTest.java)

CyclicBarrier is a synchronization aid that allows a set of threads to wait at a barrier
until all threads in the set have reached the barrier.

## Runnable
[RunnableTest.java](../src/test/java/org/mwatt/tutorial/concurrency/RunnableTest.java)

Runnable is an interface that package a section of code (task, job) that can be executed/run.

## Executor (Java 8)
Executor is an interface that provides a way of decoupling task submission from the mechanics
of how each task will be run. It separates the task running from how it is run (synchronously,
thread, pool of threads, etc.)

ExecutorTest.java


## ExecutorService
[ExecutorServiceTest.java](../src/test/java/org/mwatt/tutorial/concurrency/ExecutorServiceTest.java)

ExecutorService extends Executor and provides additional methods for managing and interacting
with the executor and its tasks. You can think of ExecutorService as a more feature-rich
version of Executor that adds task management and control capabilities.

Some common implementations include:

* ThreadPoolExecutor: This class provides an ExecutorService implementation that manages
  a pool of threads. You can configure the core pool size, maximum pool size, keep-alive
  time, and the work queue. Tasks are executed using threads from the pool, and if the pool
  is full, tasks are placed in the work queue.

* ScheduledThreadPoolExecutor: This class extends ThreadPoolExecutor and provides support
  for scheduling tasks to run at a specific time or periodically. It adds methods like
  schedule(Runnable command, long delay, TimeUnit unit) and scheduleAtFixedRate(Runnable
  command, long initialDelay, long period, TimeUnit unit) for scheduling tasks.

* Executors.newFixedThreadPool(int nThreads): This is a factory method that returns a new
  ExecutorService with a fixed number of threads. Tasks are executed using threads from the
  fixed-size pool.

* Executors.newCachedThreadPool(): This is a factory method that returns a new ExecutorService
  with an unbounded thread pool. Threads are created as needed and reused if available,
  or terminated if unused for a certain period.

These classes provide different strategies for executing tasks asynchronously and managing
threads, allowing you to choose the one that best fits your application's requirements.

## Future
[FutureTest.java](../src/test/java/org/mwatt/tutorial/concurrency/FutureTest.java)

Future represents the result of an asynchronous computation. It provides methods for
checking if the computation is complete, waiting for the result, and canceling the computation.

## Semaphore
[SemaphoreTest.java](../src/test/java/org/mwatt/tutorial/concurrency/SemaphoreTest.java)

Semaphore class is used for managing execution permits. 
A semaphores contains fixed number of permits, and threads can acquire and release permits. 
Semaphores are often used to control access to a shared resource.

The semaphore con be set to fair or unfair mode. In fair mode, the semaphore guarantees
that threads acquire permits in the order they requested them. In unfair mode, there is no
guarantee of the order in which threads acquire permits.

## Thread, Joining (thread.join), Forking (thread.start), Sleep (Thread.sleep)
[ThreadTest.java](../src/test/java/org/mwatt/tutorial/concurrency/ThreadTest.java)

When you create a thread by instantiating the Thread class directly,
you typically create a new instance of Thread and pass a Runnable object to its constructor.

This approach gives you control over the properties of the thread, such as its name, 
priority, and whether it's a daemon thread. However, it can be more verbose, especially if you need to customize each thread you create.

- threadStartAndJoin
- threadInterrupt
- threadJoin
- joinAll
- threadSleep

## ThreadFactory
[ThreadFactoryTest.java](../src/test/java/org/mwatt/tutorial/concurrency/ThreadFactoryTest.java)

Using a ThreadFactory allows you to centralize the logic for creating threads, 
making your code more modular and easier to maintain. You can also use custom ThreadFactory implementations 
to create threads with specific behaviors, such as setting thread names or customizing thread properties.

## BlockingQueue
[BlockingQueueTest.java](../src/test/java/org/mwatt/tutorial/concurrency/BlockingQueueTest.java)

BlockingQueue is designed to provide thread-safe access to a queue that may become empty 
or full at different points in time. Its blocking behavior serves several purposes:

### Synchronization

BlockingQueue ensures that threads can safely add to or remove from the queue 
without interference from other threads. This is crucial for multithreading applications where 
data consistency is important.

### Producer-Consumer Pattern

BlockingQueue is commonly used in scenarios 
where there are one or more producers adding elements to the queue and one or more consumers 
removing elements from it. The blocking behavior allows consumers to wait for new elements 
to be added if the queue is empty, and producers to wait if the queue is full.

###  Backpressure: 

By blocking when the queue is full, producers can be regulated to prevent 
overwhelming consumers. This can help manage resource usage and prevent memory 
or resource exhaustion.

### Efficiency
BlockingQueue's blocking operations are more efficient than constantly 
polling the queue for changes. Threads are only woken up when there is a change 
in the queue's state, reducing unnecessary CPU usage.

Overall, the blocking behavior of BlockingQueue helps in coordinating the activities 
of producer and consumer threads, ensuring that they can efficiently and safely exchange 
data without the need for explicit synchronization mechanisms.

## DelayQueue
[DelayQueueTest.java](../src/test/java/org/mwatt/tutorial/concurrency/DelayQueueTest.java)

Examples demonstrating the use of the DelayQueue class, which is a specialized queue 
implementation for managing elements that have an associated delay for their retrieval.

Examples demonstrating the use of the DelayQueue class, which is a specialized queue implementation
for managing elements that have an associated delay for their retrieval.
 
Having a delay associated with elements in a queue can be useful in various scenarios, such as:

1. **Task Scheduling**: DelayQueue can be used to schedule tasks to run after a certain delay. This is useful for scenarios where tasks need to be executed after a specific time interval, such as periodic tasks, timeouts, or scheduled events.

2. **Event Scheduling**: In event-driven programming, DelayQueue can be used to schedule events to occur at a future time. This can be useful for implementing timers, alarms, or other time-sensitive operations.

3. **Rate Limiting**: DelayQueue can be used to implement rate limiting by delaying the processing of elements until a certain rate limit is met. This can help control the rate of processing to prevent overwhelming a system.

4. **Cache Expiration**: DelayQueue can be used to implement a cache with expiration policies. Elements can be added to the queue with an expiration time, and expired elements can be removed from the queue when they are retrieved.

5. **Retry Mechanism**: DelayQueue can be used to implement a retry mechanism for failed operations. Failed operations can be added back to the queue with a delay, allowing them to be retried after a certain interval.

Overall, the ability to associate a delay with elements in a queue adds flexibility and control to the management of tasks and events in a concurrent application.

## Synchronized

The `synchronized` keyword in Java is used to create a block of code called a synchronized block. This block of code can be accessed by only one thread at a time, ensuring that the operations inside the block are atomic and thread-safe.

## Usage

### Synchronized Methods

You can use the `synchronized` keyword to define a method as synchronized, 
which means only one thread can execute the method at a time, even if the 
method is called by multiple threads concurrently.

```java
public synchronized void synchronizedMethod() {
  System.out.println("This is a synchronized code block");
    println("This is a synchronized method");
}
```
### Synchronized Blocks
You can also use the synchronized keyword to create a synchronized block within a method. 
This allows you to synchronize only a specific portion of the method's code, 
rather than the entire method.

```java
  public void synchronizedMethod() {
      // Non-synchronized code

      synchronized(this) {
          System.out.println("This is a synchronized code block");
      }

      // Non-synchronized code
  }
  ```
### Synchronized at class level

Class-level synchronization in Java works by using the synchronized 
keyword with a class object. When you declare a method as static synchronized, 
or use synchronized block with the class object, it ensures that only one thread can 
execute any synchronized method of the class at a time across all instances of the class.

Static Synchronized Methods: When you declare a method as static synchronized,
it means that the method is synchronized at the class level. This means that only one thread 
can execute any static synchronized method of the class at a time. Other threads trying 
to execute any static synchronized method of the class will be blocked until the 
current thread releases the lock.
```java
public class MyClass {
  public static synchronized void staticSynchronizedMethod() {
    // Class level synchronized method
  }
}
```

Synchronized Blocks with Class Object: You can also use a synchronized 
block with the class object (MyClass.class) to achieve class-level synchronization. 
This is useful when you want to synchronize a specific block of code within a method 
at the class level.

### Purpose
The purpose of using synchronized in Java is to provide a simple 
and effective way to synchronize access to shared resources in a 
multithreading environment. By using synchronized blocks or methods, 
you can prevent race conditions and ensure that critical sections of code are executed by only one thread at a time, maintaining data integrity and avoiding thread interference.

### Considerations
While synchronized provides a convenient way to synchronize access to shared resources, 
it can also introduce performance overhead, especially in highly concurrent applications. 
It's important to use synchronized judiciously and consider other synchronization mechanisms, 
such as java.util.concurrent classes, for more complex synchronization requirements.

```java
public class MyClass {
    public void someMethod() {
        synchronized (MyClass.class) {
          println("This is a synchronized code block");
        }
    }
}
```

In both cases, the synchronization is at the class level, 
meaning that it applies to all instances of the class. When a thread 
enters a static synchronized method or a synchronized block with the class object, 
it acquires a lock on the class object. Other threads trying to enter any static 
synchronized method or synchronized block with the class object will be blocked 
until the lock is released.

It's important to note that class-level synchronization affects all instances 
of the class and can potentially introduce contention if multiple threads are 
accessing static synchronized methods or synchronized blocks with the class 
object simultaneously. Care should be taken to design the synchronization strategy 
to minimize contention and avoid deadlocks.

### Double-Checked Locking for Singleton Initialization

The double-checked locking pattern is a technique used to lazily initialize a singleton 
instance in a multithreading environment while minimizing synchronization overhead. 
It involves checking if the singleton instance is null, and if so, acquiring a lock to 
synchronize the creation of the instance. However, before creating the instance, 
it performs another null check inside the synchronized block to ensure that the instance
has not been initialized by another thread that acquired the lock simultaneously.

### Implementation

```java
public class MySingleton {
    private static volatile MySingleton instance;
    private static final Object syncObject = new Object();

    private MySingleton() {
        // Private constructor to prevent instantiation
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (syncObject) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }

        return instance;
    }
}
```

In this implementation, the volatile keyword is used for the instance variable 
to ensure that changes to the variable are immediately visible to other threads. 
The syncObject is used as a synchronization object to prevent multiple threads 
from creating the singleton instance simultaneously. The double-checked locking 
ensures that only one instance of the singleton is created, even in a multithreading
environment.

## Phaser
[PhaserTest.java](../src/test/java/org/mwatt/tutorial/concurrency/PhaserTest.java)

# Phasers in Java

Phasers in Java are synchronization barriers that allow threads to coordinate their execution at multiple points. 
They are more flexible than other synchronization constructs like CountDownLatch and CyclicBarrier because 
they support dynamic addition and removal of parties (threads) and can be used for synchronization in multiple phases.

## Purpose
The main purpose of a Phaser is to coordinate the execution of threads
that need to wait for each other at synchronization points. 
Threads can register with a Phaser and wait for other threads to arrive at the same synchronization 
point before proceeding. This is useful in scenarios where threads need to synchronize their execution in stages or phases.

Phasers can also be used for parallel tasks where different parts of a computation can be done in parallel, 
and then the results combined after all parts are complete.

### Lifetime
The lifetime of a Phaser starts when it is created and ends when it is no longer referenced. 
Phasers can be reused for multiple synchronization operations by resetting them using the `Phaser#reset` method. 
Once a Phaser is reset, it can be used again for a new set of synchronization operations.

### Usage
Phasers are created using the `new Phaser()` constructor and can be used to coordinate the execution of multiple threads. 
Threads register with a Phaser using the `Phaser#register` method and wait for other threads using methods like `Phaser#arriveAndAwaitAdvance`. Once all registered parties have arrived at a synchronization point, the Phaser advances to the next phase, and the threads can proceed with the next phase of their execution.

Phasers can also be used in a try-with-resources statement to ensure that the Phaser is properly terminated after its use.

```
// Try with resources
try (Phaser phaser = new Phaser()) {
    // Use the phaser here
}
```

Overall, Phasers provide a flexible and powerful synchronization mechanism for coordinating the execution of threads in Java.

### How Phasers Work
In Java's Phaser class, a thread determines whether it needs to wait or not based on the current phase of the Phaser 
and the number of registered parties that have arrived at a synchronization point. Here's a basic overview of how this works:

Arrival at a Synchronization Point: When a thread arrives at a synchronization point (using methods like 
arriveAndAwaitAdvance()), it checks the current phase of the Phaser.

Checking for Completion: The thread checks if all registered parties have arrived at the synchronization point. 
If all parties have arrived, the Phaser advances to the next phase, and the thread can proceed with the next phase of its execution without waiting.

Waiting for Other Parties: If not all parties have arrived at the synchronization point, the thread needs to wait. 
It enters a waiting state until the remaining parties arrive.

Signaling Completion: When all parties have arrived and the Phaser advances to the next phase, 
the waiting threads are notified, and they can proceed with the next phase of their execution.

The Phaser class manages the synchronization and signaling of threads, ensuring that threads wait only 
when necessary and proceed when all required parties have arrived at a synchronization point.

The Phaser class provides methods for threads to arrive at a phase and wait for other parties (arriveAndAwaitAdvance()), 
as well as methods for advancing to the next phase (arriveAndDeregister()), and for determining when all parties have 
arrived (getArrivedParties()). This flexible synchronization mechanism allows threads to coordinate their execution 
and progress together through a series of phases.





