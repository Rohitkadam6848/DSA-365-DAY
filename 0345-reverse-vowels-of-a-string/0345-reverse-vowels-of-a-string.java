class Solution {
    public boolean isVowel(char ch){
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }

        return false;
    }
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int st=0;
        int end=arr.length-1;

        while(st<end){
            if(isVowel(arr[st])&& isVowel(arr[end])){
                char temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }else if(!isVowel(arr[st])){
                st++;
            }else if(!isVowel(arr[end])){
                end--;
            }
        }

        StringBuilder sb=new StringBuilder();

        for(char ch:arr){
            sb.append(ch);
        }

        return sb.toString();
    }
}