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
  public void append( int value){
    Node newNode=new Node(value);
    if(head==null){
      head=newNode;
    }else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }
  public void  insertBefore (int target, int value){
    Node newNode=new Node(value);
    Node current = head;
    if(head!=null){
      if(head.value==target){
        newNode.next=head;
        head=newNode;
      }else {
        while (current.next != null) {
          System.out.println(current.value);
          if (current.next.value == target) {
            newNode.next = current.next;
            current.next=newNode;
            break;
          }
            current = current.next;
        }
      }
    }
  }
  public void insertAfter(int target,int value) {
    Node newNode = new Node(value);
    Node current = head;
    if (head != null) {
      if (head.value == target) {
        head.next = newNode;
      } else {
        while (current != null) {
          if (current.value == target) {
            newNode.next = current.next.next;
            current.next = newNode;
          }
          current = current.next;
        }
      }
    }
  }

}
