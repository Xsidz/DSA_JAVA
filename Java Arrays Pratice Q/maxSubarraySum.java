public class maxSubarraySum {

    public static void maxsubarray(int arr[]) {

        // Brute force
        int maxsum = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentsum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = 0; j2 <= j; j2++) {
                    currentsum = currentsum + arr[j2];
                    System.out.println("current Sum is :" + currentsum);
                    if (currentsum > maxsum) {
                        maxsum = currentsum;

                    }
                }
            }

            System.out.println("The maximum sum is : " + maxsum);

        }
    }

    public static void Maxsubarray(int arr[]){
        
            int prefix[] = new int [arr.length];
            prefix[0] = arr[0];
            int maxSum = Integer.MIN_VALUE;

            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i-1] + arr[i];
            }

            for (int i = 0; i < prefix.length; i++) {
                int start = i;
                int currentSum = 0;
                for (int j = i+1; j < prefix.length; j++) {
                    int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                    
                }
            }
            System.out.println("The max Sum is  :" + maxSum);
    }
    
    class Solution {
        public int maxSubArray(int[] nums) {
            int prefix[] = new int[nums.length];
            prefix[0] = nums[0];
            int maxSum = Integer.MIN_VALUE;

            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i - 1] + nums[i];
            }

            for (int i = 0; i < prefix.length; i++) {
                int start = i;
                int currentSum = 0;
                for (int j = i + 1; j < prefix.length; j++) {
                    int end = j;
                    currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int sum[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maxsubarray(sum);
        Maxsubarray(sum);
    }
}