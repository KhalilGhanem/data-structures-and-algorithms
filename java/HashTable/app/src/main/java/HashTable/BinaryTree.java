package HashTable;

import java.util.ArrayList;

//public class BinaryTree<T> {
//  Node<T>root;
//  ArrayList<T> preList = new ArrayList<T>();
//
//  public BinaryTree(){
//    this.root=null;
//  }
//
//  public BinaryTree(T value){
//    Node<T>newNode=new Node(value);
//    if (root==null){
//      root=newNode;
//    }
//  }
//
//  public ArrayList<T> preOrder(Node<T> root) throws Exception{
//    if (root==null){
//      throw new Exception("The tree in empty");
//    }
//
//    if(root!=null){
//      preList.add(root.value);
//    }
//    if (root.left!=null){
//      preOrder(root.left);
//    }
//    if(root.right!=null){
//      preOrder(root.right);
//    }
//
//    return preList;
//  }
//
//  @Override
//  public String toString() {
//    return "BinaryTree{" +
//      "preList=" + preList +
//      '}';
//  }
//}
