package PTA;

import java.util.Scanner;

public class SolvePolyByDichotomy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str0 = scanner.nextLine().split(" +");
        int a3 = Integer.valueOf(str0[0]);
        int a2 = Integer.valueOf(str0[1]);
        int a1 = Integer.valueOf(str0[2]);
        int a0 = Integer.valueOf(str0[3]);
        String[] str1 = scanner.nextLine().split(" +");
        int a = Integer.valueOf(str1[0]);
        int b = Integer.valueOf(str1[1]);
        dichotomy(a3, a2, a1, a0, a, b);
    }
    public static void dichotomy(double a3, double a2, double a1, double a0,double a, double b){
        while (b-a>0.001) {
            if (polynomialFunction(a3, a2, a1, a0, a)*polynomialFunction(a3, a2, a1, a0, b) < 0) {
                if (polynomialFunction(a3, a2, a1, a0, (a + b) / 2)==0) {
                    break;
                }
                if (polynomialFunction(a3, a2, a1, a0, (a + b) / 2)*polynomialFunction(a3, a2, a1, a0, a) > 0) {
                    a = (a + b) / 2;
                }
                if (polynomialFunction(a3, a2, a1, a0, (a + b) / 2)*polynomialFunction(a3, a2, a1, a0, b)>0) {
                    b = (a + b) / 2;
                }
            }
            if (polynomialFunction(a3, a2, a1, a0, b) == 0 || polynomialFunction(a3, a2, a1, a0, a) == 0) {
                System.out.println(Double.valueOf(String.format("%.2f",polynomialFunction(a3, a2, a1, a0, a) == 0 ? a : b)));
            }
        }
    }
    public static double polynomialFunction(double a3, double a2, double a1, double a0, double x){
        return a3*Math.pow(x,3) + a2*Math.pow(x,2) + a1*x + a0;
    }
}
