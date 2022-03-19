import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 합
public class Main8393 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] alphabets = br.readLine().split("");
        int sum = 0;
        for (String alphabet : alphabets) {
            int ascii = (int) alphabet.charAt(0);
            if (65 <= ascii && ascii <= 67) {
                sum += 2 + 1;
            }
            if (68 <= ascii && ascii <= 70) {
                sum += 2 + 2;
            }
            if (71 <= ascii && ascii <= 73) {
                sum += 2 + 3;
            }
            if (74 <= ascii && ascii <= 76) {
                sum += 2 + 4;
            }
            if (77 <= ascii && ascii <= 79) {
                sum += 2 + 5;
            }
            if (80 <= ascii && ascii <= 83) {
                sum += 2 + 6;
            }
            if (84 <= ascii && ascii <= 86) {
                sum += 2 + 7;
            }
            if (87 <= ascii && ascii <= 90) {
                sum += 2 + 8;
            }
        }
        System.out.println(sum);
    }
}
