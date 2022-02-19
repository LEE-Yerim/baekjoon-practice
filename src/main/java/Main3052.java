import java.io.*;
import java.util.ArrayList;
import java.util.List;

//나머지
public class Main3052 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        List<Integer> remainders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            int remainder = number % 42;
            if (!remainders.contains(remainder)) {
                remainders.add(remainder);
            }
        }
        System.out.println(remainders.size());
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
