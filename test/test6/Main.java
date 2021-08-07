package test.test6;

import java.util.Scanner;

// 會不斷讀數字的機器
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // 給定數值

        for (int i = 0; i < num + 1; i++){
            String numToString = String.valueOf(i);   // 將數值轉成字串以方便判斷
            if (numToString.contains("1")){   // 將字串中含有"1"的跳過
                continue;
            }
            System.out.print(i);
            if (i < num){
                System.out.print(" ");
            }
        }
    }
}
