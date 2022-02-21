// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1008 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        double[] operands = Arrays.stream(bf.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        System.out.println(operands[0] / operands[1]);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
