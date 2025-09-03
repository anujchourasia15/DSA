// 2 sep 2025
// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/

class Solution {
    public int[] finalPrices(int[] nums) {
        if(nums.length == 1) return nums;
        int[] nse = findNSE(nums);
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nse[i] > 0){
                ans[i] = nums[i] - nse[i];
            }else{
                ans[i] = nums[i];
            }
        }
        return ans;
    }

    public int[] findNSE(int[] nums){
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() > nums[i]) stack.pop();
            if(!stack.isEmpty()) ans[i] = stack.peek();
            else ans[i] = -1; 
            stack.push(nums[i]);
        }
        return ans;
    }
}

// 4 2 2 -1 -1