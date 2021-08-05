import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1181 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int number = Integer.parseInt(br.readLine());
        String[] words = new String[number];
        for (int i = 0; i < number; i++) {
            words[i] = br.readLine();
        }
        for (int i = 0; i < number; ++i) {
            for (int j = 0; j < number - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
                if (words[j].length() == words[j + 1].length()) {
                    if (words[j].compareTo(words[j + 1]) > 0) {
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }
                }
            }
        }
        String previous = "";
        for (String word : words) {
            if (!previous.equals(word)) {
                System.out.println(word);
            }
            previous = word;
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
