// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2798 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        String[] input_size = br.readLine().split(" ");
        int cards_number = Integer.parseInt(input_size[0]);
        int max_number = Integer.parseInt(input_size[1]);
        String[] input_cards = br.readLine().split(" ");
        int[] cards = new int[cards_number];
        for (int i = 0; i < cards_number; i++) {
            cards[i] = Integer.parseInt(input_cards[i]);
        }
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < cards_number; i++) {
            for (int j = i; j < cards_number; j++) {
                for (int k = j; k < cards_number; k++) {
                    sums.add(cards[i] + cards[j] + cards[k]);
                }
            }
        }
        int answer = 0;
        for (int sum : sums) {
            if (sum <= max_number) {
                answer = Math.max(answer, sum);
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
