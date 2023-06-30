class Solution {
    public int countNicePairs(int[] nums) {
        long count= 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            int result = num - swap(num);
            if(!map.containsKey(result)) {
                map.put(result, 1);
            } else{
                map.put(result, map.get(result) + 1);
            }
            count = (count + map.get(result) - 1)%1000000007;
        }

        return (int)count;
    }
    int swap(int a){
        int ans = 0;
        while(a > 0){
            ans = ans*10 + a%10;
            a /= 10;
        }
        return ans;
    }
}