class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] ans=new int[n];

        int st=0;
        int end=nums.length-1;

        for(int i=0 , j=nums.length-1 ; i<nums.length; i++,j--){
            if(nums[i]<pivot){
                ans[st]=nums[i];
                st++;
            }

            if(nums[j]>pivot){
                ans[end]=nums[j];
                end--;
            }

        }  

        while(st<=end){
            ans[st]=pivot;
            st++;
        } 

        return ans;
    }
}