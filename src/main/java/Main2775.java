//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//부녀회장이 될테야
public class Main2775 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int test = Integer.parseInt(br.readLine());
        int[] answer = new int[test];
        for (int i = 0; i < test; i++) {
            int floor = Integer.parseInt(br.readLine());
            int number = Integer.parseInt(br.readLine());
            int[][] apart = new int[floor + 1][number];
            for (int k = 0; k < number; k++) {
                apart[0][k] = k + 1;
            }
            for (int j = 1; j <= floor; j++) {
                for (int k = 0; k < number; k++) {
                    apart[j][k] = 0;
                    for (int l = 0; l <= k; l++) {
                        apart[j][k] += apart[j - 1][l];
                    }
                }
            }
            System.out.println(apart[floor][number - 1]);
        }
    }
}
