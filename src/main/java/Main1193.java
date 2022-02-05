import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//분수찾기
public class Main1193 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());
        int i = 1;
        int sum = 0;
        while (true) {
            sum += i;
            if (x <= sum) {
                break;
            }
            i++;
        }
        int index = x - sum + i;
        if (i % 2 == 0) {
            System.out.println(index + "/" + (i - index + 1));
        }
        if (i % 2 != 0) {
            System.out.println((i - index + 1) + "/" + index);
        }
    }
}
