class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k= k%len;
        
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    public void reverse(int[] nums,int li, int ri){
        while(li<ri){
            int temp = nums[li];
            nums[li]=nums[ri];
            nums[ri]=temp;
            li++;
            ri--;
        }
    }
}