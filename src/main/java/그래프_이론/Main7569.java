package 그래프_이론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main7569 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] dw = {1, -1, 0, 0, 0, 0};
    private static final int[] dh = {0, 0, 1, -1, 0, 0};
    private static final int[] df = {0, 0, 0, 0, 1, -1};

    private static int width;
    private static int height;
    private static int floor;
    private static int[][][] box;
    private static Queue<Tomato> queue;

    public static class Tomato {
        int f;
        int h;
        int w;

        public Tomato(int f, int h, int w) {
            this.f = f;
            this.h = h;
            this.w = w;
        }
    }

    public static void solution() throws IOException {
        String input = br.readLine();
        width = Integer.parseInt(input.split(" ")[0]);
        height = Integer.parseInt(input.split(" ")[1]);
        floor = Integer.parseInt(input.split(" ")[2]);

        box = new int[floor][height][width];
        queue = new LinkedList<>();

        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < height; j++) {
                String[] row = br.readLine().split(" ");
                for (int k = 0; k < width; k++) {
                    box[i][j][k] = Integer.parseInt(row[k]);
                    if (box[i][j][k] == 1) {
                        queue.add(new Tomato(i, j, k));
                    }
                }
            }
        }

        bfs();

        System.out.println(result());
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            Tomato tomato = queue.remove();
            int this_floor = tomato.f;
            int this_height = tomato.h;
            int this_width = tomato.w;
            for (int i = 0; i < 6; i++) {
                int next_floor = this_floor + df[i];
                int next_height = this_height + dh[i];
                int next_width = this_width + dw[i];

                if (next_floor >= 0 && next_floor < floor && next_height >= 0 && next_height < height && next_width >= 0 && next_width < width) {
                    if (box[next_floor][next_height][next_width] == 0) {
                        queue.add(new Tomato(next_floor, next_height, next_width));
                        box[next_floor][next_height][next_width] = box[this_floor][this_height][this_width] + 1;
                    }
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
        int day = 0;
        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    day = Math.max(day, box[i][j][k]);
                }
            }
        }
        return day - 1;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
