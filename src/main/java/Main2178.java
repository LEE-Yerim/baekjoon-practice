import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 미로 탐색
public class Main2178 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] d_row = {-1, 0, 0, 1};
    private static final int[] d_column = {0, -1, 1, 0};

    private static int rows;
    private static int columns;
    private static int[][] maze;
    private static int[][] visited;

    public static void solution() throws IOException {
        String[] input = br.readLine().split(" ");
        rows = Integer.parseInt(input[0]);
        columns = Integer.parseInt(input[1]);
        maze = new int[rows][columns];
        visited = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < columns; j++) {
                maze[i][j] = Integer.parseInt(row[j]);
            }
        }

        System.out.println(bfs(0, 0));
    }

    public static int bfs(int row, int column) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, column});
        visited[row][column] = 1;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int now_row = now[0];
            int now_column = now[1];
            for (int i = 0; i < 4; i++) {
                int next_row = now_row + d_row[i];
                int next_column = now_column + d_column[i];

                if (next_row >= 0 && next_row < rows && next_column >= 0 && next_column < columns) {
                    if (maze[next_row][next_column] == 1 && visited[next_row][next_column] == 0) {
                        queue.add(new int[]{next_row, next_column});
                        visited[next_row][next_column] = visited[now_row][now_column] + 1;
                    }
                }
            }
        }
        return visited[rows - 1][columns - 1];
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
