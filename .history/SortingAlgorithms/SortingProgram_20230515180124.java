package SortingAlgorithms;

import java.util.Random;
import java.util.Scanner;

public class SortingProgram {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Sorting Program!");

            // Get the number of boxes
            System.out.print("Enter the number of boxes: ");
            int numberOfBoxes = scanner.nextInt();

            // Generate random shoe sizes
            int[] shoeSizes = generateRandomSizes(numberOfBoxes);

            // Display the original shoe sizes
            System.out.println("\nOriginal shoe sizes:");
            displayShoeSizes(shoeSizes);

            // Sorting menu
            System.out.println("\nSorting Algorithms:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            System.out.println("6. Radix Sort");
            System.out.println("7. Bogo Sort");

            // Get the user's choice
            System.out.print("\nEnter your choice (1-7): ");
            int choice = scanner.nextInt();

            // Perform the selected sorting algorithm
            switch (choice) {
                case 1:
                    bubbleSort(shoeSizes);
                    break;
                case 2:
                    insertionSort(shoeSizes);
                    break;
                case 3:
                    selectionSort(shoeSizes);
                    break;
                case 4:
                    mergeSort(shoeSizes, 0, shoeSizes.length - 1);
                    break;
                case 5:
                    quickSort(shoeSizes, 0, shoeSizes.length - 1);
                    break;
                case 6:
                    radixSort(shoeSizes);
                    break;
                case 7:
                    bogoSort(shoeSizes);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }

            // Display the sorted shoe sizes
            System.out.println("\nSorted shoe sizes:");
            displayShoeSizes(shoeSizes);
        }
    }

    public static int[] generateRandomSizes(int numberOfBoxes) {
        int[] sizes = new int[numberOfBoxes];
        Random random = new Random();
        for (int i = 0; i < numberOfBoxes; i++) {
            sizes[i] = random.nextInt(100); // Generating random shoe sizes between 0 and 99
        }
        return sizes;
    }

    public static void displayShoeSizes(int[] shoeSizes) {
        for (int size : shoeSizes) {
            System.out.print(size + " ");
        }
        System.out.println();
    }

    // Bubble Sort implementation
    public static void bubbleSort(int[] arr) {
        // Implement bubble sort logic here
    }

    // Insertion Sort implementation
    public static void insertionSort(int[] arr) {
        // Implement insertion sort logic here
    }

    // Selection Sort implementation
    public static void selectionSort(int[] arr) {
        // Implement selection sort logic here
    }

    // Merge Sort implementation
    public static void mergeSort(int[] arr, int low, int high) {
        // Implement merge sort logic here
    }

    // Quick Sort implementation
    public static void quickSort(int[] arr, int low, int high) {
        // Implement quick sort logic here
    }

    // Radix Sort implementation
    public static void radixSort(int[] arr) {
        // Implement radix sort logic here
    }

    // Bogo Sort implementation
    public static void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffleArray(arr);
        }
    }

    /**
     * @param arr
     * @return
     */
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