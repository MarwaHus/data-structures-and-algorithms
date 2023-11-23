package graphBusinessTripTest;


import graph.Graph;
import graph.GraphBusinessTrip;
import graph.Vertex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GraphBusinessTripTest {
    @Test
    public void testBusinessTripWithValidCities() {
        Graph<String> graph = new Graph<>(10);
        Vertex<String> metroville = graph.addVertex("Metroville");
        Vertex<String> pandora = graph.addVertex("Pandora");
        graph.addEdge(metroville, pandora, 82);
        String[] trip = {"Metroville", "Pandora"};
        Integer cost = GraphBusinessTrip.businessTrip(graph, trip);
        assertEquals(82, cost);
    }

    @Test
    public void testBusinessTripWithInvalidCity() {
        Graph<String> graph = new Graph<>(10);
        Vertex<String> metroville = graph.addVertex("Metroville");
        Vertex<String> pandora = graph.addVertex("Pandora");
        String[] trip = {"Metroville", "Pandora"};
        Integer cost = GraphBusinessTrip.businessTrip(graph, trip);
        assertNull(cost);
    }
    @Test
    public void testBusinessTripWithInvalidCities() {
        Graph<String> graph = new Graph<>(10);
        Vertex<String> metroville = graph.addVertex("Metroville");
        Vertex<String> pandora = graph.addVertex("Pandora");
        graph.addEdge(metroville, pandora, 82);

        String[] trip = {"Metroville", "InvalidCity"};
        Integer cost = GraphBusinessTrip.businessTrip(graph, trip);

        assertNull(cost);
    }

}

