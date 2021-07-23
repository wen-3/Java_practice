package practice2.practice2_7;

import java.util.Scanner;

// 多數字的最大公因數 - 並進行質因數分解
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int gcd = num;  // 假設(第一個)輸入的數值為最大公因數
        while (true){
            num = sc.nextInt();  // 輸入(第二個)數值  // 輸入(第三個)數值 ...
            if (num == -1){
                break;
            }

            // 找出輸入的(第一個)和(第二個)的最大公因數
            // 找出(得出兩數值的最大公因數數值)和(第三個)的最大公因數
            // 找出(得出兩數值的最大公因數數值)和(第X個)的最大公因數...
            for (int i = num; i >= 2; i--){
                if (gcd % i == 0 && num % i == 0){
                    gcd = i;  // 得出兩數值的最大公因數數值
                    break;
                }
            }
        }

        System.out.print(gcd + "=");

        // 將最大公因數做質因數分解
        // 補充 - 質因數分解
        int n = gcd;
        for (int i = 2; i < n; i++){
            int count = 0;
            while (n % i == 0){
                count++;
                n = n / i;  // 除到不能整除為止
            }
            if (count > 0){
                System.out.print(i + "^" + count);
                if (n != 1){   // n分解到最後會變成1，若非1，代表n還可繼續分解
                    System.out.print("*");
                }
            }
        }
    }
}
