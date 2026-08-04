class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        if (nums == null || nums.length == 0) {
            return ans;
        }

        
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        
        int arr[]=new int[max+1];
        for(int i:nums){
            arr[i]++;
        }

        for(int i=min;i<=max;i++){
            if (arr[i]==0) {
                ans.add(i);
            }
        }
        return ans;


    }
}