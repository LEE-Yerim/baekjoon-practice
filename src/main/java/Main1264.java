import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main1264 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = "";
        while (!(str = br.readLine()).equals("#")) {
            int count = 0;
            for(String character : str.toLowerCase().split("")) {
                if(character.equals("a")||character.equals("e")||character.equals("i")||character.equals("o")||character.equals("u")) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
