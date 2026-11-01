class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int ans=0;

        int min=Integer.MAX_VALUE;

        for(int num:nums){
            min=Math.min(min,num);

        }

        for(int i=0;i<n;i++){
            if(min==nums[i]){
                continue;
            }

            ans+=(nums[i]-min);
        }

        return ans;

        
    }
}