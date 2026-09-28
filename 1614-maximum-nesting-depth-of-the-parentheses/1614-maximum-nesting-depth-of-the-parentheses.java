class Solution {
    public int maxDepth(String s) {
        int maxDepth=0;
        int currDepth=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                currDepth++;
                maxDepth=Math.max(maxDepth,currDepth);
            }else if(ch==')'){
                currDepth--;
            }
        }

        return maxDepth;
    }
}