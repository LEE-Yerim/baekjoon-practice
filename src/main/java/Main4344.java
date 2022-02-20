import java.io.*;
import java.util.Arrays;

//평균은 넘겠지
public class Main4344 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            int[] testCase = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = testCase[0];
            int[] scores = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                scores[j] = testCase[j + 1];
                sum += scores[j];
            }
            int avg = sum / n;
            int count = 0;
            for (int score : scores) {
                if (score > avg) {
                    count++;
                }
            }
            double percent = (double) count / (double) n * 100;
            System.out.println(String.format("%.3f", percent) + "%");
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
