package 구현;

// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//별찍기15
public class Main10990 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 0; i < j * 2 - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
