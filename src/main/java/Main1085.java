import java.io.*;

public class Main1085 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        String[] coordinates = br.readLine().split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);
        int w = Integer.parseInt(coordinates[2]);
        int h = Integer.parseInt(coordinates[3]);

        int min = Math.min(x, y);
        min = Math.min(min, w - x);
        min = Math.min(min, h - y);
        System.out.println(min);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
