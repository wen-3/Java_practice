package practice3.practice3_5;

import java.util.Scanner;

// 運動成效4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 初始速度
        int k = sc.nextInt();  // 每天移動的時間
        int m = sc.nextInt();  // 環島的總距離

        int sumMoveDistance = n;   // 每天可移動的總距離
        int tmp = n;
        
        // 每天可移動距離
        for (int i = 1; i < k; i++){
            n = (int)(n - (tmp * 0.1)); 
            sumMoveDistance += n;
        }

        // 輸出在第幾天時環島成功
        System.out.println((int)(m / sumMoveDistance + 1));
    }
}
