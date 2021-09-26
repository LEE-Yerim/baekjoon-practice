import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3046 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        String[] input_numbers = br.readLine().split(" ");
        int r1 = Integer.parseInt(input_numbers[0]);
        int s = Integer.parseInt(input_numbers[1]);
        System.out.println(s * 2 - r1);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
