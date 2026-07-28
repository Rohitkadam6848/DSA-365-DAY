class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int number=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                number=nums[i];
            }else if(nums[i]==number){
                count++;
            }else{
                count--;
            }
        }

        int cnt1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==number){
                cnt1++;
            }
        }

        return cnt1 > nums.length/2 ? number : -1;
    }
}