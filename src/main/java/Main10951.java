import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// A+B - 4
public class Main10951 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        while (flag) {
            String input = br.readLine();
            if (!input.isEmpty()) {
                int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
                int sum = 0;
                for(int number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            }
            if (input.isEmpty()) {
                flag = false;
            }
        }
    }
}
