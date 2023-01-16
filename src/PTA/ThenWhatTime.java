package PTA;
import java.util.Scanner;

public class ThenWhatTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int time = Integer.valueOf(str[0]);
        int next = Integer.valueOf(str[1]);
        int a = 0;
        if ((time % 100 + next % 60) >= 0) {
             a = ((time / 100 + (next / 60)) + (time % 100 + next % 60) / 60) * 100 + (time % 100 + next % 60) % 60;
            judge(a);
        } else {
            a = ((time / 100 + (next / 60)) + ((time % 100 + next % 60) / 60 - 1)) * 100 + 60 + (time % 100 + next % 60);
            judge(a);
        }
    }
    public static void judge(int a){
        if (a / 100 >= 1) {
            System.out.println(a);
        } else if (a / 10 >= 1) {
            System.out.println("0" + a);
        } else if (a / 10 == 0) {
                System.out.println("00" + a);
        }
    }
}
