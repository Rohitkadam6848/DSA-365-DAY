class Solution {
    public int countTriplets(int[] arr) {
        int n=arr.length;
        int prefixSumAndXor[]=new int[n+1];
        int count=0;

        for(int i=0;i<n;i++){
            prefixSumAndXor[i+1]=prefixSumAndXor[i]^arr[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i+1,k=n;j<n;j++){
                if(prefixSumAndXor[i]==prefixSumAndXor[j+1]){
                    count+=j-i;
                }
            }
        }
        return count;

    }
}