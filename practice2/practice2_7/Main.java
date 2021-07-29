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

            for (int i = num; i >= 1; i--){
                if (gcd % i == 0 && num % i == 0){
                    gcd = i;  // 得出兩數值的最大公因數數值
                    break;
                }
            }
        }

        // 將最大公因數做質因數分解
        // 補充 - 質因數分解
        if (gcd == 1){
            System.out.print(gcd + "=1^1");
        }else {
            System.out.print(gcd + "=");
            for (int i = 1; i <= gcd; i++){   // 注意 gcd 可能是質數(也就是說包含自己)，條件式為 <= gcd，而非 < gcd
                int count = 0;
                if (i == 1){
                    System.out.print(i + "^1" + "*");
                    continue;
                }
                while (gcd % i == 0){
                    gcd = gcd / i;  // 除到不能整除為止
                    count++;
                }

                if (count > 0){
                    System.out.print(i + "^" + count);
                    if (gcd != 1){   // n分解到最後會變成1，若非1，代表n還可繼續分解
                        System.out.print("*");
                    }
                }
            }
        }
    }
}
