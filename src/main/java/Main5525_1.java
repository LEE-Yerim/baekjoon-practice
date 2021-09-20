import java.io.*;

public class Main5525_1 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int index = 1 + n * 2;
        int count = 0;
        for (int i = 0; i < s.length - index + 1; i++) {
            if (s[i].equals("I")) {
                boolean flag = true;
                for (int j = 0; j < index / 2; j++) {
                    if (!s[i + j * 2 + 1].equals("O") || !s[i + j * 2 + 2].equals("I")) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
