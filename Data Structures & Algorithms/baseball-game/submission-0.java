

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {

            if (s.equals("+")) {
                int top = stack.pop();
                int secondTop = stack.peek();

                stack.push(top);
                stack.push(top + secondTop);
            }
            else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if (s.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }

        int result = 0;

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
