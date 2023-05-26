class Solution {
    public int maxCoins(int[] piles) {
        int count = 0;
        Arrays.sort(piles);
        if(piles.length == 3){
            return piles[1];
        }
        int index = piles.length - 2;
        for(int i = 0; i < piles.length/3; i++){
            count += piles[index];
            index-=2;
        }
        return count;
    }
}