//1 sep 2025
//https://leetcode.com/problems/asteroid-collision/

class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) stack.push(nums[i]);
            else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(nums[i])) stack.pop();
                if(stack.isEmpty() || stack.peek() < 0) stack.push(nums[i]);
                else if(stack.peek() == Math.abs(nums[i])) stack.pop();
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}