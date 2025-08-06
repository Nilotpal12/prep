class Solution {

    int dp[];

    public int tribonacci(int n) {
        dp = new int[n+1];

        Arrays.fill(dp,-1);
        return tr(n);
    }

    int tr(int n){

        if(n==0) return 0;
        if(n==1||n==2) return 1;

        if(dp[n]!=-1) return dp[n];

        dp[n] = tr(n-1)+tr(n-2)+tr(n-3);
        return dp[n];
    }
}