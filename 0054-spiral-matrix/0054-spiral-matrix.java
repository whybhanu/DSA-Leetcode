class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // taking 4 positions
        int top = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // using 4 directions 
        int direction = 0;

        List<Integer> list = new ArrayList<>();
        
        // main condition
        while(top <= down && left <= right){
            if(direction == 0){
                for(int i = left; i <= right; i++){
                    list.add(matrix[top][i]);
                }
                top++;
                direction++;
            } else if(direction == 1){
                for(int i = top; i <= down; i++){
                    list.add(matrix[i][right]);
                }
                right--;
                direction++;
            } else if(direction == 2){
                for(int i = right; i >= left; i--){
                    list.add(matrix[down][i]);
                }
                direction++;
                down--;
            } else if(direction == 3){
                for(int i = down; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
                direction = 0;
            }
        }

        return list;
    }
}