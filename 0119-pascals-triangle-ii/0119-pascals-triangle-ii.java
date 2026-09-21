class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        long temp=1;
        ans.add((int) temp);

        for(int col=1;col<=rowIndex;col++){
            temp=temp*(rowIndex-col+1);
            temp=temp/col;
            ans.add((int) temp);
        }

        return ans;
    }
}