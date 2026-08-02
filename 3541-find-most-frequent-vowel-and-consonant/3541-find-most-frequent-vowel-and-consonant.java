class Solution {
    public int maxFreqSum(String s) {
        int freq[]=new int[26];
        int maxVowel=0;
        int maxConst=0;
        for(char c:s.toCharArray()){
            int i=c-'a';
            freq[i]++;
            if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'){
                maxVowel=Math.max(maxVowel,freq[i]);
            }else{
                maxConst=Math.max(maxConst,freq[i]);
            }
        }

        return maxConst+maxVowel;
    }
}