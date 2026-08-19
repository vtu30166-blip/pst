import java.util.*;

public class Main {

    public static String largestNumber(int[] nums) {

        // Convert integers to strings
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort so that a+b is greater than b+a
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", all numbers are zero
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(largestNumber(nums));

        sc.close();
    }
}
