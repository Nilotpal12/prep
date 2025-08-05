class Solution {

    int[][] dp;

    public int uniquePaths(int m, int n) {

        dp = new int[m][n];

        for(int[] p: dp){
            Arrays.fill(p, -1);
        }

        return up(0,0,m,n);
    }

    public int up(int i, int j, int m, int n){
        
        if(i==m-1&&j==n-1) return 1;
        if(i>=m||j>=n) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        dp[i][j] = up(i+1,j,m,n) + up(i,j+1,m,n);

        return dp[i][j];
    }
}