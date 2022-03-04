package DFS와_BFS;

// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//단지번호붙이기
public class Main2667 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] d_row = {-1, 0, 0, 1};
    private static final int[] d_column = {0, -1, 1, 0};

    private static int n;
    private static int[][] map;
    private static boolean[][] visited;
    private static int count_apart;
    private static final List<Integer> result = new ArrayList<>();

    public static void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }
        visited = new boolean[n][n];
        int count_group = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count_apart = 0;
                if (!visited[i][j] && map[i][j] == 1) {
                    //dfs(i, j);
                    bfs(i, j);
                    count_group++;
                    result.add(count_apart);
                }
            }
        }
        System.out.println(count_group);
        Collections.sort(result);
        for (Integer number : result) {
            System.out.println(number);
        }
    }

    public static void dfs(int row, int column) {
        visited[row][column] = true;
        count_apart++;

        for (int i = 0; i < 4; i++) {
            int next_row = row + d_row[i];
            int next_column = column + d_column[i];

            if (next_row >= 0 && next_row < n && next_column >= 0 && next_column < n) {
                if (map[next_row][next_column] == 1 && !visited[next_row][next_column]) {
                    dfs(next_row, next_column);
                }
            }
        }
    }

    public static void bfs(int row, int column) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, column});
        visited[row][column] = true;
        count_apart++;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int next_row = now[0] + d_row[i];
                int next_column = now[1] + d_column[i];

                if (next_row >= 0 && next_row < n && next_column >= 0 && next_column < n) {
                    if (map[next_row][next_column] == 1 && !visited[next_row][next_column]) {
                        queue.add(new int[]{next_row, next_column});
                        visited[next_row][next_column] = true;
                        count_apart++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
