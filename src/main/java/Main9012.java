import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호
public class Main9012 {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String ps = bf.readLine();
            Stack<String> psStack = new Stack<>();
            for(String p : ps.split("")) {
                if(psStack.isEmpty()) {
                    psStack.push(p);
                }
                else if (p.equals(")") && psStack.peek().equals("(")){
                    psStack.pop();
                }
                else {
                    psStack.push(p);
                }
            }
            String answer = "";
            if (psStack.size() == 0) {
                answer = "YES";
            }
            if (psStack.size() != 0) {
                answer = "NO";
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
