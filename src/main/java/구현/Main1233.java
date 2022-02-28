package 구현;

// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//주사위
public class Main1233 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] sn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> sums = new ArrayList<>();
        for (int i = 1; i <= sn[0]; i++) {
            for (int j = 1; j <= sn[1]; j++) {
                for (int k = 1; k <= sn[2]; k++) {
                    sums.add(i + j + k);
                }
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int sum : sums) {
            map.put(sum, Collections.frequency(sums, sum));
        }

        int max_frequency = 0;
        for (int value : map.values()) {
            max_frequency = Math.max(max_frequency, value);
        }

        List<Integer> answers = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == max_frequency) {
                answers.add(key);
            }
        }

        int min_sum = Integer.MAX_VALUE;
        for (int answer : answers) {
            min_sum = Math.min(min_sum, answer);
        }

        System.out.println(min_sum);
    }
}
