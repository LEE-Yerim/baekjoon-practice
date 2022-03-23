import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// X보다 작은 수
public class Main10871 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int[] NandX = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = NandX[0];
        int X = NandX[1];
        int[] A = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int a : A) {
            if (a < X) {
                System.out.print(a + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
