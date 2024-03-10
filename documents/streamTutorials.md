#Java Explained: Streams

Java Streams provide a powerful way to work with collections in a functional style. Streams can be used to process elements of collections in a declarative way, allowing for concise and expressive code.

## Source
A Stream in Java begins with a source, which can be any Collection, Array, or I/O resource. The source provides the data that will be processed by the stream.
[StreamConstructionTest.java](../src/javaExplained/streams/StreamConstructionTest.java)

## Intermediate Operations
Intermediate operations are used to transform or filter the elements of the stream. These operations are lazy, meaning they do not execute until a terminal operation
is called. Some common intermediate operations include map, filter, sorted, and distinct

## Terminal Operations
Terminal operations are used to produce a result or side-effect. 
When a terminal operation is called, the stream is processed, 
and the result is computed. Some common terminal operations 
include forEach, collect, reduce, and count.