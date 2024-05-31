import java.util.*;
import java.util.*;

public class Graph {

    private Map<Vertex, List<Edge<Vertex>>> map = new HashMap<>();

    public void addVertex(Vertex vertex) {
        map.put(vertex, new LinkedList<Edge<Vertex>>());
    }

    public void addEdge(Vertex source, Vertex destination, Double weight) {
        Edge<Vertex> edge = new Edge<>(source, destination, weight);
        map.get(source).add(edge);
    }

    public Map<Vertex, Double> dijkstraShortestPath(Vertex source) {
        Map<Vertex, Double> distances = new HashMap<>();
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>(Comparator.comparing(distances::get));
        Map<Vertex, Vertex> previousVertices = new HashMap<>();

        for (Vertex vertex : map.keySet()) {
            distances.put(vertex, Double.MAX_VALUE);
            previousVertices.put(vertex, null);
        }

        distances.put(source, 0.0);
        priorityQueue.add(source);

        while (!priorityQueue.isEmpty()) {
            Vertex current = priorityQueue.poll();
            for (Edge<Vertex> edge : map.get(current)) {
                Vertex adjacent = edge.getDest();
                Double newDist = distances.get(current) + edge.getWeight();
                if (newDist < distances.get(adjacent)) {
                    distances.put(adjacent, newDist);
                    previousVertices.put(adjacent, current);
                    priorityQueue.add(adjacent);
                }
            }
        }

        return distances;
    }
    public List<Vertex> bfs(Vertex source) {
        List<Vertex> visited = new ArrayList<>();
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visitedSet = new HashSet<>();

        queue.add(source);
        visitedSet.add(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            visited.add(current);

            for (Edge<Vertex> edge : map.get(current)) {
                Vertex adjacent = edge.getDest();
                if (!visitedSet.contains(adjacent)) {
                    queue.add(adjacent);
                    visitedSet.add(adjacent);
                }
            }
        }

        return visited;
    }
}

