import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 열 개씩 끊어 출력하기
public class Main11721 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String[] S = bf.readLine().split("");
        for (int i = 0; i < S.length; i++) {
            if (i != 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print(S[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
