package HashTable;

public class Node <T>{
  int key;
  T value;
  Node next;

  public Node(int key, T value) {
    this.key = key;
    this.value = value;
    this.next = null;
  }
  public Node(){
    next=null;
  }

  public int getKey() {
    return key;
  }

  public T getValue() {
    return value;
  }
}
