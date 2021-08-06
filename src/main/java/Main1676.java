import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1676 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int count_2 = 0;
        int count_5 = 0;
        for (int i = 2; i <= n; i++) {
            int divided = i;
            while (divided % 2 == 0) {
                divided = divided / 2;
                count_2++;
            }
            while (divided % 5 == 0) {
                divided = divided / 5;
                count_5++;
            }
        }
        System.out.println(Math.min(count_2, count_5));
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
