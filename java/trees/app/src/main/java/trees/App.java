/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        BinaryTree<Integer> bs=new BinaryTree(1);
      System.out.println(bs.root.value+" test root");
      bs.root.left=new Node<>(70);
      bs.root.left.left=new Node<>(7);
      bs.root.left.right=new Node<>(9);
      bs.root.right=new Node<>(5);
      bs.root.right.left=new Node<>(11);
      bs.root.right.right=new Node<>(13);
      ArrayList<Integer> result=null;
//      try {
//         result=bs.postOrder(bs.root);
//      } catch (Exception e) {
//        e.printStackTrace();
//      }

//      ArrayList<Integer> result=bs.inOrder(bs.root);
//      ArrayList<Integer> result= null;
//      try {
//        result = bs.postOrder(bs.root);
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//      for (int i = 0; i < result.size(); i++) {
//        System.out.println(result.get(i));
//      }
//      BinarySearchTree<Integer> bst=new BinarySearchTree<>(15);
//      bst.Add(70);
//      bst.Add(10);
//      bst.Add(5);
//      bst.Add(13);
//      bst.Add(18);
//      bst.Add(120);
//      System.out.println(bst.Contains(10));

      /// CC16
      System.out.println("max v "+bs.maximumValue());


    }

}
