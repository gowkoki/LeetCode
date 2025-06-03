class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_Wealth = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max_Wealth = Math.max(max_Wealth, sum);
        }
        
        return max_Wealth;
    }
}