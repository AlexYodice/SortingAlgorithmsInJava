package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] shoeSizes = { 8, 5, 12, 3, 10 }; // Example shoe sizes to sort

        selectionSort(shoeSizes);

        // Print the sorted shoe sizes
        for (int size : shoeSizes) {
            System.out.print(size + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}