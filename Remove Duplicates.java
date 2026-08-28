import java.util.Arrays;

public class Main {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int k = 1; // Start from 1 because first element is always unique
        
        for (int i = 1; i < nums.length; i++) {
            // If current element is different from previous unique element
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
    
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("k = " + k1);
        System.out.println("nums = " + Arrays.toString(nums1));
        
        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("k = " + k2);
        System.out.println("nums = " + Arrays.toString(nums2));
    }
}
