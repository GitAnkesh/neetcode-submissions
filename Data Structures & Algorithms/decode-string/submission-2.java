
class Solution {
    public String decodeString(String s) {
        //2[a3[b]]-> abbbabbb -> 

        int num =0;
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();


        for(char ch:s.toCharArray()){


            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }
            else if(ch == '['){
                countStack.push(num);
                stringStack.push(current);

                num=0;
                current = new StringBuilder();

            }
            else if(ch==']'){
                StringBuilder previous = stringStack.pop();
                int repeat = countStack.pop();

                for(int i=0;i<repeat;i++){
                    previous.append(current);
                }
                current = previous;
            }
            else{
                current.append(ch);
            }
        }
      return current.toString();
    }
}