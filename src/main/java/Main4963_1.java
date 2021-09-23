import java.io.*;
import java.util.StringTokenizer;

public class Main4963_1 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        while (true) {
            String str = br.readLine();
            int width = Integer.parseInt(str.split(" ")[0]);
            int height = Integer.parseInt(str.split(" ")[1]);
            //StringTokenizer st = new StringTokenizer(br.readLine());
            //width = Integer.parseInt(st.nextToken());
            //height = Integer.parseInt(st.nextToken());
            if (width == 0 && height == 0) {
                break;
            }
            int[][] array = new int[height][width];
            for (int i = 0; i < height; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 0; j < width; j++) {
                    array[i][j] = Integer.parseInt(row[j]);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
