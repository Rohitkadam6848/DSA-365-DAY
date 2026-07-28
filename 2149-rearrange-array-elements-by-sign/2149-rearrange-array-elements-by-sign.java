class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int i=0;
        int j=0;

        for(int num:nums){
            if(num>0){
                pos[i]=num;
                i++;
            }else{
                neg[j]=num;
                j++;
            }
        }

        int ans[]=new int[n];
        int p=0,ne=0,k=0;
        while(p<pos.length && ne<neg.length ){
            ans[k++]=pos[p++];
            ans[k++]=neg[ne++];
        }

        return ans;
    }
}