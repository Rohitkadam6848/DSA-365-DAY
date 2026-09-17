class Solution {
    public String compressedString(String word) {
        int n=word.length();
        int i=0, j=0;
        int count=0;

        StringBuilder sb=new StringBuilder();

        while(j<n){
            count=0;
            while(j<n && word.charAt(i)==word.charAt(j) && count<9){
                j++;
                count++;
            }

            sb.append(count).append(word.charAt(i));
            i=j;

        }

        return sb.toString();
    }
}