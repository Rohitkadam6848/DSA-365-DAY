class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int min=nums1[0];
        int odd=0;

        for(int i=0;i<n;i++){
            min=Math.min(min,nums1[i]);
            odd|=nums1[i] & 1;
        }

        return (min & 1)==odd;
    }
}