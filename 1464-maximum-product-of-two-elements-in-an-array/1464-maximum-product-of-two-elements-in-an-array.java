class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;

        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max2=max;
                max=nums[i];
            }else if(max2!=max && nums[i]>max2){
                max2=nums[i];
            }
        }

        return (max-1)*(max2-1);
        
    }
}