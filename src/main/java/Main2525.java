import java.util.Scanner;

// 오븐 시계
public class Main2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.next().split(" ");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);

        int aditional_minute = Integer.parseInt(sc.next());

        int new_minute = minute + aditional_minute;

        if (new_minute < 60 ) {
            System.out.println(hour + " " + new_minute);
        }
        else {
            int new_hour = hour + new_minute / 60;
            new_minute = new_minute % 60;
            System.out.println(new_hour + " " + new_minute);
        }
    }
}
