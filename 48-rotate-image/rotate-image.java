class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int top = 0;
        int bottom = len - 1;

        while (top < bottom) {
            for (int i = 0; i < len; i++) {
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = temp;
            }
            top++;
            bottom--;
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}