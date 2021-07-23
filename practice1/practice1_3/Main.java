package practice1.practice1_3;

import java.util.Scanner;

// 直角三角形面積
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float botton = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println((botton * height) / 2);
    }
}
