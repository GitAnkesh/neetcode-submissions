

class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the delimiter '#' starting from index i
            int hashIndex = str.indexOf('#', i);
            
            // Extract the length of the next string
            int length = Integer.parseInt(str.substring(i, hashIndex));
            
            // The actual string starts right after '#'
            int start = hashIndex + 1;
            int end = start + length;
            
            result.add(str.substring(start, end));
            
            // Move index past the current string
            i = end;
        }
        
        return result;
    }
}