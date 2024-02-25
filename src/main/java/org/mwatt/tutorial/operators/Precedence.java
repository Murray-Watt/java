package org.mwatt.tutorial.operators;

/*
    16	() parentheses
        [] array access
        .  member

        left-to-right

    15	++ unary post-increment
        -- unary post-decrement

        left-to-right
    14	+ unary plus
        - unary minus
        ! unary logical NOT
        ~ unary bitwise NOT
        ++ unary pre-increment
        -- unary pre-increment

      	right-to-left

    13	() cast
        new object creation

        right-to-left

    12	* / %	multiplicative	left-to-right
    11	+ -
    +	additive
    string concatenation	left-to-right
    10	<< >>
    >>>	shift	left-to-right
    9	< <=
    > >=
    instanceof	relational	left-to-right
    8	==
    !=	equality	left-to-right
    7	&	bitwise AND	left-to-right
    6	^	bitwise XOR	left-to-right
    5	|	bitwise OR	left-to-right
    4	&&	logical AND	left-to-right
    3	||	logical OR	left-to-right
    2	?:	ternary	right-to-left
    1	 =   +=   -=
    *=   /=   %=
    &=   ^=   |=
    <<=  >>= >>>=	assignment	right-to-left
    0	->
    lambda expression arrow	right-to-left
 */
public class Precedence {
}
