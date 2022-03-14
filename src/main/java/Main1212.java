import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8진수 2진수
public class Main1212 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int octal = Integer.valueOf(br.readLine(),8);
        System.out.println(Integer.toBinaryString(octal));
    }
}
