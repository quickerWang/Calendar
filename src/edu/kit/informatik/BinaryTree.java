package edu.kit.informatik;

import java.util.List;

/**
 * 二叉树功能接口
 */
public interface BinaryTree {
    void InOrder(Node node, List<Object> list);//中序递归遍历
    void PostOrder(Node node, List<Object> list);//后序递归遍历
    void PreOrder(Node node, List<Object> list); //前序递归遍历
    int getDeep();//获取指定节点之下的深度,解决递归求深度问题
    int getCount(Node node); //得到叶子结点数量
    int deep(Node node); //获取指定节点之下的深度,解决递归求深度问题
    boolean isEmpty() ;  //判断二叉树是否为空
    Node getRoot(); //获取根节点
}
