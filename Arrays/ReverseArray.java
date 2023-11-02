package Arrays;

public class ReverseArray {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] reversedArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                reversedArr[i] = arr[arr.length - 1 - i];
            }

            System.out.print("Original Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.print("Reversed Array: ");
            for (int num : reversedArr) {
                System.out.print(num + " ");
            }
        }
    }
