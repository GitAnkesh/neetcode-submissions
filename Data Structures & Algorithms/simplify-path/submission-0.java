class Solution {

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String[] tokens = path.split("/");

        for (String token : tokens) {

            if (token.equals("") || token.equals(".")) {
                continue;
            }

            else if (token.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {

                stack.push(token);

            }
        }

        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}