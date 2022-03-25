import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// A+B - 6
public class Main10953 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] operands = bf.readLine().split(",");
            System.out.println(Integer.parseInt(operands[0]) + Integer.parseInt(operands[1]));
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
