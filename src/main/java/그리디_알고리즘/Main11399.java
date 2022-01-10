package 그리디_알고리즘;

import java.io.*;
import java.util.Arrays;

public class Main11399 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int people = Integer.parseInt(br.readLine());
        int[] times = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(times);
        int sum = 0;
        for (int i = 0; i < times.length; i++) {
            if(i == 0) {
                sum += times[i];
            }
            else {
                times[i] += times[i - 1];
                sum += times[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
