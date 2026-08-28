import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        // Handle edge case where s cannot physically fit p
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        // Fixed-size frequency arrays for lowercase English letters
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Fill initial frequency map for p and the first window of s
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // Check the first window (index 0)
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // Slide the window across s
        for (int i = p.length(); i < s.length(); i++) {
            // Include new character on the right
            sCount[s.charAt(i) - 'a']++;
            
            // Exclude old character on the left
            sCount[s.charAt(i - p.length()) - 'a']--;

            // Fast O(26) match check
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}
