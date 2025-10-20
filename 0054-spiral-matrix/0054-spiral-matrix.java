class Solution {
     

    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        int len = matrix[0].length*matrix.length;
        List<Integer> result = new ArrayList<>();
        int row =0;
        int col =0;

        while (result.size() < len) {

            //straight
            while(col<=endCol && result.size() < len){
                result.add(matrix[row][col++]);
            }
            col--;
            row++;
            startRow++;

            //down
            while(row<=endRow && result.size() < len){
                result.add(matrix[row++][col]);
            }
            row--;
            col--;
            endCol--;

            //reverse
            while(col>=startCol && result.size() < len){
                result.add(matrix[row][col--]);
            }
            row--;
            col++;
            endRow--;
            
            //reverse up
            while(row>=startRow && result.size() < len){
                result.add(matrix[row--][col]);
            }
            row++;
            col++;
            startCol++;
        }

        return result;
    }

    

}