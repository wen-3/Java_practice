package test.test2;

import java.util.Scanner;

// 填空練習
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int r;
        r = arr[1] / arr[0];
        for (int i = 2; i < arr.length; i++){
            // 等差數列
            if (arr[i] != arr[i - 1] * r){
                r = arr[1] - arr[0];
                System.out.println(arr[3] + r);
                break;
            }

            // 等比數列
            if (i == arr.length - 1){
                System.out.println(arr[3] * r);
            }
        }
    }
}
