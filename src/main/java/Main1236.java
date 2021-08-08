import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1236 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] size = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] castle = new String[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < size[1]; j++) {
                castle[i][j] = row[j];
            }
        }
        int count_vertical = 0;
        for (int i = 0; i < size[0]; i++) {
            boolean flag = false;
            for (int j = 0; j < size[1]; j++) {
                if (castle[i][j].equals("X")) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count_vertical++;
            }
        }
        int count_horizonal = 0;
        for (int i = 0; i < size[1]; i++) {
            boolean flag = false;
            for (int j = 0; j < size[0]; j++) {
                if (castle[j][i].equals("X")) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count_horizonal++;
            }
        }
        System.out.println(Math.max(count_horizonal, count_vertical));
    }
}
