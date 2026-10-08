class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>map = new HashMap<>();
        boolean containsNearByDuplicate = false;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    containsNearByDuplicate = true;
                }
            }


            map.put(nums[i],i);
        }
       
     return containsNearByDuplicate;


    }
}