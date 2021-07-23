package practice4.practice4_5;

import java.util.Scanner;

// 成績調整
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int score;
        score = (int)(x * 0.4 + 60);
        System.out.println(score);
    }
}
