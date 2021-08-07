package test.test8;

import java.util.Scanner;

// 找出孤獨的數字
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 數量
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            int key = arr[i];
            int count = 0;  // 數值出現幾次
            for (int j = 0; j < arr.length; j++){
                if (key == arr[j]){
                    count++;
                }
            }
            if (count == 1){   // 只出現一次即為孤獨數字
                System.out.println(key);
            }
        }
    }
}
