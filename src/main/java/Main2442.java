import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//별찍기5
public class Main2442 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
