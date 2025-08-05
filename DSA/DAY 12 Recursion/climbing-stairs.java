class Solution {

    int[] dp;

    public int climbStairs(int n) {

        dp = new int[n];

        Arrays.fill(dp, -1);

        return climb(n,0);
        
    }

    public int climb(int n, int i){

        if(i==n) return 1;
        if(i>n) return 0;

        if(dp[i]!=-1) return dp[i];

        dp[i] =  climb(n,i+1)+climb(n,i+2);

        return dp[i];

    }
}