class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxWater = 0;

        while(left<right){

            int dist = right-left;

            int currentMaxWater = Math.min(heights[left],heights[right])*dist;
            maxWater= Math.max(maxWater,currentMaxWater);
            
            if(heights[left]>heights[right]){
                right--;
            }else{
                left++;
            }



        }
        return maxWater;

    }
}
