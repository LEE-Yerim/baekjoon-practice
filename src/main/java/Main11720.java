import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 합
public class Main11720 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void solution() throws IOException {
        int size = Integer.parseInt(bf.readLine());
        String numbers = bf.readLine();

        int sum = 0;
        for (String number : numbers.split("")) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
