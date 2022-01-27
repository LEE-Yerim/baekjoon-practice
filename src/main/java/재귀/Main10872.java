package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10872 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
