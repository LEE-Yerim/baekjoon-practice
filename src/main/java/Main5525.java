// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//IOIOI
public class Main5525 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
        List<String> pn_pieces = new ArrayList<>();
        pn_pieces.add("I");
        int index = 1;
        for (int i = 0; i < n; i++) {
            pn_pieces.add("OI");
            index += 2;
        }
        String pn = String.join("", pn_pieces);
        int count = 0;
        for (int i = 0; i < m - index + 1; i++) {
            if (s.substring(i, i + index).equals(pn)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
