package trees;

public class BinarySearchTree<T> extends BinaryTree<T> {
  Node<T> root;

  public BinarySearchTree(T value) {
    Node<T> newNode = new Node<>(value);
    if (root == null) {
      root = newNode;
    }
  }

  public void Add(T value){
    Node<T> newNode = new Node<>(value);
    if (root==null){
      root=newNode;
    }

    }
  }
}

