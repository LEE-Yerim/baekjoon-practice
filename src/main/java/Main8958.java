import java.util.Scanner;

// OX퀴즈
public class Main {
    public static void solution() {
        int number = inputNumber();
        for (int i = 0; i < number; i++) {
            String test = inputString();
            int count = 0;
            int sum = 0;
            for (String mission : test.split("")) {
                if (mission.equals("O")) {
                    sum += 1 + count;
                    count++;
                }
                if (mission.equals("X")) {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }

    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        solution();
    }
}
