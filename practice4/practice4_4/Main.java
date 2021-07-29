package practice4.practice4_4;

import java.util.Scanner;

// 奇怪的生物生態
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();  // 原生Beta數量
        int b = sc.nextInt();  // 小Beta數量
    
        int n = 1;
        int bb = B; 
        while (bb != b){
            n++;
            bb = B + bb * 2;
        }
        System.out.println(n);
    }
}
