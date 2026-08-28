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

        // Square every number
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];

        }

        // Sort the squared values
        Arrays.sort(nums);

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);

            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
