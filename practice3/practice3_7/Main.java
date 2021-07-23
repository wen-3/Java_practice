package practice3.practice3_7;

import java.util.Scanner;

public class Main {
    // 金額記帳
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();  // 當月開銷金額
        float t = sc.nextFloat();  // 每天通勤費用
        int r;  // 通勤佔開銷的比例
        r = (int)(((t * 30) / c) * 100);
        System.out.println(r);
    }
}
