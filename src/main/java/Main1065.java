// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//한수
public class Main1065 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isAP(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isAP(int i) {
        String number = Integer.toString(i);
        int[] numbers = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        for (int j = 1; j < numbers.length-1; j++) {
            if(numbers[j]-numbers[j-1] != numbers[j+1]-numbers[j]) {
                return false;
            }
        }
        return true;
    }
}
