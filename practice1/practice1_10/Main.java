package practice1.practice1_10;

import java.util.Scanner;

// 最大公因數
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = n2;
        if (n1 > n2){
            max = n1;
        }

        for (int i = max; i >= 1; i--){
            if (n1 % i == 0 && n2 % i == 0){
                System.out.print(i);
                break;
            }
        }

    }
}
