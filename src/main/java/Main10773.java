import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 제로
public class Main10773 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] numbers = br.readLine().split(" ");
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < 2; i++) {
            sum = sum.add(new BigInteger(numbers[i]));
        }
        System.out.println(sum);
    }
}
