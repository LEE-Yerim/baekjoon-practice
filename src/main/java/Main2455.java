// import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//지능형 기차
public class Main2455 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int[] people = new int[4];
        int previous_people = 0;
        for (int i = 0; i < 4; i++) {
            String[] new_people = br.readLine().split(" ");
            int down_people = Integer.parseInt(new_people[0]);
            int up_people = Integer.parseInt(new_people[1]);
            people[i] = previous_people - down_people + up_people;
            previous_people = people[i];
        }
        int max_people = 0;
        for (int number : people) {
            max_people = Math.max(max_people, number);
        }
        System.out.println(max_people);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
