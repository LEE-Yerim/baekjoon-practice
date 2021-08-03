import java.io.*;

public class Main1002 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int r1 = Integer.parseInt(input[2]);
            int x2 = Integer.parseInt(input[3]);
            int y2 = Integer.parseInt(input[4]);
            int r2 = Integer.parseInt(input[5]);

            double distance_between_centers = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            }
            if (r1 + r2 < distance_between_centers) {
                System.out.println(0);
            }
            if (r1 + r2 == distance_between_centers) {
                System.out.println(1);
            }
            if (r1 + r2 > distance_between_centers) {
                System.out.println(2);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
