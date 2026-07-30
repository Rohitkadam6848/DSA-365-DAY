class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWind=Integer.MAX_VALUE;
        int n=nums.length;
        int i=0;
        int currSum=0;

        for(int j=0;j<n;j++){
            currSum+=nums[j];

            while(currSum>=target){
                minWind= Math.min(minWind,j-i+1);
                currSum-=nums[i];
                i++;
            }
        }

        return minWind == Integer.MAX_VALUE ? 0 : minWind;
    }
}