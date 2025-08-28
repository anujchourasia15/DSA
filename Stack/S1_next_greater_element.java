//27 aug 2025
//Link: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(-1);
        }
        
        for(int i = arr.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) list.set(i, stack.peek());
            stack.push(arr[i]);
            
        }
        return list;
    }
}