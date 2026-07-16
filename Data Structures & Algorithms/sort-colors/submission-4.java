class Solution {
    public void sortColors(int[] nums) {
        int red =0,white =0,blue=nums.length-1;

        while(white<= blue){
            if(nums[white]==0){
                swap(nums,white,red);
                white++;
                red++;

            }
            else if( nums[white]==2){
                 swap(nums,white,blue);
                blue--;
            }
            else{
                white++;
            }
        }
    
    }
    public void swap(int[] nums, int fi,int li){
            int temp = nums[fi];
            nums[fi]= nums[li];
            nums[li] = temp;

    }
}