class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int open=0;
        int close=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                open++;
            }else if(!st.isEmpty() && ch==')' && st.peek()=='('){
                st.pop();
                open--;
                
            }else{
                close++;
            }
        }

        return open+close;
    }
}