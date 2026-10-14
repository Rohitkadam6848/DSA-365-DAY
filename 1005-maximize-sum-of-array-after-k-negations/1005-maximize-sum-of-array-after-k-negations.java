class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;

        Arrays.sort(nums);
        int ans=0;

        for(int i=0;i<n && k>0 ;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
            }
        }

        Arrays.sort(nums);

        if(k%2==1){
            nums[0]=-nums[0];
        }



        for(int i=0;i<n;i++){
            ans+=nums[i];
        }

        

        return ans;
    }
}