// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//균형잡힌 세상
public class Main4949 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static void solution() throws IOException {
        String str = "";
        while (!(str = br.readLine()).equals(".")) {
            String[] characters = str.split("");
            Stack<String> stack = new Stack<>();
            for (String character : characters) {
                if (character.equals("(")) {
                    stack.push("(");
                }
                if (character.equals(")")) {
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.push(")");
                    }
                }
                if (character.equals("[")) {
                    stack.push("[");
                }
                if (character.equals("]")) {
                    if (!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        stack.push("]");
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes");
            }
            if (!stack.isEmpty()) {
                System.out.println("no");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
