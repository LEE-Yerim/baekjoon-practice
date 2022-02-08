import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//소수 찾기
public class Main1978 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> primeNumbers = new ArrayList<>();
        for (int number : numbers) {
            boolean flag = true;
            if (number == 1) {
                flag = false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                primeNumbers.add(number);
            }
        }
        System.out.println(primeNumbers.size());
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
