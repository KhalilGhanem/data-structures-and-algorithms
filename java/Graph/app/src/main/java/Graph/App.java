/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Graph;

import java.util.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

//        Graph<String>test=new Graph<String>();
//        Node<String> node1=test.addNode("Amman");
//        Node<String> node2=test.addNode("Zarqa");
//        Node<String> node3=test.addNode("Irbid");
//        Node<String> node4=test.addNode("Aqabah");
//        Node<String> node5=test.addNode("Karak");
//
//
//        test.addEdge(node1,node2,true,10);
//        test.addEdge(node1,node5,true,30);
//
//      Queue<Integer> breadth  = new LinkedList<>();
//      breadth.add(15);
//      breadth.add(11);
//      breadth.add(7);
//      breadth.add(5);
//      System.out.println(breadth.toString());
//      System.out.println(breadth.remove());
//      System.out.println(breadth.toString());
      // Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo
        Graph<String>test=new Graph<String>();
        Node<String> node1=test.addNode("Pandora");
        Node<String> node2=test.addNode("Arendelle");
        Node<String> node3=test.addNode("Metroville");
        Node<String> node4=test.addNode("Monstroplolis");
        Node<String> node5=test.addNode("Narnia");
        Node<String> node6=test.addNode("Naboo");

        test.addEdge(node1,node2,true);

        test.addEdge(node2,node3,true);
        test.addEdge(node2,node4,true);

        test.addEdge(node3,node5,true);
        test.addEdge(node3,node6,true);
        test.addEdge(node3,node4,true);

        test.addEdge(node4,node6,true);

        test.addEdge(node5,node6,true);

      System.out.println(test.breadthFirst(node1));









//        test.addEdge(node1,node2,true);
//      System.out.println(test.getNodes());
//      System.out.println(test.graphList.containsKey(node1));
//      System.out.println("N"+test.getNeighbors(node1));
//      System.out.println(test.size());
//      for (Node key : test.graphList.keySet()) {
//        System.out.println(key);
//      }

    }


}
