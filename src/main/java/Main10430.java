import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 나머지
public class Main10430 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int[] numbers = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((numbers[0] + numbers[1]) % numbers[2]);
        System.out.println(((numbers[0] % numbers[2]) + (numbers[1] % numbers[2])) % numbers[2]);
        System.out.println((numbers[0] * numbers[1]) % numbers[2]);
        System.out.println(((numbers[0] % numbers[2]) * (numbers[1] % numbers[2])) % numbers[2]);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
