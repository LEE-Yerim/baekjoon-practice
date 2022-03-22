import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 개수
public class Main10808 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String S = bf.readLine();
        int[] count = new int[26];
        for (int i = 0; i < 26; i++) {
            count[i] = 0;
        }
        for (String s : S.split("")) {
            count[(int) s.charAt(0) - 97]++;
        }
        for (int c : count) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
