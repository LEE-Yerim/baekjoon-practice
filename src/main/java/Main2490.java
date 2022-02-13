// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//윷놀이
public class Main2490 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        for (int i = 0; i < 3; i++) {
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int count_1 = 0;
            for (int number : numbers) {
                if (number == 1) {
                    count_1++;
                }
            }
            if (count_1 == 3) {
                System.out.println("A");
            }
            if (count_1 == 2) {
                System.out.println("B");
            }
            if (count_1 == 1) {
                System.out.println("C");
            }
            if (count_1 == 0) {
                System.out.println("D");
            }
            if (count_1 == 4) {
                System.out.println("E");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
