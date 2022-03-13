// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 알람 시계
public class Main2884 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int[] wakeUp = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] alarm = new int[2];
        if (wakeUp[1] - 45 < 0) {
            if (wakeUp[0] == 0) {
                alarm[0] = 23;
            } else {
                alarm[0] = wakeUp[0] - 1;
            }
            alarm[1] = wakeUp[1] + 60 - 45;
        } else {
            alarm[0] = wakeUp[0];
            alarm[1] = wakeUp[1] - 45;
        }
        for (int time : alarm) {
            System.out.print(time + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
