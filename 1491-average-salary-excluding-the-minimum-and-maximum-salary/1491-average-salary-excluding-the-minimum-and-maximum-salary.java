class Solution {
    public double average(int[] salary) {
        double avg=0;
        int n=salary.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);

            avg+=salary[i];
        }

        avg=avg-min-max;

     

        return avg/(n-2);
    }
}