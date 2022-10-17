public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        
        StringBuilder encoded = new StringBuilder();
        
        for (String str : strs) {
            String encodedString = str.length() + "_" + str;
            encoded.append(encodedString);
        }
        
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        System.out.println(s);
        List<String> list = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            int j = i;
            
            // The string length can be more than 1 digit
            // So we are moving the pointer until we find an underscore
            while (s.charAt(j) != '_') 
                j++;

            // This is the real length of the string
            int length = Integer.valueOf(s.substring(i, j));
            
            i = j + 1 + length;
            list.add(s.substring(j + 1, i));
       }
        
       return list;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));