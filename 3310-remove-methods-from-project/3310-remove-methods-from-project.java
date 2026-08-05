class Solution {
    public void dfs(int u,List<List<Integer>> grph,boolean vis[]){
        vis[u]=true;

        for(int v:grph.get(u)){
            if(vis[v]){
                continue;
            }
            dfs(v,grph,vis);
        }
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> grph=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            grph.add(new ArrayList<>());
        }

        for(int[] arr:invocations){
            int u=arr[0];
            int v=arr[1];
            grph.get(u).add(v);
        }

        boolean vis[]=new boolean[n];
        dfs(k,grph,vis);

        for(int arr[]:invocations){
            int u=arr[0];
            int v=arr[1];

            if(!vis[u] && vis[v]){
                List<Integer> ans=new ArrayList<>();
                for(int i=0;i<n;i++){
                    ans.add(i);
                }
                return ans;
            }
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                ans.add(i);
            }
        }

        return ans;


    }
}