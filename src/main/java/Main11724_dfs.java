// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//연결 요소의 개수
public class Main11724_dfs {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Map<Integer, List<Integer>> map = new HashMap<>();

    private static boolean[] visited;

    public static void solution() throws IOException {
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);

        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String edge = br.readLine();
            int u = Integer.parseInt(edge.split(" ")[0]);
            int v = Integer.parseInt(edge.split(" ")[1]);

            map.get(u).add(v);
            map.get(v).add(u);
        }

        visited = new boolean[n + 1];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void dfs(int node) {
        if (visited[node]) {
            return;
        }
        visited[node] = true;
        for (int adjacentNode : map.get(node)) {
            dfs(adjacentNode);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
