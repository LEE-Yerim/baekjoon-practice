// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//바이러스
public class Main2606 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static int number_of_computers;
    private static int[][] map;

    public static void solution() throws IOException {
        number_of_computers = Integer.parseInt(br.readLine());
        int number_of_edges = Integer.parseInt(br.readLine());

        map = new int[number_of_computers + 1][number_of_computers + 1];
        for (int i = 0; i < number_of_edges; i++) {
            String edge = br.readLine();
            int u = Integer.parseInt(edge.split(" ")[0]);
            int v = Integer.parseInt(edge.split(" ")[1]);

            map[u][v] = 1;
            map[v][u] = 1;
        }

        System.out.println(bfs(1));
    }

    public static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[number_of_computers + 1];
        int count = 0;
        queue.add(node);
        visited[node] = true;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int i = 1; i < map.length; i++) {
                if (map[x][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
