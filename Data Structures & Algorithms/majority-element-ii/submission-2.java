class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int me1 = -1;
        int me2 = -1;
        int c1 =0;
        int c2 =0;

        for(int num:nums){
            if(me1==num){
                c1++;
            }
            else if(me2==num){
                c2++;
            }
            else if(c1==0){
                c1=1;
                me1=num;
            }
            else if(c2==0){
                c2=1;
                me2=num;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=c2=0;
        for(int num:nums){
            if(num==me1)c1++;
            else if(num==me2)c2++;
        }
        List<Integer> result = new ArrayList<>();
        if(c1>nums.length/3){
            result.add(me1);
        }
        if(c2>nums.length/3){
            result.add(me2);
        }
        return result;
        
    }
}