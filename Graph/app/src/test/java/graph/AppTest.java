/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testAddVertex() {
        Graph<String> graph = new Graph<>(4);
        Vertex<String> vertexA = graph.addVertex("A");
        assertTrue(graph.getVertices().contains(vertexA));
    }

    @Test
    void testAddEdge() {
        Graph<String> graph = new Graph<>(4);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        graph.addEdge(vertexA, vertexB, 3);
        assertEquals(1, graph.getNeighbors(vertexA).size());
    }

    @Test
    void testGetAllVertices() {
        Graph<String> graph = new Graph<>(4);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        assertEquals(2, graph.getVertices().size());
    }

    @Test
    void testGetAllNeighbors() {
        Graph<String> graph = new Graph<>(4);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        graph.addEdge(vertexA, vertexB, 3);
        assertEquals(1, graph.getNeighbors(vertexA).size());
    }

    @Test
    void testGetNeighborsWithWeight() {
        Graph<String> graph = new Graph<>(4);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        graph.addEdge(vertexA, vertexB, 3);
        Edge<String> edgeAB = graph.getNeighbors(vertexA).get(0);
        assertEquals(3, edgeAB.weight);
    }

    @Test
    void testGetSize() {
        Graph<String> graph = new Graph<>(4);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        assertEquals(2, graph.size());
    }

    @Test
    void testSingleVertexAndEdgeGraph() {
        Graph<String> singleVertexGraph = new Graph<>(1);
        Vertex<String> singleVertex = singleVertexGraph.addVertex("SingleVertex");
        assertEquals(1, singleVertexGraph.getVertices().size());
        assertEquals(1, singleVertexGraph.size());
        assertTrue(singleVertexGraph.getNeighbors(singleVertex).isEmpty());
    }
    @Test
    void testBreadthFirst() {
        Graph<String> graph = new Graph<>(6);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        Vertex<String> vertexC = graph.addVertex("C");
        Vertex<String> vertexD = graph.addVertex("D");
        Vertex<String> vertexE = graph.addVertex("E");
        Vertex<String> vertexF = graph.addVertex("F");

        graph.addEdge(vertexA, vertexB, 1);
        graph.addEdge(vertexA, vertexC, 1);
        graph.addEdge(vertexB, vertexD, 1);
        graph.addEdge(vertexC, vertexE, 1);
        graph.addEdge(vertexC, vertexF, 1);

        LinkedList<Vertex<String>> result = graph.breadthFirst(vertexA);

        assertEquals(6, result.size());
        assertTrue(result.contains(vertexA));
        assertTrue(result.contains(vertexB));
        assertTrue(result.contains(vertexC));
        assertTrue(result.contains(vertexD));
        assertTrue(result.contains(vertexE));
        assertTrue(result.contains(vertexF));
    }


    @Test
    void testBreadthFirstGraphWithMultiplePaths() {
        Graph<String> graph = new Graph<>(6);
        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        Vertex<String> vertexC = graph.addVertex("C");
        Vertex<String> vertexD = graph.addVertex("D");
        Vertex<String> vertexE = graph.addVertex("E");
        Vertex<String> vertexF = graph.addVertex("F");

        graph.addEdge(vertexA, vertexB, 1);
        graph.addEdge(vertexA, vertexC, 1);
        graph.addEdge(vertexB, vertexD, 1);
        graph.addEdge(vertexC, vertexE, 1);
        graph.addEdge(vertexE, vertexF, 1);

        LinkedList<Vertex<String>> result = graph.breadthFirst(vertexA);

        assertEquals(6, result.size());
        assertTrue(result.contains(vertexA));
        assertTrue(result.contains(vertexB));
        assertTrue(result.contains(vertexC));
        assertTrue(result.contains(vertexD));
        assertTrue(result.contains(vertexE));
        assertTrue(result.contains(vertexF));
    }
}
