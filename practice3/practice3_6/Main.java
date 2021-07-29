package practice3.practice3_6;

import java.util.Scanner;

// 運動成效5
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();  // 每次消耗的體力
        int g = sc.nextInt();  // 隔天的體力增長值

        int bodyLimit = 1000;  // 體力上限
        int day = 0;   // 運動天數
        while (true){
            int n = sc.nextInt();  // 每天的運動次數
            if (n == -1){
                break;
            }

            day++;
            if (day % 2 == 0){
                c -= 20;
            }

            // 每天的消耗值
            int sum = 0;
            for (int i = 0; i < n; i++){
                sum += c;
                if (sum > bodyLimit){
                    sum = sum - c;
                    break;
                }
            }

            bodyLimit += (sum / 100) * g;
        }

        System.out.println(bodyLimit);
    }
}
