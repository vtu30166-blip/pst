import java.util.*;

public class Main {

    public static void maxSubarray(int[] arr) {

        // Kadane's algorithm for maximum subarray
        int currentSum = arr[0];
        int maxSubarray = arr[0];

        // For maximum subsequence
        int maxSubsequence = arr[0];
        int positiveSum = 0;
        boolean hasPositive = false;

        for (int i = 0; i < arr.length; i++) {

            // Maximum subarray
            if (i > 0) {
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSubarray = Math.max(maxSubarray, currentSum);
            }

            // Maximum subsequence
            if (arr[i] > 0) {
                positiveSum += arr[i];
                hasPositive = true;
            }

            maxSubsequence = Math.max(maxSubsequence, arr[i]);
        }

        if (hasPositive) {
            maxSubsequence = positiveSum;
        }

        System.out.println(maxSubarray + " " + maxSubsequence);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            maxSubarray(arr);
        }
    }
}
