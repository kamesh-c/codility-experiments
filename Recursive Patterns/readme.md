###  Six Patterns

* Iterations
* Breaking into sub-problems
* Selections (Permutations )
* ordering
* divide and conquer
* Depth first search

#### Iterations
- Iteration over an array / list using recursion
- rarely useful except for simplifying code

Examples:
   * printing a linked list in reverse order
   * Factorial
   * Any time when you might use a for loop

> Public static void printReversedLinkedList(Node head){
>    if (head == null ) return;
>    printReversedLinkedList(head.next);
>    System.out.println(head.value());
> }


#### Breaking into sub-problems

* Classic problem solving
* Technically all recursive problem, buy many are not obvious
* Use this pattern when it makes sense to you
* Examples
    * Towers of Hanoi
    * Fibonacci     

#### selections
* Fundamentally, problem that can be solved by finding all the valid combinations - Chess problem 
* Brute force - Find and validate every combinations. 
* Optimize by validating as we go/backtracking
* Examples:
    * Knapsack problem
    * word break
    * Phonespell
    * N Queens 
(This can be optimized with dynamic programming as well)

#### Ordering (Permutations)
* Similar of selections except order matters
* Brute force - find all the permutations and validate which is best/Matchs or conditions
* Examples:
    * Finding all permutations of inputs
    * Finding all N-digit number whose digits sums to specific value
    * Word squares

#### Divide and conquer
* Can we solve the problem for each half of the inputs easily combine the result.
* Common with searching, sorting and trees
* Examples:
    * Merge sort
    * Generate all BSTs for a set of items
    * Finding all valid parentheses

#### Depth first search

* Common technique with tree/graph structures
* Can be used for may different recursive problems
* Examples:
    * Search in a tree
    * Probability of a knight on a chessboard
    * Many Recursive problems if framed properly 

