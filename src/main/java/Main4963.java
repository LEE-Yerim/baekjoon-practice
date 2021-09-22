import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4963 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] d_col = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] d_row = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static int width;
    private static int height;
    private static int[][] array;
    private static boolean[][] visited;

    public static void solution() throws IOException {
        String str = "";

        while (!(str = br.readLine()).equals("0 0")) {
            width = Integer.parseInt(str.split(" ")[0]);
            height = Integer.parseInt(str.split(" ")[1]);
            array = new int[height][width];
            for (int i = 0; i < height; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 0; j < width; j++) {
                    array[i][j] = Integer.parseInt(row[j]);
                }
            }
            visited = new boolean[height][width];
            int count = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (!visited[i][j] && array[i][j] == 1) {
                        findIsland(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void findIsland(int row, int column) {
        visited[row][column] = true;

        for (int i = 0; i < 8; i++) {
            int next_row = row + d_row[i];
            int next_column = column + d_col[i];

            if (next_row >= 0 && next_row < height && next_column >= 0 && next_column < width) {
                if (array[next_row][next_column] == 1 && !visited[next_row][next_column]) {
                    findIsland(next_row, next_column);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
