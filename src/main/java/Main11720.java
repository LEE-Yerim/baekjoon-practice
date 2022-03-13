import java.util.Scanner;

// 숫자의 합
public class Main11720 {
    public static void solution() {
        Scanner scanner1 = new Scanner(System.in);
        int size = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        String numbers = scanner2.nextLine();

        int sum = 0;
        for (String number : numbers.split("")) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        solution();
    }
}
