import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//벌집
public class Main2292 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int diffrence = 1;
        while (n > 0) {
            answer++;
            n -= diffrence;
            diffrence = 6 * answer;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
