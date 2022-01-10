package 정렬;

import java.io.*;

public class Main10989 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        int[] counting = new int[10001];
        for (int i = 0; i < n; i++) {
            counting[array[i]]++;
        }
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }
        for (int i = 0; i < n; i++) {
            bw.write(Integer.toString(result[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
