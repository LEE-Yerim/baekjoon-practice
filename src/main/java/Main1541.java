// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//잃어버린 괄호
public class Main1541 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String equation = bf.readLine();
        List<Integer> operandsForSubtraction = new ArrayList<>();
        for (String e : equation.split("-")) {
            if (e.contains("+")) {
                int[] operandsForAddition = Arrays.stream(e.split("\\+")).mapToInt(Integer::parseInt).toArray();
                int sum = 0;
                for (int operand : operandsForAddition) {
                    sum += operand;
                }
                operandsForSubtraction.add(sum);
            } else {
                operandsForSubtraction.add(Integer.parseInt(e));
            }
        }
        int answer = operandsForSubtraction.get(0);
        for (int i = 1; i < operandsForSubtraction.size(); i++) {
            answer -= operandsForSubtraction.get(i);
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
