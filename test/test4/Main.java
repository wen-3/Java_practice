package test.test4;

import java.util.Scanner;

// 計算重複數字
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 給定數值
        int n = sc.nextInt();  // 循環次數

        int sum = 0;
        int tmp = a;  // 將數值固定
        for (int i = 0; i < n; i++){
            sum += a;
            a = a * 10 + tmp;
        }

        System.out.println(sum);
    }
}
