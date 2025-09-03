// 3 sep 2025
// https://leetcode.com/problems/car-fleet/

class Pair{
    int position;
    int speed;
    public Pair(int position, int speed){
        this.position=position;
        this.speed=speed;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair> pair = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            pair.add(new Pair(position[i], speed[i]));
        }
        pair.sort(Comparator.comparingInt(p -> p.position));
        Stack<Double> stack = new Stack<>();
        for(int i = pair.size()-1; i >= 0; i--){
            double time = (double)(target - pair.get(i).position) / pair.get(i).speed;
            if(stack.isEmpty() || time > stack.peek()) stack.push(time);
        }
        return stack.size();
    }
}
