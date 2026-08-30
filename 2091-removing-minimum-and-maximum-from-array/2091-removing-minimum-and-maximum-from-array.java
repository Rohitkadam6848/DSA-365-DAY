class Solution {
    public int minimumDeletions(int[] nums) {
       int n=nums.length;
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       int maxIdx=0;
       int minIdx=0;

       for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIdx=i;
            }
            
            if(nums[i]<min){
                min=nums[i];
                minIdx=i;
            }
       }

       int front=Math.max(maxIdx,minIdx)+1;
       int back=n-Math.min(maxIdx,minIdx);
       
       int both = Math.min(maxIdx, minIdx) + 1
                + n - Math.max(maxIdx, minIdx);

       return Math.min(front,Math.min(back,both));
    }
}