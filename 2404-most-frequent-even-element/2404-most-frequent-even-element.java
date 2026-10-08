class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            if(num%2==0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }

        int maxFre=0;
        int ans=-1;

        for(int num:map.keySet()){
           int freq=map.get(num);
           if(freq>maxFre || (freq==maxFre && num<ans)){
                maxFre=freq;
                ans=num;
           }
        }

        return ans;

        
    }
}