class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, // pointas on word
            j = 0; // points om abbr
        
        while(i<word.length() && j<abbr.length()){
            if(Character.isLetter(abbr.charAt(j))){
                if( word.charAt(i) != abbr.charAt(j)){
                    return false;
                }
                i++;
                j++;
            }
            
            else{
                int curr =0;
                if (abbr.charAt(j) == '0'){
                    return false;
                }
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))){
                    curr = curr * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i = i + curr;
            }
        }
        return i == word.length() && j == abbr.length();
    }
}