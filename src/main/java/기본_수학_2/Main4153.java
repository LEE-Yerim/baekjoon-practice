package 기본_수학_2;

import java.io.*;
import java.util.Arrays;

public class Main4153 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        String str = "";
        while (!(str = br.readLine()).equals("0 0 0")) {
            int[] lengths = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
            int max_length = 0;
            for (int length : lengths) {
                max_length = Math.max(max_length, length);
            }
            int double_sum = 0;
            for (int length : lengths) {
                if (length != max_length) {
                    double_sum += Math.pow(length, 2);
                }
            }
            if (Math.pow(max_length, 2) == double_sum) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
