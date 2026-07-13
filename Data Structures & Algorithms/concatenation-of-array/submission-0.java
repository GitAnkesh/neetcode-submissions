class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] result = new int[nums.length*2];
        int k =0;
        for(int i =0;i<nums.length;i++){
            result[k++]=nums[i];
        }


        for(int i=0;i<nums.length;i++){
            result[k++]=nums[i];

        }
        return result;
    }
}