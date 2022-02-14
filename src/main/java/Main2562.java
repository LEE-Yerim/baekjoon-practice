//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//최댓값
public class Main2562 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        int maxScore = 0;
        for (int number : numbers) {
            maxScore = Math.max(maxScore, number);
        }
        System.out.println(maxScore);
        for (int i = 0; i < 9; i++) {
            if (numbers[i] == maxScore) {
                System.out.println(i + 1);
            }
        }
    }
}
