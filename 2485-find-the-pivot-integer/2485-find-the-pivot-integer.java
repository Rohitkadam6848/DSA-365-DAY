class Solution {
    public int pivotInteger(int n) {

        if(n == 1){
            return 1;
        }

        int prefixSum[] = new int[n];
        prefixSum[0] = 1;

        int totalSum = 1;

        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + (i + 1);
            totalSum += (i + 1);
        }

        for(int i = 0; i < n; i++){

            int pivot = i + 1;

            int leftSum = prefixSum[i];

            int rightSum = totalSum - prefixSum[i] + pivot;

            if(leftSum == rightSum){
                return pivot;
            }
        }

        return -1;
    }
}