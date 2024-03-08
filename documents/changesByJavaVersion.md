# Java Explained: JDK Enhancements by Version

## New to JDK 8 LTS

### Language Features

- **Interface Default and Static Methods (New API):**
    - Static Method
    - Default Method

- **Method References (NLF):**
    - Reference to a Static Method
    - Reference to an Instance Method
    - Reference to an Instance Method of an Object of a Particular Type
    - Reference to a Constructor

- **Optional<T> (NLF):**
    - Creation of the Optional<T>
    - Optional<T> Usage

- **forEach() method in Iterable interface (NLF)**

- **Unicode 8.0 (NLF)**

### IO and Date/Time

- **Java IO improvements (New API / Perf)**

- **Date/Time API (New API)**

### Concurrency

- **Concurrency (New API):**
    - Interface CompletableFuture.AsynchronousCompletionTask (New API)
    - Interface CompletionStage<T>
    - Class CompletableFuture<T>
    - ConcurrentHashMap.KeySetView<K,V>
    - Class CountedCompleter<T>
    - CompletionException

- **java.util.concurrent.ConcurrentHashMap (New API):**
    - forEach methods (forEach, forEachKey, forEachValue, and forEachEntry)
    - search methods (search, searchKeys, searchValues, and searchEntries)
    - a large reduction reduction methods (reduce, reduceToDouble, reduceToLong etc.)
    - miscellaneous methods (mappingCount and newKeySet)

- **java.util.concurrent.atomic (New API):**
    - DoubleAccumulator
    - DoubleAdder
    - LongAccumulator
    - LongAdder

- **java.util.concurrent.ForkJoinPool (New API):**
    - commonPool()
    - ForkJoinTask
    - getCommonPoolParallelism()

- **java.util.concurrent.locks.StampedLock (New API)**

- **ThreadLocal (New API)**

### Streams

- **Stream Creation (New API):**
    - Empty Stream
    - Stream of Collection
    - Stream of Array
    - Stream.builder()
    - Stream.builder()
    - Stream.iterate()
    - range
    - rangeClosed

- **Stream of Primitives (New API):**
    - IntStream
    - LongStream
    - DoubleStream
    - Stream of String
    - Stream of File

- **Referencing a Stream (NLF)**

- **Stream Pipeline (New API):**
    - source
    - intermediate operations
    - terminal operations

- **Lazy Invocation (NLF)**

- **Order of Execution (NLF)**

- **Stream Reduction (New API):**
    - identity
    - accumulator
    - combiner
    - reduce

- **Parallel Streams**

- **Comparison Based Stream Operations:**
    - sorted
    - min and max
    - distinct
    - allMatch, anyMatch, and noneMatch

- **collect:**
    - joining
    - toList
    - toSet
    - toCollection
    - partitioningBy
    - mapping
    - joining
    - toList
    - toSet
    - toCollection
    - partitioningBy

### Functional Interfaces

- **Functional Interfaces java.util.function (New API):**
    - BinaryOperator<T>
    - BiFunction<T, U, R>
    - Consumer<T>
    - Function<T, R>
    - Predicate<T>
    - Supplier<T>
    - UnaryOperator<T>
    - BiConsumer<T, U>
    - BiPredicate<T, U>
    - ToDoubleFunction<T
    - ToDoubleBiFunction<T, U>
    - ToIntFunction<T>
    - ToIntBiFunction<T, U>
    - ToLongFunction<T>
    - ToLongBiFunction<T, U>
    - IntFunction<R>
    - IntToDoubleFunction
    - IntToLongFunction
    - LongFunction<R>
    - LongToDoubleFunction
    - LongToIntFunction
    - DoubleFunction<R>
    - DoubleToIntFunction
    - DoubleToLongFunction
    - ObjDoubleConsumer<T>
    - ObjIntConsumer<T>
    - ObjLongConsumer<T>
    - DoublePredicate
    - IntPredicate
    - LongPredicate
    - DoubleUnaryOperator
    - IntUnaryOperator
    - DoubleBinaryOperator
    - IntBinaryOperator
    - LongBinaryOperator## New to JDK 8 LTS

### Language Features

- **Interface Default and Static Methods (New API):**
    - Static Method
    - Default Method

- **Method References (NLF):**
    - Reference to a Static Method
    - Reference to an Instance Method
    - Reference to an Instance Method of an Object of a Particular Type
    - Reference to a Constructor

- **Optional<T> (NLF):**
    - Creation of the Optional<T>
    - Optional<T> Usage

- **forEach() method in Iterable interface (NLF)**

- **Unicode 8.0 (NLF)**

### IO and Date/Time

- **Java IO improvements (New API / Perf)**

- **Date/Time API (New API)**

### Concurrency

- **Concurrency (New API):**
    - Interface CompletableFuture.AsynchronousCompletionTask (New API)
    - Interface CompletionStage<T>
    - Class CompletableFuture<T>
    - ConcurrentHashMap.KeySetView<K,V>
    - Class CountedCompleter<T>
    - CompletionException

- **java.util.concurrent.ConcurrentHashMap (New API):**
    - forEach methods (forEach, forEachKey, forEachValue, and forEachEntry)
    - search methods (search, searchKeys, searchValues, and searchEntries)
    - a large reduction reduction methods (reduce, reduceToDouble, reduceToLong etc.)
    - miscellaneous methods (mappingCount and newKeySet)

- **java.util.concurrent.atomic (New API):**
    - DoubleAccumulator
    - DoubleAdder
    - LongAccumulator
    - LongAdder

- **java.util.concurrent.ForkJoinPool (New API):**
    - commonPool()
    - ForkJoinTask
    - getCommonPoolParallelism()

- **java.util.concurrent.locks.StampedLock (New API)**

- **ThreadLocal (New API)**

### Streams

- **Stream Creation (New API):**
    - Empty Stream
    - Stream of Collection
    - Stream of Array
    - Stream.builder()
    - Stream.builder()
    - Stream.iterate()
    - range
    - rangeClosed

- **Stream of Primitives (New API):**
    - IntStream
    - LongStream
    - DoubleStream
    - Stream of String
    - Stream of File

- **Referencing a Stream (NLF)**

- **Stream Pipeline (New API):**
    - source
    - intermediate operations
    - terminal operations

- **Lazy Invocation (NLF)**

- **Order of Execution (NLF)**

- **Stream Reduction (New API):**
    - identity
    - accumulator
    - combiner
    - reduce

- **Parallel Streams**

- **Comparison Based Stream Operations:**
    - sorted
    - min and max
    - distinct
    - allMatch, anyMatch, and noneMatch

- **collect:**
    - joining
    - toList
    - toSet
    - toCollection
    - partitioningBy
    - mapping
    - joining
    - toList
    - toSet
    - toCollection
    - partitioningBy

### Functional Interfaces

- **Functional Interfaces java.util.function (New API):**
    - BinaryOperator<T>
    - BiFunction<T, U, R>
    - Consumer<T>
    - Function<T, R>
    - Predicate<T>
    - Supplier<T>
    - UnaryOperator<T>
    - BiConsumer<T, U>
    - BiPredicate<T, U>
    - ToDoubleFunction<T
    - ToDoubleBiFunction<T, U>
    - ToIntFunction<T>
    - ToIntBiFunction<T, U>
    - ToLongFunction<T>
    - ToLongBiFunction<T, U>
    - IntFunction<R>
    - IntToDoubleFunction
    - IntToLongFunction
    - LongFunction<R>
    - LongToDoubleFunction
    - LongToIntFunction
    - DoubleFunction<R>
    - DoubleToIntFunction
    - DoubleToLongFunction
    - ObjDoubleConsumer<T>
    - ObjIntConsumer<T>
    - ObjLongConsumer<T>
    - DoublePredicate
    - IntPredicate
    - LongPredicate
    - DoubleUnaryOperator
    - IntUnaryOperator
    - DoubleBinaryOperator
    - IntBinaryOperator
    - LongBinaryOperator
### Deprecated Or Removed
- Underscore is no longer a valid identifier
- Remove apple.applescript and com.apple packages
- Disable X.509 certificate chains with SHA-1 based signatures
- Remove Launch-Time JRE Version Selection directives: JRE-Version manifest entry and -version: cli option
- Remove the jhat tool
- Remove the JVM TI hprof Agent
- Remove GC Combinations Deprecated in JDK 8
- Deprecate the Concurrent Mark Sweep Garbage Collector
- Remove the Endorsed Standards Override (lib/endorsed) and Extensions (lib/ext) mechanisms from the JRE
- Remove rt.jar from the JRE

### Language
- **Modular System:** Introduces the modular system, which allows developers to create more maintainable and scalable applications.
- **JShell (Tool):** Provides an interactive shell for quickly testing Java code snippets and APIs.
- **Private Interface Methods (NLF):** Allows interfaces to have private methods, improving code organization and reusability.
- **Diamond Operator for Anonymous Inner Classes (NLF):** Allows the use of the diamond operator (`<>`) with anonymous inner classes, reducing verbosity.
- **Try-with-resources Allows Effectively Final Variables (NLF):** Allows effectively final variables to be used in the try-with-resources statement.
- **@SafeVarargs on Private Instance Methods (NLF):** Allows the `@SafeVarargs` annotation to be used on private instance methods.
- **No Deprecation Warnings on Import Statements (NLF):** Prevents deprecation warnings for imported classes or packages.
- **Enhanced Deprecation Policy:** Allows the `@Deprecated` annotation to be marked with `forRemoval` for clearer deprecation.

### API
- **HTTP/2 Client (New API):** Introduces a new HTTP client API that supports HTTP/2 and WebSocket out-of-the-box.
- **Improved Streams (New API):** Enhancements to the Streams API, including new methods for efficient processing of streams.
- **Enhanced Process (New API):** Improvements to the Process API, making it easier to handle and control native processes.
- **Convenience Factory Methods for Collections:** Introduces factory methods for creating immutable collections easily.
- **Time-based Enhancements to CompletableFuture (New API):** Adds timeout and delay methods to CompletableFuture for easier asynchronous programming.
- **More Options to Transform Streams (New API):** Introduces new methods like `dropWhile` and `takeWhile` for transforming streams.
- **Generate Streams (Iterate, ofNullable) (New API):** Provides methods for generating streams from iterators and nullable values.
- **Read-only Collectors (toUnmodifiableList) (New API):** Introduces collectors for creating unmodifiable collections.
- **Optionals Can Be Transformed to Streams (New API):** Allows transforming Optionals to streams for easier processing.
- **Arrays.mismatch (New API):** Returns the index of the first mismatched element in two arrays.
- **System.Logger (New API):** Provides a standard logging API for applications.
- **Stack-Walking API (New API):** Allows laziness and stack-frame filtering for more efficient stack walking.
- **VarHandle API (New API):** Provides a low-level API for performing atomic operations on variables.
- **New Combinators and Lookup Methods for MethodHandle (New API):** Introduces new combinator methods for MethodHandle to simplify code.
- **Update JDK's XML Parser:** Updates the JDK's built-in XML parser to the latest version.
- **OASIS Standard XML Catalog API (New API):** Provides an API for working with XML catalogs based on the OASIS standard.
- **TIFF Support for Image I/O:** Adds support for reading and writing TIFF images using the Image I/O API.
- **ResourceBundle Loads as UTF-8:** Resource bundles are now loaded using UTF-8 encoding by default.
- **CLDR Locale Data Enabled by Default:** Enables the Common Locale Data Repository (CLDR) locale data by default.
- **Desktop Features for All Platforms (New API):** Introduces new APIs for desktop interactions, such as login/logout/lock event listeners and taskbar interactions.
- **MultiResolutionImage (New API):** Provides support for images with multiple resolutions.
- **HiDPI Graphics on Windows and Linux (New API):** Adds support for High DPI graphics on Windows and Linux.
- **Enable GTK 3 on Linux for JavaFX, Swing, and AWT (New API):** Adds support for GTK 3 on Linux for JavaFX, Swing, and AWT applications.
- **Replace @beaninfo Javadoc Tags with @BeanInfo Annotations for Swing (New API):** Changes the way bean information is specified for Swing components.
- **Update GStreamer Included in JavaFX/Media to Version 1.4.4 (New API):** Updates the GStreamer library used in JavaFX/Media to the latest version.
- **Replace Existing ICU OpenType Font-Layout Engine with HarfBuzz (New API):** Replaces the ICU OpenType font-layout engine with the HarfBuzz library for improved text rendering.

### XML and Data Handling
- **Update JDK's XML Parser:** Updates the JDK's built-in XML parser to the latest version.
- **OASIS Standard XML Catalog API (New API):** Provides an API for working with XML catalogs based on the OASIS standard.
- **TIFF Support for Image I/O:** Adds support for reading and writing TIFF images using the Image I/O API.
- **ResourceBundle Loads as UTF-8:** Resource bundles are now loaded using UTF-8 encoding by default.
- **CLDR Locale Data Enabled by Default:** Enables the Common Locale Data Repository (CLDR) locale data by default.

### Desktop and Graphics
- **Desktop Features for All Platforms (New API):** Introduces new APIs for desktop interactions, such as login/logout/lock event listeners and taskbar interactions.
- **MultiResolutionImage (New API):** Provides support for images with multiple resolutions.
- **HiDPI Graphics on Windows and Linux (New API):** Adds support for High DPI graphics on Windows and Linux.
- **Enable GTK 3 on Linux for JavaFX, Swing, and AWT (New API):** Adds support for GTK 3 on Linux for JavaFX, Swing, and AWT applications.
- **Replace @beaninfo Javadoc Tags with @BeanInfo Annotations for Swing (New API):** Changes the way bean information is specified for Swing components.
- **Update GStreamer Included in JavaFX/Media to Version 1.4.4 (New API):** Updates the GStreamer library used in JavaFX/Media to the latest version.
- **Replace Existing ICU OpenType Font-Layout Engine with HarfBuzz (New API):** Replaces the ICU OpenType font-layout engine with the HarfBuzz library for improved text rendering.

### Performance and Security
- **Space-efficient, Compact Strings:** Stores Latin-1 only strings more efficiently, reducing memory consumption.
- **Code Caches Separated for Profiled and Non-profiled Compiled Code:** Improves performance and memory footprint by separating code caches.
- **Store Interned Strings in Class-Data Sharing Archives:** Reduces memory consumption by storing interned strings in class-data sharing archives.
- **Security Manager Performance Improvements:** Improves the performance of the security manager.
- **Spin-Wait Hint (Thread#onSpinWait):** Provides a hint to the runtime that the thread is in a spin-waiting style loop, optimizing performance.
- **Use Marlin Renderer in Java 2D as the Default Graphics Rasterizer:** Improves graphics rendering performance in Java 2D applications.
- **Improved GHASH and RSA Performance:** Leverages recently-introduced CPU instructions for improved GHASH and RSA performance.
- **Improved Performance of Contended Object Monitors:** Improves the performance of contended object monitors

### Deprecated Or Removed JDK 9
- Underscore is no longer a valid identifier.
- Removed apple.applescript and com.apple packages.
- Disabled X.509 certificate chains with SHA-1 based signatures.
- Removed Launch-Time JRE Version Selection directives: JRE-Version manifest entry and -version: CLI option.
- Removed the jhat tool.
- Removed the JVM TI hprof Agent.
- Removed GC Combinations Deprecated in JDK 8.
- Deprecated the Concurrent Mark Sweep Garbage Collector.
- Removed the Endorsed Standards Override (lib/endorsed) and Extensions (lib/ext) mechanisms from the JRE.
- Removed rt.jar from the JRE.

## New to JDK 10
### Local Variable Type Inference (var)
### Enhanced Optional Class
### Application Class-Data Sharing
### var for local variables
java.util.Locale and related APIs
Application Class-Data Sharing to improve startup time and reduce footprint by sharing class metadata between Java processes.
Thread-Local Handshakes (Perf)
Parallel Full GC to improve worst-case latencies
Default set of root Certification Authority (CA) certificates are provided with the JDK, so TLS connections are working out of the box (Security)
Simpler Version-String Scheme. (Version Scheme)
### Deprecated Or Removed
- var is no longer a valid class name
- Remove the javah tool

## JDK 11 LTS
### HTTP Client Standard
### Nest-Based Access Control
### var for lambdas (NLF)
### TLS 1.3 Support
### Epsilon Garbage Collector
### Flight Recorder is part of OpenJDK (Perf)
Standard HTTP Client featuring HTTP/2, WebSocket support and non-blocking API
String enhancements, like isBlank, lines, repeat and strip
Unicode 10.0
Improved intrinsics for java.lang.Math sin, cos and log functions on AArch64 processors (LIB)
SerialGC, ParallelGC and ZGC now supports String Deduplication (Perf)
Low-Overhead Heap Profiling via JMTI (Perf)
TLS 1.3 support (Security)
Key Agreement with Curve25519 and Curve448 (Security)
ChaCha20 and Poly1305 Cryptographic Algorithms (Security)
Launch Single-File Source-Code Programs, including support for shebang (#!) line on Unix (Launch)
CONSTANT_Dynamic (Bytecode)
Introduction of the Nest access-control context that wraps classes (Bytecode)
### Deprecated Or Removed
- Deprecate the Pack200 Tools and API
- Remove Java EE
- Remove CORBA
- Remove Thread.destroy() and Thread.stop(Throwable)

## JDK 12
### File mismatch
### Collectors.teeing
### Compact Number Formatting
### String indent and transform
Class-Data Sharing archive of the default class list is enabled by default to improve out-of-the-box startup time (Perf)
Abortable mixed collections to meet user-supplied pause goals (Perf)
Microbenchmark Suite based on JMH
java.lang.invoke.constant(ByteCode)
### Deprecated Or Removed
- Remove Nashorn JavaScript Engine

## Java 13 
### FileSystems.newFileSystem
### DOM and SAC factories
Support Non-Volatile Mapped Byte Buffers in the FileChannel API (Perf)
### Deprecated Or Removed JDK 13
- Remove the JDK Deprecated GenRemovalPerfData JVM Flag
- Remove the JDK8-era implementation of java.rmi in the java.corba module
- Remove the jdk.scripting.nashorn module

## Java 14
### Switch Expressions (NLF)
@Serial (New API)
Enable dynamic archiving of classes (Perf)
NUMA-Aware Memory Allocation (Perf)
SerialGC, ParallelGC and ZGC now supports String Deduplication (Perf)
### Deprecated Or Removed
- Remove the Concurrent Mark Sweep (CMS) Garbage Collector
- Deprecate the ParallelScavenge + SerialOld GC Combination
- Remove the Pack200 Tools and API


## Java 15 
### TextBlocks (NLF)
### Hidden Classes
### Helpful NullPointerExceptions (NLF)
Edwards-Curve Digital Signature Algorithm (EdDSA) - RFC8032 (Security)
Replace Unsafe::defineAnonymousClass() with Lookup::defineHiddenClass() (Bytecode)

## Java 16
### Pattern matching for instanceof (NLF)
### Stream.toList
### Record Classes, terse syntax to define immutable DTOs  (NLF)
### Stream.toList (New API)
### Stream.mapMulti (New API)
### New builder to HTTP client (New API)
### DateTimeFormatterBuilder.html#appendDayPeriodText (New API)
### Unix-domain socket channels and server socket channels (New API)
Elastic metaspace to return unused HotSpot class-metadata memory to the operating system more promptly (Perf)
Packaging Tool to create self-contained applications, also supporting native package formats: msi, exe, pkg, dmg, deb and rpm (Link)
Alpine (New Platform)
Windows/AArch64 (New Platform)

## Java 17 LTS
### Restore Always-Strict Floating-Point Semantics
### Enhanced Pseudo-Random Number Generators
### Deprecate the Applet API
### Strongly Encapsulate JDK Internals
### Remove RMI Activation
### Sealed Classes (NLF)
### Remove the Experimental AOT and JIT Compiler
### Deprecate the Security Manager for Removal
### Context-Specific Deserialization Filters
### Process::inputReader, Process::outputWritter, Process::errorReader (New API)
### java.time.InstantSource interface (New API)
### HexFormat (New API)
### Align random generators (Random, ThreadLocalRandom, and SplittableRandom) (New API)
New internal macOS rendering pipeline that supports Apple's new Metal Framework (LIB)
Validate Incoming Serialization Data (Security)
macOS/AArch64 (New Platform)

## Java 18
### UTF-8 by Default
#### InputStreamReader
#### FileReader
#### OutputStreamWriter
#### FileWriter
#### PrintStream
#### Formatter
#### Scanner
### Simple Web Server
### Code Snippets in Java API Documentation
### Reimplement Core Reflection with Method Handles
### Vector API (Third Incubator)
### Internet-Address Resolution SPI
#### Dominance checking of the same type.
#### Exhaustiveness of switch expressions and statements
### Deprecate Finalization for Removal
### Math.divideExact (New API)
### Service-provider interface for host name and address resolution (New API)
GC Configurable Card Table Card Size (Perf)
GC Allow G1 Heap Regions up to 512MB (Perf)
Configurable Card Table Card Size (-XX:GCCardSizeInBytes) for Serial and Parallel GC (Perf)
SerialGC, ParallelGC and ZGC now supports String Deduplication (Perf)
The cacerts keystore file is now a passwordless PKCS12 file (Security)
Calling keyStore.store(outputStream, null) on a PKCS12 KeyStore creates a passwordless PKCS12 file (Security)
jwebserver (Launch)
javac now assumes that source files are encoded with the new default UTF-8 (Launch)
@snippet (JavaDoc)

## Java 19
#### Normal Record Patterns Example
#### Record Nested Patterns Example
### Linux/RISC-V Port
### Vector API (Fourth Incubator)
### BigInteger.parallelMultiply (New API)
### BigDecimal.TWO (New API)
Linux/RISC-V (New Platform)


## Java 20

### Virtual Threads as Preview Feature
### Vector API Proposal
### Structured Perfrency
### Scoped Values
### Foreign Function and Memory API
### Record Patterns
### Pattern Matching for Switch Statements and Expressions

## Java 21 LTS
### Pattern Matching for Switch (NLF)
### Record Patterns for switch and instanceof (NLF)
### Unnamed Variables (NLF)
### Unnamed Patterns (NLF)
### String Templates (NLF)
### Unnamed Classes and Instance Main Methods (NLF)
### Sequenced Collections (New API) 
### Math.clamp (New API)
### StringBuffer.repeat amd StringBuilder.repeat (New API)
### split with delimiters (New API)
### Vector API (New API)
### Virtual Threads (Perf)
Structured Perfrency API (Perf) PREVIEW
Scoped Values (Perf) Preview
Foreign Function & Memory API (Perf) Preview
Vector API (Perf) Incubator
Generational ZGC
Key Encapsulation Mechanisms (KEMs) API (Security)