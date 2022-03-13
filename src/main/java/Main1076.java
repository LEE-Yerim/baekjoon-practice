import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 저항
public class Main1076 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] resistances = new String[3];
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if (str.equals("black")) {
                resistances[i] = "0";
            }
            if (str.equals("brown")) {
                resistances[i] = "1";
            }
            if (str.equals("red")) {
                resistances[i] = "2";
            }
            if (str.equals("orange")) {
                resistances[i] = "3";
            }
            if (str.equals("yellow")) {
                resistances[i] = "4";
            }
            if (str.equals("green")) {
                resistances[i] = "5";
            }
            if (str.equals("blue")) {
                resistances[i] = "6";
            }
            if (str.equals("violet")) {
                resistances[i] = "7";
            }
            if (str.equals("grey")) {
                resistances[i] = "8";
            }
            if (str.equals("white")) {
                resistances[i] = "9";
            }
        }
        int answer = Integer.parseInt(resistances[0] + resistances[1]) * (int) Math.pow(10, Integer.parseInt(resistances[2]));
        System.out.println(answer);
    }
}
