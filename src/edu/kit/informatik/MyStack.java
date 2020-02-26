package edu.kit.informatik;


//stack node
class LLNode {
    private Object data;//store data
    private LLNode next;//
    public LLNode(){

    }
    public LLNode(Object data){
        this.data=data;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public LLNode getNext() {
        return next;
    }
    public void setNext(LLNode next) {
        this.next = next;
    }
}

/**
 * a simple implementation of stack
 */
public class MyStack {
    LLNode headnode=null;
    public MyStack(){
        headnode=null;
    }

    public boolean isEmpty(){
        return headnode==null;
    }

    public void push(Object data){
        if(headnode==null){
            headnode=new LLNode(data);
        }
        else if(headnode.getData()==null){
            headnode.setData(data);
        }
        else {
            LLNode newnode=new LLNode(data);
            newnode.setNext(headnode);
            headnode=newnode;
        }
    }


    public Object pop(){
        Object data=null;
        if(isEmpty()){
            System.out.println("stack is empty");
            return 0;
        }
        data=headnode.getData();
        headnode=headnode.getNext();
        return data;
    }

    public Object peek(){
        Object data=null;
        if(isEmpty()){
            System.out.println("stack is empty");
            return 0;
        }
        data=headnode.getData();
        return data;
    }

    public int size(){
        int count=0;
        LLNode tempnode=headnode;
        if(isEmpty()||tempnode.getData()==null)
        {
            count=0;
        }
        else
        {
            while(tempnode!=null)
            {
                count++;
                tempnode=tempnode.getNext();
            }
        }
        return count;
    }

}
