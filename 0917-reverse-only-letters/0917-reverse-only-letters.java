class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();

        int st=0;
        int end=arr.length-1;

        while(st<end){
            if(Character.isLetter(arr[st])&& Character.isLetter(arr[end])){
                char temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }else if(!Character.isLetter(arr[st])){
                st++;
            }else if(!Character.isLetter(arr[end])){
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

