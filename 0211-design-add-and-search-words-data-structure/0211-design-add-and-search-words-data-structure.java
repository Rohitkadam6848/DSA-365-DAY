class WordDictionaryNode{
    WordDictionaryNode [] childeren=new WordDictionaryNode[26];
    boolean isEnd;
}

class WordDictionary {
    WordDictionaryNode root;

    public WordDictionary() {
        root=new WordDictionaryNode();
    }
    
    public void addWord(String word) {
        WordDictionaryNode node=root;

        for(char ch:word.toCharArray()){
            int idx=ch-'a';
            if(node.childeren[idx]==null){
                node.childeren[idx]=new WordDictionaryNode();
            }

            node=node.childeren[idx];
        }
        node.isEnd=true;
    }
    
    public boolean search(String word) {
        return dfs(word,0,root);
        
    }

    private boolean dfs(String word,int idx,WordDictionaryNode node){
        if(node==null){
            return false;
        }

        if(idx==word.length()){
            return node.isEnd;
        }

        char ch=word.charAt(idx);

        if(ch!='.'){
            return  dfs(word,idx+1,node.childeren[ch-'a']);
        }

        for(WordDictionaryNode child:node.childeren){
            if(child!=null && dfs(word,idx+1,child)){
                return true;
            }
        }

        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */