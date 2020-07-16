class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        int end = 0;
        int maxLength = -1;
        HashSet<Character> set = new HashSet<>();
        
        while (end < s.length()) {
            
            // Adding the characters between the window to a set
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                
                maxLength = Math.max(maxLength, (end-start));
            } else {
                
                // If the end value already occurs in the set, moving the start to the character
                // which matches the end character.
                while (start < end && end < s.length()) {
                    if (s.charAt(start) != s.charAt(end)) {
                        
                        // The characters before the matching character will be removed
                        set.remove(s.charAt(start));
                        start++;
                    } else {
                        start++;
                        end++;
                        break;
                    }
                }
            }
        }
        
        // For cases where all the characters are unique
        if (maxLength == -1)
            maxLength = s.length();
        
        return maxLength;
    }
}
