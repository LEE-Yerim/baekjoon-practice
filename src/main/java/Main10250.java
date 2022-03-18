import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// ACM 호텔
public class Main10250 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String[] answer = new String[2];
            answer[0] = Integer.toString(numbers[2] % numbers[0]);
            answer[1] = Integer.toString(numbers[2] / numbers[0] + 1);
            if (Integer.toString(numbers[1]).length() == 2 && answer[1].length() == 1) {
                answer[1] = "0" + answer[1];
            }
            System.out.println(String.join("", answer));
        }
    }
}
