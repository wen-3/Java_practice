package practice4.practice4_8;

import java.util.Scanner;

// 降雨機率3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        while (true){
            int x = sc.nextInt();
            if (x == -1){
                break;
            }

            if (x > tmp){
                tmp = x;
            }
        }

        if (tmp > 60){
            System.out.println("不出門");
        }else if (tmp > 30){
            System.out.println("帶傘出門");
        }else{
            System.out.println("出門");
        }
    }
}
