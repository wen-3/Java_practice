package practice3.practice3_8;

import java.util.Scanner;

public class Main {
    // 記帳成效
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();  // 前一個月的記帳金額
        int c = sc.nextInt();  // 當月的記帳金額
        String result = "成效一般";
        
        if (c - p >= 1000){
            result = "無效";
        }else if(c - p <= 0){
            result = "成效良好";
        }

        System.out.println(result);
    }
}
