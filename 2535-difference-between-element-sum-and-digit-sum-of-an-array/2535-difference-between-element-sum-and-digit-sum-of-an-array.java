class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int digitSum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];

            while(nums[i]>0){
                int digit=nums[i]%10;
                digitSum+=digit;
                nums[i]/=10;
            }
        }

        return Math.abs(sum-digitSum);
    }
}