import java.util.Scanner;

//숫자의 개수
public class Main2577 {
    private static Scanner scanner = new Scanner(System.in);

    public static void solution() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int multiple = a * b * c;

        int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(String num : Integer.toString(multiple).split("")){
            count[Integer.parseInt(num)]++;
        }

        for(int num : count) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
