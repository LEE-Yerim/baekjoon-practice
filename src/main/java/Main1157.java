import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//단어 공부
public class Main1157 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String word = bf.readLine().toUpperCase();
        List<String> characters = new ArrayList<>();
        List<String> characterList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        Collections.addAll(characters, word.split(""));
        for (String character : characters) {
            if (!characterList.contains(character)) {
                characterList.add(character);
            }
        }
        for (String character : characterList) {
            countList.add(Collections.frequency(characters, character));
        }
        int maxCount = 0;
        for (int number : countList) {
            maxCount = Math.max(maxCount, number);
        }
        List<String> answerList = new ArrayList<>();
        for (int i = 0; i < countList.size(); i++) {
            if (countList.get(i) == maxCount) {
                answerList.add(characterList.get(i));
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
