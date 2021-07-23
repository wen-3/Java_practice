package practice4.practice4_3;

import java.util.Scanner;

// 記帳成效4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();  // 收入
        int goal = sc.nextInt();    // 存款目標

        int sumSpend = 0;   // 總花費金額
        int n = 0;          // 連續輸入n個月
        int sumIncome = 0;      // 總收入
        int deposit = 0;  // 存款
        int count = 0;
        while (true){
            int spend = sc.nextInt();
            if (spend == -1){
                break;
            }

            // 總花費
            sumSpend += spend;
            n++;

            // 總收入金額
               // 加薪
            if (n > 0 && n % 6 == 0){
                income += 5000;
            }
               // 季獎金
            if (n > 0 && n % 3 == 0){
                sumIncome += 5000; 
            }

            sumIncome += income;

            deposit = sumIncome - sumSpend;

            // 存款目標是否達成
            if (goal < deposit){
                count++;
            }
        }

        System.out.println(sumSpend);
        System.out.println(deposit);

        // 存款目標是否達成
        if (deposit > goal){
            System.out.println((count + 1));
        }else{
            System.out.println("-1");
        }
    }
}
