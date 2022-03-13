import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 농구 경기
public class Main1159 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<String> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            players.add(br.readLine().split("")[0]);
        }
        List<String> answer = new ArrayList<>();
        for (String player : players) {
            if (Collections.frequency(players, player) >= 5 && !answer.contains(player)) {
                answer.add(player);
            }
        }
        if(answer.isEmpty()) {
            answer.add("PREDAJA");
        }
        System.out.println(String.join("", answer));
    }
}
