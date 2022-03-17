import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 달팽이는 올라가고 싶다
public class Main2869 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        int go = 0;
        while (true) {
            count++;
            go += numbers[0];
            if (go >= numbers[2]) {
                break;
            }
            go -= numbers[1];
            if (go >= numbers[2]) {
                break;
            }
        }
        System.out.println(count);
    }
}
