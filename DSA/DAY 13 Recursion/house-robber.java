class Solution {

    int[] dp;

    public int rob(int[] nums) {

        dp = new int[nums.length+1];

        Arrays.fill(dp, -1);

        return robbing(0, nums);
        
    }

    int robbing(int n, int[] nums){

        if(n>=nums.length) return 0;

        if(dp[n]!= -1) return dp[n];

        int rob = nums[n] + robbing(n+2, nums);
        int dontrob = robbing(n+1, nums);

        dp[n] = Math.max(rob, dontrob);

        return dp[n];
    }
}