public class Graph {
    LinkedList vertices;
    int numVertices;


    Graph() {
        vertices = new LinkedList();
        numVertices = 0;
    }

    void addVertex(String name) {
        vertices.add(name, 0);
        numVertices++;
    }

    void addEdge(String source, String tujuan, int weight) {
        Node current = vertices.getHead();
        while (current != null) {
            if (current.desa.equals(source)) {
                current.next = new Node(tujuan, weight);
                break;
            }
            current = current.next;
        }
    }

    void dijkstra(String startVertex) {
        LinkedList visited = new LinkedList();
        LinkedList distances = new LinkedList();
        LinkedList paths = new LinkedList();

        Node current = vertices.getHead();
        while (current != null) {
            distances.add(current.desa, Integer.MAX_VALUE);
            paths.add(current.desa, 0);
            current = current.next;
        }

        distances.add(startVertex, 0);

        while (visited.getHead() == null) {
            String u = minDistance(distances, visited);
            visited.add(u, 0);

            Node edgeNode = getVertexEdges(u);
            while (edgeNode != null) {
                String v = edgeNode.desa;
                int weight = edgeNode.weight;

                if (!isVisited(v, visited) && getDistance(v, distances) > getDistance(u, distances) + weight) {
                    setDistance(v, distances, getDistance(u, distances) + weight);
                    setPath(v, paths, u);
                }
                edgeNode = edgeNode.next;
            }
        }

        printPaths(paths, startVertex);
    }

    String minDistance(LinkedList distances, LinkedList visited) {
        Node current = distances.getHead();
        String minVertex = null;
        int minDistance = Integer.MAX_VALUE;

        while (current != null) {
            if (!isVisited(current.desa, visited) && getDistance(current.desa, distances) < minDistance) {
                minDistance = getDistance(current.desa, distances);
                minVertex = current.desa;
            }
            current = current.next;
        }
        return minVertex;
    }

    Node getVertexEdges(String name) {
        Node current = vertices.getHead();
        while (current != null) {
            if (current.desa.equals(name)) {
                return current.edges.getHead();
            }
            current = current.next;
        }
        return null;
    }

    boolean isVisited(String name, LinkedList visited) {
        Node current = visited.getHead();
        while (current != null) {
            if (current.desa.equals(name)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    int getDistance(String name, LinkedList distances) {
        Node current = distances.getHead();
        while (current != null) {
            if (current.desa.equals(name)) {
                return current.weight;
            }
            current = current.next;
        }
        return Integer.MAX_VALUE;
    }

    void setDistance(String name, LinkedList distances, int distance) {
        Node current = distances.getHead();
        while (current != null) {
            if (current.desa.equals(name)) {
                current.weight = distance;
                break;
            }
            current = current.next;
        }
    }

    void setPath(String name, LinkedList paths, String path) {
        Node current = paths.getHead();
        while (current != null) {
            if (current.desa.equals(name)) {
                current.desa = path;
                break;
            }
            current = current.next;
        }
    }

    void printPaths(LinkedList paths, String startVertex) {
        System.out.println("Paths from " + startVertex + ":");
        Node current = paths.getHead();

        while (current != null) {
            if (!current.desa.equals(startVertex)) {
                System.out.println(startVertex + " => " + current.desa);
            }
            current = current.next;
        }
    }

}