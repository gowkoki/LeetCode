class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int x = 0;
        int y = 0;
        int dx = 1;
        int dy = 0;

        for (int i = 0; i < n * n; i++) {
            result[y][x] = i + 1;

            if (!(0 <= x + dx && x + dx < n && 0 <= y + dy && y + dy < n && result[y + dy][x + dx] == 0)) {
                int temp = dx;
                dx = -dy;
                dy = temp;
            }

            x += dx;
            y += dy;
        }

        return result;
    }
}