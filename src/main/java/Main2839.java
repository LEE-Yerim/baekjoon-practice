import java.io.*;

public class Main2839 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int sugar = Integer.parseInt(br.readLine());

        if (sugar % 5 == 0) {
            System.out.println(sugar / 5);
            return;
        }
        int divide_to_5 = sugar / 5;
        for (int i = divide_to_5; i >= 0; i--) {
            int count = i;
            int rest_sugar = sugar - (5 * i);
            if (rest_sugar % 3 == 0) {
                count += rest_sugar / 3;
                System.out.println(count);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
