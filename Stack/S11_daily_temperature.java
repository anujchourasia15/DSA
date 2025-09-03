// 3 sep 2025
// https://leetcode.com/problems/daily-temperatures/

class Solution {
    public int[] dailyTemperatures(int[] nums) {
        if(nums.length == 1) return nums;
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length-1; i >= 0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]) stack.pop();
            if(!stack.isEmpty()) ans[i] = stack.peek()-i;
            else ans[i] = 0; 
            stack.push(i);
        }
        
        return ans;
    }
}


// 73,74,75,71,69,72,76,73
// 1 2 6 6 6 6 -1 -1