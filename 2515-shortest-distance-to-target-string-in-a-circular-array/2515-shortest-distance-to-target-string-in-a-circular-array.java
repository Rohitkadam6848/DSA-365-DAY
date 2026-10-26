class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ans=Integer.MAX_VALUE;
        int n=words.length;

        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int diff=Math.abs(startIndex-i);
                int dist=Math.min(diff,n-diff);

                ans=Math.min(ans,dist);
            }
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}