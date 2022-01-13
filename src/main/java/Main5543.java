import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5543 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int[] burgers = new int[3];
        int min_burger = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            burgers[i] = Integer.parseInt(br.readLine());
            min_burger = Math.min(min_burger, burgers[i]);
        }
        int[] beverages = new int[3];
        int min_beverage = Integer.MAX_VALUE;
        for (int i = 0; i < 2; i++) {
            beverages[i] = Integer.parseInt(br.readLine());
            min_beverage = Math.min(min_beverage, beverages[i]);
        }
        System.out.println(min_burger + min_beverage - 50);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
