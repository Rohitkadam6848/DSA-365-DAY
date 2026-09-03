class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int odd=0;
        int even=0;
        int min=Integer.MAX_VALUE;

        for(int num:nums1){
            if(num%2==0){
                even++;
            }else{
                odd++;
                min=Math.min(min,num);
            }
        }

        if(even==n){
            return true;
        }else if(odd==n){
            return true;
        }else{
            for(int num:nums1){
                if(num%2==0){
                    if(num<min){
                        return false;
                    }
                }
            }

            return true;
        }
    }
}