package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] shoeSizes = { 8, 5, 12, 3, 10 }; // Example shoe sizes to sort

        insertionSort(shoeSizes);

        // Print the sorted shoe sizes
        for (int size : shoeSizes) {
            System.out.print(size + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position
            // ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
