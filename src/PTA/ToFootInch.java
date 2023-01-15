package PTA;
import java.util.Scanner;

public class ToFootInch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cent = sc.nextInt();
        change(cent);
    }
    public static void change(int cent){
        double fd = cent/(30.48);
        int f = (int) Math.floor(fd);
        int d = (int) Math.floor((fd - f) * 12);
        System.out.println(f + " " + d);
    }
}
