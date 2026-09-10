class Solution {
    public int minMoves(int target, int maxDoubles) {
        int moves=0;
        int num=target;

        while(num>1){
            if(maxDoubles==0){
                moves+=num-1;
                break;
            }
            
            if(num%2==0 && maxDoubles>0){
                maxDoubles--;
                moves++;
                num/=2;
                
            }else{
                num--;
                moves++;
            }

           
        }

        return moves;
    }
}