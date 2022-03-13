import java.io.*;

public class Main14681 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0) {
            System.out.println(1);
        }
        if (x < 0 && y > 0) {
            System.out.println(2);
        }
        if (x < 0 && y < 0) {
            System.out.println(3);
        }
        if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
