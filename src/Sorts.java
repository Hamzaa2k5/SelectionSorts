public class Sorts {
    // other sorting methods (bubbleSort, quickSort, mergeSort, insertionSort) can go here

    // selection sort
    public static void selectionSort(int[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            // Find minimum element in the unsorted section of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap found minimum element with the first element
            int temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
    }
}
