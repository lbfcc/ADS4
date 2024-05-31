import java.lang.*;
import java.util.*;
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;
    public void addAdjacentVertex(Vertex<V> destination, Double weight){
        adjacentVertices.put(destination, weight);
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }
    public void setAdjacentVertices(Map<Vertex<V>, Double> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }
}
