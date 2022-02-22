// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1009 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            String[] ab = br.readLine().split(" ");
            long a = Integer.parseInt(ab[0]);
            long b = Integer.parseInt(ab[1]);
            long datas = (long) Math.pow(a, b);
            System.out.println(datas);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
