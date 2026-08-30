class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m=nums.length;

        int ans[]=new int[2*n];
        int k=0;

        for(int i=0;i<ans.length;i+=2){
            ans[i]=nums[k++];
        }

        for(int i=1;i<ans.length;i+=2){
            ans[i]=nums[k++];
        }

        return ans;
    }
}