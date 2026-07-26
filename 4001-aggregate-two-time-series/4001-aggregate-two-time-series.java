class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans=new ArrayList<>();

        int i=0,j=0;
        int n=series1.length;
        int m=series2.length;

        while(i<n || j<m){
            int time;

            if(i==n){
                time=series2[j][0];
            }else if(j==m){
                time=series1[i][0];
            }else{
                time=Math.min(series1[i][0],series2[j][0]);
            }

            int val1=0,val2=0;

            if(i<n){
                val1=series1[i][1];

                if(series1[i][0]==time){
                    i++;
                }
            }

            if(j<m){
                val2=series2[j][1];

                if(series2[j][0]==time){
                    j++;
                }
            }

            ans.add(Arrays.asList(time,val1+val2));
            
        }

        return ans;
    }
}