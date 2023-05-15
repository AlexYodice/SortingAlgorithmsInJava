public class BubbleSort {
    public static void main(String[] args) {
        int[] shoeSizes = { 8, 5, 12, 3, 10 }; // Example shoe sizes to sort

        bubbleSort(shoeSizes);

        // Print the sorted shoe sizes
        for (int size : shoeSizes) {
            System.out.print(size + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
