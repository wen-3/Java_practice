package test.test7;

import java.util.Scanner;

// 找出連續正整數 (不使用陣列)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 輸入數量

        int sum = 0;
        int count = 0;       // 計算連續正整數的次數
        int longCount = 0;   // 計算連續正整數的最長次數
        int longSum = sum;   // 最長的連續正整數的總和
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            if (num <= 0){
                count = 0;
                sum = 0;
                continue;
            }

            count++;
            sum += num;

            // 找出 最長次數 的連續正整數總和
            if (longCount < count){
                longCount = count;
                longSum = sum;
            }
        }

        // 沒找到 連續 正整數輸出-1
        if (longCount == 0){
            System.out.println(-1);
        } else {
            System.out.println(longSum);
        }
    }
}
