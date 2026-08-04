class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char mag[]=magazine.toCharArray();

        for(int i=0;i<ransomNote.length();i++){
            boolean found=false;
            for(int j=0;j<magazine.length();j++){
                if(ransomNote.charAt(i)==mag[j]){
                    mag[j]='#';
                    found=true;
                    break;
                }
            }

            if(!found){
                return false;
            }
        }

        return true;
    }
}