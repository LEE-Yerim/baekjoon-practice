// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//연결 요소의 개수
public class Main11724_bfs {
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
        //node들로 map 만들기

        for (int i = 0; i < m; i++) {
            String edge = br.readLine();
            int u = Integer.parseInt(edge.split(" ")[0]);
            int v = Integer.parseInt(edge.split(" ")[1]);

            map.get(u).add(v);
            map.get(v).add(u);
        }
        //node들에 인접노드리스트 설정해주기

        visited = new boolean[n + 1];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                bfs(i);
                count++;
            }
        }
        //모든 node들에 대하여 방문하지 않았다면 깊이우선탐색해주기

        System.out.println(count);
    }

    public static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int adjacentNode : map.get(now)) {
                if (!visited[adjacentNode]) {
                    queue.add(adjacentNode);
                    visited[adjacentNode] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
