import java.util.Scanner;

// 숫자의 합
public class Main11720 {
    public static void solution() {
        int size = inputNumber();
        String numbers = inputString();

        int sum = 0;
        for (String number : numbers.split("")) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
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
