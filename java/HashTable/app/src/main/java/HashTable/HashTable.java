package HashTable;

import java.util.Arrays;

public class HashTable<T> {
  Node[] hashArray;
  int size;

  public HashTable(int size) {
    this.size = size;
    this.hashArray=new Node[this.size];

    for (int i = 0; i < hashArray.length; i++) {
      hashArray[i]=new Node();
    }
  }

  public int hash(T key){
    return (Math.abs(key.hashCode()*7)) % hashArray.length;
  }

  public void add(T key,T value){
    int index=hash(key);
    Node newNode=new Node(key,value);

    if (hashArray[index].value==null){
      hashArray[index]=newNode;
    }else {
      newNode.next=hashArray[index].next;
      hashArray[index].next=newNode;
    }
  }

  public T get(T key) {
    T value = null;
    int index = hash(key);
    if (hashArray[index]==null){
      return null;
    }else {
      Node arrayValue = hashArray[index];
      while (arrayValue!=null){
        if (arrayValue.key==key){
          value=(T)arrayValue.value;
          break;
        }
        arrayValue=arrayValue.next;
      }
    }

    return value;
  }
  public boolean contains(T key){
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

  public void  printValue(T key){
    int index=hash(key);
    System.out.println(hashArray[index].value);
  }

  @Override
  public String toString() {
    return "HashTable{" +
      "hashArray=" + Arrays.toString(hashArray) +
      '}';
  }

  //return (Math.abs(key.hashCode()*599)) % hashArray.length;
}
