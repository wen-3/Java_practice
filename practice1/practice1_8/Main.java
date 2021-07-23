package practice1.practice1_8;

import java.util.Scanner;

// 反轉數字
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();     
        int reverse = 0; 
        while(true){
            reverse = reverse * 10 + num % 10;  // 取出最後一位
            num = num / 10;   // 取出前面位數
            if (num == 0){
                break;
            }
        }
        System.out.println(reverse);
    }
}
