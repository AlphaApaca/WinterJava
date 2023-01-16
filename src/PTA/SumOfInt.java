package PTA;

import java.util.Scanner;

public class SumOfInt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int a = Integer.valueOf(str[0]);
        int b = Integer.valueOf(str[1]);
        int sum = 0;
        for(int i = 0; i <= (b - a); i++){
            String len = "" + (a+i);
            if(((i)%5 == 0)&&(i >= 5)){
                System.out.println();
            }
            for(int j = (5 - len.length()); j > 0; j--){
                System.out.print(" ");
            }
            System.out.print(a+i);
            sum = sum + (a+i);
        }
        System.out.print("\n" + "Sum = " + sum);
    }
}
