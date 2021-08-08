package stack.and.queue;

public class PseudoQueue<T> {
  Stack<T>firstStack=new Stack<T>();
  Stack<T>secondStack=new Stack<T>();

  public void enqueue(T value){
    firstStack.push(value);
    try {
      secondStack.push(firstStack.pop());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
