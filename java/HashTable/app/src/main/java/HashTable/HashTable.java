package HashTable;

public class HashTable<T> {
  Node[] hashArray;
  int size;
  public HashTable(int size) {
    this.size = size;
    hashArray = new Node[this.size];
    for (int i = 0; i < hashArray.length; i++) {
      hashArray[i] = new Node<T>();
    }
  }
    int hash(int key){
    return (key*7)%size;
  }
  public void add(int key,T value){
    int index=hash(key);
    Node newNode=new Node(key,value);
    Node arrayValue=hashArray[index];

    newNode.next=arrayValue.next;
    arrayValue.next=newNode;

  }
// throws Exception
  public T get(int key) {
    T value=null;
    int index=hash(key);
//    if(hashArray[index].value==null){
//      throw new Exception("this index is empty");
//    }else {
      Node arrayValue = hashArray[index];
      while (arrayValue != null) {
        if (arrayValue.key == key) {
          value = (T) arrayValue.value;
          break;
        }
        arrayValue = arrayValue.next;
      }
//    }
    return value;
  }

  public boolean contains(int key){
    boolean result=false;
    int index=hash(key);
    Node arrayValue=hashArray[index];
    while (arrayValue!=null){
      if (arrayValue.key==key){
        result=true;
        break;
      }
      arrayValue=arrayValue.next;
    }
    return result;
  }

}
