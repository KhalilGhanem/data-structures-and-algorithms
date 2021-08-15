package trees;

public class BinarySearchTree<T> extends BinaryTree<T> {
  Node<T> root;

  public BinarySearchTree(T value) {
    Node<T> newNode = new Node<>(value);
      this.root = newNode;

  }

  public void Add(T value) {
    root = addRecursive(root, value);
  }

  private Node addRecursive(Node current, T value) {
    if (current == null) {
      return new Node(value);
    }

    if ((int)value < (int)current.value) {
      current.left = addRecursive(current.left, value);
    } else if ((int)value > (int)current.value) {
      current.right = addRecursive(current.right, value);
    } else {
      // value already exists
      return current;
    }
    return current;
  }

  public boolean Contains(T value){
    boolean result =false;
    Node newnode=searchRecursive(root,value);
    if (newnode==null){
      return result;
    }
    else if (newnode.value==value){
      result =true;
      return result;
    }else {
      result=false;
    }

    return result;
  }

  private Node searchRecursive(Node current, T value){
    if (current==null || current.value==value){
      return current;
    }else if((int)value<(int)current.value){
      return searchRecursive(current.left,value);
    }else {
      return searchRecursive(current.right,value);
    }
  }


  }


