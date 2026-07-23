
class Solution {
    public int largestRectangleArea(int[] heights) {
        // Base case: if the array is empty, the max area is 0
        if (heights == null || heights.length == 0) {
            return 0;
        }
        
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        // Loop runs up to heights.length to handle any bars left in the stack
        for (int i = 0; i <= heights.length; i++) {
            // Treat the index past the end of the array as a bar of height 0
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            // Maintain a strictly increasing stack
            while (!st.isEmpty() && currentHeight < heights[st.peek()]) {
                // Pop the top bar to calculate its maximum possible rectangle area
                int h = heights[st.pop()];
                
                // Determine the width of the rectangle
                // If stack is empty, 'h' was the shortest bar seen so far, spanning from index 0 to i
                int w = st.isEmpty() ? i : i - st.peek() - 1;
                
                // Calculate and update the maximum area found so far
                maxArea = Math.max(maxArea, h * w);
            }
            
            // Push the current index onto the stack
            st.push(i);
        }

        return maxArea;
    }
}
