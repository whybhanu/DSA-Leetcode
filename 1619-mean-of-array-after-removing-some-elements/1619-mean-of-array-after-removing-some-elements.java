class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double smallestElement = 0.05 * arr.length;
        double biggestElement = smallestElement;
        double mean = 0;
        for(int i = (int)(smallestElement); i < arr.length - biggestElement; i++){
            mean = mean + arr[i];
        }
        return mean/(arr.length - 2 * biggestElement);
    }
}