package PTA;

import java.util.Scanner;

public class WordLength {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String pretreatment = scanner.nextLine();
        String str = null;
        String[] ary = new String[pretreatment.length()];
        int j = 0;
        for(int i = 0; i < pretreatment.length(); i++){
            if(pretreatment.charAt(i)=='.'){
                str = pretreatment.substring(0,i);
                break;
            } else if (pretreatment.charAt(i)!=' ') {
                ary[j] = ary[j] + pretreatment.charAt(i);
            }
        }
        for(int i = 0; i < ary.length; i++){
            if(i != 0){
                System.out.print(" ");
            }
            System.out.print(ary[i].length());
        }
    }
}
