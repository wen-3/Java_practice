package practice5.practice5_8;

import java.util.Scanner;

// 節外生枝

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1 => 1 = 1 = sum
        // 2 => sum*2 + 1 = 3 = sum
        // 3 => sum*3 + 1 = 10
        // sum * i + 1

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum * (i + 1) + 1;
        }

        System.out.println(sum);
    }
}
