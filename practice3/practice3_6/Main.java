package practice3.practice3_6;

import java.util.Scanner;

// 運動成效5
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();  // 每次消耗的體力
        int g = sc.nextInt();  // 隔天的體力增長值
        int n;  // 每天的運動次數
        
        int nc; // 每天的消耗值
        int limit = 1000;  // 體力上限
        
        // day 每天消耗  < 體力上限
        //  0    n*c    <  limit
        //  1    n*c    <  limit + g*(nc/100)
        //  2  n*(c-20) <  limit + g*(nc/100)    // (c-20) > 50
        // => g*(nc/100) ?
        // c - 20 => day 3 5 7 => count 2 4 6
        int count = 0;
        while (true){
            n = sc.nextInt();
            if (n == -1){
                break;
            }

            count++;
            
            if (count > 0 && count % 2 == 0){
                c = c - 20;
            }
            nc = n * c;

            if (nc > limit){
                nc = (n - 1) * c;
            }

            limit = limit + g * (nc / 100);
        }

        System.out.println(limit);
    }
}
