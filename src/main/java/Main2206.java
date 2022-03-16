import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 벽 부수고 이동하기
public class Main2206 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] d_row = {-1, 0, 0, 1};
    private static final int[] d_column = {0, -1, 1, 0};

    private static int height;
    private static int width;
    private static int[][] map;
    private static int[][] visited;

    public static void solution() throws IOException {
        String[] size = br.readLine().split(" ");
        height = Integer.parseInt(size[0]);
        width = Integer.parseInt(size[1]);

        map = new int[height][width];
        for (int i = 0; i < height; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < width; j++) {
                map[i][j] = Integer.parseInt(row[j]);
            }
        }
        visited = new int[height][width];
        bfs(0, 0);
        List<Integer> distances = new ArrayList<>();
        distances.add(visited[height - 1][width - 1]);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (map[i][j] == 1) {
                    map[i][j] = 0;
                    visited = new int[height][width];
                    bfs(0, 0);
                    distances.add(visited[height - 1][width - 1]);
                    map[i][j] = 1;
                }
            }
        }
        boolean flag = false;
        for (int distance : distances) {
            if (distance != 0) {
                flag = true;
            }
        }
        if (flag) {
            int result = Integer.MAX_VALUE;
            for (int distance : distances) {
                if (distance != 0) {
                    result = Math.min(result, distance);
                }
            }
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }

    public static void bfs(int row, int column) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, column});
        visited[row][column] = 1;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int this_row = now[0];
            int this_column = now[1];

            for (int i = 0; i < 4; i++) {
                int next_row = this_row + d_row[i];
                int next_column = this_column + d_column[i];

                if (next_row >= 0 && next_row < height && next_column >= 0 && next_column < width) {
                    if (map[next_row][next_column] == 0 && visited[next_row][next_column] == 0) {
                        queue.add(new int[]{next_row, next_column});
                        visited[next_row][next_column] = visited[this_row][this_column] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
