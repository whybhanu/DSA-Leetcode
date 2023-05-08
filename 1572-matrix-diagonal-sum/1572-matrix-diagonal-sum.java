class Solution {
    public int diagonalSum(int[][] mat) {
        int count = 0;
        int a = 0;
        int b = mat[0].length - 1;
        int row = 0;
        for(int i = 0; i < mat.length; i++){
            if(a == b){
                count = mat[row][a] + count;
            } else {
                count = mat[row][a] + mat[row][b] + count;
            }
            row++;
            a++;
            b--;
        }
        return count;
    }
}