import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최솟값과 최댓값
public class Main2357 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String[] range = br.readLine().split(" ");
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = Integer.parseInt(range[0]) - 1; j < Integer.parseInt(range[1]); j++) {
                min = Math.min(min, numbers[j]);
                max = Math.max(max, numbers[j]);
            }
            System.out.println(min + " " + max);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
