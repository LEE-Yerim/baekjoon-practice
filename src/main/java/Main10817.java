import java.io.*;
import java.util.Arrays;

public class Main10817 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
