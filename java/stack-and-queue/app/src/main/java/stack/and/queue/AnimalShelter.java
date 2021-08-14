package stack.and.queue;

import org.checkerframework.checker.units.qual.C;

public class AnimalShelter<Animal> {
  Node<Animal> front,rear;

  public void enqueue(Animal animal){
    Node<Animal>newNode=new Node(animal);
    if ((animal instanceof Cat || animal instanceof Dog) && front==null){
      front=newNode;
      rear=front;
    }else if (animal instanceof Cat || animal instanceof Dog){
      rear.next=newNode;
      rear=newNode;
    }
  }

  public String dequeue(String pref){
    String result=null;
    if ((pref.toLowerCase()=="cat" || pref.toLowerCase()=="dog")&& front!=null){
      Node<Animal>temp=front;
      front=front.next;
      temp.next=null;
      System.out.println(temp.value.toString());
      if (temp.value.toString().contains("Cat")){
        result= "cat";
      }else if(temp.value.toString().contains("Dog")){
        result= "dog";
      }
    }else {
      result= null;
    }
    return result;
  }

}
