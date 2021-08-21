import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11650 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int number;
    private static int[][] coordinates;

    private static void solution() throws IOException {
        number = Integer.parseInt(br.readLine());
        coordinates = new int[number][2];
        for (int i = 0; i < number; i++) {
            String[] input = br.readLine().split(" ");
            coordinates[i][0] = Integer.parseInt(input[0]);
            coordinates[i][1] = Integer.parseInt(input[1]);
        }
        sort();
        for (int i = 0; i < number; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
        }
    }

    private static void sort() {
        int left = 0;
        int right = number-1;
        int[] pivot = coordinates[(left+right)/2];


    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
