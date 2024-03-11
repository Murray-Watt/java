#Java Explained: Streams

Java Streams provide a powerful way to work with collections in a functional style. Streams can be used to process elements of collections in a declarative way, allowing for concise and expressive code.

## Source
A Stream in Java begins with a source, which can be any Collection, Array, or I/O resource. The source provides the data that will be processed by the stream.

### Stream Construction
The StreamConstructionTest class demonstrates different ways to construct 
streams in Java. It includes examples of constructing streams from arrays, 
collections, and other stream operations. The examples cover stream concatenation, 
generation, and building streams from different sources.

### Stream Sources
[StreamConstructionTest.java](../src/test/java/org/mwatt/tutorial/streams/StreamConstructionTest.java)
The StreamSourceTest class explores different sources for Java streams. 
It includes examples of creating streams from various sources such as arrays, 
collections, and I/O operations. The examples cover different ways to initialize 
streams and perform operations like mapping, filtering, and collecting.

### Creating Streams with Stream.of
[StreamOfTest.java](../src/test/java/org/mwatt/tutorial/streams/StreamOfTest.java)

The StreamOfTest class demonstrates how to use Stream.of to create streams in 
Java. It includes examples of creating streams from arrays, collections, and 
individual elements. The examples cover basic stream operations like mapping, 
filtering, and collecting using Stream.of.

### Streams from Collections
[CollectionStreamTest.java](../src/test/java/org/mwatt/tutorial/streams/CollectionsStreamTest.java)

The CollectionStreamTest class demonstrates how to create streams from collections in Java. 
It includes examples of creating streams from List, Set, and Map collections. The examples cover 
operations like mapping, filtering, and collecting using streams on different types of collections.

### Streams from Arrays
[ArrayStreamTest.java](../src/test/java/org/mwatt/tutorial/streams/ArraysStreamTest.java)

The ArrayStreamTest class demonstrates how to create streams from arrays in Java. 
It includes examples of creating streams from arrays of different types, such as int, 
long, double, and String. The examples cover basic operations like summing, mapping, 
and filtering using streams.

## Intermediate Operations
[StreamIntermediateOperationsTest.java](../src/test/java/org/mwatt/tutorial/streams/StreamIntermediateOperationsTest.java)

Intermediate operations are used to transform or filter the elements of the stream. These operations are lazy, meaning they do not execute until a terminal operation
is called. Some common intermediate operations include map, filter, sorted, and distinct

[StreamMappingTest.java](../src/test/java/org/mwatt/tutorial/streams/StreamMappingTest.java)

The StreamIntermediateOperationsTest class demonstrates intermediate operations in Java streams. 
These operations are used to transform or filter elements in the stream and include methods like 
map, filter, sorted, and distinct. The examples showcase how intermediate operations are lazy and 
only execute when a terminal operation is called.

[StreamFilteringTest.java](../src/test/java/org/mwatt/tutorial/streams/StreamFilteringTest.java)

The StreamMappingTest class illustrates how to use mapping operations in Java streams. 
It includes examples of mapping streams to different types, transforming elements, and 
extracting information. The examples also cover how to use filtering operations to select 
specific elements from a stream based on a predicate.

## Terminal Operations
[StreamTerminalOperationsTest.java](../src/test/java/org/mwatt/tutorial/streams/StreamTerminalOperationsTest.java)

Terminal operations are used to produce a result or side-effect. 
When a terminal operation is called, the stream is processed, 
and the result is computed. Some common terminal operations 
include forEach, collect, reduce, and count.

### Collectors
[StreamCollectorTest.java](../src/test/java/org/mwatt/tutorial/streams/StreamCollectorsTest.java)

The StreamCollectorTest class demonstrates the use of collectors in Java streams. 
It includes examples of using various collectors to perform operations like 
grouping, partitioning, and reducing on stream elements. The examples cover 
common collector methods and their applications.

### Reduction
[StreamReductionTest.java](../src/test/java/org/mwatt/tutorial/streams/StreamReductionTest.java)

The StreamReductionTest class demonstrates how to perform reduction operations 
on streams in Java. It includes examples of reducing streams to obtain a single 
result, such as summing and multiplying numbers. The examples cover basic 
reduction operations using the reduce method with and without an identity 
value.

## Value Type Streams
[ValueTypeStreamsTest.java](../src/test/java/org/mwatt/tutorial/streams/ValueTypeStreamsTest.java)

The ValueTypeStreamsTest class demonstrates working with streams of primitive 
value types in Java. It includes examples of creating and manipulating 
IntStream, LongStream, and DoubleStream streams. The examples cover operations 
like summing, averaging, and finding minimum and maximum values in streams 
of primitive types.

## Using Binary Operators with Streams

BinaryOperator<T>: Represents an operation upon two operands of the same type, producing a result of 
the same type as the operands.

IntBinaryOperator: Represents an operation upon two int-valued operands and producing an int-valued 
result.

LongBinaryOperator: Represents an operation upon two long-valued operands and producing a long-valued 
result.

DoubleBinaryOperator: Represents an operation upon two double-valued operands and producing 
a double-valued result.
