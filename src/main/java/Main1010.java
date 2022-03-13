// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//다리 놓기
public class Main1010 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            String[] input_numbers = br.readLine().split(" ");
            int n = Integer.parseInt(input_numbers[0]);
            int m = Integer.parseInt(input_numbers[1]);
            double n_fac = 1;
            for (int j = 2; j <= n; j++) {
                n_fac *= j;
            }
            double m_n_fac = 1;
            for (int j = 2; j <= m - n; j++) {
                m_n_fac *= j;
            }
            double m_fac = 1;
            for (int j = 2; j <= m; j++) {
                m_fac *= j;
            }
            System.out.println(Math.round(m_fac / (m_n_fac * n_fac)));
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
