import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 이상한 곱셈
public class Main1225 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] numbers = br.readLine().split(" ");
        int[] A = Arrays.stream(numbers[0].split("")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(numbers[1].split("")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        for (int a : A) {
            for (int b : B) {
                answer += a * b;
            }
        }
        System.out.println(answer);
    }
}
