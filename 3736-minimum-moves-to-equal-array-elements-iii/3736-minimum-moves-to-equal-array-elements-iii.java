class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int ans=0;

        Arrays.sort(nums);

        int max=nums[n-1];

        for(int i=0;i<n;i++){
            if(nums[i]==max)continue;

            ans+=Math.abs(nums[i]-max);
        }

        return ans;
    }
}