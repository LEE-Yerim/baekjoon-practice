import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1259 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str = "";
        while(!(str = br.readLine()).equals("0")) {
            String[] numbers = str.split("");
            boolean flag = true;
            for(int i = 0; i<numbers.length/2;i++) {
                if (!numbers[i].equals(numbers[numbers.length - 1 - i])) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
