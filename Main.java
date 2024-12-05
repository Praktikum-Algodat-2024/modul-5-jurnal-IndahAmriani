public class Main {
    // soal readme : Tambahkan dengan mencoba untuk masing masing desa sebagai titik mulai (Total 17)
    public static void main(String[] args) {
        Graph graph = new Graph();
        
        // Adding vertices
        String[] villages = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Eta", "Theta", "Iota", "Kappa", "Lambda", "Mu", "Nu", "Xi", "Omnicron", "Sigma", "Omega"};
        for (String village : villages) {
            graph.addVertex(village);
        }
        
        // Adding edges based on the provided connections
        graph.addEdge("Theta", "Kappa", 3);
        graph.addEdge("Theta", "Iota", 4);
        graph.addEdge("Theta", "Epsilon", 5);
        graph.addEdge("Theta", "Delta", 7);
        graph.addEdge("Theta", "Mu", 4);
        graph.addEdge("Theta", "Lambda", 14);
        graph.addEdge("Theta", "Xi", 7);
        
        graph.addEdge("Iota", "Zeta", 10);
        graph.addEdge("Iota", "Theta", 4);
        graph.addEdge("Iota", "Kappa", 5);
        graph.addEdge("Iota", "Nu", 9);
        
        graph.addEdge("Kappa", "Theta", 3);
        graph.addEdge("Kappa", "Iota", 5);
        graph.addEdge("Kappa", "Mu", 9);
        graph.addEdge("Kappa", "Nu", 7);
        
        graph.addEdge("Mu", "Theta", 14);
        graph.addEdge("Mu", "Eta", 9);
        graph.addEdge("Mu", "Xi", 7);
        
        graph.addEdge("Lambda", "Theta", 14);
        graph.addEdge("Lambda", "Epsilon", 5);
        graph.addEdge("Lambda", "Mu", 8);
        
        graph.addEdge("Nu", "Iota", 9);
        graph.addEdge("Nu", "Mu", 14);
        graph.addEdge("Nu", "Kappa", 7);
        graph.addEdge("Nu", "Omega", 9);
        
        graph.addEdge("Omnicron", "Sigma", 9);
        graph.addEdge("Omnicron", "Mu", 8);
        graph.addEdge("Omnicron", "Omega", 10);
        
        graph.addEdge("Sigma", "Xi", 5);
        graph.addEdge("Sigma", "Omnicron", 9);
        
        graph.addEdge("Omega", "Omnicron", 10);
        graph.addEdge("Omega", "Nu", 9);
        
        // Running Dijkstra's algorithm from Theta
        graph.dijkstra("Theta");
        graph.dijkstra("Alpha");
        graph.dijkstra("Mu");
        graph.dijkstra("Beta");
        graph.dijkstra("Gamma");
        graph.dijkstra("Delta");
        graph.dijkstra("Epsilon");
        graph.dijkstra("Zeta");
        graph.dijkstra("Eta");
        graph.dijkstra("Iota");
        graph.dijkstra("Kappa");
        graph.dijkstra("Lambda");
        graph.dijkstra("Nu");
        graph.dijkstra("Omega");
        graph.dijkstra("Xi");
        graph.dijkstra("Omnicron");
        graph.dijkstra("Sigma");
    }
}
