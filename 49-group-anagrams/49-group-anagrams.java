class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Creating a list of strings from the input and sorting the characters of those strings
        List<String> listOfSortedStrings = new ArrayList<>();
        for (String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            listOfSortedStrings.add(String.valueOf(charArray));
        }
                
        // Creating a map with the sorted form as key and input strings as list of values
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < listOfSortedStrings.size(); i++) {
            String key = listOfSortedStrings.get(i);
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        
        return new ArrayList(map.values());
    }
}