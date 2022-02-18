//import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//상수
public class Main2908 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNumber = 0;
        for (String number : br.readLine().split(" ")) {
            String[] nums = number.split("");
            for (int i = 0; i < 3; i++) {
                String temp = nums[0];
                nums[0] = nums[2];
                nums[2] = temp;
            }
            maxNumber = Math.max(maxNumber, Integer.parseInt(String.join("", nums)));
        }
        System.out.println(maxNumber);
    }
}
