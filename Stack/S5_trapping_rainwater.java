//31 aug 2025
//https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] arr) {
        int l = 0, r = arr.length-1, total = 0;
        int leftMax = 0, rightMax = 0;
        while(l < r){
            if(arr[l] <= arr[r]){
                if(leftMax > arr[l]) total += leftMax - arr[l];
                else leftMax = arr[l];
                l++;
            }else{
                if(rightMax > arr[r]) total += rightMax - arr[r];
                else rightMax = arr[r];
                r--;
            }
        }
        return total;
    }
}