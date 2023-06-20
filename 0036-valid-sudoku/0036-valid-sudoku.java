class Solution {
    public boolean isValidSudoku(char[][] nums) {
        HashSet<Character> row = null;
        HashSet<Character> col = null;

        for(int i = 0; i < 9; i++){
            row = new HashSet<>();
            col = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char r = nums[i][j];
                char c = nums[j][i];
                if(r!='.'){
                    if(row.contains(r)) return false;
                    else row.add(r);
                    
                }
                if(c!='.'){
                    if(col.contains(c)) return false;
                    else col.add(c);
                }
            }
        }

        // checking 3 x 3 blocks
        for(int i = 0; i < 9; i = i + 3){
            for(int j = 0; j < 9; j = j + 3){
                if(!checkBlock(i, j, nums)) return false;
            }
        }
        return true;
    }

    boolean checkBlock(int idxI, int idxJ, char[][] board) {
        Set<Character> blockSet = new HashSet<>();
        int rows = idxI + 3;
        int cols = idxJ + 3;
        for (int i = idxI; i < rows; i++) {
            for (int j = idxJ; j < cols; j++) {
                if (board[i][j] == '.') continue;
                if (blockSet.contains(board[i][j])) return false;
                blockSet.add(board[i][j]);
            }
        }
        return true;
    }
}