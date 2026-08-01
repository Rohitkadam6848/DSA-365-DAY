class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }

        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int j=0;j<n;j++){
                if (ans[j] < min) {
                    min = ans[j];
                    idx = j;
                }
            }
            ans[idx]*=multiplier;
        }

        return ans;
    }
}