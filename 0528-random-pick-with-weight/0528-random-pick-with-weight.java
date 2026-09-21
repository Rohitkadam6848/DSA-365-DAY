class Solution {
    int prefixSum[];
    int totalSum;

    public Solution(int[] w) {
        prefixSum=new int[w.length];
        int sum=0;

        for(int i=0;i<w.length;i++){
            sum+=w[i];
            prefixSum[i]=sum;
        }

        totalSum=sum;
    }
    
    public int pickIndex() {
        Random ran=new Random();
        int target=ran.nextInt(totalSum)+1;

        int st=0;
        int end=prefixSum.length;

        while(st<end){
            int mid=st+(end-st)/2;
            if(target>prefixSum[mid]){
                st=mid+1;
            }else{
                end=mid;
            }
        }  

        return st;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */