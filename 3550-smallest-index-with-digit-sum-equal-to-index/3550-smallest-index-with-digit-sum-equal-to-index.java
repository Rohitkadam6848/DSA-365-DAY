class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            int digitSum=0;
            int num=nums[i];
            while(num>0){
                digitSum+=num%10;
                num/=10;
            }

            if(digitSum==i){
                return i;
            }
        }

        return -1;
    }
}