class Solution {
    public int singleNumber(int[] nums) {
        int j=0;
        int num=0;
        for(int i=0; i<32; i++){
           int count=0;
            for(int p=0; p<nums.length; p++){
                count+=(nums[p]>>i) & 1 ;
            }

            if(count%3 ==0){ //bit 0 hogi;  
            num= num | (0<<j);

                
            } else{//bit 1 hogi;
            num=num | (1<<j);

            }
            j++;
        }

        for(int k=0; k<nums.length; k++){
            if(nums[k]==num){
                return nums[k];
            }
        }
        return -1;
     
 
        
    }
}