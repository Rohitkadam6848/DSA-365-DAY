class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> ans=new ArrayList<>();

        while(num>0){
            ans.add(num%10);
            num/=10;
        }

        Collections.sort(ans);

        return (ans.get(0) * 10 + ans.get(2) + ans.get(1)*10 + ans.get(3));
    }
}