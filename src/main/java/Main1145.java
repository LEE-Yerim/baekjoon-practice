// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
public class Main1145 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> LCMs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    LCMs.add(LCM(LCM(numbers[i], numbers[j]), numbers[k]));
                }
            }
        }
        int minValue = Integer.MAX_VALUE;
        for (int LCM : LCMs) {
            minValue = Math.min(minValue, LCM);
        }
        System.out.println(minValue);
    }

    public static int LCM(int a, int b) {
        int GCD = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        return a * b / GCD;
    }
}
