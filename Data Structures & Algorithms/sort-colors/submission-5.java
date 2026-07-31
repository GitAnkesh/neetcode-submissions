class Solution {
    public void sortColors(int[] nums) {
     int redIndex =0;
     int whiteIndex =0;
     int blueInddex =nums.length-1;

     while(whiteIndex <= blueInddex){
        if(nums[whiteIndex]==0){
            swap(nums,redIndex,whiteIndex);
            whiteIndex++;
            redIndex++;
            
        }
        else if(nums[whiteIndex]==2){
            swap(nums,whiteIndex,blueInddex); // 1 0 2
            blueInddex--;


        }
        else{
            whiteIndex++;
        }
       
     }

    }
    public void swap(int[]nums,int li,int ri){
        int temp = nums[li];
        nums[li]=nums[ri];
        nums[ri]=temp;
    }
}