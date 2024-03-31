# Sorting 
Sorting is the process of arranging elements in a specific order, typically in ascending or descending order. It is a fundamental operation in computer science and is used in various applications, such as searching, data analysis, and optimization. There are many different sorting algorithms, each with its unique characteristics, advantages, and disadvantages. Some of the most common sorting algorithms include Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort, and Heap Sort. Each algorithm has its time and space complexity, which determines its efficiency and suitability for different types of data and input sizes.

## Bubble Sort
A simple comparison-based sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order.

It has a time complexity of O(n^2).

[BubbleSort.java](../src/main/java/org/mwatt/algorithms/sort/BubbleSort.java)

[SortAlgorithmTest.java](../src/test/java/org/mwatt/algorithms/sort/SortAlgorithmTest.java)

Optimizations to improve the performance of Bubble Sort:
* Flag to track swaps (implemented in BubbleSort.java)
  Include a flag variable to track if any swaps occurred during a pass through the array. If no swaps occurred, the array is already sorted, and you can stop the algorithm early. This can significantly improve performance for nearly sorted arrays.
* Optimized Bubble Sort (Bidirectional Bubble Sort) (implemented in BubbleSort.java as the cocktail sort):
  This variation performs the Bubble Sort in both directions (from left to right and right to left). This can reduce the number of passes needed to sort the array, resulting in improved performance.
* Detecting a sorted array:
  Before starting the sorting process, you can check if the array is already sorted. If it is, you can skip the sorting operation altogether, saving time and resources.
  These optimizations can help improve the performance of Bubble Sort, but it's essential to remember that Bubble Sort is still not as efficient as other sorting algorithms like QuickSort, MergeSort, or HeapSort for large data sets.

Despite these optimization, it's important to note that Bubble Sort is not the most efficient sorting algorithms for large datasets.

## Selection Sort

A sorting algorithm that divides the input list into a sorted and unsorted region, then repeatedly selects the smallest element
from the unsorted region and swaps it with the leftmost unsorted element.

It has a time complexity of O(n^2).

[SelectionSort.java](../src/main/java/org/mwatt/algorithms/sort/SelectionSort.java)

[SortAlgorithmTest.java](../src/test/java/org/mwatt/algorithms/sort/SortAlgorithmTest.java)

Selection Sort has a few advantages over Bubble Sort:

* Number of swaps: Selection Sort performs fewer swaps compared to Bubble Sort. In Bubble Sort, adjacent elements are repeatedly swapped to move them to their correct positions. In Selection Sort, the algorithm finds the smallest element and swaps it with the element at the current index only once in each iteration. This reduces the number of unnecessary swaps, improving efficiency.
* Performance: On average, Selection Sort performs slightly better than Bubble Sort, especially for large input sizes. While both algorithms have a worst-case time complexity of O(n^2), Selection Sort requires fewer comparisons and swaps, which results in better overall performance.
* Space complexity: Both Bubble Sort and Selection Sort have the same space complexity (O(1)), meaning they don't require any additional space apart from the input array.

Despite these optimization, it's important to note that Selection Sort is not the most efficient sorting algorithms for large datasets.

## Insertion Sort

A simple sorting algorithm that builds the final sorted array one item at a time by inserting each element into its correct position within a sorted sub-array.

It has a time complexity of O(n^2).

[InsertionSort.java](../src/main/java/org/mwatt/algorithms/sort/InsertionSort.java)

[SortAlgorithmTest.java](../src/test/java/org/mwatt/algorithms/sort/SortAlgorithmTest.java)



## Merge Sort

A divide-and-conquer sorting algorithm that recursively splits the input array into smaller sub-arrays,
sorts them individually, and merges them to achieve the final sorted array.

It has a time complexity of O(n log n).



[SortAlgorithmTest.java](../src/test/java/org/mwatt/algorithms/sort/SortAlgorithmTest.java)

[MergeSort.java](../src/main/java/org/mwatt/algorithms/lists/MergeSort.java)

[MergeSortTest.java](../src/test/java/org/mwatt/algorithms/lists/MergeSortTest.java)

Other optimizations and variations of Merge Sort include:
* Use Insertion Sort for small subarrays: Merge Sort's efficiency suffers when dealing with small arrays due to the overhead of recursive function calls. Switching to Insertion Sort for small subarrays can improve the running time, as it performs better on small input sizes.
* Optimize memory usage: In the standard Merge Sort algorithm, a temporary array is used to store the merged subarrays. This can lead to high memory usage, especially for large arrays. You can reduce memory usage by using a small, fixed-size buffer and repeatedly swapping elements between the buffer and the input array.
* Parallelization: Merge Sort lends itself well to parallelization due to its divide-and-conquer nature. By splitting the array into independent subarrays, you can perform the sort operation on multiple subarrays simultaneously, reducing the overall execution time.
* Adaptive Merge Sort: This variation of Merge Sort uses different merge strategies based on the data's characteristics. For example, if the input array contains many repeated elements or is already partially sorted, an adaptive algorithm can optimize the merge process and significantly reduce the number of comparisons and swaps

## Quick Sort
* Topological Sort
* Counting Sort
* Heap Sort
* Kahn's Topological Sort
* Radix Sort
  Bucket Sort
  Shell Sort
  Tim Sort
  Introspective Sort
  Odd-Even Sort
  /*
* Quick Sort - A divide-and-conquer sorting algorithm that partitions the input array into two parts around a pivot element and recursively sorts the sub-arrays before merging them.
  Topological Sort - A linear ordering of vertices in a directed acyclic graph where every directed edge of the graph goes from a vertex earlier in the ordering to a vertex later in the ordering.
  Counting Sort - A non-comparative integer sorting algorithm that works by counting the number of objects that have distinct key values and using arithmetic to determine the position of each key.
  Heap Sort - A comparison-based sorting algorithm that divides its input into a sorted and unsorted region, and uses a binary heap data structure to manage the unsorted region and move elements from it to the sorted region.
  Kahn's Topological Sort - A topological sorting algorithm that finds a topological order of a directed acyclic graph by incrementally constructing a list of vertices with indegree zero and reducing the indegrees of their neighbors.
  Radix Sort - A non-comparative integer sorting algorithm that sorts keys by grouping digits with the same positions and values.
  Bucket Sort - A sorting algorithm that works by partitioning an array into a finite number of buckets.
  Shell Sort - A generalization of insertion sort that allows for swapping elements at a distance, instead of just adjacent ones.
  Tim Sort - A hybrid sorting algorithm that combines merge sort and insertion sort, used in Python and Java's standard libraries.
  Introspective Sort - A hybrid sorting algorithm that combines quick sort and heap sort to achieve worst-case time complexity of O(n log n) and best-case time complexity of O(n).
  Odd-Even Sort - An optimization of bubble sort that alternates between sorting odd-indexed and even-indexed elements.



* MergeSort
* QuickSort
* TopologicalSort
* Insertion Sort
* SelectionSort
* CountingSort
* HeapSort
* KahnTopologicalSort
* Bubble Sort: A simple comparison-based sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order. It has a time complexity of O(n^2).
* Radix Sort: A non-comparative integer sorting algorithm that sorts keys by grouping digits with the same positions and values. It has a time complexity of O(d * (n + b)) where d is the number of digits, n is the number of elements, and b is the base of those elements.
* Bucket Sort: A sorting algorithm that works by partitioning an array into a finite number of buckets. It has an average time complexity of O(n + kn) where k is the number of buckets.
* Shell Sort: A generalization of insertion sort that allows for swapping elements at a distance, instead of just adjacent ones. It has an average time complexity of O(n(log n)^2).
* Tim Sort: A hybrid sorting algorithm that combines merge sort and insertion sort, used in Python and Java's standard libraries. It has a worst-case time complexity of O(n log n) and a best-case time complexity of O(n).
* Introspective Sort: A hybrid sorting algorithm that combines quick sort and heap sort to achieve a worst-case time complexity of O(n log n) and a best-case time complexity of O(n).
* Odd-Even Sort: An optimization of bubble sort that alternates between sorting odd-indexed and even-indexed elements. It has a best-case time complexity of O(n) but still suffers from O(n^2) in the average and worst cases.
