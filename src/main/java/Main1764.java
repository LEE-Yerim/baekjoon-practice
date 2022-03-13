// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//듣보잡
public class Main1764 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String[] numbers = br.readLine().split(" ");
        int listen_number = Integer.parseInt(numbers[0]);
        int see_number = Integer.parseInt(numbers[1]);
        List<String> listen_people = new ArrayList<>();
        List<String> see_people = new ArrayList<>();
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < listen_number; i++) {
            listen_people.add(br.readLine());
        }
        for (int i = 0; i < see_number; i++) {
            see_people.add(br.readLine());
        }
        for (int i = 0; i < listen_number; i++) {
            if (see_people.contains(listen_people.get(i))) {
                answer.add(listen_people.get(i));
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for (String ans : answer) {
            System.out.println(ans);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
