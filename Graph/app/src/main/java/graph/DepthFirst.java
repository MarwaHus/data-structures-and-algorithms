package graph;

import java.util.*;

class Node {
    int value;
    List<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor) {
        this.neighbors.add(neighbor);
    }
}

public class DepthFirst {
    private Map<Integer, Node> nodes;

    public DepthFirst() {
        this.nodes = new HashMap<>();
    }

    public void addNode(Node node) {
        nodes.put(node.value, node);
    }

    public List<Node> depthFirst(Node startNode) {
        Set<Node> visited = new HashSet<>();
        List<Node> result = new ArrayList<>();
        depthFirstHelper(startNode, visited, result);
        return result;
    }

    private void depthFirstHelper(Node currentNode, Set<Node> visited, List<Node> result) {
        if (currentNode == null || visited.contains(currentNode)) {
            return;
        }

        visited.add(currentNode);
        result.add(currentNode);

        for (Node neighbor : currentNode.neighbors) {
            depthFirstHelper(neighbor, visited, result);
        }
    }
}