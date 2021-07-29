package practice1.practice1_4;

import java.util.Scanner;

// BMI計算
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat() / 100;
        float weight = sc.nextFloat();
        float bmi = weight / (height * height);
        String result = "過輕";
        if (bmi >= 35){
        result = "重度肥胖";
        }else if (bmi >= 30){
        result = "中度肥胖";
        }else if (bmi >= 27){
        result = "輕度肥胖";
        }else if (bmi >= 24){
        result = "過重";
        }else if (bmi >= 18.5){
        result = "正常";
        }

        System.out.printf("%.1f %s", bmi, result);
    }
}
