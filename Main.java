import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex<String> vertexA = new Vertex<>();
        vertexA.setData("A");
        Vertex<String> vertexB = new Vertex<>();
        vertexB.setData("B");
        Vertex<String> vertexC = new Vertex<>();
        vertexC.setData("C");
        Vertex<String> vertexD = new Vertex<>();
        vertexD.setData("D");
        Vertex<String> vertexE = new Vertex<>();
        vertexE.setData("E");

        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);
        graph.addVertex(vertexD);
        graph.addVertex(vertexE);

        graph.addEdge(vertexA, vertexB, 10.0);
        graph.addEdge(vertexA, vertexC, 3.0);
        graph.addEdge(vertexB, vertexC, 1.0);
        graph.addEdge(vertexB, vertexD, 2.0);
        graph.addEdge(vertexC, vertexB, 4.0);
        graph.addEdge(vertexC, vertexD, 8.0);
        graph.addEdge(vertexC, vertexE, 2.0);
        graph.addEdge(vertexD, vertexE, 7.0);
        graph.addEdge(vertexE, vertexD, 9.0);

        Map<Vertex, Double> distances = graph.dijkstraShortestPath(vertexA);

        for (Map.Entry<Vertex, Double> entry : distances.entrySet()) {
            System.out.println("Distance from A to " + entry.getKey().getData() + " is " + entry.getValue());
        }
        //implementation of BFS
        List<Vertex> bfsResult = graph.bfs(vertexA);
        System.out.println("BFS traversal starting from vertex A:");
        for (Vertex vertex : bfsResult) {
            System.out.println(vertex.getData());
        }
    }
}
