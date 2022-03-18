import java.util.Scanner;

// 단어의 개수
public class Main1152 {
    private static Scanner scanner = new Scanner(System.in);

    public static void solution() {
        String sentence = scanner.nextLine();
        int count = 0;
        for (String voca : sentence.split(" ")) {
            if (!voca.equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        solution();
    }
}
