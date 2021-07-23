package practice5.practice5_8;

import java.util.Scanner;

// 節外生枝

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1 => 1 = 1
        // 2 => 2*1 + 1 = 3
        // 3 => 3*2 + 3*1 + 1 = 10
        // n * (n-1) + ... + n * 1 + 1

        int sum = 1;
        for (int i = n - 1; i >= 1; i--){
            sum += n * i;
        }

        System.out.println(sum);
    }
}
