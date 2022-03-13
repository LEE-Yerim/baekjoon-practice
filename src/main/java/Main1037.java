// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//약수
public class Main1037 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        System.out.println(max * min);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
