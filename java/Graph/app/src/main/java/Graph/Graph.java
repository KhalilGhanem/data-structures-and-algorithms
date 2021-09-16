package Graph;

import java.util.*;

public class Graph<T> {
  Map<Node<T>, List<Node<T>>> graphList=new HashMap<>();
  Graph(){};

  public Node<T> addNode(T value){
    Node newNode=new Node(value);
    graphList.put(newNode,new ArrayList<>());

    return newNode;
  }

  public void addEdge(Node<T> source,Node<T> destination,boolean bidirectional){

    if (graphList.containsKey(source) && graphList.containsKey(destination)){
      graphList.get(source).add(destination);
      if (bidirectional){
        graphList.get(destination).add(source);
      }else {
        System.out.println("one of the nodes is not exist in the graph");
      }
    }

  }
  public void addEdge(Node<T> source,Node<T> destination,boolean bidirectional,int weight){

    if (graphList.containsKey(source) && graphList.containsKey(destination)){
      source.setWeight(weight);
      graphList.get(source).add(destination);
      if (bidirectional){
        destination.setWeight(weight);
        graphList.get(destination).add(source);
      }else {
        System.out.println("one of the nodes is not exist in the graph");
      }
    }
  }

  public List<Node<T>> getNodes(){
    System.out.println(graphList.size());
    if (!graphList.isEmpty()) {
      List<Node<T>> nodeList = new ArrayList<>();
      for (Node<T> key : graphList.keySet()) {
        nodeList.add(key);
      }
      return nodeList;
    }else {
      return null;
    }
  }

  public List<Node<T>> getNeighbors(Node node){
    if (graphList.containsKey(node)){
      List<Node<T>> nodeList = new ArrayList<>();
      return graphList.get(node);
    }
    return null;
  }

  public int size(){
    return graphList.size();
  }


}




// Sources https://www.geeksforgeeks.org/implementing-generic-graph-in-java/ ---- https://algorithms.tutorialhorizon.com/weighted-graph-implementation-java/
