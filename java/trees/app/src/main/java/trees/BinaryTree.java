package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T> {
  Node<T>root;
  ArrayList<T> preList = new ArrayList<T>();
  ArrayList<T> inList = new ArrayList<T>();
  ArrayList<T> postList = new ArrayList<T>();
  //ArrayList<String> cars = new ArrayList<String>();

  public BinaryTree(){
    this.root=null;
  }


  public BinaryTree(T value){
    Node<T>newNode=new Node<>(value);
    if (root==null){
      root=newNode;
    }
  }

  public ArrayList<T> preOrder(Node<T> root) throws Exception{
    if (root==null){
      throw new Exception("The tree in empty");
    }

    if(root!=null){
      preList.add(root.value);
    }
    if (root.left!=null){
      preOrder(root.left);
    }
    if(root.right!=null){
      preOrder(root.right);
    }

    return preList;
  }

  public ArrayList<T> inOrder(Node<T> root) throws Exception {
    if (root==null){
      throw new Exception("The tree in empty");
    }

    if (root.left!=null){
      inOrder(root.left);
    }
    if (root!=null){
      inList.add(root.value);
    }
    if (root.right!=null){
      inOrder(root.right);
    }

    return inList;
  }

  public ArrayList<T> postOrder(Node<T> root) throws Exception{
    if (root==null){
      throw new Exception("The tree in empty");
    }
    if (root.left!=null){
      postOrder(root.left);
    }
    if (root.right!=null){
      postOrder(root.right);
    }
    if (root!=null){
      postList.add(root.value);
    }

    return postList;
  }

  public int maximumValue(){
    int max=0;
    if (root==null){
      return max;
    }else {

      try {
        ArrayList<T> result=postOrder(root);
        for (T t : result) {
          if ((int)t>max){
            max=(int)t;
          }
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    return max;
  }
  public List<T> breadthFirstTraversal(){
    List<T> list = new ArrayList<>();
    if(this.root != null){
      Queue q = new LinkedList();
      q.offer(this.root);
      while(q.peek() != null){
        Node front = (Node) q.poll();
        list.add((T) front.value);
        if(front.left != null){
          q.offer(front.left);
        }
        if(front.right !=null){
          q.offer(front.right);
        }
      }
    }
    else{
      throw new NullPointerException("Empty Queue");
    }
    return list;
  }

}
