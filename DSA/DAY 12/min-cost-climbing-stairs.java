class Solution {

    int[] dp;

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length+1];
        Arrays.fill(dp, -1);
        
        return Math.min(minSteps(cost, 0),minSteps(cost, 1));
    }

    public int minSteps(int[] cost, int step){

        if(step>=cost.length) return 0;

        if(dp[step]!=-1) return dp[step];

        dp[step] = cost[step] + Math.min(minSteps(cost, step+1), 
                                minSteps(cost, step+2));

        return dp[step];
    }


}