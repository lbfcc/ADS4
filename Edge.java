import java.lang.*;
public class Edge<Vertex> {
    private Vertex source;
    private Vertex dest;
    private Double weight;

    public Edge(Vertex source,
                Vertex dest,
                Double weight) {
        this.setDest(dest);
        this.setSource(source);
        this.setWeight(weight);
    }

    public Double getWeight() {
        return weight;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getDest() {
        return dest;
    }

    public void setDest(Vertex dest) {
        this.dest = dest;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
