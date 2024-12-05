public class Node {
    String desa;
    int weight;
    Node next;
    LinkedList edges;

    public Node (String desa, int weight) {
        this.desa = desa;
        this.weight = weight;
        this.next = null;
    }
}
