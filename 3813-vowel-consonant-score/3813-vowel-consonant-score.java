class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int cos=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                v++;
            }else if(c>='a' && c<='z'){
                cos++;
            }
        }


        return cos > 0 ? v / cos : 0;

         
    }
}