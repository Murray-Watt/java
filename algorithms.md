# Algorithms in Java

## Introduction

### Dynamic Programming

Dynamic programming is a method for solving complex problems by breaking them down 
into simpler sub-problems. It solves each sub-problem only once and then saves its 
answer in a table (often an array or a matrix). When the same sub-problem is 
encountered, it simply looks up the previously computed answer, rather than recomputing
it. Dynamic programming is typically used when the sub=problems overlap, 
i.e., when a recursive algorithm for the problem would solve the same sub-problem 
multiple times.

#### Top-Down Approach

The top-down approach starts with the original problem and breaks it down into smaller 
sub-problems . It then solves these sub-problems  recursively, storing the solutions in 
a table (usually an array or a hash table) to avoid redundant calculations. 

The top-down approach is similar to recursion, but with the added benefit of memoization
to improve efficiency by storing and reusing intermediate results.

#### Bottom-Up Approach

Bottom-Up starts with the smallest sub-problems and iteratively builds up solutions 
for larger sub-problems. It typically uses a loop to iterate through all sub-problems  
in a specific order, filling in a table (usually an array or a matrix) with the 
solutions to these sub-problems . Unlike the top-down approach, which uses recursion, 
the bottom-up approach avoids the overhead of function calls and can be more efficient 
for certain problems.

#### Memoization (Top-Down)

Memoization refers to the technique of storing the results of expensive function calls 
and returning the cached result when the same inputs occur again. It is typically 
implemented using recursion, where the function first checks if the result for the 
given inputs is already cached before proceeding with the computation. 
Memoization is often used in a top-down approach, where the original problem is broken 
down into smaller sub-problems , and solutions to these sub-problems  are memoized.

### Tabulation (Bottom-Up)

Tabulation is a bottom-up approach to dynamic programming where 
solutions to all sub-problems  are computed iteratively and stored in a table 
(often an array or a matrix). Unlike memoization, which uses recursion and stores 
solutions as they are computed, tabulation computes solutions for smaller sub-problems  
first and then uses those solutions to compute solutions for larger sub-problems. 
Tabulation is often more efficient than memoization for problems where all sub-problems 
need to be computed.

When I optimize the space complexity of memoization, I only save the values I need. 
For example with the Fibonacci sequence, I only need to save the last two values at 
any stage. It has minor impact on the time complexity, but it can have a significant
impact on the space complexity. For example the space cost of saving every value
of Fibonacci sequence is O(n), but the space cost of saving only the last two values
is O(1).

#### Greedy Algorithms

Greedy algorithms, on the other hand, make the best possible choice at each step 
with the hope that this will lead to the globally optimal solution. 
Greedy algorithms do not always guarantee the optimal solution, 
but they are often simpler and more efficient than dynamic programming algorithms. 
Greedy algorithms are used for optimization problems where at each step, 
the best choice can be made without considering the future consequences.

#### Divide and Conquer

Divide and Conquer is a technique where you break down a problem into smaller, 
more manageable sub-problems of the same type. You solve the sub-problems independently,
and then combine their solutions to solve the original problem. 

Examples of algorithms that use the divide and conquer approach include merge sort, 
quicksort, and binary search.

#### Backtracking

Backtracking is a technique used to find all possible solutions to a problem by 
trying out different sequences of choices. It involves making a series of choices, 
exploring each choice until you either find a solution or determine that the 
choice cannot lead to a solution. If a choice does not lead to a solution, 
you backtrack and try a different choice. 

Backtracking is commonly used in problems such as the N-Queens problem and the 
Sudoku solver.

#### Floyd-Warshall Algorithm

The Floyd-Warshall algorithm is used to find the shortest paths between all pairs 
of vertices in a weighted graph with positive or negative edge weights 
(but with no negative cycles). It does this by iteratively updating a matrix of 
shortest path distances between all pairs of vertices. The algorithm has a time 
complexity of O(V^3), where V is the number of vertices in the graph.

#### Bellman-Ford Algorithm

The Bellman-Ford algorithm is used to find the shortest path from a single source 
vertex to all other vertices in a weighted graph with negative edge weights 
(but with no negative cycles). It works by iteratively relaxing edges, updating 
the shortest path estimates until no more improvements can be made. The algorithm can 
also detect the presence of negative cycles in the graph. The time complexity of the 
Bellman-Ford algorithm is O(V*E), where V is the number of vertices and E is the number 
of edges in the graph.

#### Easy
Fibonacci.java
- fibonacciRecursive
- fibonacciDynamicProgramming
- fibDynamicProgrammingSpaceOptimized

MinCostPath.java
- minCostRecursive (chooseMinPathRecursiveStep)
- minCostDynamicProgramming
- minCostDynamicProgrammingOptimized

StaircaseClimbing.java
- waysToClimbRecursive
- waysToClimbDynamicProgramming
- waysToClimbDynamicProgrammingOptimized

### Search

#### Easy
FindAddends.java

### String

#### Easy
MatchBrackets.java









