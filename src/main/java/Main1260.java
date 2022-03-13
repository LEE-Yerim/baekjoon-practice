// import.java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//DFS와 BFS
public class Main1260 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static Map<Integer, List<Integer>> map;
    private static boolean[] visited;

    public static void solution() throws IOException {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String edge = br.readLine();
            int node_1 = Integer.parseInt(edge.split(" ")[0]);
            int node_2 = Integer.parseInt(edge.split(" ")[1]);

            map.get(node_1).add(node_2);
            map.get(node_2).add(node_1);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(map.get(i));
        }
        visited = new boolean[n+1];
        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);
    }

    public static void dfs(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for(int adjacentNode : map.get(vertex)) {
            if(!visited[adjacentNode]) {
                dfs(adjacentNode);
            }
        }
    }

    public static void bfs(int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(vertex);
        visited[vertex] = true;
        result.add(vertex);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int adjacentNode : map.get(now)) {
                if (!visited[adjacentNode]) {
                    queue.add(adjacentNode);
                    visited[adjacentNode] = true;
                    result.add(adjacentNode);
                }
            }
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
