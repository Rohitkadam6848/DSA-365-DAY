class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int ans=0;

        for(int i=0;i<n;++i){
            for(int j=i;j<n;++j){
                if((j-i+1)%2==1){
                    int currSum=0;
                    for(int k=i;k<j+1;k++){
                        currSum+=arr[k];
                    }
                    ans+=currSum;
                }
            }   
        }

        return ans;


    }
}