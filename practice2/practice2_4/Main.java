package practice2.practice2_4;

import java.util.Scanner;

// 數字反轉
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while (true){
            if (reverse > 214_748_364 || reverse < -214_748_364) {
                reverse = 0;
                break;
            }
            reverse = reverse * 10 + n % 10;
            n /= 10;
            if (n == 0){
                break;
            }
        }
        
        System.out.println(reverse);
    }
}
