class OrderedStream {
    private String[] orderStream;
    private int ptr;

    public OrderedStream(int n) {
        orderStream=new String[n];
        ptr=0;
    }
    
    public List<String> insert(int idKey, String value) {
        orderStream[idKey-1]=value;

        List<String> result=new ArrayList<>();
        while(ptr<orderStream.length && orderStream[ptr]!=null){
            result.add(orderStream[ptr++]);
        }

        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */