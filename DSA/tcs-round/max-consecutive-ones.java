class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;

        for(int num: nums){
            if(num==1){
                count++;
            }else{
                max = count>max?count:max;
                count = 0;
            }
        }

        max = count>max?count:max;

        return max;
    }
}