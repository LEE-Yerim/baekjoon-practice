import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// A+B - 5
public class Main10952 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while (!(str = br.readLine()).equals("0 0")) {
            int[] numbers = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
