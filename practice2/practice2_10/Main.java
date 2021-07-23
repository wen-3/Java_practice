package practice2.practice2_10;

import java.util.Scanner;

// 運動成效
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bpm = sc.nextInt();
        if (bpm > 160){
            System.out.println("高強度");
        }else if (bpm >= 140){
            System.out.println("中度");
        }else if (bpm >= 120){
            System.out.println("輕中度");
        }else if (bpm >= 110){
            System.out.println("輕度");
        }else{
            System.out.println("非運動狀態");
        }

    }
}
