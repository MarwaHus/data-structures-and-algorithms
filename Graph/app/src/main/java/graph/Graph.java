package graph;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph <T extends Comparable<? super T>> implements Comparable<Graph<T>>  // just in case you have Comparable data structures
{
    public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
    private int numberOfVertices = 0;

    public Graph(int maxNumberOfVertices)
    {
        adjacencyLists = new HashMap<>(maxNumberOfVertices);
    }

    public Vertex<T> addVertex(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        adjacencyLists.put(vertex, new LinkedList<>());
        numberOfVertices++;
        return vertex;
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination) {
        addEdge(start, destination, 0);
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination, int weight) {
        if (!adjacencyLists.containsKey(start) || !adjacencyLists.containsKey(destination)) {
            throw new IllegalArgumentException("Both vertices must be in the graph");
        }

        LinkedList<Edge<T>> edges = adjacencyLists.get(start);
        edges.add(new Edge<>(destination, weight));
    }
    public LinkedList<Vertex<T>> getVertices() {
        return new LinkedList<>(adjacencyLists.keySet());
    }

    public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex) {
        if (!adjacencyLists.containsKey(vertex)) {
            throw new IllegalArgumentException("Vertex not found in the graph");
        }

        return new LinkedList<>(adjacencyLists.get(vertex));
    }

    public int size()
    {
        return numberOfVertices;  // TODO: make sure this gets updated at the right times
    }

    public LinkedList<Vertex<T>> breadthFirst(Vertex<T> start) {
        if (!adjacencyLists.containsKey(start)) {
            throw new IllegalArgumentException("Start vertex not found in the graph");
        }

        LinkedList<Vertex<T>> visited = new LinkedList<>();
        LinkedList<Vertex<T>> queue = new LinkedList<>();
        HashMap<Vertex<T>, Boolean> visitedMap = new HashMap<>();
        visitedMap.put(start, true);
        visited.add(start);
        queue.add(start);
        while (!queue.isEmpty()) {
            Vertex<T> currentVertex = queue.poll();
            LinkedList<Edge<T>> neighbors = adjacencyLists.get(currentVertex);
            for (Edge<T> edge : neighbors) {
                Vertex<T> neighbor = edge.getDestination();
                if (!visitedMap.containsKey(neighbor)) {
                    visitedMap.put(neighbor, true);
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        for (Vertex<T> vertex : adjacencyLists.keySet()) {
            if (!visitedMap.containsKey(vertex)) {
                visited.add(vertex);
            }
        }

        return visited;
    }
    @Override
    public int compareTo(Graph<T> o)
    {
        throw new UnsupportedOperationException("Graph does not implement compareTo()");
    }

    @Override
    public String toString()
    {
        // Good for testing
        // WARNING: Your HashMap does not guarantee ordering!
        // But you can basically rely on it if you add nodes to your graphs in a consistent way

        return "";
    }
}
