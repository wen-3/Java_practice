package practice4.practice4_3;

import java.util.Scanner;

// 記帳成效4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int income = sc.nextInt();  // 收入
        int goal = sc.nextInt();    // 存款目標

        int sumSpend = 0, sumDeposit = 0;   // 總花費金額, 總存款
        int n = 0;    // 連續輸入n個月
        int month = 0;   // 目標達成月份
        while (true){
            int spend = sc.nextInt();  // 連續輸入數個月花費金額
            if (spend == -1){
                break;
            }

            n++;
            if (n % 6 == 0){   // 加薪
                income += 5000;
            }

            if (n % 3 == 0){    // 季獎金
                sumDeposit += 5000;
            }

            sumSpend += spend;
            sumDeposit += income - spend;
            
            // 判斷存款目標是否達成
            if (sumDeposit < goal){
                month++;
            }
        }

        System.out.println(sumSpend);
        System.out.println(sumDeposit);
        System.out.println((month + 1));
    }
}
