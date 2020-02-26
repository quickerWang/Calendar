package edu.kit.informatik;

import java.util.List;

/**
 * 二叉树类
 */
public class TwoLinkTree implements BinaryTree{

    //根节点
    private Node root;

    //默认的无参构造函数
    public TwoLinkTree(){
        root = null;
    }

    //根据提供的元素构造二叉树
    public TwoLinkTree(Object data){
        root = new Node(data);
    }

    //中序遍历
    public void InOrder(Node node, List<Object> list) {
        if(node!=null) {
            InOrder(node.left,list);
            list.add(node.data);
            InOrder(node.right,list);
        }
    }

    //后序遍历
    public void PostOrder(Node node, List<Object> list) {
        if(node!=null) {
            PostOrder(node.left,list);
            PostOrder(node.right,list);
            list.add(node.data);
        }
    }

    //前序遍历
    public void PreOrder(Node node, List<Object> list) {
        if(node!=null) {
            list.add(node.data);
            PreOrder(node.left,list);
            PreOrder(node.right,list);
        }
    }

    //递归获取二叉树的深度
    public int getDeep(){
        return deep(root);
    }

    //递归获取叶子结点个数
    public int getCount(Node node){
        int count =0;
        if(root==null)
            return 0;
        //叶子结点，返回1
        if(node.left==null&&node.right==null){
            return 1;
        }
        if(node.left!=null){
            count+=getCount(node.left);
        }
        if(node.right!=null){
            count+=getCount(node.right);
        }
        return count;
    }

    //获取指定节点之下的深度,解决递归求深度问题
    public int deep(Node node){
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null){
            return 1;
        }else{//采用递归的算法，遍历整个二叉树，每次将节点的最大深度（左子树、右子树深度不一致）传递给父节点
            int leftDeep=deep(node.left);
            int rightDeep=deep(node.right);
            //去深度最大值
            int max=leftDeep>rightDeep?leftDeep:rightDeep;
            return max+1;
        }
    }

    //判断二叉树是否为空
    public boolean isEmpty(){
        //这里之所以是对data进行判断是因为提供的构造函数都能够保证root不为空，但是data有可能为空
        return root==null;
    }

    //获取根节点
    public Node getRoot(){
        if(isEmpty()){
            return null;
        }
        return root;

    }


}