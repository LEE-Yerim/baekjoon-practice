import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 평균 점수
public class Main10039 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = Integer.parseInt(br.readLine());
            if (score < 40) {
                score = 40;
            }
            sum += score;
        }
        System.out.println(sum / 5);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
