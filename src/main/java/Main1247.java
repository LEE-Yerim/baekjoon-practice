import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 부호
public class Main1247 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Long.parseLong(br.readLine());
            }
            if (sum == 0) {
                System.out.println(0);
            }
            if (sum < 0) {
                System.out.println("-");
            }
            if (sum > 0) {
                System.out.println("+");
            }
        }
    }
}