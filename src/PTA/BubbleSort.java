package PTA;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] str0 = scanner.nextLine().split(" +");
        int n = Integer.valueOf(str0[0]);
        int k = Integer.valueOf(str0[1]);
        String[] str1 = scanner.nextLine().split(" +");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(str1[i]);
        }
        bubbleSort(arr, k);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    // 交换元素
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr){
        for (int i = 0 ; i < arr.length; i++){
            if(i!=0){
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
    }
}
