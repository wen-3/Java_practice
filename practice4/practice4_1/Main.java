package practice4.practice4_1;

import java.util.Scanner;

// 記帳成效3 - 讓使用者快速連續輸入商品金額的系統
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int tmp = 0;   // 代表前一筆的金額，假設初始值為 0
        int count = 0;   // 修改前一筆次數
        while (true){
            int num = sc.nextInt();

            // 表示記帳完成
            if (num == 0){
                break;
            }

            // 表示要修改前一筆紀錄(連續輸入負整數的話，即修改同一筆紀錄)
            if (num < 0){
                count++;   // 修改前一筆次數
                if (count == 1){
                    sum -= tmp;
                }
                continue;
            }

            count = 0;   // 如果有做修改，執行到此行，代表修改完成。因此將修改次數調整為初始狀態

            // 計算總金額
            sum += num;

            tmp = num;  // 代表前一筆的金額
        }

        System.out.println(sum);
    }
}
