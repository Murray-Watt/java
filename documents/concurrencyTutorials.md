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


