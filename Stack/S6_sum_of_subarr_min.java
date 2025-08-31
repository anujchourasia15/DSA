//31 aug 2025
//https://leetcode.com/problems/sum-of-subarray-minimums/

class Solution {
    public int sumSubarrayMins(int[] arr) {
        long total = 0;
        int mod = (int)(1e9+7);
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);

        for(int i = 0; i < arr.length; i++){
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + (left * right * 1L * arr[i]) % mod ) % mod;
        }
        return (int)total;
    }

    public int[] findNSE(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            res[i] = (stack.isEmpty()) ? arr.length : stack.peek();
            stack.push(i);
        }
        return res;
    }
    public int[] findPSE(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]) stack.pop();
            res[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(i);
        }
        return res;
    }  
}