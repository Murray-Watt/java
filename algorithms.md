# Java Competency

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
1. [ ]   equals
2. [ ]   equalsIgnoreCase
3. [ ]   contentEquals
4. [ ]   compareTo
5. [ ]   compareToIgnoreCase
6. [ ]   isEmpty
7. [ ]   isBlank
8. [ ] 
### Searching
StringSearchingTest.java
1. [ ]   contains
2. [ ]   endsWith
3. [ ]   indexOf
4. [ ]   lastIndexOf
5. [ ]   matches
6. [ ]   regionMatches
7. [ ]   startsWith

### Manipulation
StringManipulationTest.java
1. [ ]   concat
2. [ ]   join (introduced in Java 8)
3. [ ]   replace
4. [ ]   replaceAll
5. [ ]   replaceFirst
6. [ ]   split
7. [ ]   substring
8. [ ]   subSequence

### Transformation
StringTransformationTest.java
1. [ ]   chars (introduced in Java 9)
2. [ ]   codePoints (introduced in Java 9)
3. [ ]   format
4. [ ]   lines (introduced in Java 11)
5. [ ]   repeat (introduced in Java 11)
6. [ ]   strip
7. [ ]   stripLeading
8. [ ]   stripTrailing
9. [ ]   toCharArray
10. [ ]   toLowerCase
11. [ ]   toUpperCase
12. [ ]   trim
13. [ ]   valueOf

## StringBuilder
StringBuilderTest.java
1. [ ]   constructions
2. [ ]   basics examples
3. [ ]   append examples
4. [ ]   compare examples
5. [ ]   insert examples
6. [ ]   delete examples
7. [ ]   replace examples
8. [ ]   index examples
9. [ ]   lastIndexOf examples
10. [ ]   reverseExamples
11. [ ]   setCharAtExamples
12. [ ]   setLengthExamples
13. [ ]   subStringExamples
14. [ ]   toString Examples
15. [ ]   trimToSize Examples
16. [ ]   replace entire contents of a StringBuilder

## StringBuffer
StringBufferTest.java
basics examples

### Text Blocks
TextBlocksTest.java
1. [ ] basics examples
2. [ ] //stripIndent examples
3. [ ] translateEscapes examples
4. [ ] //formatted examples

### Formatting
SimpleDateFormatTest.java
formattingDates

StringFormattingTest.java
1. [ ] formattingDates
2. [ ] formattingIntegers
3. [ ] formatTime
4. [ ] formatDateTimeWithTimeZone
5. [ ] formatToUpperCase
6. [ ] formattingString
7. [ ] formatDateTime
8. [ ] formattingFloatingPoint

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
1. [ ] parentheses
2. [ ] shiftOperators
3. [ ] postFixIncrement
4. [ ] multiplicationOverAddition
5. [ ] divisionOverAddition
6. [ ] prefixIncrement
7. [ ] unaryOperatorsPrecedence

* unary operators higher than binary
* parentheses highest precedence
* next postfix increment and decrement are highest precedence
* unary operators with the exception of prefix and postfix promote to int
* on equal precedence, left to right associativity, except assignment

### Arithmetic Operators
ArithmeticOperatorsTest.java
1. [ ] subtraction
2. [ ] addition
3. [ ] prefixIncrement
4. [ ] modulusByZero
5. [ ] postfixIncrement
6. [ ] division
7. [ ] modulusByZeroDouble
8. [ ] unaryMinus
9. [ ] multiplication
10. [ ] unaryPlus
11. [ ] prefixDecrement
12. [ ] modulus
13. [ ] divideByZero
14. [ ] postfixDecrement
15. [ ] divideByZeroDouble

### Comparison Operators
ComparisonOperatorsTest.java
1. [ ] lessThanEquals
2. [ ] equals
3. [ ] notEquals
4. [ ] greaterThan
5. [ ] greaterThanEquals
6. [ ] lessThan

### Conditional Operators
ConditionalOperatorsTest.java
1. [ ] conditionalAnd
2. [ ] conditionalNot
3. [ ] conditionalOrShortCircuit
4. [ ] conditionalAndShortCircuit
5. [ ] conditionalOr

### Logical Operators
LogicalOperatorsTest.java
2. [ ] rightShift
3. [ ] bitWiseNegate
4. [ ] bitWiseOr
5. [ ] bitWiseAnd
6. [ ] bitWiseXor
7. [ ] unsignedRightShift
8. [ ] leftShift

## Flow of Control

### if else
IfElseTest.java
1. [ ] simpleIfElse
2. [ ] ifElse
3. [ ] ifElseIfElse
4. [ ] nestedIfElse
5. [ ] ifStatement
### switch
SwitchTest.java
1. [ ] lambdaSwitch
2. [ ] enumSwitch
3. [ ] switchWithFallThrough
4. [ ] integerSwitch
5. [ ] switchWithExpressionsInCases
6. [ ] switchWithExpressionInSwitchExpression
6. [ ] intSwitch
7. [ ] stringSwitch

### while loop
WhileLoopTest.java
1. [ ] basicWhileLoop
2. [ ] whileLoopWithBreak
3. [ ] whileLoopWithContinue
4. [ ] whileLoopWithReturn
5. [ ] whileLoopWithReturn
6. [ ] nestedWhileLoops

### do while loop
DoWhileLoopTest.java
1. [ ] basicDoWhileLoop
2. [ ] nestedDoWhileLoop

### for loop
ForLoopTest.java
1. [ ] basicForLoop
2. [ ] forLoopWithBreak
3. [ ] forLoopWithContinue
4. [ ] forLoopWithReturn
5. [ ] forLoopWithMultipleVariables

### for each loop
ForEachLoopTest.java
1. [ ] basicForEachLoop
2. [ ] forEachLoopWithBreak
3. [ ] forEachLoopWithContinue
4. [ ] forEachLoopWithLabel

### Labels
BreakToLabelTest.java
1. [ ] breakToLabel


# Streams
## Creating Streams

1. [ ] createStreamBuilder
2. [ ] createStreamGenerate
3. [ ] createStreamOfNullable
4. [ ] createStreamFromArray
5. [ ] createStreamFromArrayList
6. [ ] createStreamIterate
7. [ ] createStreamConcat
8. [ ] createStreamOfElements
9. [ ] createEmptyStream

## Greedy algorithms
An example of dynamic programming algorithms, greedy algorithms are also optimization tools. The method solves a challenge by searching for optimum solutions to the subproblems and combining the findings of these subproblems to get the most optimal answer.

Conversely, when greedy algorithms solve a problem, they look for a locally optimum solution to find a global optimum. They make a guess that looks optimum at the time but does not guarantee a globally optimum solution. This could end up becoming costly down the road.

## Floyd-Warshall algorithm
   The Floyd-Warshall method uses a technique of dynamic programming to locate the shortest pathways. It determines the shortest route across all pairings of vertices in a graph with weights. Both directed and undirected weighted graphs can use it.

This program compares each pair of vertices’ potential routes through the graph. It gradually optimizes an estimate of the shortest route between two vertices to determine the shortest distance between two vertices in a chart. With simple modifications to it, one can reconstruct the paths.

This method for dynamic programming contains two subtypes:

Behavior with negative cycles: Users can use the Floyd-Warshall algorithm to find negative cycles. You can do this by inspecting the diagonal path matrix for a negative number that would indicate the graph contains one negative cycle. In a negative cycle, the sum of the edges is a negative value; thus, there cannot be a shortest path between any pair of vertices. Exponentially huge numbers are generated if a negative cycle occurs during algorithm execution.
Time complexity: The Floyd-Warshall algorithm has three loops, each with constant complexity. As a result, the Floyd-Warshall complexity has a time complexity of O(n3). Wherein n represents the number of network nodes.
## Bellman Ford algorithm
   The Bellman-Ford Algorithm determines the shortest route from a particular source vertex to every other weighted digraph vertices. The Bellman-Ford algorithm can handle graphs where some of the edge weights are negative numbers and produce a correct answer, unlike Dijkstra’s algorithm, which does not confirm whether it makes the correct answer. However, it is much slower than Dijkstra’s algorithm.

The Bellman-Ford algorithm works by relaxation; that is, it gives approximate distances that better ones continuously replace until a solution is reached. The approximate distances are usually overestimated compared to the distance between the vertices. The replacement values reflect the minimum old value and the length of a newly found path.

This algorithm terminates upon finding a negative cycle and thus can be applied to cycle-canceling techniques in network flow analysis. 







