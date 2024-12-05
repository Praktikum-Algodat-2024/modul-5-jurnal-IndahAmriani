public class Vertex {
    String name;
    LinkedList edges;

    Vertex(String name) {
        this.name = name;
        this.edges = new LinkedList();
    }
}
