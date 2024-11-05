import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Read the elements of the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array is sorted in ascending order
        boolean isSorted = isArraySorted(array);

        // Output the result
        System.out.println(isSorted);
    }

    // Method to check if the array is sorted in ascending order
    private static boolean isArraySorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false; // If current element is less than the previous one, it's not sorted
            }
        }
        return true; // If no elements were out of order, it is sorted
    }
}