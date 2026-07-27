class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int count[]=new int[26];
        int max=0;

        int i=0;
        for(int j=0;j<n;j++){
            count[s.charAt(j)-'a']++;

            while(count[s.charAt(j)-'a']>2){
                count[s.charAt(i)-'a']--;
                i++;
            }

            max=Math.max(max,j-i+1);
        }

        return max;
    }
}