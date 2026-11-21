class Solution {
    public int firstMatchingIndex(String s) {
        int st=0;
        int end=s.length()-1;

        while(st<=end){
            if(s.charAt(st)==s.charAt(end)){
                return st;
            }

            st++;
            end--;
        }

        return -1;
    }
}