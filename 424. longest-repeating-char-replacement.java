class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        while (right < s.length()) {
            // Counting the occurrances of characters in the map
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            
            // Counting the max occurance from the map
            int max = Collections.max(map.values());
            int windowLength = right - left + 1;
                        
            // If the length of (window - max occurance) is more than k then it means
            // we can change any character in the window anymore. So we need to move the
            // left pointer by one position, remove the character from map and also reduce the
            // size of the window
            if (windowLength - max > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
                windowLength--;
            }
            
            maxLength = Math.max(maxLength, windowLength);
            right++;
        }
        
        return maxLength;
    }
}
