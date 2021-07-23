package practice3.practice3_4;

import java.util.Scanner;

// 數列問題
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean result;
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        result = fun(arr);
        System.out.println(result);
    }

    public static boolean fun(int[] arr){
        for (int i = 3; i < arr.length; i++){
            if (arr[i] != arr[i - 2] * arr[i - 1]){
                return false;
            }
        }
        return true;
    }
}
