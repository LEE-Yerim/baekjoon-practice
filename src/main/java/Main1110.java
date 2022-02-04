// import java.util.*;
import java.util.Scanner;

//더하기 사이클
public class Main1110 {
    private static Scanner scanner = new Scanner(System.in);
    public static void addition() {
        int initialNumber = scanner.nextInt();
        int number = initialNumber;
        boolean flag = true;
        int count = 0;
        while(flag) {
            number = makeNumber(number%10, sumItself(number)%10);
            count ++;
            if(number == initialNumber) {
                flag = false;
            }
        }
        System.out.println(count);
    }

    private static int sumItself(int number) {
        int sum = 0;
        for(String num : Integer.toString(number).split("")) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    private static int makeNumber(int firstNum, int secondNum) {
        return firstNum*10 + secondNum;
    }

    public static void main(String[] args) {
        addition();
    }
}
