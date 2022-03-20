import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX퀴즈
public class Main8958 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int number = inputNumber();
        for (int i = 0; i < number; i++) {
            String test = inputString();
            int count = 0;
            int sum = 0;
            for (String mission : test.split("")) {
                if (mission.equals("O")) {
                    sum += 1 + count;
                    count++;
                }
                if (mission.equals("X")) {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }

    private static int inputNumber() throws IOException {
        return Integer.parseInt(bf.readLine());
    }

    private static String inputString() throws IOException {
        return bf.readLine();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
