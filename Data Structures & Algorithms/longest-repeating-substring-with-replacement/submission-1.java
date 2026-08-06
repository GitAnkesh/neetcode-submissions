 class Solution {

    public int characterReplacement(String s, int k) {

        int max = 0;
        int[] counts = new int[26];

        int i = 0;
        int maxC = 0;

        for (int j = 0; j < s.length(); j++) {

            char c = s.charAt(j);

            counts[c - 'A']++;

            maxC = Math.max(maxC, counts[c - 'A']);

            int operations = (j - i + 1) - maxC;

            while (operations > k) {

                counts[s.charAt(i) - 'A']--;

                i++;

                operations = (j - i + 1) - maxC;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }
 }