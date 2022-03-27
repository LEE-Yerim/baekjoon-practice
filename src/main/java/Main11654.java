import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 아스키 코드
public class Main11654 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String character = br.readLine();
        System.out.println((int)character.charAt(0));
    }
}
