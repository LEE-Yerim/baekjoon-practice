import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 소수 구하기
public class Main1929 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String[] numbers = br.readLine().split(" ");
        int start_number = Integer.parseInt(numbers[0]);
        int end_number = Integer.parseInt(numbers[1]);
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = start_number; i <= end_number; i++) {
            boolean flag = true;
            if (i == 1) {
                flag = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                primeNumbers.add(i);
            }
        }
        for (int number : primeNumbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
