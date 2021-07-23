package practice2.practice2_2;

import java.util.Scanner;

// 分數判斷
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int score;
        if (num >= 40){
            score = 100;
        }else if (num > 20){
            score = 80 + (num - 20) * 1;
        }else if (num > 10){
            score = 60 + (num - 10) * 2;
        }else{
            score = num * 6;
        }
        System.out.println(score);
    }
}
