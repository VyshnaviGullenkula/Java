package Arrays;

public class FindIndexInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;

        int index = findIndex(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " is found at index " + index);
        } else {
            System.out.println("Element " + target + " is not found in the array.");
        }
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}