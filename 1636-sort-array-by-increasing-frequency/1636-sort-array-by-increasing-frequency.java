class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        Integer[] newNums=new Integer[nums.length];
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            newNums[i]=nums[i];
        }

        Arrays.sort(newNums,(n1,n2)->{
            if (map.get(n1) != map.get(n2)) {
                return map.get(n1) - map.get(n2);
            } else {
                return n2 - n1;
            }
        });

        for(int i=0;i<nums.length;i++){
            nums[i]=newNums[i];
        }

        return nums;

        
    }
}