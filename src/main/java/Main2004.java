import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 조합 0의 개수
public class Main2004 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        String[] input_number = br.readLine().split(" ");
        int n = Integer.parseInt(input_number[0]);
        int m = Integer.parseInt(input_number[1]);
        double n_m_fac = 1;
        for (int i = m + 1; i <= n; i++) {
            n_m_fac *= i;
        }
        double m_fac = 1;
        for (int i = 2; i <= m; i++) {
            m_fac *= i;
        }
        double divided = n_m_fac / m_fac;
        int count_2 = 0;
        int count_5 = 0;
        while (divided % 2 == 0) {
            divided = divided / 2;
            count_2++;
        }
        while (divided % 5 == 0) {
            divided = divided / 5;
            count_5++;
        }
        System.out.println(Math.min(count_2, count_5));
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
