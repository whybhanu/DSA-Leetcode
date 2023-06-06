class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int count = 0;
        while(i <= n){
            n = n - i;
            count++;
            i++;
        }
        return count;
    }
}

// 1 2 3 4 5

// 12
// 1 2 3 4 5 6 7 8 9 10 11 12
// 