# Merge Sort
MergeSort is a divide-and-conquer algorithm that recursively divides a given array into smaller sub-arrays, sorts the sub-arrays, and then merges the sorted sub-arrays back into the original array in a sorted order.

### Pseudocode
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```
### Trace
```
arr = [8, 4, 23, 42, 16, 15]

Iteration 1
mid = 3
left = [8, 4, 23]
right = [42, 16, 15]
mergeSort(left) => [4, 8, 23]
mergeSort(right) => [15, 16, 42]
merge(left, right, arr) => [4, 8, 15, 16, 23, 42]
arr = [4, 8, 15, 16, 23, 42]

Iteration 2
mid = 1
left = [4, 8]
right = [15, 16, 23]
mergeSort(left) => [4, 8]
mergeSort(right) => [15, 16, 23]
merge(left, right, arr) => [4, 8, 15, 16, 23, 42]
arr = [4, 8, 15, 16, 23, 42]

Iteration 3
mid = 1
left = [4]
right = [8]
mergeSort(left) => [4]
mergeSort(right) => [8]
merge(left, right, arr) => [4, 8]
arr = [4, 8, 15, 16, 23, 42]

Iteration 4
mid = 1
left = [15]
right = [16, 23]
mergeSort(left) => [15]
mergeSort(right) => [16, 23]
merge(left, right, arr) => [15, 16, 23]
arr = [4, 8, 15, 16, 23, 42]

Iteration 5
mid = 1
left = [16]
right = [23]
mergeSort(left) => [16]
mergeSort(right) => [23]
merge(left, right, arr) => [16, 23]
arr = [4, 8, 15, 16, 23, 42]

Final sorted array
arr = [4, 8, 15, 16, 23, 42]

```
### Efficiency
The time complexity of MergeSort is `O(n log n)`.
The space complexity of MergeSort is `O(n)`.
