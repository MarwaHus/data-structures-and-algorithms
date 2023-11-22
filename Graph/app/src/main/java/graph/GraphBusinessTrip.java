package graph;

import java.util.Arrays;
import java.util.LinkedList;

public class GraphBusinessTrip {

    public static Integer businessTrip(Graph<String> graph, String[] cityName) {
        int cost = 0;
        for (int i = 0; i < cityName.length - 1; i++) {
            Vertex<String> currentCity = findVertex(graph, cityName[i]);
            Vertex<String> nextCity = findVertex(graph, cityName[i + 1]);
            if (currentCity == null || nextCity == null) {
                return null;
            }

            boolean directFlightExists = false;
            LinkedList<Edge<String>> neighbors = graph.adjacencyLists.get(currentCity);
            for (Edge<String> edge : neighbors) {
                if (edge.getDestination().equals(nextCity)) {
                    directFlightExists = true;
                    cost += edge.getWeight();
                    break;
                }
            }
            if (!directFlightExists) {
                return null;
            }
        }

        return cost;
    }

    private static Vertex<String> findVertex(Graph<String> graph, String cityName) {
        for (Vertex<String> vertex : graph.adjacencyLists.keySet()) {
            if (vertex.getValue().equals(cityName)) {
                return vertex;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>(10);
        Vertex<String> metroville = graph.addVertex("Metroville");
        Vertex<String> pandora = graph.addVertex("Pandora");
        Vertex<String> arendelle = graph.addVertex("Arendelle");
        Vertex<String> newMonstropolis = graph.addVertex("New Monstropolis");
        Vertex<String> naboo = graph.addVertex("Naboo");
        Vertex<String> narnia = graph.addVertex("Narnia");
        graph.addEdge(metroville, pandora, 82);
        graph.addEdge(arendelle, newMonstropolis, 42);
        graph.addEdge(newMonstropolis, naboo, 73);
        String[] trip1 = {"Metroville", "Pandora"};
        String[] trip2 = {"Arendelle", "New Monstropolis", "Naboo"};
        String[] trip3 = {"Naboo", "Pandora"};
        String[] trip4 = {"Narnia", "Arendelle", "Naboo"};
        System.out.println(Arrays.toString(trip1) + "\t$" + businessTrip(graph, trip1));
        System.out.println(Arrays.toString(trip2) + "\t$" + businessTrip(graph, trip2));
        System.out.println(Arrays.toString(trip3) + "\t" + businessTrip(graph, trip3));
        System.out.println(Arrays.toString(trip4) + "\t" + businessTrip(graph, trip4));
    }}