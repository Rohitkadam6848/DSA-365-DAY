class Solution {
    public List<Integer> PascalsTriangle(int row){
        List<Integer> temp=new ArrayList<>();
        long ans=1;
        temp.add((int)ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            temp.add((int)ans);
        }

        return temp;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(PascalsTriangle(i));
        }
        return ans;
    }
}