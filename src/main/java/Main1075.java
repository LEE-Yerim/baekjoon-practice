// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//나누기
public class Main1075 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        int number = n - n % 100;
        while (number % f != 0) {
            number++;
        }
        String answer = Integer.toString(number % 100);
        if (answer.length() == 1) {
            answer = "0" + answer;
        }
        System.out.println(answer);
    }
}
