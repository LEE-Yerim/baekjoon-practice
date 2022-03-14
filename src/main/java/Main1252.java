import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이진수 덧셈
public class Main1252 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] binarys = br.readLine().split(" ");
        int sum = 0;
        for(String binary : binarys) {
            sum += Integer.valueOf(binary, 2);
        }
        System.out.println(Integer.toBinaryString(sum));
    }
}