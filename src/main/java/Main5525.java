import java.io.*;

// IOIOI
public class Main5525 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int n;
    public static String[] s;

    public static void solution() throws IOException {
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        s = br.readLine().split("");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("I")) {
                if (check(i)) {
                    count++;
                }
            }
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }

    public static boolean check(int i) {
        for (int j = 0; j < n / 2; j++) {
            if (!s[i + j].equals("O") || !s[i + j + 1].equals("I")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
