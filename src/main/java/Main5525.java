import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// IOIOI
public class Main5525 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("I")) {
                boolean flag = true;
                for (int j = 0; j < n / 2; j++) {
                    if (s[i + j].equals("O") && s[i + j + 1].equals("I")) {
                        flag = false;
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
