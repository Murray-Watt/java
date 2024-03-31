# Two pointers on opposite ends of a list/array

One common programming algorithm that involves using two pointers at opposite ends of a single input is the
Two Pointers technique. This technique is often used to find a certain subarray, subsequence, or to solve problems
involving arrays or linked lists efficiently.

## N-Sum Problems
The time complexity for the N-Sum problem with the best known solutions can be expressed as O(n^(k-1) * log(n)).
Here's a breakdown of the time complexities for different N-Sum problems:

* 2-Sum problem: O(n) using a hash map or O(n log n) using sorting.
* 3-Sum problem: O(n^2) * log(n) using sorting and the two-pointer technique.
* 4-Sum problem: O(n^3) * log(n) using sorting and the two-pointer technique.

The time complexities for the 3-Sum and 4-Sum problems follow the general N-Sum pattern, while the 2-Sum problem has a more efficient solution that deviates from the general case.

In general, for the N-Sum problem, the time complexity would be O(n^(k-1)) * log(n).
This time complexity includes optimizations such as using hash maps or sorting to improve the search for the target sum k within subsets of the n-element array.

1-Sum problem: O(n) - This is the simplest form of the N-Sum problem, where we are looking for a single element in the array that matches the target sum, and can be solved with a binary search.

## Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
[FindTwoSum.java](../src/main/java/org/mwatt/algorithms/dynamic/easy/FindTwoSum.java)

[FindTwoSumTest.java](../src/test/java/org/mwatt/algorithms/dynamic/easy/FindTwoSumTest.java)

## Three Sum (three pointers extension of Two Sum
Given an array of integers, find all unique triplets in the array which gives the sum of zero.

Sort the input array nums.
For each element nums[i], fix two pointers low and high to the left and right boundaries of the subarray to the right of i.
Perform a binary search-like approach by adjusting the low and high pointers based on the sum of the triplet formed by nums[i], nums[low], and nums[high].
If the sum is equal to the target, return the indices [i, low, high].
If the sum is less than the target, increment the low pointer to consider larger numbers.
If the sum is greater than the target, decrement the high pointer to consider smaller numbers.
Repeat steps 3-6 for each element in the array.
If no triplet is found, return an array of zeros ([0, 0, 0]) to indicate that there is no solution.

[FindThreeSum.java](../src/main/java/org/mwatt/algorithms/dynamic/easy/FindThreeSum.java)

[FindThreeSumTest.java](../src/test/java/org/mwatt/algorithms/dynamic/easy/FindThreeSumTest.java)

### Naive Approach (O(n^3))
The most straightforward way to solve the 3-Sum problem is by using three nested loops to check all possible triplets in the input array. However, this approach has a time complexity of O(n^3), which is inefficient for large arrays.

### Optimized Approach using Two Pointers with Sorted Array (O(n^2 * log(n)))
This method improves upon the naive approach by using a sorted array and a two-pointer technique to find the triplets that sum to the target. The steps involved in this approach are:

1. Sort the input array nums.
2. For each element nums[i], fix two pointers low and high to the left and right boundaries of the subarray to the right of i.
3. Perform a binary search-like approach by adjusting the low and high pointers based on the sum of the triplet formed by nums[i], nums[low], and nums[high].
4. If the sum is equal to the target, return the indices [i, low, high].
5. If the sum is less than the target, increment the low pointer to consider larger numbers.
6. If the sum is greater than the target, decrement the high pointer to consider smaller numbers.
7. Repeat steps 3-6 for each element in the array.
8. If no triplet is found, return an array of zeros ([0, 0, 0]) to indicate that there is no solution.

This method has a time complexity of O(n^2 * log(n)) due to the sorting step and the binary search-like technique with the two pointers.

# Optimized Approach using Two Pointers with Sorted Array and Hash Map
This approach optimizes finding all triplets in a sorted array that sum up to zero using a hash map. The code consists of two methods: `twoSum` and `findAllThreeSumsHashMap`.

## `twoSum` method:
- This method takes an input array `nums`, a starting index `start`, and a list of lists `solutions` to store the resulting triplets.
- It creates a hash map `seen` to keep track of the elements seen so far.
- For each element `nums[i]` starting from `start + 1`, it calculates the remainder needed to form a sum of zero with `nums[start]` and `nums[i]`.
- If the remainder is found in the hash map, a solution has been found. The triplet `[nums[start], nums[i], remainder]` is added to the `solutions` list.
- The method handles consecutive duplicate elements by incrementing `i` as long as `nums[i] == nums[i + 1]`, avoiding duplicate triplets.
- Each processed element `nums[i]` is added to the hash map `seen` with its index `i`.

## `findAllThreeSumsHashMap` method:
- This method first sorts the input array `nums`.
- It initializes an empty list `solutions` to store the resulting triplets.
- The method loops through `nums`, and for each non-duplicate element less than or equal to zero, it calls the `twoSum` method, passing `nums`, the current index `i`, and the `solutions` list as parameters.
- Finally, it returns the list of triplets found.

## Time and Space Complexity
- The time complexity of this solution is O(n^2) due to the nested loops in the `twoSum` method.
- The space complexity is also O(n) for the hash map used to store the seen elements.

### Description of the Approach
This approach focuses on finding all unique triplets that sum up to zero in an array without sorting it first. The main goal is to handle duplicate elements and avoid generating duplicate triplets. The code consists of a single method `findAllThreeSumsNoSort`.

### `findAllThreeSumsNoSort` method:
The method employs the following data structures:

1. `Set<List<Integer>> res`: A set to store unique triplets that sum up to zero.
2. `Set<Integer> dups`: A set to handle duplicate elements in the input array.
3. `Map<Integer, Integer> seen`: A hash map to keep track of the elements seen so far.

The method uses nested loops to iterate over the array elements:

1. The outer loop iterates through the array elements. It checks if the current element is not a duplicate by using the `dups` set.
2. The inner loop starts from the next element after the current one and iterates to the end of the array.
3. For each pair of elements (nums[i], nums[j]), it calculates the required complementary number (`complement`) to form a sum of zero.
4. It checks if the `complement` is present in the `seen` map and is not the same as the current element (nums[i]). If both conditions are met, it forms a triplet and adds it to the `res` set.
5. The method adds each processed element `nums[j]` to the `seen` map with the current index `i`.

Finally, the method returns a list of unique triplets found by converting the `res` set to a list.

### Analysis
While this approach is intuitive and doesn't require sorting the input array, it's not as efficient as the previously discussed solutions. Using sets and hash maps can introduce additional overhead due to their underlying operations and space requirements. The time complexity of this solution is O(n^2) due to the nested loops, and the space complexity is also O(n) for the hash map used to store seen elements.

In conclusion, this alternative solution demonstrates a different perspective on solving the problem but comes with its own trade-offs in terms of readability, performance, and maintainability.


## Container With Most Water
Given n non-negative integers representing the height of each bar in a bar chart, compute the maximum amount of water that can be trapped between the bars.
## Merge Sorted Array
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
## Reverse Linked List
Reverse a singly linked list.
[ReverseLinkedList.java](../src/main/java/org/mwatt/algorithms/lists/ReverseLinkedList.java)

[ReverseLinkedListTest.java](../src/test/java/org/mwatt/algorithms/lists/ReverseLinkedListTest.java)

## Palindrome Linked List
[Palindrome.java](../src/main/java/org/mwatt/algorithms/strings/Palindrome.java)

[PalindromeTest.java](../src/test/java/org/mwatt/algorithms/strings/PalindromeTest.java)

[PalindromeLinkedList.java](../src/main/java/org/mwatt/algorithms/lists/PalindromeLinkedList.java)

[PalindromeLinkedListTest.java](../src/test/java/org/mwatt/algorithms/lists/PalindromeLinkedListTest.java)


Check if a linked list is a palindrome.
## BinarySearch
* [BinarySearch.java](../src/main/java/org/mwatt/algorithms/lists/BinarySearch.java)
* 
* [BinarySearchTest.java](../src/test/java/org/mwatt/algorithms/lists/BinarySearchTest.java)


Given a sorted array and a target/key value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.



