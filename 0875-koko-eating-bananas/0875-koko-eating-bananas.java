class Solution {
    public long timeReq(int[] piles,int timePerHour){
        long totalTime=0;

        for (int pile:piles) {
            totalTime+=((long) pile+timePerHour-1)/timePerHour;
        }

        return totalTime;
    }

    public int minEatingSpeed(int[] piles, int h) {
       int maxEle=Integer.MIN_VALUE;

       for(int i=0;i<piles.length;i++){
         maxEle=Math.max(maxEle,piles[i]);
       } 

       int st=1;
       int end=maxEle;

       while(st<=end){
        int mid=st+(end-st)/2;

        if(timeReq(piles,mid)<=h){
            end=mid-1;
        }else{
            st=mid+1;
        }
       }

       return st;
    }
}