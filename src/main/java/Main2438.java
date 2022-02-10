// import java.io.*; 로 한꺼번에 가져올 수 있다
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 1
public class Main2438 {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int size = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
