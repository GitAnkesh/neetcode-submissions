class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();

        int [] ans = new int[temperatures.length];

        for(int i =0;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[i]>temperatures[st.peek()]){
                int prevIndex = st.pop();
                ans[prevIndex]= i-prevIndex;
            }
            st.push(i);
        }
        return ans;
    }
}
