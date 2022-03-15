import java.io.*;
import java.util.Arrays;

// 수 찾기
public class Main1920 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] n_array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());
        int[] m_array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int j = 0; j < m; j++) {
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (m_array[j] == n_array[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
