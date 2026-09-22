class Solution {
    public void sortColors(int[] nums) {
        int r =0;
        int w = 0;
        int b = nums.length-1;
//nums=[1,2,0]

        while(w<=b){
            if(nums[w]==0){
                int temp =nums[w];
                nums[w]= nums[r];
                nums[r]= temp;
                r++;
                w++;
            }
            else if(nums[w]==2){
                int temp = nums[b];
                nums[b]=nums[w];
                nums[w]=temp;

                b--;
                
            }
            else{
                w++;
            }
        }
    }
}