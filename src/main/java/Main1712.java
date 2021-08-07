import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1712 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String[] prices = br.readLine().split(" ");
        int A = Integer.parseInt(prices[0]);
        int B = Integer.parseInt(prices[1]);
        int C = Integer.parseInt(prices[2]);
        int i = 0;
        while (A + B * i >= C * i) {
            i++;
        }
        System.out.println(i);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
