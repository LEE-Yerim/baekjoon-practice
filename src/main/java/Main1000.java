// import java.util.*;
import java.util.Scanner;

public class Main1000 {
    private static Scanner scanner = new Scanner(System.in);
    public static void addition() {
        String numbers = scanner.nextLine();

        int sum = 0;
        for(String number : numbers.split(" ")) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        addition();
    }
}
