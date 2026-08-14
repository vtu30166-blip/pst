import java.util.Arrays;

class Main {
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        
        return maxAltitude;
    }
    
    public static void main(String[] args) {
        // Example 1
        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println("Example 1: " + largestAltitude(gain1)); // Output: 1
        
        // Example 2
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println("Example 2: " + largestAltitude(gain2)); // Output: 0
        
        // Test with positive gains
        int[] gain3 = {1, 2, 3, 4};
        System.out.println("Example 3: " + largestAltitude(gain3)); // Output: 10
    }
}
