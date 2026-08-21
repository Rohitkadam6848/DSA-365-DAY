class Node{
    int val;
    Node next;

    public Node(int val){
        this.val=val;
        this.next=null;
    }
}
class FrontMiddleBackQueue {
    Node head;
    int size;

    public FrontMiddleBackQueue() {
        head=null;
        size=0;
    }
    
    public void pushFront(int val) {
        Node newNode=new Node(val);

        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
            
        }
        size++;
    }
    
    public void pushMiddle(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        if (size == 1) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        int index = size / 2;

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
        
    }
    
    public void pushBack(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

        size++;
    }
    
    public int popFront() {
        if(head==null){
            return -1;
        }

        if(head.next==null){
            int val= head.val;
            head=null;
            size--;
            return val;
        }

        int val=head.val;
        head=head.next;
        size--;
        return val;


    }
    
    public int popMiddle() {
        if(head==null){
            return -1;
        }
        
        if(head.next==null){
            int val= head.val;
            head=null;
            size--;
            return val;   
        }
        
        if(size==2){
            int val=head.val;
            head=head.next;
            size--;
            return val;
        }
        
        int count=0;
        Node temp=head;
        Node prev=null;

        while(temp!=null){
            if(count==(size-1)/2){
                int val=temp.val;
                prev.next=temp.next;
                temp=null;
                size--;
                
                return val;
            }
            count++;
            prev=temp;
            temp=temp.next;
        }
    
        size--;

        return -1;
    }
    
    public int popBack() {
        if(head==null){
            return -1;
        }

        if(head.next==null){
            int val= head.val;
            head=null;
            size--;
            return val;
        }

        Node prev=null;
        Node temp=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        size--;

        return temp.val;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */