import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main10845 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void solution() throws IOException {
        int commands = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int back = 0;
        for (int i = 0; i < commands; i++) {
            String command = br.readLine();
            if (command.startsWith("push")) {
                int input_number = Integer.parseInt(command.split(" ")[1]);
                queue.add(input_number);
                back = input_number;
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                    //queue가 비어있으면 null을 반환
                    //System.out.println(queue.remove());
                    //queue가 비어있으면 NoSuchElementException 발생
                }
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peek());
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(back);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}
