# Insertion Sort
Insertion sort is a sorting algorithm that works by comparing each element in an array to its preceding elements and inserting it in the correct position in the sorted array. It starts by comparing the second element to the first element and swapping them if they are in the wrong order. It then compares the third element to the first and second elements and swaps it accordingly to place it in the correct position. This process continues for each element in the array until the entire array is sorted.

### Pseudocode
```
Insert(int[] sorted, int value)
  initialize i to 0
  WHILE value > sorted[i]
    set i to i + 1
  WHILE i < sorted.length
    set temp to sorted[i]
    set sorted[i] to value
    set value to temp
    set i to i + 1
  append value to sorted

InsertionSort(int[] input)
  LET sorted = New Empty Array
  sorted[0] = input[0]
  FOR i from 1 up to input.length
    Insert(sorted, input[i])
  return sorted
```
### Trace
```
Array :[8,4,23,42,16,15]
In the first iteration, `i=1`:
- current: 4
- j=0: arr[j]=8>current, so we swap: arr[j]=4, arr[j+1]=8
- The `newArray` is now {4, 8, 23, 42, 16, 15}

In the second iteration, `i=2`:
- current: 23
- j=1: arr[j]=8<current, so we don't swap
- The `newArray` is still {4, 8, 23, 42, 16, 15}

In the third iteration, `i=3`:
- current: 42
- j=2: arr[j]=23<current, so we don't swap
- The `newArray` is still {4, 8, 23, 42, 16, 15}

In the fourth iteration, `i=4`:
- current: 16
- j=3: arr[j]=42>current, so we swap: arr[j]=16, arr[j+1]=42
- j=2: arr[j]=23>current, so we swap: arr[j]=16, arr[j+1]=23
- j=1: arr[j]=8<current, so we don't swap
- j=0: arr[j]=4<current, so we don't swap
- The `newArray` is now {4, 8, 16, 23, 42, 15}

In the fifth iteration, `i=5`:
- current: 15
- j=4: arr[j]=42>current, so we swap: arr[j]=15, arr[j+1]=42
- j=3: arr[j]=23>current, so we swap: arr[j]=15, arr[j+1]=23
- j=2: arr[j]=16>current, so we swap: arr[j]=15, arr[j+1]=16
- j=1: arr[j]=8>current, so we swap: arr[j]=15, arr[j+1]=8
- j=0: arr[j]=4<current, so we don't swap
- The `newArray` is now {4, 8, 15, 16, 23, 42}


```
### Efficiency
 * The time complexity of the Insertion Sort algorithm is: `O(n^2)` in the worst case, where n is the number of elements in the array. 

 * The space complexity of the Insertion Sort algorithm is: `O(1)`, as it only requires a constant amount of extra space to store some temporary variables.