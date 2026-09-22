class Solution {
    public boolean isAnagram(String s, String p,int a[],int i,int j){
        int a2[]=new int[26];

        for(int r=i;r<j;r++){
            a2[s.charAt(r)-'a']++;
        }

        return Arrays.equals(a, a2);
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n1=s.length();
        int n2=p.length();

        List<Integer> ans=new ArrayList<>();
        int a[]=new int[26];

        if(n1<n2){
            return ans;
        } 

        for(int i=0;i<n2;i++){
            a[p.charAt(i)-'a']++;
        }

        for(int i=0;i<=n1-n2;i++){
            if(isAnagram(s,p,a,i,i+n2)){
                ans.add(i);
            }
        }

        return ans;

    }
}