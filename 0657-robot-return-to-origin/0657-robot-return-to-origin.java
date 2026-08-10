class Solution {
    public boolean judgeCircle(String moves) {
        int[] ans=new int[]{0,0};

        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                ans[0]+=1;
            }else if(moves.charAt(i)=='D'){
                ans[0]-=1;
            }else if(moves.charAt(i)=='R'){
                ans[1]+=1;
            }else if(moves.charAt(i)=='L'){
                ans[1]-=1;
            }
        }

        boolean finalAns=false;
        if(ans[0]==0 && ans[1]==0){
            finalAns=true;
        }

        return finalAns;
        
    }
}