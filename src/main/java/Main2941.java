//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//크로아티아 알파벳
public class Main2941 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        String word = bf.readLine();
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String c : croatia) {
            if(word.contains(c)) {
                word = word.replaceAll(c, ".");
            }
        }
        System.out.println(word.length());
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
