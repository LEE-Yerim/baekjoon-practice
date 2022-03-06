package if문;

// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//윤년
public class Main2753 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int year = Integer.parseInt(bf.readLine());
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
