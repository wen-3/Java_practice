package practice1.practice1_5;

import java.util.Scanner;

// 三個數字取最小值
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int min;

        if (n1 > n2){
            min = n2;
        }else{
            min = n1;
        }

        if (min > n3){
            min = n3;
        }

        System.out.println(min);
    }
}
