package edu.kit.informatik;

/**
 * 结点类
 */
public class Node{
    Object data;
    Node left;
    Node right;
    public Node(){

    }
    public Node(Object data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public Node(Object data,Node left,Node right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}