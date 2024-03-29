/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void testAddNode(){
      Graph<String>test=new Graph<String>();
      Node<String> node1=test.addNode("Amman");
      assertTrue(test.graphList.containsKey(node1));
    }
    @Test void  testAddEdge(){
      Graph<String>test=new Graph<String>();
      Node<String> node1=test.addNode("Amman");
      Node<String> node2=test.addNode("Zarqa");
      test.addEdge(node1,node2,true);
      assertEquals(node2,test.getNeighbors(node1).get(0));
    }
    @Test void testAllNode(){
      Graph<String>test=new Graph<String>();
      Node<String> node1=test.addNode("Amman");
      Node<String> node2=test.addNode("Zarqa");
      Node<String> node3=test.addNode("Irbid");
      Node<String> node4=test.addNode("Aqabah");
      Node<String> node5=test.addNode("Karak");
      List<Node> nodeList = new ArrayList<>();
      nodeList.add(node5);
      nodeList.add(node3);
      nodeList.add(node1);
      nodeList.add(node4);
      nodeList.add(node2);
      assertEquals(nodeList,test.getNodes());
    }

    @Test void testNeighbors(){
      Graph<String>test=new Graph<String>();
      Node<String> node1=test.addNode("Amman");
      Node<String> node2=test.addNode("Zarqa");
      Node<String> node3=test.addNode("Irbid");
      Node<String> node4=test.addNode("Aqabah");
      Node<String> node5=test.addNode("Karak");

      test.addEdge(node1,node2,true);
      test.addEdge(node1,node5,true);

      List<Node> nodeList = new ArrayList<>();
      nodeList.add(node2);
      nodeList.add(node5);
      assertEquals(nodeList,test.getNeighbors(node1));
    }

  @Test void testNeighborsWithWeight(){
    Graph<String>test=new Graph<String>();
    Node<String> node1=test.addNode("Amman");
    Node<String> node2=test.addNode("Zarqa");
    Node<String> node3=test.addNode("Irbid");
    Node<String> node4=test.addNode("Aqabah");
    Node<String> node5=test.addNode("Karak");

    test.addEdge(node1,node2,true,10);
    test.addEdge(node1,node5,true,30);

    List<Node> nodeList = new ArrayList<>();
    nodeList.add(node2);
    nodeList.add(node5);
    assertEquals(nodeList,test.getNeighbors(node1));
  }
  @Test void testSize(){
      Graph<String>test=new Graph<String>();
      Node<String> node1=test.addNode("Amman");
      Node<String> node2=test.addNode("Zarqa");
      Node<String> node3=test.addNode("Irbid");
      Node<String> node4=test.addNode("Aqabah");
      Node<String> node5=test.addNode("Karak");

      assertEquals(5,test.size());
  }
  @Test void testOneNode(){
    Graph<String>test=new Graph<String>();
    Node<String> node1=test.addNode("Amman");
    List<Node> nodeList = new ArrayList<>();
    nodeList.add(node1);
    assertEquals(nodeList,test.getNodes());
  }
  @Test void testEmpty(){
    Graph<String>test=new Graph<String>();
    assertNull(test.getNodes());
  }
  @Test void testBFT(){
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

    List<Node> nodeList = new ArrayList<>();

    nodeList.add(node1);
    nodeList.add(node2);
    nodeList.add(node3);
    nodeList.add(node4);
    nodeList.add(node5);
    nodeList.add(node6);

    assertEquals(nodeList,test.breadthFirst(node1));

  }

}
