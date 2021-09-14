import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7569 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] dw = {1, -1, 0, 0, 0, 0};
    private static final int[] dh = {0, 0, 1, -1, 0, 0};
    private static final int[] df = {0, 0, 0, 0, 1, -1};

    private static int width;
    private static int height;
    private static int floor;
    private static int[][][] box;
    private static boolean[][][] visited;
    private static int day;

    public static void solution() throws IOException {
        String input = br.readLine();
        width = Integer.parseInt(input.split(" ")[0]);
        height = Integer.parseInt(input.split(" ")[1]);
        floor = Integer.parseInt(input.split(" ")[2]);

        box = new int[floor][height][width];

        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < height; j++) {
                String[] row = br.readLine().split(" ");
                for (int k = 0; k < width; k++) {
                    box[i][j][k] = Integer.parseInt(row[k]);
                }
            }
        }

        visited = new boolean[floor][height][width];
        day = 0;
        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    if (!visited[i][j][k] && box[i][j][k] == 1) {
                        ripen(i, j, k);
                    }
                }
            }
        }

        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    System.out.print(box[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        System.out.println(result());
    }

    public static void ripen(int this_floor, int this_height, int this_width) {
        visited[this_floor][this_height][this_width] = true;
        day++;
        for (int i = 0; i < 6; i++) {
            int next_floor = this_floor + df[i];
            int next_height = this_height + dh[i];
            int next_width = this_width + dw[i];

            if (next_floor >= 0 && next_floor < floor && next_height >= 0 && next_height < height && next_width >= 0 && next_width < width) {
                if (box[next_floor][next_height][next_width] == 0 && !visited[next_floor][next_height][next_width]) {
                    box[next_floor][next_height][next_width] = 1;
                    ripen(next_floor, next_height, next_width);
                }
            }
        }
    }

    public static int result() {
        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    if (box[i][j][k] == 0) {
                        return -1;
                    }
                }
            }
        }
        return day;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
