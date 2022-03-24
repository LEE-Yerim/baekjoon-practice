import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// A+B - 3
public class Main10950 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            int[] operands = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(operands[0] + operands[1]);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
