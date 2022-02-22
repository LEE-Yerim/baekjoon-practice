// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1012 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] d_row = {-1, 0, 0, 1};
    private static final int[] d_column = {0, -1, 1, 0};

    private static int width;
    private static int height;
    private static int[][] field;
    private static boolean[][] visited;

    public static void solution() throws IOException {
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            String[] input = br.readLine().split(" ");
            width = Integer.parseInt(input[0]);
            height = Integer.parseInt(input[1]);
            int number = Integer.parseInt(input[2]);
            field = new int[height][width];
            for (int j = 0; j < number; j++) {
                String[] cabbage = br.readLine().split(" ");
                int column = Integer.parseInt(cabbage[0]);
                int row = Integer.parseInt(cabbage[1]);
                field[row][column] = 1;
            }
            visited = new boolean[height][width];
            int count = 0;
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    if (field[j][k] == 1 && !visited[j][k]) {
                        dfs(j, k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int row, int column) {
        visited[row][column] = true;

        for (int i = 0; i < 4; i++) {
            int next_row = row + d_row[i];
            int next_column = column + d_column[i];

            if (next_row >= 0 && next_row < height && next_column >= 0 && next_column < width) {
                if(field[next_row][next_column] == 1 && !visited[next_row][next_column]) {
                    dfs(next_row, next_column);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
