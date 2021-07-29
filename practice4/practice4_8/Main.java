package practice4.practice4_8;

import java.util.Scanner;

// 降雨機率3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (true){
            int x = sc.nextInt();
            if (x == -1){
                break;
            }

            if (x > max){
                max = x;
            }
        }

        if (max > 60){
            System.out.println("不出門");
        }else if (max > 30){
            System.out.println("帶傘出門");
        }else{
            System.out.println("出門");
        }
    }
}
