package practice2.practice2_9;

import java.util.Scanner;

// 健走運動
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int d = sc.nextInt();
        int time;
        time = (t / d) / 60;
        System.out.println(time);
    }
}
