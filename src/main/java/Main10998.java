import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// AxB
public class Main10998 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int[] operands = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(operands[0] * operands[1]);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
