package linked.list;

public class LinkedList {
  Node head;

  public LinkedList() {
    head = null;
  }

  public void insert(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next=head;
      head=newNode;
//      Node current = head;
//      while (current.next != null) {
//        current = current.next;
//      }
//      current.next = newNode;

    }
  }

  public boolean includes(int value) {
    boolean target = false;
    Node current = head;
    int count = 0;
    while (current != null) {
      count++;
      if (current.value == value) {
        target = true;
        System.out.println("The target value is at node number:" + count + " in the linked list");
        return target;
      }
      current = current.next;
    }

    return target;
  }

  public String to_string() {
    String listValues = "";
    Node current = head;
    while (current != null) {
      listValues += "{ " + current.value + " } -> ";
      current = current.next;
    }
    listValues += "Null";

    return listValues;
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

  public void insertBefore(int target, int value) {
    Node newNode = new Node(value);
    Node current = head;
    if (head != null) {
      if (head.value == target) {
        newNode.next = head;
        head = newNode;
      } else {
        while (current.next != null) {
          System.out.println(current.value);
          if (current.next.value == target) {
            newNode.next = current.next;
            current.next = newNode;
            break;
          }
          current = current.next;
        }
      }
    }
  }

  public void insertAfter(int target, int value) {
    Node newNode = new Node(value);
    Node current = head;
    if (head != null) {
      if (head.value == target) {
        newNode.next = head.next;
        head.next = newNode;
      } else {
        while (current.next != null) {
          System.out.println(current.value + " indie after");
          if (current.next.value == target) {
            newNode.next = current.next.next;
            current.next.next = newNode;
          }
          current = current.next;
        }
      }
    }
  }
  public int kthFromEnd( int k) throws Exception{
    int count=0;
    int target = 0;
    Node tail=null;
    Node nextNode=null;
    Node current=head;
    while (current!=null){
      count++;
      nextNode=current.next;
      current.next=tail;
      tail=current;
      current=nextNode;
    }
    if (k>count){
      throw new Exception("The number is greater than the length of the linked list ");
    }else if(0>k){
      throw new Exception("The number should be positive ");
    }
    else {
      for (int i=0;i<k;i++){
        tail=tail.next;
      }
      target=tail.value;
    }

    return target;
  }


}
// old
//int target = 0;
//  int count=0;
//  Node tail = head;
//    while (tail.next !=null){
//      ++count;
//      tail=tail.next;
//      }
//      int last=count;
//      System.out.println(last+ " last");
//      count=0;
//      while (tail.next !=null){
//      if((last-k)==count){
//      target=tail.value;
//      }
//      count++;
//      tail=tail.next;
//      }
//
//
//
//      return target;
//      }





//if (head != null) {
//  if (head.value == target) {
//  head.next = newNode;
//  } else {
//  while (current != null) {
//  System.out.println("cureent from after "+current.value);
//  if (current.value == target) {
//  newNode.next = current.next.next;
//  current.next = newNode;
//  break;
//  }else {
//  current = current.next;
//  }
//
//
//  }
//  }
//  }
