# Insertion Sort
Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.

## Pseudocode
```
  InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```
## Trace
Sample Array: [8,4,23,42,16,15]

![Insertion Sort](Blog26.png)              

     