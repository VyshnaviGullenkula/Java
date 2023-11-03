package Arrays;

public class NumberSumInArray {
        public static void main(String[]args) {
            int[] input1 = {1, 2, 3, 4, 5};
            int[] input2 = {1, 2, -3, 4, 5};
            int[] input3 = {};
            int[] input4 = null;

            int output1 = calculateArraySum(input1);
            int output2 = calculateArraySum(input2);
            int output3 = calculateArraySum(input3);
            int output4 = calculateArraySum(input4);

            System.out.println("Output 1: " + output1);
            System.out.println("Output 2: " + output2);
            System.out.println("Output 3: " + output3);
            System.out.println("Output 4: " + output4);
        }
            public static int calculateArraySum(int[] arr) {
                if (arr == null) {
                    return -3; // Condition 4: If the input array is null, return -3
                } else if (arr.length == 0) {
                    return -2; // Condition 3: If the input array is empty, return -2
                } else {
                    int sum = 0;
                    for (int num : arr) {
                        sum += num;
                    }

                    if (sum < 0) {
                        return -1; // Condition 2: If the sum is negative, return -1
                    } else {
                        return sum; // Condition 1: If the sum is positive, return the sum
                    }
                }
        }
}

