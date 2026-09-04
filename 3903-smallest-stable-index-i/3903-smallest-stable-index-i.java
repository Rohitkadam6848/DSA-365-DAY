class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            //calclate min
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                min=Math.min(min,nums[j]);
            }

            //calculate max
            int max=Integer.MIN_VALUE;
            for(int l=0;l<=i;l++){
                max=Math.max(max,nums[l]);
            }

            if(max-min<=k){
                return i;
            }


        }

        return -1;
    }
}