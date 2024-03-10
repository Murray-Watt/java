# Java Explained: Java Language Tutorials

## Introduction 

* JVM
* JRE
* JDK

### Java Setup

* Versions
* LST
* JShell (REPL)
* IDEs
* Maven
* Jupyter

### Java Core

### Java Basics
* Literals
* Variables
* Data Types
* Casting
* Imports
* Binding

## Strings

### Comparisons
StringComparisonsTest.java
- equals
- equalsIgnoreCase
- contentEquals
- compareTo
- compareToIgnoreCase
- isEmpty
- isBlank
- 
### Searching
StringSearchingTest.java
- contains
- endsWith
- indexOf
- lastIndexOf
- matches
- regionMatches
- startsWith

### Manipulation
StringManipulationTest.java
- concat
- join (introduced in Java 8)
- replace
- replaceAll
- replaceFirst
- split
- substring
- subSequence

### Transformation
StringTransformationTest.java
- chars (introduced in Java 9)
- codePoints (introduced in Java 9)
- format
- lines (introduced in Java 11)
- repeat (introduced in Java 11)
- strip
- stripLeading
- stripTrailing
- toCharArray
10. [ ]   toLowerCase
-  toUpperCase
-  trim
-  valueOf

## StringBuilder
StringBuilderTest.java
- constructions
- basics examples
- append examples
- compare examples
- insert examples
- delete examples
- replace examples
- index examples
- lastIndexOf examples
10. [ ]   reverseExamples
-  setCharAtExamples
-  setLengthExamples
-  subStringExamples
-  toString Examples
-  trimToSize Examples
-  replace entire contents of a StringBuilder

## StringBuffer
StringBufferTest.java
basics examples

### Text Blocks
TextBlocksTest.java
- basics examples
- //stripIndent examples
- translateEscapes examples
- //formatted examples

### Formatting
SimpleDateFormatTest.java
formattingDates

StringFormattingTest.java
- formattingDates
- formattingIntegers
- formatTime
- formatDateTimeWithTimeZone
- formatToUpperCase
- formattingString
- formatDateTime
- formattingFloatingPoint

[Java Explained: Operators](#operatorsTutorials.md)

[Java Explained: Flow of Control](#flowOfControlTutorials.md)

[Java Explained: Concurrency in Java](#concurrecyTutorials.md)

### Parallelism vs. Concurrency

Parallelism and concurrency are closely related concepts in computing but refer to 
slightly different aspects of program execution:

Concurrency typically refers to the ability of a system to run multiple tasks at the 
same time, making progress on all of them through interleaved execution. Concurrency 
is often achieved through techniques such as multitasking or multithreading.

Parallelism refers to the simultaneous execution of multiple tasks, where each task 
is broken down into subtasks that can be executed in parallel, either by multiple
processors/cores or by a single processor/core that simulates multiple cores through 
techniques like hyper-threading.

In many cases, the terms are used interchangeably or in a way that implies they are the same thing. However, there are subtle differences in their meanings, especially in contexts where concurrency may not necessarily involve true simultaneous execution of tasks (e.g., cooperative multitasking or asynchronous I/O).

[Java Explained: Collections in Java](#collectionTutorials.md)

[Java Explained: Streams](#streamsTutorials.md)









