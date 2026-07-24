class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                int idx = stack.pop();
                map.put(nums2[idx], nums2[i]); // [1,3,4,2] -> [ 3, 4 ,-1, -1]

            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            map.put(nums2[idx], -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}