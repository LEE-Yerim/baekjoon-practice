import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7562 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] d_x = {1, 2, 2, 1, -1, -2, -2, -1};
    private static final int[] d_y = {-2, -1, 1, 2, -2, -1, 2, 2};

    public static void solution() throws IOException {
        int test_case = Integer.parseInt(br.readLine());
        for(int i = 0; i<test_case;i++) {
            int size = Integer.parseInt(br.readLine());
            String[] start = br.readLine().split(" ");
            int start_x = Integer.parseInt(start[0]);
            int start_y = Integer.parseInt(start[1]);
            String[] end = br.readLine().split(" ");
            int end_x = Integer.parseInt(end[0]);
            int end_y = Integer.parseInt(end[1]);

        }
    }

    public static void bfs() {

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
