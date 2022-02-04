import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1157 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String word = bf.readLine().toUpperCase();
        List<String> characters = new ArrayList<>();
        for (String character : word.split("")) {
            characters.add(character);
        }
        Map<String, Integer> count = new HashMap<>();
        for (String character : characters) {
            count.put(character, Collections.frequency(characters, character));
        }
        int maxCount = 0;
        for (int number : count.values()) {
            maxCount = Math.max(maxCount, number);
        }
        List<String> answerList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == maxCount) {
                answerList.add(entry.getKey());
            }
        }
        if (answerList.size() == 1) {
            System.out.println(answerList.get(0));
        }
        if (answerList.size() != 1) {
            System.out.println("?");
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
