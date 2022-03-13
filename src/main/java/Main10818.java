import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최소, 최대
public class Main10818 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int n = Integer.parseInt(bf.readLine());
        String[] inputNumbers = bf.readLine().split(" ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }
        int minNumber = 1_000_000;
        for (int number : numbers) {
            minNumber = Math.min(minNumber, number);
        }
        int maxNumber = 0;
        for (int number : numbers) {
            maxNumber = Math.max(maxNumber, number);
        }
        System.out.println(minNumber + " " + maxNumber);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
