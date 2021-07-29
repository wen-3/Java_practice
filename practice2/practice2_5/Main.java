package practice2.practice2_5;

import java.util.Scanner;

// 連續判斷質數
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime[] = new boolean[n];
       
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            boolean result = true;

            // 記得要判斷使用者輸入數值1的情況
            if (num == 1){
                result = false;
                isPrime[i] = result;
                continue;
            }

            for (int j = 2; j < num; j++){
                if (num % j == 0){
                    result = false;
                }
            }
            isPrime[i] = result;
        }
        
        for (boolean result : isPrime){
            System.out.println(result);
        }
    }
}

