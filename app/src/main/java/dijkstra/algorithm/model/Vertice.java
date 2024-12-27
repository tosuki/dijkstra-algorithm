package main.java.dijkstra.algorithm.model;

class NodeVertex {
    public String nameOfVertex;
    public int weight;

    public NodeVertex(String nameOfVertex, int weight) {
        this.nameOfVertex = nameOfVertex;
        this.weight = weight;
    }
}

public class Vertice {
    public String name;
    public NodeVertex[] nodes;
    public int weight;

    public Vertice(
        String name,
        NodeVertex[] nodes,
        int weight
    ) {
        this.name = name;
        this.nodes = nodes;
        this.weight = weight;
    }
}
