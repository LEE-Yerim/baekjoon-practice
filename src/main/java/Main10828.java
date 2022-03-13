// import java.io.*;
// import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//스택
public class Main10828 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int commands = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < commands; i++) {
            String command = br.readLine();
            if (command.startsWith("push")) {
                stack.push(Integer.parseInt(command.split(" ")[1]));
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
