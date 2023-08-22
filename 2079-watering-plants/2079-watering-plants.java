class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int idx = 0;
        int can = capacity;
        
        while(idx < plants.length){
            if(can >= plants[idx]){
                steps++;
                can-=plants[idx];
                idx++;
            } else {
                steps += idx * 2;
                can = capacity;
            }
        }
        return steps;
    }
}