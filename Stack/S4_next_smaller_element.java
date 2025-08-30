//30 aug 2025
class Complete {
    public static int[] nextSmallerElement(int arr[], int n) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && stack.peek() >= arr[i]) stack.pop();
            if(!stack.isEmpty()) res[i] = stack.peek();
            else res[i] = -1;
            stack.push(arr[i]);
        }
        return res;
    }
}
