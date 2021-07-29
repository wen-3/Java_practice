package practice2.practice2_1;

import java.util.Scanner;

// 答題數判斷
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = (int)(Math.ceil(num * 0.6));
        
        System.out.println(result);
    }
}
