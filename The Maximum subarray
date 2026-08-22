import java.util.*;

public class Main {

    public static int[] maxSubarray(int[] arr) {
        int maxSubarray = arr[0];
        int current = arr[0];

        int maxSubsequence = arr[0];
        int positiveSum = 0;

        for (int i = 0; i < arr.length; i++) {

            // Maximum subarray - Kadane's Algorithm
            if (i > 0) {
                current = Math.max(arr[i], current + arr[i]);
                maxSubarray = Math.max(maxSubarray, current);
            }

            // Maximum subsequence
            if (arr[i] > 0) {
                positiveSum += arr[i];
            }

            maxSubsequence = Math.max(maxSubsequence, arr[i]);
        }

        if (positiveSum > 0) {
            maxSubsequence = positiveSum;
        }

        return new int[]{maxSubarray, maxSubsequence};
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

            int[] result = maxSubarray(arr);

            System.out.println(result[0] + " " + result[1]);
        }

        sc.close();
    }
}
