//import java.io.*;
//import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//문자열 반복
public class Main2675 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String input = bf.readLine();
            int r = Integer.parseInt(input.split(" ")[0]);
            String s = input.split(" ")[1];
            List<String> p = new ArrayList<>();
            for (String character : s.split("")) {
                for (int j = 0; j < r; j++) {
                    p.add(character);
                }
            }
            System.out.println(String.join("",p));
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
