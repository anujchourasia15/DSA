//  2 sep 2025
// https://leetcode.com/problems/largest-rectangle-in-histogram/description/

class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                int element = stack.pop();
                int nse = i, pse = (stack.isEmpty()) ? -1 : stack.peek();
                area = Math.max(area, arr[element] * (nse - pse - 1));
            } 
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int nse = arr.length;
            int element = stack.pop(), pse = (stack.isEmpty()) ? -1 : stack.peek();
            area = Math.max(area, arr[element] * (nse - pse - 1));
        }
        return area;
    }
}