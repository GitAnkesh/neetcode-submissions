class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int poppedIndex = stack.pop();
                int height = heights[poppedIndex];
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
                int width = i - leftBoundary - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        // Process remaining bars

        while (!stack.isEmpty()) {
            int poppedIndex = stack.pop();
            int height = heights[poppedIndex];
            int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
            int width = heights.length - leftBoundary - 1;

            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
