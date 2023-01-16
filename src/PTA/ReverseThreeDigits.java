package PTA;

import java.util.Scanner;

public class ReverseThreeDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String go = scanner.nextLine();
        for(int i = (go.length() - 1); i >= 0; i--){
            if((go.charAt(i) != '0')||(go.charAt(2) != '0')){
                System.out.print(go.charAt(i));
            }
        }
    }
}
