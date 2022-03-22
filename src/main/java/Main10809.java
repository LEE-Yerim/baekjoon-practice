import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 찾기
public class Main10809 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String word = bf.readLine();
        int[] countOfAlphabet = new int[26];
        for (int i = 0; i < 26; i++) {
            countOfAlphabet[i] = -1;
        }
        String[] charatersOfWord = word.split("");
        for (int i = 0; i < charatersOfWord.length; i++) {
            int numberOfAlphabet = (int) charatersOfWord[i].charAt(0) - 97;
            if (countOfAlphabet[numberOfAlphabet] == -1) {
                countOfAlphabet[numberOfAlphabet] = i;
            }
        }
        for (int count : countOfAlphabet) {
            System.out.print(count + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
