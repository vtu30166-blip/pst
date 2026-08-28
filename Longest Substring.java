class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];

        // Initialize all positions to -1
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If character appeared inside current window
            if (lastIndex[c] >= left) {
                left = lastIndex[c] + 1;
            }

            lastIndex[c] = right;

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
