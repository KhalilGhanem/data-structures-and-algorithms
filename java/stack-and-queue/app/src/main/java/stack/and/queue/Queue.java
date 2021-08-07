package stack.and.queue;

public class Queue<T> {
  Node<T> front,rear;
  public Queue(){
    front=null;
    rear=null;
  }

  public void enqueue(T value){
    Node<T>newNode=new Node(value);
    if (front==null){
      front=newNode;
      rear=front;
    }else {
      rear.next=newNode;
      rear=newNode;
    }
  }

  public T dequeue() throws Exception{
    if (front==null){
    throw new Exception("The queue is empty");
    }else {
      Node temp=front;
      front=front.next;
      temp.next=null;
      return front.value;
    }
  }

  public T peek () throws Exception{
    if (front==null){
      throw new Exception("The queue is empty");
    }else {
      return front.value;
    }
  }
  public boolean isEmpty() {
    if (front==null){
      return true;
    }else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Queue{" +
      "front=" + front.value +
      ", rear=" + rear.value +
      '}';
  }
}
