//30 aug 2025
//https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c = 0; c < s.length(); c++){
            if(s.charAt(c) == '(' || s.charAt(c) == '[' || s.charAt(c) == '{'){
                stack.push(s.charAt(c));
            }else{ 
                if (!stack.isEmpty()){
                    if(stack.peek() == '(' && s.charAt(c) != ')') return false;
                    if(stack.peek() == '[' && s.charAt(c) != ']') return false;
                    if(stack.peek() == '{' && s.charAt(c) != '}') return false;
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}