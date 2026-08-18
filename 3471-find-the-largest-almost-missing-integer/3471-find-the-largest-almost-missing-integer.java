class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        if(k==n){
            int max=Integer.MIN_VALUE;

            for(int num:nums){
                max=Math.max(max,num);
            }

            return max;
        }

        if(k==1){
            int max=-1;

            for(int i=0;i<n;i++){
                if(map.get(nums[i])==1){
                    max = Math.max(max, nums[i]);
                }
            }

            return max;
        }

        int last=n-1;

        if(nums[0]==nums[last]){
            return -1;
        }

        if(map.get(nums[0])==1 && map.get(nums[last])==1){
            return Math.max(nums[0],nums[last]);
        }

        if(map.get(nums[0])==1){
            return nums[0];
        }

        if(map.get(nums[last])==1){
            return nums[last];
        }

        return -1;

    }
}