package 정렬;

// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//수 정렬하기
public class Main2750 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
