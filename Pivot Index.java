import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find total sum
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
        }

        int leftSum = 0;

        // Check every index
        for (int i = 0; i < n; i++) {

            // Everything except left side and current number
            // is the right side
            int rightSum = total - leftSum - nums[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            // Add current number to left side
            leftSum += nums[i];
        }

        // No pivot found
        System.out.println(-1);

        sc.close();
    }
}
