package stack.and.queue;

public class PseudoQueue<T> {
  Stack<T> firstStack = new Stack<T>();
  Stack<T> secondStack = new Stack<T>();


  public void enqueue(T value) {
    firstStack.push(value);
  }

  public T dequeue() throws Exception{
    T value=null;
    if (firstStack.isEmpty()==true){
      throw new Exception("The PseudoQueue is Empty");
    }
    while (firstStack.isEmpty()!=true){
      secondStack.push(firstStack.pop());
    }
    value=secondStack.pop();

    return value;
  }


}



// while (true) {
//   if(firstStack.isEmpty()!=true) {
//   firstStack.push(value);
//   try {
//   secondStack.push(firstStack.pop());
//   } catch (Exception e) {
//   e.printStackTrace();
//   }
//   }else {
//   break;
//   }
//   }

// System.out.println("second ..."+secondStack.top);
//   this.firstStack.push(value);
//   while (firstStack.isEmpty()!=true){
//   System.out.println("run");
//   try {
//   System.out.println("pop  "+firstStack.pop());
//   secondStack.push(firstStack.pop());
//   } catch (Exception e) {
//   e.printStackTrace();
//   }
//   }
