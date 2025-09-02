// 1 sep 2025
// https://leetcode.com/problems/remove-k-digits/

    class Solution {
        public String removeKdigits(String num, int k) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < num.length(); i++){
                while(!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0) {
                    stack.pop();
                    k--;
                }
                stack.push(num.charAt(i));
            }
            while(k > 0){
                    stack.pop();
                    k--;
                }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.insert(0, stack.pop());
            }
            while (sb.length() > 1 && sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
            return sb.length() == 0 ? "0" : sb.toString();
        }
    }



