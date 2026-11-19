class Solution {
    public int secondHighest(String s) {
        int firstMax=-1;
        int secondMax=-1;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if (Character.isDigit(ch)) {
                int val = ch - '0';
                if(val>firstMax){
                    secondMax=firstMax;
                    firstMax=val;

                }else if(val>secondMax && val!=firstMax){
                    secondMax=val;
                }
            }
        }

        return secondMax;

    }
}