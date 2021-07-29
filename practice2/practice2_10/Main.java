package practice2.practice2_10;

import java.util.Scanner;

// 運動成效
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bpm = sc.nextInt();
        String result = "非運動狀態";

        if (bpm >= 160){
            result = "高強度";
        } else if (bpm >= 140){
            result = "中度";
        } else if (bpm >= 120){
            result = "輕中度";
        } else if (bpm >= 110){
            result = "輕度";
        }

        System.out.println(result);
    }
}
