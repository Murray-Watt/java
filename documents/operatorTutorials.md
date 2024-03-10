# Java Explained: Operators

## Number of operands
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

## Precedence and associativity
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

## Arithmetic Operators
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

## Comparison Operators
ComparisonOperatorsTest.java
- lessThanEquals
- equals
- notEquals
- greaterThan
- greaterThanEquals
- lessThan

## Conditional Operators
ConditionalOperatorsTest.java
- conditionalAnd
- conditionalNot
- conditionalOrShortCircuit
- conditionalAndShortCircuit
- conditionalOr

## Logical Operators
LogicalOperatorsTest.java
- rightShift
- bitWiseNegate
- bitWiseOr
- bitWiseAnd
- bitWiseXor
- unsignedRightShift
- leftShift

# Streams
# Creating Streams

- createStreamBuilder
- createStreamGenerate
- createStreamOfNullable
- createStreamFromArray
- createStreamFromArrayList
- createStreamIterate
- createStreamConcat
- createStreamOfElements
- createEmptyStream