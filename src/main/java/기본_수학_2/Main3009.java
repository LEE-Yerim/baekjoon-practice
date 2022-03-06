package 기본_수학_2;

import java.io.*;
// import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//네번째 점
public class Main3009 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String[] coordinate = br.readLine().split(" ");
            xList.add(Integer.parseInt(coordinate[0]));
            yList.add(Integer.parseInt(coordinate[1]));
        }
        for (int x : xList) {
            if (Collections.frequency(xList, x) == 1) {
                bw.write(Integer.toString(x));
            }
        }
        bw.write(" ");
        for (int y : yList) {
            if (Collections.frequency(yList, y) == 1) {
                bw.write(Integer.toString(y));
            }
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
