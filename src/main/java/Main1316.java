import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

//그룹단어체커
public class Main1316 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int number = Integer.parseInt(bf.readLine());
        int count = 0;
        for (int i = 0; i < number; i++) {
            String word = bf.readLine();
            boolean flag = true;
            Stack<String> characters = new Stack<>();
            for (String character : word.split("")) {
                if (characters.isEmpty()) {
                    characters.push(character);
                } else if (!character.equals(characters.peek())) {
                    characters.push(character);
                }
            }
            for (String character : characters) {
                if (Collections.frequency(characters, character) > 1) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
