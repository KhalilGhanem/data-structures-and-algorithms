package HashTable;

public class Node <T>{
  T key;
  T value;
  Node next;

  public Node(T key,T value){
    this.key=key;
    this.value=value;
  }
  public Node(){};

//  public Node(T value){
//    this.value=value;
//  }

  public T getKey() {
    return key;
  }

  public void setKey(T key) {
    this.key = key;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" +
      "key=" + key +
      ", value=" + value +
      '}';
  }
}
