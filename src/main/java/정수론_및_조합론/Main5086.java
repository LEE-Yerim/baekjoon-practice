package 정수론_및_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main5086 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        String str = "";
        while (!(str = br.readLine()).equals("0 0")) {
            int[] numbers = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            if (numbers[0] % numbers[1] == 0) {
                System.out.println("multiple");
            } else if (numbers[1] % numbers[0] == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
