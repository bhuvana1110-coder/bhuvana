import java.util.Arrays;

public class BinarySearchWithImport {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;                    // Starting index of the search range
        int right = arr.length - 1;      // Ending index of the search range

        // Loop until the search range is valid
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Calculate the middle index

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;  // Target found, return the index
            }

            // If target is greater than mid element, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is less than mid element, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        // Example unsorted array
        int[] unsortedArray = {10, 4, 2, 8, 7, 1, 9, 5};

        // Sort the array using Arrays.sort() method
        Arrays.sort(unsortedArray);

        int target = 5;

        // Perform binary search
        int result = binarySearch(unsortedArray, target);

        // Output result
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
