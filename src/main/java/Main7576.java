import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main7576 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] d_row = {-1, 0, 0, 1};
    private static final int[] d_column = {0, -1, 1, 0};

    private static int width;
    private static int height;
    private static int[][] box;
    private static int[][] visited;
    private static Queue<int[]> queue;

    public static void solution() throws IOException {
        String[] size = br.readLine().split(" ");
        width = Integer.parseInt(size[0]);
        height = Integer.parseInt(size[1]);

        box = new int[height][width];
        visited = new int[height][width];
        queue = new LinkedList<>();

        for (int i = 0; i < height; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < width; j++) {
                box[i][j] = Integer.parseInt(row[j]);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (box[i][j] == 1 && visited[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = 1;
                    // 양쪽에서 시작해서 중간에서 만날 때 큐에 시작점 한꺼번에 넣어두고 출발하기
                }
            }
        }
        ripen();
        int day = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                day = Math.max(day, visited[i][j]);
            }
        }
        System.out.println(day - 1);
    }

    public static void ripen() {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int this_row = now[0];
            int this_column = now[1];
            for (int i = 0; i < 4; i++) {
                int next_row = this_row + d_row[i];
                int next_column = this_column + d_column[i];

                if (next_row >= 0 && next_row < height && next_column >= 0 && next_column < width) {
                    if (box[next_row][next_column] == 0 && visited[next_row][next_column] == 0) {
                        queue.add(new int[]{next_row, next_column});
                        box[next_row][next_column] = 1;
                        visited[next_row][next_column] = visited[this_row][this_column] + 1;
                    }
                }
            }
        }
    }
    //최소 비용 문제(최단 거리 문제)는 bfs가 적당
    //dfs 로 풀이하면 시간초과
    public static void main(String[] args) throws IOException {
        solution();
    }
}
