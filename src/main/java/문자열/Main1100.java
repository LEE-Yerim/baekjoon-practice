package 문자열;

// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//하얀 칸
public class Main1100 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int count = 0;
        for (int i = 1; i <= 8; i++) {
            String[] line = br.readLine().split("");
            if (i % 2 == 1) {
                for (int j = 0; j < 4; j++) {
                    if (line[j * 2].equals("F")) {
                        count++;
                    }
                }

            }
            if (i % 2 == 0) {
                for (int j = 0; j < 4; j++) {
                    if (line[j * 2 + 1].equals("F")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
