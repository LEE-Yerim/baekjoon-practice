import java.io.*;
import java.util.Arrays;

// 빠른 A+B
public class Main15552 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            bw.write(Integer.toString(numbers[0] + numbers[1]));
            bw.newLine();
        }
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
