//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//곱셈
public class Main2588 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String firstNumber = bf.readLine();
        String secondNumber = bf.readLine();
        int sum = 0;
        String[] numbers = secondNumber.split("");
        for (int i = 2; i >=0; i--) {
            int multiple = Integer.parseInt(firstNumber) * Integer.parseInt(numbers[i]);
            System.out.println(multiple);
            sum += multiple * Math.pow(10, Math.abs(i-2));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
