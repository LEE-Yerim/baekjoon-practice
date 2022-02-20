import java.io.*;
import java.util.Arrays;

//셀프 넘버
public class Main4673 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        boolean[] selfNumbers = new boolean[10000];
        for (int i = 0; i < 10000; i++) {
            selfNumbers[i] = true;
        }
        for (int i = 1; i <= 10000; i++) {
            int sum = i;
            sum += Arrays.stream(Arrays.stream(Integer.toString(i).split("")).mapToInt(Integer::parseInt).toArray()).sum();
            if (sum <= 10000) {
                selfNumbers[sum - 1] = false;
            }
        }
        for (int i = 0; i < 10000; i++) {
            if (selfNumbers[i] == true) {
                System.out.println(i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
