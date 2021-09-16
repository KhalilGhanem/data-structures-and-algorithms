package Graph;

public class Node<T>{
  T value;
  int weight;

  public Node(T value){
    this.value=value;
  }

  public Node(T value, int weight) {
    this.value = value;
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", weight=" + weight +
      '}';
  }

}
