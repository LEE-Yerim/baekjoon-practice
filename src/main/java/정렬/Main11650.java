package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11650 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        int number = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[number][2];
        for (int i = 0; i < number; i++) {
            String[] input = br.readLine().split(" ");
            coordinates[i][0] = Integer.parseInt(input[0]);
            coordinates[i][1] = Integer.parseInt(input[1]);
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                if (coordinates[j][0] > coordinates[j + 1][0]) {
                    int[] temp = coordinates[j];
                    coordinates[j] = coordinates[j + 1];
                    coordinates[j + 1] = temp;
                }
                if (coordinates[j][0] == coordinates[j + 1][0]) {
                    if (coordinates[j][1] > coordinates[j + 1][1]) {
                        int[] temp = coordinates[j];
                        coordinates[j] = coordinates[j + 1];
                        coordinates[j + 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
