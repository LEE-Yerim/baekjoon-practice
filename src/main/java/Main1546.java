import java.io.*;
import java.util.Arrays;

//평균
public class Main1546 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        double n = Integer.parseInt(br.readLine());
        double[] scores = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double maxScore = 0;
        for (double score : scores) {
            maxScore = Math.max(maxScore, score);
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = scores[i] / maxScore * 100;
            sum += scores[i];
        }
        System.out.println(sum / n);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
