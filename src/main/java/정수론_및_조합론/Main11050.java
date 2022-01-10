package 정수론_및_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11050 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int n_fac = 1;
        for (int i = 2; i <= n; i++) {
            n_fac *= i;
        }
        int n_k_fac = 1;
        for (int i = 2; i <= n - k; i++) {
            n_k_fac *= i;
        }
        int k_fac = 1;
        for (int i = 2; i <= k; i++) {
            k_fac *= i;
        }
        System.out.println(n_fac / (n_k_fac * k_fac));
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}

