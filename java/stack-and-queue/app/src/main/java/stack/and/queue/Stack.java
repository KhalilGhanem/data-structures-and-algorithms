package stack.and.queue;

public class Stack<T> {
  Node<T> top;

  public Stack(){
    this.top=null;
  }

  public void push(T value){
    Node<T>newNode=new Node(value);
    if (top==null){
      top=newNode;
    }else {
      newNode.next=top;
      top=newNode;
    }
  }
  public T pop() throws Exception{
    if (top==null){
      throw new Exception("The Stack is empty");
    }else {
      Node temp=top;
      top=top.next;
      temp.next=null;
      return top.value;
    }

  }
  public T peek() throws Exception{
    if (top==null){
      throw new Exception("The Stack is empty");
    }else {
      return top.value;
    }
  }

  public boolean isEmpty(){
    if (top==null){
      return true;
    }else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Stack{" +
      "top=" + top.value +
      '}';
  }
}
