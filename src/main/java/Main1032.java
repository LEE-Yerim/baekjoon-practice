import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main1032 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        List<String[]> files = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            files.add(br.readLine().split(""));
        }
        String[] answer = new String[files.get(0).length];
        for (int i = 0; i < files.get(0).length; i++) {
            String str = files.get(0)[i];
            boolean flag = false;
            for (int j = 1; j < n; j++) {
                if (!str.equals(files.get(j)[i])) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                answer[i] = "?";
            }
            else {
                answer[i] = str;
            }
        }
        for (String ans : answer) {
            System.out.print(ans);
        }
    }
}
