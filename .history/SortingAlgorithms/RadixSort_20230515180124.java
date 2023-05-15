package SortingAlgorithms;

public class RadixSort {
    public static void main(String[] args) {
        int[] shoeSizes = { 8, 5, 12, 3, 10 }; // Example shoe sizes to sort

        radixSort(shoeSizes);

        // Print the sorted shoe sizes
        for (int size : shoeSizes) {
            System.out.print(size + " ");
        }
    }

    public static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Perform counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Initialize count array
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Modify the count array to store the actual position of each element in the
        // output array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
