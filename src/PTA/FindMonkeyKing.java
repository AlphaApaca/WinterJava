package PTA;

import java.util.Scanner;

public class FindMonkeyKing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int n = 0;

        for(int i=2; i <= sum; i++)
            n=(n + 3)%i;
        System.out.println(n+1);
        //wc有脏东西

//        for(int i = 1; i <= sum; i++){
//            System.out.println(josephRing(sum,3,i)+1);
//        }来日再解决这个递归的做法
    }
    public static int josephRing(int sum, int value, int n){
        if(n == 1){
            return (sum + value - 1)%sum;
        }else {
            return (josephRing(sum-1,value,n-1)+value)%sum;
        }
    }//总共有sum个人，报value个数，把第n次被dead的人最开始的排名挑出来
}
