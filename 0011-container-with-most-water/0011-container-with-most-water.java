class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        // Area = length * width 
        // length = min(start, end)
        // width = start - end
        while(start < end){
            int area = Math.min(height[start], height[end])*(end - start);
            max = Math.max(area, max);
            if(height[start] > height[end]){
                end--;
            } else {
                start++;
            }
        }
        return max;
    }
}