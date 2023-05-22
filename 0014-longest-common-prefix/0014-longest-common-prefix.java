class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        
        for (int i = 0; i < strs.length; i++) {
            prefix = commonPrefix(prefix, strs[i]);
            if (prefix == "")
                break;
        }        
        return prefix;
    }
    
    private String commonPrefix(String a, String b) {
        StringBuilder prefix = new StringBuilder();
        int size = 0;
        for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
            if (a.charAt(i) == b.charAt(j))
                prefix.append(a.charAt(i));
            else
                break;
        }
        return prefix.toString();
    }
}