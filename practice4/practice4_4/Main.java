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
        //      B           1  b     
        //  B       b       1  1     
        //  B   b   b   b   1  3   2b + B
        // B b b b b b b b  1  7     
        // 2n + 1   

        while (true){
            n++;
            bb = 2 * bb + B;
            if (b == bb){
                System.out.println(n);
                break;
            }
        }
    }
}
