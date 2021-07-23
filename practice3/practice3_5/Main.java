package practice3.practice3_5;

import java.util.Scanner;

// 運動成效4
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 初始速度
        int k = sc.nextInt();  // 每天移動的時間
        int m = sc.nextInt();  // 環島的總距離
        int hourDistance;
        int sumDistance = 0;   // 每天可移動的總距離
        // m = n * k
        // n 0.9n 0.8n ...
        // 1   2   3   ... k

        // 每天可移動距離
        for (int i = 0; i < k; i++){
            if (i == 0){
                hourDistance = n;
            }else{
                hourDistance = (int)(n * (1 - 0.1 * i));
            }
            sumDistance += hourDistance;
        }

        // 輸出在第幾天時環島成功
        System.out.println((int)(m / sumDistance + 1));
    }
}
