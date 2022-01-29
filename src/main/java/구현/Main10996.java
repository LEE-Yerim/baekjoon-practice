package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10996 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < n / 2; j++) {
                    System.out.print("* ");
                }
                if (n % 2 == 1) {
                    System.out.print("*");
                }
            }
            if (i % 2 == 0) {
                for (int j = 0; j < n / 2; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
