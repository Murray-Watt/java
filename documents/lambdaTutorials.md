**Predicate\<T\>**: Represents a predicate (boolean-valued function) of one argument.

    - **IntPredicate**: Predicate of one int-valued argument.
    - **LongPredicate**: Predicate of one long-valued argument.
    - **DoublePredicate**: Predicate of one double-valued argument.

- **Consumer\<T\>**: Represents an operation that accepts a single input argument and returns no result.

    - **IntConsumer**: Operation that accepts a single int-valued argument and returns no result.
    - **LongConsumer**: Operation that accepts a single long-valued argument and returns no result.
    - **DoubleConsumer**: Operation that accepts a single double-valued argument and returns no result.

- **Function\<T, R\>**: Represents a function that accepts one argument and produces a result.

    - **IntFunction\<R\>**: Function that accepts an int-valued argument and produces a result.
    - **IntToDoubleFunction**: Function that accepts an int-valued argument and produces a double-valued result.
    - **IntToLongFunction**: Function that accepts an int-valued argument and produces a long-valued result.
    - **LongFunction\<R\>**: Function that accepts a long-valued argument and produces a result.
    - **LongToDoubleFunction**: Function that accepts a long-valued argument and produces a double-valued result.
    - **LongToIntFunction**: Function that accepts a long-valued argument and produces an int-valued result.
    - **DoubleFunction\<R\>**: Function that accepts a double-valued argument and produces a result.
    - **ToIntFunction\<T\>**: Function that produces an int-valued result.
    - **ToDoubleFunction\<T\>**: Function that produces a double-valued result.
    - **ToLongFunction\<T\>**: Function that produces a long-valued result.

- **Supplier\<T\>**: Represents a supplier of results.

    - **BooleanSupplier**: Supplier of boolean-valued results.
    - **IntSupplier**: Supplier of int-valued results.
    - **LongSupplier**: Supplier of long-valued results.
    - **DoubleSupplier**: Supplier of double-valued results.

- **UnaryOperator\<T\>**: Represents an operation on a single operand that produces a result of the same type as its operand.

    - **IntUnaryOperator**: Function operation on a single int-valued operand that produces an int-valued result.
    - **LongUnaryOperator**: Function operation on a single long-valued operand that produces a long-valued result.
    - **DoubleUnaryOperator**: Function operation on a single double-valued operand that produces a double-valued result.