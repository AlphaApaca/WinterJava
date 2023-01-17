package PTA;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String pretreatment = scanner.nextLine();
        String str = null;
        String[] ary = new String[pretreatment.length()];
        int j = 0;
        boolean judged = false;
        intialize(ary);
        for(int i = 0; i < pretreatment.length(); i++){
            if((i == pretreatment.length()-1)&&(pretreatment.charAt(i)==' ')){
                if(!judged){
                    j = j - 1;
                }
                break;
            } else if (pretreatment.charAt(i)!=' ') {
                judged = true;
                ary[j] = ary[j] + pretreatment.charAt(i);
            }
            if(judged&&(pretreatment.charAt(i) == ' ')){
                judged = false;
                j++;
            }
        }
        if(pretreatment.length() == 0){
            System.out.println();
        }else {
            for(int i = j; i >= 0; i--){
                if(i != j){
                    System.out.print(" ");
                }
                System.out.print(ary[i]);
            }
        }
    }
    public static void intialize(String[] ary){
        for (int i = 0; i < ary.length; i++){
            ary[i] = "";
        }
    }
    //去你妈的pta超时，傻逼pta题目作者就应该被超时
}
