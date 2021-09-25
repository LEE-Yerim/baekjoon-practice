import java.io.*;

public class Main3053 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {
        int r = Integer.parseInt(br.readLine());

        System.out.println(Math.pow(r, 2) * Math.PI);

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
