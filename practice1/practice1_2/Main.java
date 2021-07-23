package practice1.practice1_2;

import java.util.Scanner;

// 簡易四則運算
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((int)(2 * a + 6 / b + c));
    }
}
