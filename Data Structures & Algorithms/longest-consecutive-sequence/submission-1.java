class Solution {
    public int longestConsecutive(int[] nums) {
        int longest =0;
        Set<Integer> set = new HashSet<>();

        for(int val:nums){
            set.add(val);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int length=1;
                int current=num;

                while(set.contains(current+1)){
                    current++;
                    length++;

                }

                longest = Math.max(longest,length);
            }
            
        }
        return longest;
    }
}
