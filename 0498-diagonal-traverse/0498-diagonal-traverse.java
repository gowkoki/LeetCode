class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) {
            return new int[] {};
        }
        int row = mat.length;
        int col = mat[0].length;
        int[] result = new int[row * col];
        int x = 0;
        int y = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = mat[x][y];

            if ((x + y) % 2 == 0) {
                if (y == col - 1) {
                    x++;
                } else if (x == 0) {
                    y++;
                } else {
                    x--;
                    y++;
                }
            } else {
                if (x == row - 1) {
                    y++;
                } else if (y == 0) {
                    x++;
                } else {
                    x++;
                    y--;
                }
            }
        }

        return result;
    }
}