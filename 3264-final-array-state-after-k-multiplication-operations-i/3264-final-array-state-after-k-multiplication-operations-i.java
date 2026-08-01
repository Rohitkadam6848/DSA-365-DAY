class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        while(k-->0){
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int j=1;j<nums.length;j++){
                if (nums[j] < nums[idx]) {
                    idx = j;
                }
            }
            nums[idx]*=multiplier;
        }

        return nums;
    }
}