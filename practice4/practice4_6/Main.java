package practice4.practice4_6;

import java.util.Scanner;

// 降雨機率1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String result;
        if (x > 60){
            result = "不出門";
        }else if (x > 30){
            result = "帶傘出門";
        }else{
            result = "出門";
        }

        System.out.println(result);
    }
}
