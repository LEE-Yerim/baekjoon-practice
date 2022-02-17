//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//단어 길이 재기
public class Main2743 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String word = bf.readLine();
        System.out.println(word.length());
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
