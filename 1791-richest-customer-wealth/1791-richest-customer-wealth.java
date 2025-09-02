class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int tot = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tot += accounts[i][j];
            }
            max = Math.max(tot, max);
        }

        return max;
    }
}