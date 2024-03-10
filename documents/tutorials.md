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

## Operators

### Number of operands
* unary
  * -- postfix, prefix
  * ++ postfix, prefix
  * +, -
  * !
  * ~
  * (type)
* binary
  * +, -
  * *, /, %
  * <<, >>, >>>
  * <, <=, >, >=
  * ==, !=
  * &
  * ^
  * |
  * &&
  * ||
  * ?:
  * =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
* ternary
  * ?:

### Precedence and associativity
PrecedenceTest.java
- parentheses
- shiftOperators
- postFixIncrement
- multiplicationOverAddition
- divisionOverAddition
- prefixIncrement
- unaryOperatorsPrecedence

* unary operators higher than binary
* parentheses highest precedence
* next postfix increment and decrement are highest precedence
* unary operators with the exception of prefix and postfix promote to int
* on equal precedence, left to right associativity, except assignment

### Arithmetic Operators
ArithmeticOperatorsTest.java
- subtraction
- addition
- prefixIncrement
- modulusByZero
- postfixIncrement
- division
- modulusByZeroDouble
- unaryMinus
- multiplication
10. [ ] unaryPlus
- prefixDecrement
- modulus
- divideByZero
- postfixDecrement
- divideByZeroDouble

### Comparison Operators
ComparisonOperatorsTest.java
- lessThanEquals
- equals
- notEquals
- greaterThan
- greaterThanEquals
- lessThan

### Conditional Operators
ConditionalOperatorsTest.java
- conditionalAnd
- conditionalNot
- conditionalOrShortCircuit
- conditionalAndShortCircuit
- conditionalOr

### Logical Operators
LogicalOperatorsTest.java
- rightShift
- bitWiseNegate
- bitWiseOr
- bitWiseAnd
- bitWiseXor
- unsignedRightShift
- leftShift

## Flow of Control

### if else
IfElseTest.java
- simpleIfElse
- ifElse
- ifElseIfElse
- nestedIfElse
- ifStatement
### switch
SwitchTest.java
- lambdaSwitch
- enumSwitch
- switchWithFallThrough
- integerSwitch
- switchWithExpressionsInCases
- switchWithExpressionInSwitchExpression
- intSwitch
- stringSwitch

### while loop
WhileLoopTest.java
- basicWhileLoop
- whileLoopWithBreak
- whileLoopWithContinue
- whileLoopWithReturn
- whileLoopWithReturn
- nestedWhileLoops

### do while loop
DoWhileLoopTest.java
- basicDoWhileLoop
- nestedDoWhileLoop

### for loop
ForLoopTest.java
- basicForLoop
- forLoopWithBreak
- forLoopWithContinue
- forLoopWithReturn
- forLoopWithMultipleVariables

### for each loop
ForEachLoopTest.java
- basicForEachLoop
- forEachLoopWithBreak
- forEachLoopWithContinue
- forEachLoopWithLabel

### Labels
BreakToLabelTest.java
- breakToLabel


# Streams
## Creating Streams

- createStreamBuilder
- createStreamGenerate
- createStreamOfNullable
- createStreamFromArray
- createStreamFromArrayList
- createStreamIterate
- createStreamConcat
- createStreamOfElements
- createEmptyStream

[Java Explained: Concurrency in Java](#concurrency-in-java)

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

[Java Explained: Collections in Java](#collections-in-java)

### Deadlocks and Race Condition 

Common issues in concurrent programming. Deadlocks occur when two or more threads are 
waiting for each other to release resources, while race conditions occur when the outcome 
of a program depends on the timing or interleaving of threads.

### Thread Safety

Ensuring that data shared between threads is accessed in a way that avoids conflicts 
and maintains data integrity. This often involves using synchronization mechanisms 
like locks or atomic operations.







