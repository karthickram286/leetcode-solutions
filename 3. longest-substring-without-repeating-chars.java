class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        
        while (right < s.length()) {
            
            // If set is empty or if both pointers are in same position
            // move right
            if (set.isEmpty() || right == left) {
                set.add(s.charAt(right));
                right++;
            } else if (!set.contains(s.charAt(right))) {
                // If value is not present in set add to it and move right
                set.add(s.charAt(right));
                right++;
            } else {
                // If value is already present remove it from set and reduce the window
                // by moving left
                set.remove(s.charAt(left));
                left++;
            }
            
            maxLength = Math.max(maxLength, set.size());
        }
        
        return maxLength;
    }
}
