class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j =n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){       /* nums1=[10,20,20,40,0,0]
m=4
nums2=[1,2]
n=2*/
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;

        }
        while(j>=0){
               nums1[k] = nums2[j];
                j--;
                k--;
        }
        
    }
}