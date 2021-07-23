package practice1.practice1_4;

import java.util.Scanner;

// BMI計算
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float height = sc.nextFloat();
        float weight = sc.nextFloat();
        float bmi = (weight / ((height / 100) * (height / 100)));
        if (bmi >= 35){
            System.out.printf("%.1f 重度肥胖", bmi);
        }else if (bmi >= 30){
            System.out.printf("%.1f 中度肥胖", bmi);
        }else if (bmi >= 27){
            System.out.printf("%.1f 輕度肥胖", bmi);
        }else if (bmi >= 24){
            System.out.printf("%.1f 過重", bmi);
        }else if (bmi >= 18.5){
            System.out.printf("%.1f 正常", bmi);
        }else{
            System.out.printf("%.1f 過輕", bmi);
        }
    }
}
