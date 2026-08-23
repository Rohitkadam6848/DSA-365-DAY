class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int half=n/2;
        int q1=0;
        int q2=0;

        int leftSum=0;
        int rightSum=0;

        for(int i=0;i<half;i++){
            if(num.charAt(i)=='?'){
                q1++;
            }else{
                leftSum+=num.charAt(i)-'0';
            }
        }

        for(int i=half;i<n;i++){
            if(num.charAt(i)=='?'){
                q2++;
            }else{
                rightSum+=num.charAt(i)-'0';
            }
        }

        int q=q1+q2;
        if(q%2!=0){
            return true;
        }

        int diff=leftSum-rightSum;
        int target=q1-q2;

        return diff+9*(target/2)!=0;

    }
}