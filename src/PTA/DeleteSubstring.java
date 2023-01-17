package PTA;

import java.util.Scanner;

public class DeleteSubstring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub = scanner.nextLine();
        StringBuffer string1 = new StringBuffer(str);
        int index = 0;
        while (index != -1){
            index = string1.indexOf(sub);
            if(index != -1){
                string1.delete(index,index + sub.length());
            }
        }
        System.out.println(string1);
    }
}
