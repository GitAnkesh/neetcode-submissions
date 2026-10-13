
class Solution {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();

        for (String s : strs) {
            result.append(s.length())
                  .append("#")
                  .append(s);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter after the length
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            // Extract exactly 'length' characters
            int start = j + 1;
            int end = start + length;

            result.add(str.substring(start, end));
            i = end;
        }

        return result;
    }
}