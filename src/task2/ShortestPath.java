package task2;

import java.util.*;

/**
 * This problem is solved using Dijkstra's algorithm
 * to find the shortest path from one given vertex to all others
 */
public class ShortestPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int cityCount = scanner.nextInt();
            Map<String, Integer> cityIndex = new HashMap<>();
            List<List<int[]>> graph = new ArrayList<>();

            // Reading cities and graph construction
            for (int i = 0; i < cityCount; i++) {
                String cityName = scanner.next();
                cityIndex.put(cityName, i);
                int neighbors = scanner.nextInt();
                graph.add(new ArrayList<>());

                for (int j = 0; j < neighbors; j++) {
                    int neighborIndex = scanner.nextInt() - 1;
                    int cost = scanner.nextInt();
                    graph.get(i).add(new int[]{neighborIndex, cost});
                }
            }

            int queries = scanner.nextInt();

            while (queries-- > 0) {
                String source = scanner.next();
                String destination = scanner.next();
                System.out.println(findShortestPath(cityIndex.get(source), cityIndex.get(destination), graph));
            }
        }
        scanner.close();
    }

    /**
     * Finds the shortest path cost between two cities using Dijkstra's algorithm.
     *
     * @param source      index of the source city
     * @param destination index of the destination city
     * @param graph       adjacency list representing the graph
     * @return shortest path cost
     */
    public static int findShortestPath(int source, int destination, List<List<int[]>> graph) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{source, 0});
        int[] distances = new int[graph.size()];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int cost = current[1];

            if (node == destination) return cost;

            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int nextCost = cost + neighbor[1];

                if (nextCost < distances[nextNode]) {
                    distances[nextNode] = nextCost;
                    pq.add(new int[]{nextNode, nextCost});
                }
            }
        }
        return -1; // No path found
    }
}
