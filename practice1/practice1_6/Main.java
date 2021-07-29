package practice1.practice1_6;

import java.util.Scanner;

// 計算任意數字總和
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++){
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
