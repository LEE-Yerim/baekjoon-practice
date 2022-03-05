package 정렬;

import java.io.*;
// import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//수 정렬하기2
public class Main2751 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numbers);
        for (int number : numbers) {
            bw.write(Integer.toString(number));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
