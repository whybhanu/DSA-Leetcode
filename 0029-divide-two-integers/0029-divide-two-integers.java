class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            dividend = dividend+1;
        }
        int res = dividend/divisor;
        return res;
    }
}