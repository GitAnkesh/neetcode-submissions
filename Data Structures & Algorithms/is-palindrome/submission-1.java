class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
       String temp= s.toLowerCase();

        while(left<right){

           while( left<right && !Character.isLetterOrDigit(temp.charAt(left))){
            left++;
           }
            while(left<right && !Character.isLetterOrDigit(temp.charAt(right))){
            right--;
           }

           if(temp.charAt(left)!=temp.charAt(right)){
            return false;
           }

            left++;
            right--;
        }
        return true;
    }
}
