class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int [] hashS = new int[26]; //hashs means hash of s1
        int [] hashW = new int [26];

        int windowLen = s1.length();
        
        for(int i =0;i<windowLen;i++){
            ++hashS[s1.charAt(i)-'a'];
            ++hashW[s2.charAt(i)-'a'];
        }

        int i =0;
        int j = windowLen-1;

        while(j<s2.length()-1){
            if(hashMatch(hashS,hashW)){
                return true;
            }
            else{
            --hashW[s2.charAt(i)-'a'];
                i++;
                j++;
              ++hashW[s2.charAt(j)-'a'];
            }

        }

        return hashMatch(hashS, hashW);
    }
    public boolean hashMatch(int[]hashS,int[]hashW){
        for(int i=0;i<26;i++){
            if(hashS[i] !=hashW[i]){
                return false;
            }
        }
        return true;
    }
}