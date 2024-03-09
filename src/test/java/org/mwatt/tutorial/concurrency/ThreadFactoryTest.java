package org.mwatt.tutorial.concurrency;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ThreadFactory;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

public class ThreadFactoryTest {


    // Inner class for custom ThreadFactory
    static class CustomThreadFactory implements ThreadFactory {
        private final String namePrefix;
        private final ThreadGroup threadGroup;
        private final Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

        public CustomThreadFactory() {
            this.namePrefix = "ThreadFactory-";
            this.threadGroup = null;
            this.uncaughtExceptionHandler = null;
        }

        public CustomThreadFactory(String namePrefix) {
            this.namePrefix = namePrefix;
            this.threadGroup = null;
            this.uncaughtExceptionHandler = null;
        }

        public CustomThreadFactory(ThreadGroup threadGroup) {
            this.namePrefix = "ThreadFactory-";
            this.threadGroup = threadGroup;
            this.uncaughtExceptionHandler = null;
        }

        public CustomThreadFactory(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.namePrefix = "ThreadFactory-";
            this.threadGroup = null;
            this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        }

        @Override
        public Thread newThread(@NotNull Runnable r) {
            Thread thread = new Thread(threadGroup, r, namePrefix + r.hashCode());
            if (uncaughtExceptionHandler != null) {
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return thread;
        }
    }

    // Support object for tests
    private static final Runnable DUMMY_RUNNABLE = () -> {};

    // Creating a custom ThreadFactory
    @Test
    void createCustomThreadFactory() {
        ThreadFactory customThreadFactory = new CustomThreadFactory();
        assertNotNull(customThreadFactory, "ThreadFactory should not be null");
    }

    // Setting a thread name in a custom ThreadFactory
    @Test
    void setThreadNameInCustomThreadFactory() {
        ThreadFactory customThreadFactory = new CustomThreadFactory("CustomThread");
        assertNotNull(customThreadFactory, "ThreadFactory should not be null");
    }

    // Creating a daemon thread in a custom ThreadFactory
    @Test
    void createDaemonThreadInCustomThreadFactory() {
        ThreadFactory customThreadFactory = new CustomThreadFactory();
        Thread thread = customThreadFactory.newThread(DUMMY_RUNNABLE);
        assertTrue(thread.isDaemon(), "Thread should be daemon");
    }

    // Creating a new thread with a specific priority in a custom ThreadFactory
    @Test
    void createThreadWithSpecificPriorityInCustomThreadFactory() {
        ThreadFactory customThreadFactory = new CustomThreadFactory();
        Thread thread = customThreadFactory.newThread(DUMMY_RUNNABLE);
        assertEquals(Thread.MAX_PRIORITY, thread.getPriority(), "Thread should have maximum priority");
    }

    // Creating a custom ThreadFactory with a specific uncaught exception handler
    @Test
    void createCustomThreadFactoryWithUncaughtExceptionHandler() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (thread, _) ->
                System.err.println(STR."Uncaught exception in thread: \{thread.getName()}");

        ThreadFactory customThreadFactory = new CustomThreadFactory(uncaughtExceptionHandler);
        assertNotNull(customThreadFactory, "ThreadFactory should not be null");
    }

    // Creating a custom ThreadFactory with a specific thread group
    @Test
    void createCustomThreadFactoryWithThreadGroup() {
        ThreadGroup threadGroup = new ThreadGroup("CustomThreadGroup");
        ThreadFactory customThreadFactory = new CustomThreadFactory(threadGroup);
        assertNotNull(customThreadFactory, "ThreadFactory should not be null");
    }

    // Creating a custom ThreadFactory with a custom security context
    @Test
    void createCustomThreadFactoryWithSecurityContext() {
        ThreadFactory customThreadFactory = new CustomThreadFactory();
        assertNotNull(customThreadFactory, "ThreadFactory should not be null");
    }
}
