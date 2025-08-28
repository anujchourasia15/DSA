//27 aug 2025
//Link: https://www.geeksforgeeks.org/problems/next-greater-element/1

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(-1);
        }
        int n = arr.length;
        for(int i = 2*n-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i%n]){
                stack.pop();
            }
            if(!stack.isEmpty()) list.set(i%n, stack.peek());
            stack.push(arr[i%n]);
            
        }
        return list;
    }
}