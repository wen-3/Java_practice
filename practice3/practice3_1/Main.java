package practice3.practice3_1;

import java.util.Scanner;

// 運動成效2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int sumTime = 0;
        for (int i = 0; i < 7; i++){
            int time = sc.nextInt();
            sumTime += time;
            if (time != 0){
                day++;
            }
        }

        if (sumTime >= 100){
            if (day > 5){
                System.out.println("過度運動");
            }else if (day == 5){
                System.out.println("有運動且有效");
            }else{
                System.out.println("有運動");
            }
        }else{
            if (day >= 5){
                System.out.println("有運動");
            }else{
                System.out.println("偷懶");
            }
        }
    }
}
