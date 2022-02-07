//import java.io.*;
//import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

//소트인사이드
public class Main1427 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String N = bf.readLine();
        String[] digits = N.split("");
        Arrays.sort(digits, Collections.reverseOrder());
        for(String digit : digits) {
            System.out.print(digit);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
