package practice3.practice3_1;

import java.util.Scanner;

// 運動成效2
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "有運動";

        int day = 0, sumTime = 0;
        for (int i = 0; i < 7; i++){
            int time = sc.nextInt();
            if (time != 0){
                day++;
                sumTime += time;
            }
        }

        if (sumTime >= 100){
            if (day == 5){
                result = "有運動且有成效";
            } else if (day > 5){
                result = "過度運動";
            }
        } else {
            result = "偷懶";
        }
        
        System.out.println(result);
    }
}
