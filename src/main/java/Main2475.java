// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//검증수
public class Main2475 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String[] numbers = br.readLine().split(" ");
        double sum = 0;
        for (String number : numbers) {
            sum += Math.pow(Double.parseDouble(number), 2);
        }
        System.out.println((int) sum % 10);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
