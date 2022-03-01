package if문;

// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//두 수 비교하기
public class Main1330 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int[] numbers = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (numbers[0] > numbers[1]) {
            System.out.println(">");
        }
        if (numbers[0] < numbers[1]) {
            System.out.println("<");
        }
        if (numbers[0] == numbers[1]) {
            System.out.println("==");
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
