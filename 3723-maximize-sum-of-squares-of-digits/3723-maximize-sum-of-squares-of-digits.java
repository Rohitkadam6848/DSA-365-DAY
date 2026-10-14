class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num){
            return "";
        }

        StringBuilder ans=new StringBuilder();
        int remaining=sum;

        for(int i=0;i<num;i++){
            int digit=Math.min(9,remaining);

            ans.append(digit);

            remaining-=digit;
        }

        if(remaining!=0){
            return "";
        }

        return ans.toString();
    }
}