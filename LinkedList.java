public class LinkedList {
    Node head;

    public Node getHead() {
        return head;
    }

    void add(String desa, int weight) {
        Node newNode = new Node(desa, weight);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}
