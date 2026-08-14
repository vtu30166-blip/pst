import java.util.*;

class Main {
    public static int[] topKFrequent(int[] nums, int k) {
        // Count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Create buckets
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // Fill buckets
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }
        
        // Collect top k elements
        int[] result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            for (int num : buckets[i]) {
                result[index++] = num;
                if (index == k) break;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        int[] result1 = topKFrequent(nums1, k1);
        System.out.println("Example 1: " + Arrays.toString(result1)); // [1, 2]
        
        // Example 2
        int[] nums2 = {1};
        int k2 = 1;
        int[] result2 = topKFrequent(nums2, k2);
        System.out.println("Example 2: " + Arrays.toString(result2)); // [1]
        
        // Example 3
        int[] nums3 = {1, 2, 1, 2, 1, 2, 3, 1, 3, 2};
        int k3 = 2;
        int[] result3 = topKFrequent(nums3, k3);
        System.out.println("Example 3: " + Arrays.toString(result3)); // [1, 2]
    }
}
