package graph;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepthFirstTest {
    @Test
    void testDepthFirstTraversal() {
        DepthFirst depthFirst = new DepthFirst();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.addNeighbor(node2);
        node1.addNeighbor(node3);
        node2.addNeighbor(node4);
        node3.addNeighbor(node4);
        node3.addNeighbor(node5);
        node4.addNeighbor(node5);
        depthFirst.addNode(node1);
        depthFirst.addNode(node2);
        depthFirst.addNode(node3);
        depthFirst.addNode(node4);
        depthFirst.addNode(node5);
        List<Node> dfsResult = depthFirst.depthFirst(node1);
        assertEquals(1, dfsResult.get(0).value);
        assertEquals(2, dfsResult.get(1).value);
        assertEquals(4, dfsResult.get(2).value);
        assertEquals(5, dfsResult.get(3).value);
        assertEquals(3, dfsResult.get(4).value);
    }


}