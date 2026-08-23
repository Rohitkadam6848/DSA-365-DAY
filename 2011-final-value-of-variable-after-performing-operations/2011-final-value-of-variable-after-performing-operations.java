class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;

        for(String s:operations){
            if("X++".equals(s) || "++X".equals(s)){
                ans++;
            }else{
                ans--;
            }
        }

        return ans;
    }
}