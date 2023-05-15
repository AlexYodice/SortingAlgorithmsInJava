package SortingAlgorithms;

import java.util.Random;

public class BogoSort {
    public static void main(String[] args) {
        int[] shoeSizes = { 8, 5, 12, 3, 10 }; // Example shoe sizes to sort

        bogoSort(shoeSizes);

        // Print the sorted shoe sizes
        for (int size : shoeSizes) {
            System.out.print(size + " ");
        }
    }

    public static void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffleArray(arr);
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffleArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = random.nextInt(arr.length);
            swap(arr, i, j);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}