package practice4.practice4_6;

import java.util.Scanner;

// 降雨機率1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String result = "出門";
        if (x <= 100 && x >= 61){
            result = "不出門";
        } else if (x >= 31){
            result = "帶傘出門";
        }

        System.out.println(result);
    }
}
