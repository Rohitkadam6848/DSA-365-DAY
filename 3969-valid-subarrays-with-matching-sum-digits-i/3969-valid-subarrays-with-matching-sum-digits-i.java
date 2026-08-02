class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum % 10 == x && isFirstDigitMatch(sum)==x){
                    count++;
                }
            }
        }

        return count;
    }

    public long isFirstDigitMatch(long sum){
        while(sum>=10){
            sum/=10;
        }
        return sum;
    }
}