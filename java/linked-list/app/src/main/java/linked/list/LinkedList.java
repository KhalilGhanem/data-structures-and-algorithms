package linked.list;

public class LinkedList {
  Node head;

  public LinkedList(){
    head=null;
  }

  public void insert(int value){
    Node newNode=new Node(value);
    if(head==null){
      head=newNode;
    }else {
      Node current=head;
      while (current.next !=null){
        current=current.next;
      }
      current.next=newNode;

    }
  }

  public boolean includes(int value){
    boolean target=false;
    Node current=head;
    int count=0;
    while (current!=null){
      count++;
      if (current.value==value){
        target=true;
        System.out.println("The target value is at node number:"+count+" in the linked list");
        return target;
      }
      current=current.next;
    }

    return target;
  }
  public String to_string(){
    String listValues="";
    Node current=head;
    while (current!=null){
      listValues+="{ "+current.value+" } -> ";
      current=current.next;
    }
    listValues+="Null";

    return listValues;
  }
}
